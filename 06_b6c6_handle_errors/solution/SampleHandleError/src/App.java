import java.text.MessageFormat;

/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-01-30
 */
public class App {
    public static void main(String[] args) throws Exception {
        //throw error
        int age = 25;
        if(age>0){System.out.println(MessageFormat.format("Age is {0}", age));}
        else{throw new Exception("Age is incorrect");}
        
        //normal
        int a1 = 15;int a2 = 3;
        System.out.println(a1/a2);

        //try-catch-finally
        System.out.println("try-catch-finally");
        try{
            int b1 = 15;int b2 = 3;
            System.out.println(b1/b2);
        }
        catch(ArithmeticException e){
            System.out.println("b2 cannot be zero");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("finally");
        }
    }
}
