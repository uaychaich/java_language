import java.text.MessageFormat;

/*
 * Author: Uaychai Chotjaratwanich
 * Modified Day: 2023-01-30
 */
public class Person {
    //field
    public int PersonID;
    public String FirstName,LastName;
    public double Salary;

    public void setPersonID(int inputPersonID)throws IllegalArgumentException{
        if(inputPersonID>0){
            PersonID=inputPersonID;
        }else{throw new IllegalArgumentException("inputPersonID must be more than zero");}
    }
    public void setFirstName(String inputFirstName){
        if(inputFirstName.length()>0){
            FirstName = inputFirstName;
        }else{throw new IllegalArgumentException("No of inputFirstName's character must be more than zero");}
    }
    public void setLastName(String inputLastName){
        if(inputLastName.length()>0){
            LastName = inputLastName;
        }else{throw new IllegalArgumentException("No of inputLastName's character must be more than zero");}
    }
    public void setSalary(double inputSalary) throws IllegalArgumentException{
        if(inputSalary> 0){
            Salary=inputSalary;
        }else{throw new IllegalArgumentException("inputSalary must be more than zero");}
    }
    public int getPersonID(){return PersonID;}
    public String getFirstName(){return FirstName;}
    public String getLastName(){return LastName;}
    public String getFullName(){return MessageFormat.format("{0} {1}", FirstName, LastName);}
    public double getSalary(){return Salary;}
}
