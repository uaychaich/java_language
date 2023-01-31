import java.text.MessageFormat;

/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-01-31
 */
public class App {
    public static void main(String[] args) throws Exception {
        //before class
        int APersonID=1; String AFullName="Uaychai";double ASalary=5000;
        int BPersonID=2; String BFullName="Yoda";double BSalary=7000;
        int CPersonID=APersonID; String CFullName=AFullName; double CSalary=ASalary;

        //individual
        System.out.println("individual");
        Person p1 = new Person();
        Person p2 = new Person();
        p1.PersonID=1; p1.FullName="Uaychai"; p1.Salary=5000;
        p2.PersonID=2; p2.FullName="Yoda";p2.Salary=7000;
        System.out.println(MessageFormat.format("{0} {1} {2}", p1.PersonID,p1.FullName,p1.Salary));
        System.out.println(MessageFormat.format("{0} {1} {2}", p2.PersonID,p2.FullName,p2.Salary));

        //transfer data
        System.out.println("transfer data");
        Person p3 = p1;
        System.out.println(MessageFormat.format("{0} {1} {2}", p3.PersonID,p3.FullName,p3.Salary));

        //reference data
        System.out.println("reference data");
        p1.Salary = 8000;
        System.out.println(MessageFormat.format("{0} {1} {2}", p3.PersonID,p3.FullName,p3.Salary));
    }
}
