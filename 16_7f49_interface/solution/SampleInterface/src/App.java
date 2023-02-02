/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-02-02
 */
public class App {
    public static void main(String[] args) throws Exception {
        Class1 c11 = new Class1();
        Class2 c21 = new Class2();

        //anonymous object
        Interface1 i12 = new Interface1() {

            @Override
            public int Method1(int input1, int input2) {
                return input1-input2;
            }

            @Override
            public int Method2(int input1, int input2) {
                return input1+input2;
            }
            
        };

        //polymorphism
        Interface1 i11 = c11;
        System.out.println(i11.Method1(100, 200));
    }
}
