import org.sql2o.*;
import java.util.List;

public class Stylist {
    private String firstName;
    private String secondName;
    private String lastName;
    private String phoneNo;
    private String idNo;
    private String email;
    private int id;

    public Stylist(String firstName, String secondName, String lastName, String phoneNo, String idNo, String email){
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.idNo = idNo;
        this.email = email;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getSecondName(){
        return secondName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPhoneNo(){
        return phoneNo;
    }
    public String getIdNo(){
        return idNo;
    }
    public String getEmail(){
        return email;
    }
    public int getId(){
        return id;
    }
}