import java.text.MessageFormat;

/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-02-03
 */
public class App {
    public static void main(String[] args) throws Exception {
        Class1 c11 = new Class1();
        System.out.println(MessageFormat.format("{0} {1} {2} {3} {4}", c11.field1, c11.field2, c11.Method1(), c11.Method2(), c11.Method3()));
        System.out.println(MessageFormat.format("{0} {1}", Class1.field1, Class1.Method1()));

        Class1.field1=100;
        System.out.println(MessageFormat.format("{0} {1} {2} {3} {4}", c11.field1, c11.field2, c11.Method1(), c11.Method2(), c11.Method3()));
        System.out.println(MessageFormat.format("{0} {1}", Class1.field1, Class1.Method1()));
    }
}
