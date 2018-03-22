import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login {
	Login(){    
		JFrame f=new JFrame("ViOA");
				
		JButton button =new JButton("Login");    
		button.setBounds(100,200,140, 40);    

		JLabel label = new JLabel();		
		label.setText("User Name: ");
		label.setBounds(10, 10, 100, 100);
		
		JLabel pwd = new JLabel();		
		pwd.setText("Password: ");   
		pwd.setBounds(10, 60, 100, 100);
					
		JLabel blank = new JLabel();
		blank.setBounds(10, 110, 200, 100);
					
		JTextField textfield= new JTextField();
		textfield.setBounds(110, 50, 130, 30);
		
		JTextField pwdtext= new JTextField();
		pwdtext.setBounds(110, 100, 130, 30);
					
		f.add(blank);
		f.add(textfield);
		f.add(label);
		f.add(button); 
		f.add(pwd);
		f.add(pwdtext);
		f.setSize(1000,1000);    
		f.setLayout(null);    
		f.setVisible(true);    
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
						
		button.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
					label1.setText("Login complete");				
			}          
	      });
		}         
	
	
		public static void main(String[] args) {    
		    new Login();    
		}    
 }
