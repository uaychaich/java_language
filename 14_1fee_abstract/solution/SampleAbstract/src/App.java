/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-02-01
 */
public class App {
    public static void main(String[] args) throws Exception {
        Class1 c11;
        Class1_1 c111 = new Class1_1();
        Class1_2 c121 = new Class1_2();
        
        c11 = c111;
        System.out.println(c11.Method1(5, 7));
    }
}
