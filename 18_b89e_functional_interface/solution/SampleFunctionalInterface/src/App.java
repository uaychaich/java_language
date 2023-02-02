/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-02-02
 */
public class App {
    public static void main(String[] args) throws Exception {
        
        //anonymous object
        Interface1 i11 = new Interface1() {

            @Override
            public double Method1(double input1, double input2) {
                return input1*input2;
            }
            
        };
        System.out.println(i11.Method1(5, 6));

        //lambda expression
        Interface1 i12 = (a,b)->a-b;
        System.out.println(i12.Method1(5, 6));

        //use lambda expression as parameter
        Class1 c11 = new Class1();
        double result = c11.MethodNaja(5, 6, (x,y)->x+y);
        System.out.println(result);
    }
}
