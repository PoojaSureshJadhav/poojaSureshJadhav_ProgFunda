package com.gradedproject.q1;

public class HrDepartment extends SuperDepartment {

	String departmentName() {
		return "HR Department";
	}
	String getTodaysWork() {
		return "Complete your documents submission";    //return "Fill today’s timesheet and mark your attendance"
	}
	String getWorkDeadline() {
		return "Complete by EOD";
	}
	String doActivity() {
		return "Team Lunch";
	}

}
