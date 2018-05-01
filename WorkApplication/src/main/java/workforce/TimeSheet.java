package workforce;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "timesheet")
public class TimeSheet {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="timesheetId")
	private int timesheetId;
	
	public int getTimesheetID() {
		return timesheetId;
	}

	public void setTimesheetID(int timesheetID) {
		this.timesheetId = timesheetID;
	}

	public int getClockIn() {
		return clockIn;
	}

	public void setClockIn(int clockIn) {
		this.clockIn = clockIn;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getClockOut() {
		return clockOut;
	}

	public void setClockOut(int clockOut) {
		this.clockOut = clockOut;
	}

	public int getTotalhours() {
		return totalhours;
	}

	public void setTotalhours(int totalhours) {
		this.totalhours = totalhours;
	}

	public int getPayrate() {
		return payrate;
	}

	public void setPayrate(int payrate) {
		this.payrate = payrate;
	}

	@Column(name="clockIn")
	private int clockIn;
	
	@Column(name="userId")
	private int userId;
	
	@Column(name="clockOut")
	private int clockOut;
	
	@Column(name="totalhours")
	private int totalhours;
	
	@Column(name="payrate")
	private int payrate;
	
	
}
