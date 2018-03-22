
import java.util.ArrayList;

public class Employee extends User
{
    int EmployeePoints;
    float PayRate;
    String EmployeeName;
    ArrayList<String> Schedule;
    TimeSheet timeSheet;

    public Employee(int employeePoints, float payRate, String employeeName,
                    ArrayList<String> schedule, TimeSheet timeSheet, String username,
                    String password){

        super(username, password, Role.EMPLOYEE);

        setEmployeePoints(employeePoints);
        setPayRate(payRate);
        setEmployeeName(employeeName);
        setSchedule(schedule);
    }

    public int getEmployeePoints() {
        return EmployeePoints;
    }

    public void setEmployeePoints(int employeePoints) {

        if(EmployeePoints<0)
            throw new IllegalArgumentException("Employee points has to be greater than 0");

        EmployeePoints = employeePoints;
    }

    public float getPayRate() {
        return PayRate;
    }

    public void setPayRate(float payRate) {

        if(payRate<=0)
            throw new IllegalArgumentException("payRate has to be positive");

        PayRate = payRate;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        if(employeeName.length()>70)
            throw new IllegalArgumentException("Employee Name has be less than 70 characters in length");

        EmployeeName = employeeName;
    }

    public ArrayList<String> getSchedule() {
        return Schedule;
    }

    public void setSchedule(ArrayList<String> schedule) {
        Schedule = schedule;
    }

    public Time getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Time timeIn) {
        this.timeIn = timeIn;
    }

    public Time getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Time timeOut) {
        this.timeOut = timeOut;
    }
    
    //TODO:
    public void submitSchedule()
    {
        
    }
    //TODO:
    public void exchangeShift()
    {
        
    }
    //TODO:
    public void dropShift()
    {
        
    }
}
