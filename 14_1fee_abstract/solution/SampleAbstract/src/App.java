/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-02-02
 */
public class App {
    public static void main(String[] args) throws Exception {
        Class1 c11;
        Class1_1 c111 = new Class1_1();c111.field1=100;System.out.println(c111.Method2());
        Class1_2 c121 = new Class1_2();c121.field1=200;System.out.println(c121.Method2());

        //Anonymous Class
        Class1 c1a = new Class1() {

            @Override
            public int Method1(int input1, int input2) {
                return input1-input2-this.field1;
            }
            
        };c1a.field1=300;System.out.println(c1a.Method2());
        
        //last result
        c11 = c111;
        System.out.println(c11.Method1(23, 7));
    }
}
