import java.text.MessageFormat;

/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-01-31
 */
public class App {
    public static void main(String[] args) throws Exception {
        Class1 c11 = new Class1();System.out.println(MessageFormat.format("{0} {1}", c11.field1,c11.Method1()));
        Class1_1 c111 = new Class1_1();System.out.println(MessageFormat.format("{0} {1}", c111.field1,c111.Method1()));
        Class1_2 c121 = new Class1_2();System.out.println(MessageFormat.format("{0} {1} {2} {3}", 
                                                            c121.field1,c121.field2,c121.Method1(),c121.Method2()));
        Class1_3 c131 = new Class1_3();System.out.println(MessageFormat.format("{0} {1}", c131.field1,c131.Method1()));
    }
}
