/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-02-03
 */
public class App {
    public static void main(String[] args) throws Exception {
        Rectangle rec1 = new Rectangle();rec1.height=10;rec1.width=20;
        Elipse elp1 = new Elipse();elp1.majorradius=20;elp1.minorradius=10;
        Sphere sph1 = new Sphere();sph1.radius=10;
        AppHelper.showShapeDetail(rec1);
        AppHelper.showShapeDetail(elp1);
        AppHelper.showShapeDetail(sph1);
        int result = AppHelper.compareShapeArea(rec1, sph1,(a,b)->a.getArea()>b.getArea());
        System.out.println(result);
    }
}
