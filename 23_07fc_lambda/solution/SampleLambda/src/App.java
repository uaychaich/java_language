public class App {
    public static void main(String[] args) throws Exception {
        Class1 c1 = new Class1();
        System.out.println(c1.Method1(30, 20));

        Class2 c2 = new Class2();
        System.out.println(c2.Method1(30, 20));

        Interface1 ii1 = (x,y)->{return x-y;};
        System.out.println(ii1.Method1(30, 20));
    }
}
