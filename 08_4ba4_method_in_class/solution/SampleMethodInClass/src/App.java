import java.text.MessageFormat;

/*
 * Author: Uaychai Chotjaratwanich
 * Modified Day: 2023-01-30
 */
public class App {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        p1.setPersonID(1);
        p1.setFirstName("Uaychai");
        p1.setLastName("Chotjaratwanich");
        p1.setSalary(60000);
        System.out.println(MessageFormat.format("{0} {1} {2}",p1.getPersonID(),p1.getFullName(),p1.getSalary()));
    }
}
