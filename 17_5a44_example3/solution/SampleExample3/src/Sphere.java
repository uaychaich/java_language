/*
 * Author: Uaychai Chotjaratwanich
 * Modified Date: 2023-02-02
 */
public class Sphere extends Shape3D {
    public double radius;
    @Override
    public double getArea() {
        return 4*Math.PI*radius*radius;
    }

    @Override
    public double getVolume() {
        return (4/3)*Math.PI*radius*radius*radius;
    }
    
}
