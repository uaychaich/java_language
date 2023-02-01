import java.text.MessageFormat;

/*
 * Author: Uaychai Chotjaratwanich
 * Modified Day: 2023-02-01
 */
public class Class1 {
    //field
    private int field1;
    protected int field2;
    public int field3;

    //method
    public void showField(){
        System.out.println(MessageFormat.format("{0} {1} {2}", field1, field2, field3));
    }
}
