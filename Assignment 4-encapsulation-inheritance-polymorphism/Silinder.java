public class Silinder extends Circle{
    private double height;

    public Silinder (double height, double radius, String colour){
        super(radius,colour);
        this.height = height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }
    public double CountVolume(){
        return CountArea()*height;
    }

    public void printInfo() {
        System.out.println("Cylinder " + getColour() + ", volume = " + CountVolume());
    }

}