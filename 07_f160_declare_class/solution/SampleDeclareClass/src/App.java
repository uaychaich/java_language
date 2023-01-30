import java.text.MessageFormat;

/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-01-30
 */
public class App {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        p1.PersonID=1; p1.FullName="Uaychai"; p1.Salary=5000;
        System.out.println(MessageFormat.format("{0} {1} {2}", p1.PersonID,p1.FullName,p1.Salary));
    }
}
