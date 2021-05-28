package com.cg.oms.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ProgramScheduled {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int scheduleId;	
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name = "branch_Id",referencedColumnName = "branchId")
	private Branch branch;
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name = "course_Id",referencedColumnName = "courseId")
	private Course course;
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name = "program_Id",referencedColumnName = "programId")
	private Program program;
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name = "college_Id",referencedColumnName = "collegeRegId")
	private College college;
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name = "university_Id",referencedColumnName = "universityId")
	private University university;	
	private LocalDate startDate;
	private LocalDate endDate;
	
	public ProgramScheduled(Branch branch, Course course, Program program, College college,
			University university, LocalDate startDate, LocalDate endDate) {
		super();
		
		this.branch = branch;
		this.course = course;
		this.program = program;
		this.college = college;
		this.university = university;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Program getProgram() {
		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	
	@Override
	public String toString() {
		return "ProgramScheduled [scheduleId=" + scheduleId + ", branch=" + branch + ", course=" + course + ", program="
				+ program + ", college=" + college + ", university=" + university + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}	
	

}
