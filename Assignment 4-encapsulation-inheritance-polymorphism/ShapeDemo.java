import java.util.ArrayList;
import java.util.Scanner;

public class ShapeDemo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Shape> shapeList = new ArrayList<>();

        boolean running = true;

        while (running){
            System.out.println("=== Please Select The Option Below");
            System.out.println("1. Add Square");
            System.out.println("2. Add Circle");
            System.out.println("3. Add Cylinder");
            System.out.println("4. Show all the shape");
            System.out.println("5. Quit");
            System.out.print("Choose 1-5: ");

            int option = scanner.nextInt();
            scanner.nextLine();//bersihhin enter

            switch(option){
                case 1:
                    System.out.println("\nSQUARE ---");
                    System.out.print("Enter Side  : ");
                    double side = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Colour : ");
                    String squareColour = scanner.nextLine();

                    Square square = new Square(side, squareColour);
                    shapeList.add(square);
                    System.out.println("-> Added the square is done!");
                    Enter(scanner);
                    break;
                
                case 2:
                    System.out.println("\nCIRCLE ---");
                    System.out.print("Enter Radius  : ");
                    double Cradius = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Colour : ");
                    String circleColour = scanner.nextLine();
                    
                    Circle circle = new Circle(Cradius, circleColour);
                    shapeList.add(circle);
                    System.out.println("-> Added the circle is done!");
                    Enter(scanner);
                    break;
                
                case 3:
                    System.out.println("\nCYLINDER ---");
                    System.out.print("Enter Height  : ");
                    double height = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Radius : ");
                    double Sradius = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Colour : ");
                    String cynColour = scanner.nextLine();
                    
                    Silinder cyn = new Silinder(height, Sradius, cynColour);
                    shapeList.add(cyn);
                    System.out.println("-> Added the cylinder is done!");
                    Enter(scanner);
                    break;

                case 4:
                    System.out.println("\n======LIST OF THE SHAPE======");
                    if (shapeList.isEmpty()){
                        System.out.println("-There is no shape that has been made-");
                    }else {
                        int no = 1;
                        for (Shape bentuk : shapeList ){
                            System.out.print(no + ". ");
                            bentuk.printInfo();
                            no++;
                        }
                    }
                    Enter(scanner);
                    break;
                    
                case 5:
                    running = false;
                    System.out.println("\n thank you");
                    break;

                default:
                    System.out.println("\n-Invalid Input-");
                    Enter(scanner);
                    break;
            }
        }
        scanner.close();
    }

    private static void Enter(Scanner scanner) {
        System.out.println("\nEnter to dashboard...");
        scanner.nextLine();
    }
}