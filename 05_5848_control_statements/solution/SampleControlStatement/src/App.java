/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-01-29
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
    }
}
