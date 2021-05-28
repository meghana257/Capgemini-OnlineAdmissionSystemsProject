package com.cg.oms.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseId;
	private String courseName;
	private String description;
	private String eligibility;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="CollegeId",referencedColumnName="collegeRegId")
	private College college;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "courseId")
	private List<Branch> branches;
	
	public Course(int courseId, String courseName, String description, String eligibility, College college,
			List<Branch> branches) {
		super();
		this.courseName = courseName;
		this.description = description;
		this.eligibility = eligibility;
		this.college = college;
		this.branches = branches;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEligibility() {
		return eligibility;
	}

	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public List<Branch> getBranches() {
		return branches;
	}

	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", description=" + description
				+ ", eligibility=" + eligibility + ", college=" + college + ", branches=" + branches + "]";
	}
	
	

}
