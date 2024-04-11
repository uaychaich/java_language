import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        p1.setFirstName("Uaychai");
        p1.setLastName("Chotjaratwanich");
        p1.setBirthday(LocalDate.of(1999,10,25));

        System.out.println(MessageFormat.format("{0} {1} {2}", p1.getFirstName(), p1.getLastName(), p1.getBirthday()));
    }
}
