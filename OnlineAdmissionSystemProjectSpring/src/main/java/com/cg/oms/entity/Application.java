package com.cg.oms.entity;
import java.time.LocalDate;
public class Application
{
	private Integer applicationId;
	private String applicantFullName;
	private LocalDate dateOfBirth;
	private String highestQualification;
	private double finalYearPercentage;
	private String goals;
	private String emailId;
	private ProgramScheduled schedule;
	private String applicationStatus;//Applied/ScheduleForInterview/InterViewCompleted/ApplicationAccepted/ApplicationRejected
	private LocalDate dateOfInterview;
	private String applicantInterviewFeedback;
}
