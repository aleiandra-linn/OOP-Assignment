public class Circle extends Shape{
    private double radius;
    public static final double phi = 3.14;

    public Circle (double radius, String colour){
        super(colour);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double CountArea() {
        return phi*radius*radius;
    }

    public void printInfo(){
        System.out.println("Circle " + getColour() + ", area = " + CountArea());
    }
}