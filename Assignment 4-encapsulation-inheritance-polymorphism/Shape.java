public class Shape {
    protected String colour;

    public Shape (String warna){
        this.colour = warna;
    }
    
    public String getColour(){
        return this.colour;
    }

    public void setColour(String warna){
        this.colour = warna;
    }

    public void printInfo(){
        System.out.println("The colour of shape is " + colour);
    }
}