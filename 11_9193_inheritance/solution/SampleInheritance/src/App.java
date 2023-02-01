import java.text.MessageFormat;

/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-02-01
 */
public class App {
    public static void main(String[] args) throws Exception {
        Class1 c11 = new Class1();System.out.println(MessageFormat.format("{0} {1}", c11.field1,c11.Method1()));
        Class1_1 c111 = new Class1_1();System.out.println(MessageFormat.format("{0} {1}", c111.field1,c111.Method1()));
        Class1_2 c121 = new Class1_2();System.out.println(MessageFormat.format("{0} {1} {2} {3}", 
                                                            c121.field1,c121.field2,c121.Method1(),c121.Method2()));
        Class1_3 c131 = new Class1_3();System.out.println(MessageFormat.format("{0} {1}", c131.field1,c131.Method1()));
        Class1_4 c141 = new Class1_4();System.out.println(MessageFormat.format("{0} {1}", c141.field1,c141.Method1()));
        Class1_4_1 c1411 = new Class1_4_1();System.out.println(MessageFormat.format("{0} {1}", c1411.field1,c1411.Method1()));
    }
}
