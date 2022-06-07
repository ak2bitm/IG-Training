package com.akhilesh.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;


public class IntStreamMainTest01 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(11,22,33,14,66,77,18,19);
		System.out.println("--------Q1--Printing number greater then 4---------");
		list.stream().filter(n->n>14).map(n->n).forEach(System.out::println);
		System.out.println("--------Q2--Printing even number-----");
		list.stream().filter(n->n%2==0).map(n->n).forEach(System.out::println);
		System.out.println("--------Q3--Printing odd number--------");
		list.stream().filter(n->n%2!=0).map(n->n).forEach(System.out::println);
		System.out.println("--------Q4--Finding sum,min,max,avarage---------");
		IntSummaryStatistics iss =list.stream().mapToInt(n->n).summaryStatistics();
		System.out.println("Sum is :"+iss.getSum());
		System.out.println("Min num is :"+iss.getMin());
		System.out.println("Max num is :"+iss.getMax());
		System.out.println("Average is :"+iss.getAverage());
		System.out.println("Total count :"+iss.getCount());
		System.out.println("---------Q5--First way to Finding number start with 1------------");
		list.stream().filter(n->n.toString().startsWith("1")).forEach(System.out::println);
		System.out.println("---------Q6--Second way Finding number start with 1------------");
		list.stream().map(n->n+"").filter(n->n.startsWith("1")).forEach(System.out::println);
		System.out.println("---------Q7--Calculate the sum in second way------------");
		int sum =list.stream().mapToInt(n->n).sum();
		System.out.println(sum);
		System.out.println("---------Q9--Sorting the list by default natural sorting---------");
		list.stream().map(n->n).sorted().forEach(System.out::println);
		System.out.println("---------Q10--Sort the list by Compartor--------");
		list.stream().map(n->n)
			.sorted(Comparator.naturalOrder()).forEach(System.out::println);
		System.out.println("---------Q11--printing the list with limit--------");
		list.stream().map(n->n)
			.limit(5).forEach(System.out::println);
		System.out.println("---------Q12--skiping and limiting the list--------");
		list.stream().map(n->n)
			.skip(2).limit(4).forEach(System.out::println);
		System.out.println("----------Q13--peek method useful in logging -------");
		list.stream().map(n->n)
			.peek(System.out::println)
			.skip(2)
			.peek(System.out::println)
			.limit(6).forEach(System.out::println);
		System.out.println("-----------Q14--Using collect finding average--------");
		double avg =list.stream().collect(Collectors.averagingInt(n->n));
		System.out.println("Average is :"+avg);
		System.out.println("-----------Q15--Finding max using collect------");
		Optional<Integer> max=list.stream().collect(Collectors.maxBy(Comparator.comparingInt(n->n)));
		System.out.println(max.get());
		System.out.println("-----------Q16--Find min using collect---------");
		Optional<Integer> min=list.stream().collect(Collectors.minBy(Comparator.comparingInt(n->n)));
		System.out.println(min.get());
		System.out.println("-----------Q17--Finding sum using collect--------");
		int resSum=list.stream().collect(Collectors.summingInt(n->n));
		System.out.println(resSum);
		System.out.println("------------Q18--coverting list to set---------");
		Set<Integer> set=list.stream().collect(Collectors.toSet());
		System.out.println(set);
		System.out.println("-----------------------");
		Map<String, Integer> map=list.stream().collect(Collectors.toMap(n->n.toString().concat("a"), n->n));
		System.out.println(map);
		System.out.println("---------Q19--list of sum using reduce()-------");
		int reSum=list.stream().reduce(0, Integer::sum);
		System.out.println("Sum is :"+reSum);
		System.out.println("--------------Q20--Max using reduce()----------");
		int reMax=list.stream().reduce(0, Integer::max);
		System.out.println("Max is :"+reMax);
		System.out.println("--------------Q21--sorting list in decending order---------");
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		System.out.println("----------End--------------");
		
	}
}
