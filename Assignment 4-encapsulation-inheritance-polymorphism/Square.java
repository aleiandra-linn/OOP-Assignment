public class Square extends Shape {
    private double side;

    public Square (double side, String colour){
        super(colour);
        this.side = side;
    }

    public double getSide(){
        return this.side;
    }

    public void setSide(double side){
        this.side = side;
    }

    public double CountArea(){
        return side*side;
    }

    public void printInfo(){
        System.out.println("Square " + getColour() + ", area = " + CountArea());
    }

}