package com.tyss.dashboard.supervisor.model.dashboard.component;

public class DashboardComponents {

	private StudentsInfo studentsInfo;
	private ManualTestCases manualTestCases;
	private AutomationScripts automationScripts;

	public StudentsInfo getStudentsInfo() {
		return studentsInfo;
	}

	public void setStudentsInfo(StudentsInfo studentsInfo) {
		this.studentsInfo = studentsInfo;
	}

	public ManualTestCases getManualTestCases() {
		return manualTestCases;
	}

	public void setManualTestCases(ManualTestCases manualTestCases) {
		this.manualTestCases = manualTestCases;
	}

	public AutomationScripts getAutomationScripts() {
		return automationScripts;
	}

	public void setAutomationScripts(AutomationScripts automationScripts) {
		this.automationScripts = automationScripts;
	}

}
