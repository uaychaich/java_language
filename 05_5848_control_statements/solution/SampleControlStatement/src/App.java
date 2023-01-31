/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-01-31
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
        int monthnum = 5; String quartername;
        switch (monthnum) {
            case 1:  quartername = "Q1";break;
            case 2:  quartername = "Q1";break;
            case 3:  quartername = "Q1";break;
            case 4:  quartername = "Q2";break;
            case 5:  quartername = "Q2";break;
            case 6:  quartername = "Q2";break;
            case 7:  quartername = "Q3";break;
            case 8:  quartername = "Q3";break;
            case 9:  quartername = "Q3";break;
            case 10: quartername = "Q4";break;
            case 11: quartername = "Q4";break;
            case 12: quartername = "Q4";break;
            default: quartername = "Invalid month";break;
        }
        System.out.println(quartername);

        //switch statement 2
        System.out.println("switch statement 2");
        switch (monthnum) {
            case 1:  
            case 2:  
            case 3:  quartername = "Q1";break;
            case 4:  
            case 5:  
            case 6:  quartername = "Q2";break;
            case 7:  
            case 8:  
            case 9:  quartername = "Q3";break;
            case 10: 
            case 11: 
            case 12: quartername = "Q4";break;
            default: quartername = "Invalid month";break;
        }
        System.out.println(quartername);

        //switch statement 3
        System.out.println("switch statement 3");
        switch (monthnum) {
            case 1,2,3:  quartername = "Q1";break;
            case 4,5,6:  quartername = "Q2";break;
            case 7,8,9:  quartername = "Q3";break;
            case 10,11,12: quartername = "Q4";break;
            default: quartername = "Invalid month";break;
        }
        System.out.println(quartername);

        //switch statement 4
        System.out.println("switch statement 4");
        switch (monthnum) {
            case 1,2,3 ->  quartername = "Q1";
            case 4,5,6 -> quartername = "Q2";
            case 7,8,9 ->  quartername = "Q3";
            case 10,11,12 ->  quartername = "Q4";
            default -> quartername = "Invalid month";
        }
        System.out.println(quartername);

        //switch statement 5
        System.out.println("switch statement 5");
        quartername = switch (monthnum) {
            case 1,2,3 ->  "Q1";
            case 4,5,6 ->  "Q2";
            case 7,8,9 ->  "Q3";
            case 10,11,12 ->  "Q4";
            default -> "Invalid month";
        };
        System.out.println(quartername);

        //switch statement 6
        System.out.println("switch statement 6");
        quartername = switch (monthnum) {
            case 1,2,3 : System.out.println("Q1"); yield "Q1";
            case 4,5,6 : System.out.println("Q2"); yield "Q2";
            case 7,8,9 : System.out.println("Q3"); yield "Q3";
            case 10,11,12 : System.out.println("Q4"); yield "Q4";
            default : System.out.println("Invalid month"); yield "Invalid month";
        };
        System.out.println(quartername);

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
