/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-01-30
 */
public class App {
    public static void main(String[] args) throws Exception {
        //if statement
        System.out.println("if statement");
        int a1 = 5;
        if(a1 < 4){System.out.println("Less than four");}

        //if-else statement
        System.out.println("if-else statement");
        int b1 = 5;
        if(b1 < 4){System.out.println("Less than four");}
        else{System.out.println("Not less than four");}

        //if-else if-else statement
        System.out.println("if-else if-else statement");
        int c1 = 5;
        if(c1 < 1){System.out.println("Less than one");}
        else if (c1<3){System.out.println("Less than three");}
        else if (c1<6){System.out.println("Less than six");}
        else{System.out.println("Not less than six");}

        //switch statement
        System.out.println("switch statement");
        int monthnum = 5; String monthname;
        switch (monthnum) {
            case 1:  monthname = "January";break;
            case 2:  monthname = "February";break;
            case 3:  monthname = "March";break;
            case 4:  monthname = "April";break;
            case 5:  monthname = "May";break;
            case 6:  monthname = "June";break;
            case 7:  monthname = "July";break;
            case 8:  monthname = "August";break;
            case 9:  monthname = "September";break;
            case 10: monthname = "October";break;
            case 11: monthname = "November";break;
            case 12: monthname = "December";break;
            default: monthname = "Invalid month";break;
        }
        System.out.println(monthname);

        //while statement
        System.out.println("while statement");
        int e1=0; while(e1<5){System.out.println(e1);e1++;}

        //do-while statement
        System.out.println("do-while statement");
        int f1=0; do{System.out.println(f1);f1++;}while(f1<5);

        //for statement
        System.out.println("for statement");
        for(int g1=0;g1<5;g1++){System.out.println(g1);}

        //for with array
        System.out.println("for with array");
        int[] h1 = new int[]{10,20,30,40,50};
        for(int h2=0;h2<5;h2++){System.out.println(h1[h2]);}

        //for-each statement
        System.out.println("for-each statement");
        int[] i1 = new int[]{10,20,30,40,50};
        for(int item : i1){System.out.println(item);}

        //break continue statement
        System.out.println("break continue statement");
        for(int j1=0;j1<7;j1++){
            if(j1==3){continue;}
            if(j1==5){break;}
            System.out.println(j1);
        }
    }
}
