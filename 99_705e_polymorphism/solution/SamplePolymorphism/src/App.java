import java.text.MessageFormat;

/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-02-01
 */
public class App {
    public static void main(String[] args) throws Exception {
        Shape a1;
        Rectangle a2 = new Rectangle(); a2.height=10;a2.width=20;
        Elipse a3 = new Elipse(); a3.majorradius=20; a3.minorradius=10;
        a1 = a2; System.out.println(MessageFormat.format("{0} {1}", a1.getArea(), a1 instanceof Rectangle));
        a1 = a3; System.out.println(MessageFormat.format("{0} {1}", a1.getArea(), a1 instanceof Elipse));

        AppHelper a4 = new AppHelper();
        
        a4.showShapeDetail1(a2);
        a4.showShapeDetail1(a3);

        a4.showShapeDetail2(a2);
        a4.showShapeDetail2(a3);
    }
}
