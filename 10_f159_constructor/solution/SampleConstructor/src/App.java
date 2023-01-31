import java.text.MessageFormat;

/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-01-31
 */
public class App {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        System.out.println(MessageFormat.format("{0} {1} {2}", p1.PersonID, p1.FullName, p1.Salary));

        Person p2 = new Person(5, "Uaychai", 90000);
        System.out.println(MessageFormat.format("{0} {1} {2}", p2.PersonID, p2.FullName, p2.Salary));
    }
}
