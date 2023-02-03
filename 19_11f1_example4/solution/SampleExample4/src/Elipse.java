/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-02-03
 */
public class Elipse extends Shape {
    public double majorradius,minorradius;
    @Override
    public double getArea(){return Math.PI*majorradius*minorradius;}
}
