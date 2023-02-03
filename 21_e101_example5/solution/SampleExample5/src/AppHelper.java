import java.text.MessageFormat;

/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-02-03
 */
public class AppHelper {
    public static void showShapeDetail(IArea inputShape){
        switch (inputShape) {
            case (Rectangle rec):
                System.out.println("It's Rectangle");
                System.out.println(MessageFormat.format("width:{0} height:{1} area:{2}", 
                    rec.width,rec.height,rec.getArea()));break;
            case (Elipse elp):
                System.out.println("It's Elipse");
                System.out.println(MessageFormat.format("major radius:{0} minor radius:{1} area:{2}", 
                    elp.majorradius,elp.minorradius,elp.getArea()));break;
            case (Sphere sph):
                System.out.println("It's Sphere");
                System.out.println(MessageFormat.format("radius:{0} area:{1}", sph.radius, sph.getArea()));break;
            default:System.out.println("I don't know this shape");break;
        }
    }

    public static int compareShapeArea(IArea leftShape, IArea rightShape, ICheckArea formula){
        if(formula.checkArea(leftShape, rightShape)){return -1;}
        else if(leftShape.getArea()==rightShape.getArea()){return 0;}
        else{return 1;}
    }
}
