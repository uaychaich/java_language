import java.text.MessageFormat;

/*
 * Author: Uaychai Chotjaratwanich
 * Modified Day: 2023-02-01
 */
public class Class1_1 extends Class1 {
    //method
    @Override
    public void showField(){
        System.out.println(MessageFormat.format("{0} {1}", field2, field3));
    }
}
