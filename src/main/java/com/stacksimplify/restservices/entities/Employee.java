package com.stacksimplify.restservices.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue
	//@JsonView(Views.External.class)
	private Long empid;
	
	@NotEmpty(message = "Employee Name is mandatory field. PLease provide employee name")
	@Column(name = "name", nullable=false, unique=true)
	private String empname;
	
	@NotEmpty(message = "Department is mandatory")
	@Column(name = "department", nullable = true)
	private String department;
	
	@NotEmpty(message = "The employee must have a salary")
	@Column(name="salary", nullable = true)
	private Float salary;
	
	@NotEmpty(message = "LogTime must be recorded")
	@Column(name="loginTime", nullable = true,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	@CreationTimestamp
	private Date loginTime;
	
	@NotEmpty(message = "LooutTime must be recorded")
	@Column(name="logoutTime", nullable = true,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	@CreationTimestamp
	private Date logoutTime;
	
	@NotEmpty(message = "The lastPromotion Date must be recorded")
	@Column(name="lastPromDate", nullable = true,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	@CreationTimestamp
	private Date lastPromotionDate;

	
	
	public Employee() {
	}

	public Employee(Long empid,
			@NotEmpty(message = "Employee Name is mandatory field. PLease provide employee name") String empname,
			@NotEmpty(message = "Department is mandatory") String department,
			@NotEmpty(message = "LogTime must be recorded") @NotEmpty(message = "LogTime must be recorded") Date loginTime,
			@NotEmpty(message = "LooutTime must be recorded") Date logoutTime,
			@NotEmpty(message = "The employee must have a salary") Float salary,
			@NotEmpty(message = "The lastPromotion Date must be recorded") Date lastPromotionDate) {
		this.empid = empid;
		this.empname = empname;
		this.department = department;
		this.loginTime = loginTime;
		this.logoutTime = logoutTime;
		this.salary = salary;
		this.lastPromotionDate = lastPromotionDate;
	}

	public Long getEmpid() {
		return empid;
	}

	public void setEmpid(Long empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Date getLogoutTime() {
		return logoutTime;
	}

	public void setLogoutTime(Date logoutTime) {
		this.logoutTime = logoutTime;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public Date getLastPromotionDate() {
		return lastPromotionDate;
	}

	public void setLastPromotionDate(Date lastPromotionDate) {
		this.lastPromotionDate = lastPromotionDate;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", department=" + department + ", loginTime="
				+ loginTime + ", logoutTime=" + logoutTime + ", salary=" + salary + ", lastPromotionDate="
				+ lastPromotionDate + "]";
	}

	
	
}
