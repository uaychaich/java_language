import java.text.MessageFormat;

/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-02-01
 */
public class AppHelper {
    public void showShapeDetail1(Shape inputshape){
        if(inputshape instanceof Rectangle){
            Rectangle rec = (Rectangle)inputshape;
            System.out.println(MessageFormat.format("Rectangle width is {0}", rec.width));
            System.out.println(MessageFormat.format("Rectangle height is {0}", rec.height));
            System.out.println(MessageFormat.format("Rectangle area is {0}", rec.getArea()));
        }else if(inputshape instanceof Elipse){
            Elipse elp = (Elipse)inputshape;
            System.out.println(MessageFormat.format("Elipse major radius is {0}", elp.majorradius));
            System.out.println(MessageFormat.format("Elipse minor radius is {0}", elp.minorradius));
            System.out.println(MessageFormat.format("Elipse area is {0}", elp.getArea()));
        }else{System.out.println("I don't know this shape");}
    }
    
    public void showShapeDetail2(Shape inputshape){
        switch(inputshape){
            case(Rectangle rec): 
                System.out.println(MessageFormat.format("Rectangle width is {0}", rec.width));
                System.out.println(MessageFormat.format("Rectangle height is {0}", rec.height));
                System.out.println(MessageFormat.format("Rectangle area is {0}", rec.getArea())); break;
            case(Elipse elp):
                System.out.println(MessageFormat.format("Elipse major radius is {0}", elp.majorradius));
                System.out.println(MessageFormat.format("Elipse minor radius is {0}", elp.minorradius));
                System.out.println(MessageFormat.format("Elipse area is {0}", elp.getArea())); break;
            default:
                System.out.println("I don't know this shape");break;
        }
    }
}
