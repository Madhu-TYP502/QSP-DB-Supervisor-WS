package com.tyss.dashboard.supervisor.model;

public class FlinkoUser {

	private String name;
	private String phone;
	private String email;
	private int totalTestCasesWritten;
	private double avgNoOfStepsPerTestCases;
	private String recentLogin;
	private int totalManualTestCasesWritten;
	private int totalAutomationScriptWritten;
	private boolean registered;
	

	public int getTotalManualTestCasesWritten() {
		return totalManualTestCasesWritten;
	}

	public void setTotalManualTestCasesWritten(int totalManualTestCasesWritten) {
		this.totalManualTestCasesWritten = totalManualTestCasesWritten;
	}

	public int getTotalAutomationScriptWritten() {
		return totalAutomationScriptWritten;
	}

	public void setTotalAutomationScriptWritten(int totalAutomationScriptWritten) {
		this.totalAutomationScriptWritten = totalAutomationScriptWritten;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTotalTestCasesWritten() {
		return totalTestCasesWritten;
	}

	public void setTotalTestCasesWritten(int totalTestCasesWritten) {
		this.totalTestCasesWritten = totalTestCasesWritten;
	}

	public double getAvgNoOfStepsPerTestCases() {
		return avgNoOfStepsPerTestCases;
	}

	public void setAvgNoOfStepsPerTestCases(double avgNoOfStepsPerTestCases) {
		this.avgNoOfStepsPerTestCases = avgNoOfStepsPerTestCases;
	}

	public String getRecentLogin() {
		return recentLogin;
	}

	public void setRecentLogin(String timeStamp) {
		this.recentLogin = timeStamp;
	}

	public boolean isRegistered() {
		return registered;
	}

	public void setRegistered(boolean registered) {
		this.registered = registered;
	}

}
