import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(20);a1.add(25);a1.add(30);
        System.out.println(a1.get(1));
        a1.set(2, 40);
        a1.forEach((a)->{System.out.println(a);});

        Stack<Integer> a2 = new Stack<>();
        a2.push(100);a2.push(200);a2.push(300);
        int a2Size = a2.size();
        for (int a=0;a<a2Size;a=a+1) {System.out.println(a2.pop());}

        PriorityQueue<Integer> a3 = new PriorityQueue<>();
        a3.add(1000);a3.add(2000);a3.add(4000);
        int a3Size = a3.size();
        for (int a=0;a<a3Size;a=a+1) {System.out.println(a3.poll());}

        Hashtable<String,Integer> a4 = new Hashtable<>();
        a4.put("A", 10000);a4.put("B", 20000);a4.put("C", 30000);
        System.out.println(a4.get("A"));
        a4.forEach((x,y)->{System.out.println(MessageFormat.format("{0} {1}", x, y));});

        ArrayList<Integer> a5 = new ArrayList<>();
        a5.add(10);a5.add(20);a5.add(30);a5.add(40);a5.add(50);a5.add(60);a5.add(70);
        List<Integer> result1 =  a5.stream().filter(x->x>30).sorted(Collections.reverseOrder()).toList();
        for (Integer x : result1) {System.out.println(x);}

        ArrayList<Person> a6 = new ArrayList<>();
        a6.add(new Person("Uaychai", "Chotjaratwanich", 35));
        a6.add(new Person("Anakin", "Skywalker", 55));
        a6.add(new Person("Han", "Solo", 44));
        a6.add(new Person("Yoda", "Naja", 70));
        a6.add(new Person("Leia", "Organa", 34));
        var result2 = a6.stream()
                        .filter(x->x.Age<60)
                        .sorted((x,y)->{return Integer.compare(x.Age, y.Age);})
                        .toList();
        for (Person x : result2) {
            System.out.println(MessageFormat.format("{0} {1}", x.FirstName, x.LastName));
        }
    }
}
