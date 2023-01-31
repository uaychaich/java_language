import java.text.MessageFormat;

/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-01-31
 */
public class App {
    public static void main(String[] args) throws Exception {
        //Arithmetic Operators
        double a1=50,a2=20;
        System.out.println("Arithmetic Operators");
        System.out.println(a1+a2);
        System.out.println(a1-a2);
        System.out.println(a1*a2);
        System.out.println(a1/a2);
        System.out.println(a1%a2);

        //Concat Operators
        String b1="Uaychai",b2="Chotjaratwanich";
        System.out.println("Concat Operators");
        System.out.println(b1+b2);

        //Compare Operators
        double c1=50,c2=20;
        System.out.println("Compare Operators");
        System.out.println(c1==c2);
        System.out.println(c1!=c2);
        System.out.println(c1>c2);
        System.out.println(c1>=c2);
        System.out.println(c1<c2);
        System.out.println(c1<=c2);

        //Conditional Operators
        boolean d1=true,d2=false;
        System.out.println("Conditional Operators");
        System.out.println(d1&&d2);
        System.out.println(d1||d2);
        System.out.println(!d1);
        System.out.println(d1?1:2);

        //Unary Operators
        int e1=1;
        System.out.println("Unary Operators");
        System.out.println(e1++ + 1);System.out.println(e1);
        e1=1;
        System.out.println(++e1 + 1);System.out.println(e1);
        e1=1;
        System.out.println(e1-- + 1);System.out.println(e1);
        e1=1;
        System.out.println(--e1 + 1);System.out.println(e1);
        e1=1;e1+=5;System.out.println(e1);
        e1=1;e1-=5;System.out.println(e1);

        //Convert Whole Number to Decimal Number
        int f1=5; double f2;
        System.out.println("Convert Whole Number to Decimal Number");
        f2 = f1;System.out.println(f2);

        //Convert Decimal Number to Whole Number
        double g1=5.0; int g2;
        System.out.println("Convert Decimal Number to Whole Number");
        g2=(int) g1;System.out.println(g2);

        //Convert String to Number
        String h1="5"; int h2;
        System.out.println("Convert String to Number");
        h2=Integer.parseInt(h1);System.out.println(h2);
        h2=Integer.valueOf(h1);System.out.println(h2);

        //Convert Number to String
        int i1=5; String i2;
        System.out.println("Convert Number to String");
        i2=Integer.toString(i1);System.out.println(i2);
        i2=String.valueOf(i1);System.out.println(i2);

        //Format String
        double j1=123546.25; String j2;
        System.out.println("Format String");
        j2 = String.format("j2 is %10.4f",j1);
        System.out.println(j2);
        j2 = MessageFormat.format("j2 is {0,number,#,###.0000}", j1);
        System.out.println(j2);

        //Extract Data from array
        int[] k1 = new int[]{10,20,30};
        System.out.println("Extract Data from array");
        int k2 = k1.length;System.out.println(k2);
        int[][] k3 = new int[][]{{10,20,30},{40,50,60}};
        int k4 = k3.length;System.out.println(k4);
        int k5 = k3[0].length;System.out.println(k5);
    }
}
