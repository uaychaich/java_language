/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-02-02
 */
public class App {
    public static void main(String[] args) throws Exception {
        Rectangle rec1 = new Rectangle();rec1.height=10;rec1.width=20;
        Elipse elp1 = new Elipse();elp1.majorradius=20;elp1.minorradius=10;
        Sphere sph1 = new Sphere();sph1.radius=10;
        AppHelper ah1 = new AppHelper();
        ah1.showShapeDetail(rec1);
        ah1.showShapeDetail(elp1);
        ah1.showShapeDetail(sph1);
        int result = ah1.compareShapeArea(rec1, sph1);
        System.out.println(result);
    }
}
