package com.vnk.Rest.Model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;
@Data
public class Student {
	private String name;
	private long phNo;
	private String[] subjects;
	private List<String> acadamics;
	private Set<String> parentdetails;
	private Map<String,Double> Marks;
	private Address add;
}
