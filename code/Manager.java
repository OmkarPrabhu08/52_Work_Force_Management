public class Manager extends User{
	int managerID;
	
	void createNewSchedule()
	{
		// Create a new schedule an store in the Database
		/*We can get inputs about the employee name and the details about the schedule from the UI
		 * which would be a list picker*/
	}
	
	void approveSchedule()
	{
		// Approve the submitted schedule by the employee
		/*The submitted schedule would be visible to the manager via the UI*/
	}
	
	void editSchedule()
	{
		// Edit the schedule for a particular employee
		/*We can get inputs about the employee name and the details about the schedule from the UI
		 * which would be a list picker*/
	}
	
	Boolean createNewAccount()
	{
		// Create a new account for a employee and if successful return True else return False 
		/*We can get inputs about the employee details from the UI
		 * which would be a list picker*/
		return true;
	}
	
	void viewRequest()
	{
		// View the request submitted by the employees
		/* Request would be viewed by the manager via UI */
		
	}
	
	void giveEmployeeReviews(Employee employeeName, int employeePoints)
	{
		// Give points to employee
	}
	
	void editProfile(Employee employeeName)
	{
		// Edit the profiles of the employees
	}
	
}
