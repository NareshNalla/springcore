package com.sekharit.spring.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Person {
	private String name;
	@Value("25")
	private int age;

	public Person() {
		System.out.println("Person()");
	}

	@Autowired(required = false)
	public Person(@Qualifier("jobA") Job Job) {
		System.out.println("Person(Job Job)");
	}

	@Autowired(required = false)
	public Person(Demo demo) {
		System.out.println("Person(Demo demo)");
	}
	
	

	@Autowired(required = false)
	public void someMethod(@Qualifier("jobA") Job job) {
		System.out.println("someMethod():" + job + " demo : ");
	}

	@Autowired
	@Qualifier("address1")
	private Address address;

	@Autowired
	@Qualifier("jobB")
	private Job job;

	@Autowired
	private Job[] jobArray;

	@Autowired
	private List<Job> jobList;

	@Autowired
	private Set<Address> addressSet;

	@Autowired
	private Map<String, Address> addressMap;

	// setters & getters

	public void displayInjectedValues() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("job.title : " + job.getTitle());
		System.out.println("job.department : " + job.getDepartment());
		System.out.println("address.city : " + address.getCity());
		System.out.println("address.pincode : " + address.getPincode());
		System.out.println("jobArray : " + jobArray);
		System.out.println("jobArray.length : " + jobArray.length);
		System.out.println("jobList : " + jobList);
		System.out.println("jobList.size() : " + jobList.size());
		System.out.println("addressSet : " + addressSet);
		System.out.println("addressSet.size() : " + addressSet.size());
		System.out.println("addressMap : " + addressMap);
		System.out.println("addressMap.size() : " + addressMap.size());
		// System.out.println("job.title : " + job.getTitle());
		// System.out.println("job.department : " + job.getDepartment());
		// System.out.println("address.city: " + address.getCity());
		// System.out.println("address.pincode : " + address.getPincode());

	}

	public String getName() {
		return name;
	}

	@Value("sekhar") 
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Job[] getJobArray() {
		return jobArray;
	}

	public void setJobArray(Job[] jobArray) {
		this.jobArray = jobArray;
	}

	public List<Job> getJobList() {
		return jobList;
	}

	public void setJobList(List<Job> jobList) {
		this.jobList = jobList;
	}

	public Set<Address> getAddressSet() {
		return addressSet;
	}

	public void setAddressSet(Set<Address> addressSet) {
		this.addressSet = addressSet;
	}

	public Map<String, Address> getAddressMap() {
		return addressMap;
	}

	public void setAddressMap(Map<String, Address> addressMap) {
		this.addressMap = addressMap;
	}

}
