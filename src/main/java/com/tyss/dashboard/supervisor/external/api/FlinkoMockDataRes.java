package com.tyss.dashboard.supervisor.external.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tyss.dashboard.supervisor.model.FlinkoUser;

@Service
public class FlinkoMockDataRes {

	private List<FlinkoUser> flinkoUsers = new ArrayList<FlinkoUser>();

	/*
	 * { String timeStamp = new
	 * SimpleDateFormat("dd:MM:YYYY HH:mm:ss").format(Calendar.getInstance().getTime
	 * ());
	 * 
	 * Random random = new Random(); for (int i = 1; i <= 10; i++) { int mt =
	 * random.nextInt(10, 50); int at = random.nextInt(10, 50);
	 * 
	 * FlinkoUser flinkoUser = new FlinkoUser(); flinkoUser.setName("user " + i);
	 * flinkoUser.setPhone("987654321" + i); flinkoUser.setEmail("user" + i +
	 * "@testmail.com"); flinkoUser.setTotalTestCasesWritten(at + mt);
	 * flinkoUser.setAvgNoOfStepsPerTestCases(flinkoUser.getTotalTestCasesWritten()
	 * / 6); flinkoUser.setRecentLogin(timeStamp);
	 * flinkoUser.setTotalAutomationScriptWritten(mt);
	 * flinkoUser.setTotalManualTestCasesWritten(at);
	 * 
	 * flinkoUsers.add(flinkoUser);
	 * 
	 * } }
	 */

	public List<FlinkoUser> getUsers() {

		return flinkoUsers;

	}

	public ResponseEntity<String> addUsers(List<FlinkoUser> flinkoUsersList) {

		 flinkoUsers = flinkoUsersList;
		 return ResponseEntity.status(HttpStatus.ACCEPTED).body("mock data addded");

	}

}
