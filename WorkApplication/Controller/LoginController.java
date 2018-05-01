package workforce;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class LoginController {

	public User user;
	public PersonalDetails personaldetails;
	public Database dbConnection = new Database();
	public int exchangeUserId;
	
	@GetMapping("/login")
	public String login(Model model) 
	{
		return "login";
	}
	
	@RequestMapping(value="validate", method = RequestMethod.POST)
	public String processCredentials(@RequestParam("login")String userName, @RequestParam("password")String password, Model model) {
		
		user = dbConnection.validateLoginUser(userName, password);
		if(user!=null)
		{
			return "homepage";
		}
		else
		{
			model.addAttribute("message", "Invalid UserName or Password. Please try again!");
			return "loginPage";
		}
	}
	@RequestMapping(value="clockIn", method = RequestMethod.GET)
	public String ClockInTime(Model model)
	{
		return "clockin";
	}
	
	@RequestMapping(value="viewprofiles", method = RequestMethod.GET)
	public String ViewProfiles(Model model) {
		
		return "viewProfile";
	}
	
	@RequestMapping(value="viewschedule", method = RequestMethod.GET)
	public String ViewSchedule(Model model)
	{
		return "viewSchedule";
	}
	
	@RequestMapping(value="exchangeShift", method = RequestMethod.GET)
	public String ExchangeShift(Model model)
	{
		return "exchangeShift";
	}
	
	@RequestMapping(value="getuser", method = RequestMethod.POST)
	public String GetUserProfile(@RequestParam("userId")int userId, Model model) {
		
		personaldetails = dbConnection.viewProfileFunct(userId);
		
		
		model.addAttribute("firstName", personaldetails.getFirstName());
		model.addAttribute("lastName", personaldetails.getLastName());
		model.addAttribute("phonenumber", personaldetails.getPhonenumber());
		model.addAttribute("emailID", personaldetails.getEmailID());
		model.addAttribute("DOB", personaldetails.getDOB());
		
		return "viewProfile";
	}

	@RequestMapping(value="getuserschedule", method = RequestMethod.POST)
	public String GetUserSchedule(@RequestParam("userId")int userId, Model model) {
		
		List<EmployeeSchedule> ls= dbConnection.viewEmployeeSchedule(userId);
		exchangeUserId = userId;
		
		model.addAttribute("searchResults", ls);
		return "viewSchedule";
	}
	
	@RequestMapping(value="getusersschedule", method = RequestMethod.POST)
	public String GetUsersSchedule(@RequestParam("userId")int userId,Model model) {
		
		List<EmployeeSchedule> ls= dbConnection.viewEmployeeSchedule(userId);
		exchangeUserId = userId;
		model.addAttribute("searchResults", ls);
		return "exchangeShift";
	}
	
	@RequestMapping(value="exchangeshifter", method = RequestMethod.POST)
	public String ExchangeShifter(Model model) {
		
		dbConnection.UpdateExchange(exchangeUserId, user.getUserId());
		return "exchangeShift";
	}
	
	@RequestMapping(value="ClockInTime", method = RequestMethod.POST)
	public String ClockIn(@RequestParam("timesheetId")int userId, Model model) {
		
		timesheet = dbConnection.loadTime(userId);
		
		
		model.addAttribute("ClockIn", timesheet.getClockIn());
		
		
		return "clockin";
	}


	
}
