import java.text.MessageFormat;

/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-02-02
 */
public class AppHelper {
    public void showShapeDetail(Shape inputShape){
        switch (inputShape) {
            case (Rectangle rec):
                System.out.println("It's Rectangle");
                System.out.println(MessageFormat.format("width:{0} height:{1} area:{2}", 
                    rec.width,rec.height,rec.getArea()));break;
            case (Elipse elp):
            System.out.println("It's Elipse");
            System.out.println(MessageFormat.format("major radius:{0} minor radius:{1} area:{2}", 
                    elp.majorradius,elp.minorradius,elp.getArea()));break;
            default:System.out.println("I don't know this shape");break;
        }
    }

    public int compareShapeArea(Shape leftShape, Shape rightShape){
        if(leftShape.getArea()>rightShape.getArea()){return -1;}
        else if(leftShape.getArea()==rightShape.getArea()){return 0;}
        else{return 1;}
    }
}
