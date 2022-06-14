package com.tyss.dashboard.supervisor.model.dashboard.component;

public class ManualTestCases {

	private int totalStudentsWritten;
	private int totalStudentNotsWritten;
	private double avgTestCases;
	private double avgStepsPerTestCase;

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

	public double getAvgTestCases() {
		return avgTestCases;
	}

	public void setAvgTestCases(double avgTestCases) {
		this.avgTestCases = avgTestCases;
	}

	public double getAvgStepsPerTestCase() {
		return avgStepsPerTestCase;
	}

	public void setAvgStepsPerTestCase(double avgStepsPerTestCase) {
		this.avgStepsPerTestCase = avgStepsPerTestCase;
	}

}
