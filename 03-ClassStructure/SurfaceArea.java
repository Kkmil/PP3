public class SurfaceArea {
    
    public static double Circle(int r) {
        return 3.14*(r*r);
    };
    public static double surfaceAreaRectangle(int a,int b) {
        return a*b;
    };
    public static double Triangle(int c,int h) {
        return 0.5*c*h;
    };
    public static void main(String[] args){
        double areaRectangle = surfaceAreaRectangle(4,5);
        double areaCircle = Circle(3);
        double areaTriangle = Triangle(3,4);
        
        System.out.println(areaRectangle);
        System.out.println(areaCircle);
        System.out.println(areaTriangle);
    };
}