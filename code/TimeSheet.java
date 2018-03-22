import java.time.LocalDateTime;

public class TimeSheet {
    LocalDateTime timeIn;
    LocalDateTime timeOut;

    void clockin(int EmployeeID)
    {
        timeIn= LocalDateTime.now();
        //TODO: many more steps needed here; interact with database or create a session for the
        //TODO: employee somehow
    }

    void clockout(int EmployeeID)
    {
        timeOut = LocalDateTime.now();
        //TODO: many more steps needed here; interact with database or end the session for the
        //TODO: employee somehow
    }

}
