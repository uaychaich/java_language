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

        //Super class receives Sub class
        System.out.println("Super class receives Sub class");
        System.out.println(c11 instanceof Class1);
        System.out.println(c11.Method1());
        c11=c111;
        System.out.println(c11 instanceof Class1);
        System.out.println(c11.Method1());
        
        //Change back
        System.out.println("Change back");
        Class1_1 result = (Class1_1)c11;
        System.out.println(MessageFormat.format("{0} {1}", result.field1, result.Method1()));

        //switch to change back
        System.out.println("switch to change back");
        switch(c11){
            case (Class1_1 result1): 
                System.out.println(MessageFormat.format("Class1_1: {0} {1}", result1.field1, result1.Method1()));break;
            case (Class1_2 result2): 
                System.out.println(MessageFormat.format("Class1_2: {0} {1}", result2.field1, result2.Method1()));break;
            default:
                System.out.println("I don't know");
        }
    }
}
