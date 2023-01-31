/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-01-31
 */
public class Person{
    //field
    public int PersonID;
    public String FullName;
    public double Salary;
    
    //method
    public void SetSalary(double inputSalary) throws IllegalArgumentException{
        if(inputSalary>=0){Salary=inputSalary;}
        else{throw new IllegalArgumentException("inputSalary must be more than zero");}
    }
    public double GetSalary(){return Salary;}

    //constructor
    public Person(){PersonID=0; FullName="";Salary=0;}
    public Person(int inputPersonID,String inputFullName, double inputSalary){
        PersonID=inputPersonID;FullName=inputFullName;Salary=inputSalary;
    }
}