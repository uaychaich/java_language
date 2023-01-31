import java.text.MessageFormat;

/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-01-31
 */
public class App {
    public static void main(String[] args) throws Exception {
        SampleClass sc1 = new SampleClass();
        sc1.Method1();
        
        int a1 = sc1.Method2();System.out.println(a1);
        
        Person a2 = sc1.Method3();System.out.println(MessageFormat.format("{0} {1} {2}", a2.PersonID,a2.FullName,a2.Salary));
        
        sc1.Method4(a1, a2);System.out.println(MessageFormat.format("{0} {1}", a1, a2.Salary));
        
        int[] a3 = new int[]{10,20,30};
        int a4 = sc1.Method5(a3);System.out.println(a4);

        int a5 = sc1.Method6(10,20,30,40);System.out.println(a5);

        int a6 = sc1.Method7(10);System.out.println(a6);

        int a7 = sc1.Method7(20, 30);System.out.println(a7);
    }
}
