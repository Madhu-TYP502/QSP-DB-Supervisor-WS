package com.tyss.dashboard.supervisor.model.dashboard.component;

public class AutomationScripts {

	private int totalStudentsWritten;
	private int totalStudentNotsWritten;
	private double avgStepsperScript;
	private double avgStcripts;

	public int getTotalStudentsWritten() {
		return totalStudentsWritten;
	}

	public void setTotalStudentsWritten(int totalStudentsWritten) {
		this.totalStudentsWritten = totalStudentsWritten;
	}

	public int getTotalStudentNotsWritten() {
		return totalStudentNotsWritten;
	}

	public void setTotalStudentNotsWritten(int totalStudentNotsWritten) {
		this.totalStudentNotsWritten = totalStudentNotsWritten;
	}

	public double getAvgStepsperScript() {
		return avgStepsperScript;
	}

	public void setAvgStepsperScript(double avgStepsperScript) {
		this.avgStepsperScript = avgStepsperScript;
	}

	public double getAvgStcripts() {
		return avgStcripts;
	}

	public void setAvgStcripts(double avgStcripts) {
		this.avgStcripts = avgStcripts;
	}

}
