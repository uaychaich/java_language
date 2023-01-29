import java.text.MessageFormat;

/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-01-29
 */
public class App {
    public static void main(String[] args) throws Exception {
        byte a1 = 100;System.out.println(a1);
        short a2 = 100;System.out.println(a2);
        int a3 = 100;System.out.println(a3);
        long a4 = 100l;System.out.println(a4);
        float a5 = 100.00f;System.out.println(a5);
        double a6 = 100.00;System.out.println(a6);
        char a7 = 'a';System.out.println(a7);
        String a8 = "Uaychai";System.out.println(a8);
        boolean a9 = true;System.out.println(a9);
        var a10 = "Yoda";System.out.println(a10);

        //array
        int[] a11 = new int[3];
        a11[0]=10;a11[1]=20;a11[2]=30;
        System.out.println(MessageFormat.format("{0} {1} {2}", a11[0],a11[1],a11[2]));

        //array with initial
        int[] a12 = new int[]{10,20,30};
        System.out.println(MessageFormat.format("{0} {1} {2}", a12[0],a12[1],a12[2]));

        //multi-dimension array
        int[][] a13 = new int[2][3];
        a13[0][0]=10;a13[0][1]=20;a13[0][2]=30;
        a13[1][0]=40;a13[1][1]=50;a13[1][2]=60;
        System.out.println(MessageFormat.format("{0} {1} {2} {3} {4} {5}", a13[0][0],a13[0][1],a13[0][2],
                                                                           a13[1][0],a13[1][1],a13[1][2]));

        //multi-dimension array with initial
        int[][] a14 = new int[][]{{10,20,30},{40,50,60}};
        System.out.println(MessageFormat.format("{0} {1} {2} {3} {4} {5}", a14[0][0],a14[0][1],a14[0][2],
                                                                           a14[1][0],a14[1][1],a14[1][2]));
    }
}
