package s.core;

import java.util.List;
import java.util.Map;

public class Student {
	
	private int roll;
	private String name;
	private List<String> skills;
	private Map<String,String> courses;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", skills=" + skills + ", courses=" + courses + "]";
	}
	public Student(int roll, String name, List<String> skills, Map<String, String> courses) {
		super();
		this.roll = roll;
		this.name = name;
		this.skills = skills;
		this.courses = courses;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
	


