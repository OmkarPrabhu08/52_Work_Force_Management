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
	
	@GetMapping("/login")
	public String login(Model model) 
	{
		return "login";
	}
	
	@RequestMapping(value="validate", method = RequestMethod.POST)
	public String validate(@RequestParam("login")String userName, @RequestParam("password")String password, Model model) {
		
		if(!userName.contains("@workforce.com"))
		{
			model.addAttribute("message", "Username is invalid");
			return "login";
		}
		if(user==null)
		{
			user = new User("XYZ", "aasas");
			return "userHomePage";
		}
		else
		{
			model.addAttribute("message", "Invalid UserName or Password. Please try again!");
			return "loginPage";
		}
	}
}
