/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-02-03
 */
public class Class1 {
    //field
    public static int field1;
    public int field2;
    
    //method
    public static int Method1(){return field1;}
    public int Method2(){return field1;}
    public int Method3(){return field2;}

    //constructor
    public Class1(){field1=50; field2=20;}
    public Class1(int input1,int input2){field1=input1;field2=input2;}
}
