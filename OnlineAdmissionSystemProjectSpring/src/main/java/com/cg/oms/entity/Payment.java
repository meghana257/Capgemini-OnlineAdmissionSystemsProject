package com.cg.oms.entity;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Payment 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentId;
	private String emailIdOfStudent;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	JoinColumn(name="PaymentId",refere)
	private String applicationId;
	
	private double paymentAmount;
	private String paymentDescription;
	private LocalDate paymentDate;
	private String paymentStatus;
	
	public Payment(int paymentId, String emailIdOfStudent, String applicationId, double paymentAmount,
			String paymentDescription, LocalDate paymentDate, String paymentStatus) {
		super();
		this.paymentId = paymentId;
		this.emailIdOfStudent = emailIdOfStudent;
		this.applicationId = applicationId;
		this.paymentAmount = paymentAmount;
		this.paymentDescription = paymentDescription;
		this.paymentDate = paymentDate;
		this.paymentStatus = paymentStatus;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getEmailIdOfStudent() {
		return emailIdOfStudent;
	}
	public void setEmailIdOfStudent(String emailIdOfStudent) {
		this.emailIdOfStudent = emailIdOfStudent;
	}
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getPaymentDescription() {
		return paymentDescription;
	}
	public void setPaymentDescription(String paymentDescription) {
		this.paymentDescription = paymentDescription;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	

	
}
