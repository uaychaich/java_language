import java.text.MessageFormat;

/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-01-31
 */
public class App {
    public static void main(String[] args) throws Exception {
        Class1 c11 = new Class1();System.out.println(MessageFormat.format("{0} {1}", c11.field1,c11.Method1()));
        Class1_1 c111 = new Class1_1();System.out.println(MessageFormat.format("{0} {1}", c111.field1,c111.Method1()));
    }
}
