import java.text.MessageFormat;

/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-02-01
 */
public class App {
    public static void main(String[] args) throws Exception {
        Class1 c11 = new Class1();c11.field1=50;
        Class1_1 c111 = new Class1_1();c111.field1=200;
        Class1_2 c121 = new Class1_2();c121.field1=500;

        System.out.println(c11 instanceof Class1);
        System.out.println(c11.Method1());
        c11=c111;
        System.out.println(c11 instanceof Class1);
        System.out.println(c11.Method1());
        c11=c121;
        System.out.println(c11 instanceof Class1);
        System.out.println(c11.Method1());
    }
}
