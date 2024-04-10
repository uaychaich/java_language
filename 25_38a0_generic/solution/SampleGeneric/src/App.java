public class App {
    public static void main(String[] args) throws Exception {
        Class1<String,String> c11 = new Class1<String,String>();
        c11.printSomething("Uaychai", "Chotjaratwanich");
        c11.printSomething2(20);

        Class1<Integer,Integer> c12 = new Class1<Integer,Integer>();
        c12.printSomething(50,60);
        c12.printSomething2("Yoda");
    }
}
