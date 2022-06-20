package com.akhilesh.springbatch.config;


import org.springframework.core.io.Resource;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.akhilesh.springbatch.model.UserModel;

@Configuration
@EnableBatchProcessing
public class SpringBatchConfig {

	
	@Bean
	Job job(JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory
			, ItemReader<UserModel> itemReader, 
			ItemProcessor<UserModel, UserModel> itemProcessor, 
			ItemWriter<UserModel> itemWriter ) {
		
		Step step = stepBuilderFactory.get("ETL-file-load")
					.<UserModel, UserModel>chunk(100)
					.reader(itemReader)
					.processor(itemProcessor)
					.writer(itemWriter)
					.build();
		
		return jobBuilderFactory.get("ETL-Load")
			.incrementer(new RunIdIncrementer())
			.start(step)
			.build();
	}

    @Bean
    public FlatFileItemReader<UserModel> itemReader(@Value("${input-path}") Resource resourse) {

        FlatFileItemReader<UserModel> flateFileItemReader = new FlatFileItemReader<>();
        flateFileItemReader.setResource(resourse);
        flateFileItemReader.setName("CSV-Reader");
        flateFileItemReader.setLinesToSkip(1);
        flateFileItemReader.setLineMapper(lineMapper());
        return flateFileItemReader;
    }

    @Bean
    public LineMapper<UserModel> lineMapper() {
        DefaultLineMapper<UserModel> defaultLineMapper = new DefaultLineMapper<>();
        DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
        lineTokenizer.setDelimiter(",");
        lineTokenizer.setStrict(false);
        lineTokenizer.setNames(new String[]{"id", "name", "dept", "salary"});

        BeanWrapperFieldSetMapper<UserModel> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
        fieldSetMapper.setTargetType(UserModel.class);
        defaultLineMapper.setLineTokenizer(lineTokenizer);
        defaultLineMapper.setFieldSetMapper(fieldSetMapper);
        return defaultLineMapper;
    }
	
	
}
