import java.util.regex.*;
import java.util.Scanner;
class PersonalDetails {

    private String name;
    private int DOB;
    private String phonenumber;
    private String emailID;
    /*This constructor uses setters to all the attributes of this class
      @params name,DOB,phonenumber,emailID
      @return void
     */

    public PersonalDetails(String name, int DOB, String phonenumber, String emailID) {
        setName(name);
        setDOB(DOB);
        setPhonenumber(phonenumber);
        setEmailID(emailID);
    }
    /*getter method for name attribute
      @params none
      @return string
     */

    public String getName() {
        return name;
    }
    /*setter method for name attribute checks if number of characters
      in name String is greater than 40
      @params name
      @return void
     */

    public void setName(String name) {
        if(name.length()>40){
            throw new IllegalArgumentException("Invalid Name, Must be below 40 characters");
        }
        else{
            this.name = name;
        }
    }
    /*getter method for DateOfBirth
      @params none
      @return int
     */
    public int getDOB() {
        return DOB;
    }
    /*setter method for DateOfBirth
      @params none
      @return string
     */
    public void setDOB(int DOB) {
        this.DOB = DOB;
    }
    /*getter method for phonenumber
      @params none
      @return string
     */
    public String getPhonenumber() {
        return phonenumber;
    }
    /*setter method for phonenumber, sanity check using pattern match
      @params phonenumber
      @return void
     */

    public void setPhonenumber(String phonenumber) {
        Pattern p = Pattern.compile("(1)?[7-9][0-9]{9}");
        Matcher m = p.matcher(phonenumber);
        if(!(m.find() && m.group().equals(phonenumber)))
        {
            throw new IllegalArgumentException("Invalid Phone Number");
        }

        this.phonenumber = phonenumber;
    }
    /*getter method for EmailID
      @params none
      @return string
     */
    public String getEmailID() {
        return emailID;
    }
    /*Setter method for EmailID attribute
      Checks whether '@' sign is present or not in address
      also checks for '.' after emailID
      @params EmailID
      @return void
     */
    public void setEmailID(String emailID) {
        int i =0;
        int count = 0;
        boolean attrue = false;
        int posattrue = 0;
        boolean dottrue = false;
        for (; i < emailID.length(); i++) {
            if (emailID.charAt(i) == '@') {
                count++;
                posattrue = i;
                if (count == 1) {
                    attrue = true;
                }
            }
        }
        for ( i = posattrue,count=0; i < emailID.length(); i++) {
            if (emailID.charAt(i) == '.') {
                count++ ;
            }
            if(count == 1)
            {
                dottrue = true;
            }
        }
        if(attrue&dottrue==true) {
            this.emailID = emailID;

        }
        else {
            throw new IllegalArgumentException("Invalid EmailID");
        }
    }

}