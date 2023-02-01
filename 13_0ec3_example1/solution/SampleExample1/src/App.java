/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-02-01
 */
public class App {
    public static void main(String[] args) throws Exception {
        Rectangle rec1 = new Rectangle();rec1.height=10;rec1.width=20;
        Elipse elp1 = new Elipse();elp1.majorradius=20;elp1.minorradius=10;
        AppHelper ah1 = new AppHelper();
        ah1.showShapeDetail(rec1);
        ah1.showShapeDetail(elp1);
        int result = ah1.compareShapeArea(rec1, elp1);
        System.out.println(result);
    }
}
