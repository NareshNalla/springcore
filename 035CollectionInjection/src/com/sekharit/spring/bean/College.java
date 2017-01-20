package com.sekharit.spring.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class College {
	private String collegeName;
	private List<String> trainersList;
	private List<Student> studentsList;
	private Set<String> trainersSet;
	private Set<Student> studentsSet;
	private String[] trainersArray;
	private Student[] studentsArray;
	private Map<Integer, String> trainersMap;
	private Map<Integer, Student> studentsMap;
	private Properties dbProperties;

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public void setTrainersList(List<String> trainersList) {
		this.trainersList = trainersList;
	}

	public void setStudentsList(List<Student> studentsList) {
		this.studentsList = studentsList;
	}

	public void setTrainersSet(Set<String> trainersSet) {
		this.trainersSet = trainersSet;
	}

	public void setStudentsSet(Set<Student> studentsSet) {
		this.studentsSet = studentsSet;
	}

	public void setTrainersArray(String[] trainersArray) {
		this.trainersArray = trainersArray;
	}

	public void setStudentsArray(Student[] studentsArray) {
		this.studentsArray = studentsArray;
	}

	public void setTrainersMap(Map<Integer, String> trainersMap) {
		this.trainersMap = trainersMap;
	}

	public void setStudentsMap(Map<Integer, Student> studentsMap) {
		this.studentsMap = studentsMap;
	}

	public void setDbProperties(Properties dbProperties) {
		this.dbProperties = dbProperties;
	}

	public void displayInjectedCollections() {
		sop("collegeName : " + collegeName);
		
		sop("List with primitive values ...");
		sop("trainersList :" + trainersList);
		sop("List with object values ...");
		sop("studentsList :" + studentsList);

		sop("Set with primitive values ...");
		sop("trainersSet :" + trainersSet);
		sop("Set with object values ...");
		sop("studentsSet :" + studentsSet);
		
		sop("Array with primitive values ...");
		sop("trainersArray:" + Arrays.asList(trainersArray));
		sop("Array with object values ...");
		sop("studentsArray :" + Arrays.asList(studentsArray));
		
		sop("Map with primitive values ...");
		sop("trainersMap:" + trainersMap);
		sop("Map with object values ...");
		sop("studentsMap :" + studentsMap);
		
		sop("Properties with key-value pairs...");
		sop("dbProperties : "+dbProperties);
		

	}

	public void sop(Object object) {
		System.out.println(object);
	}

}
