public class Main {
    public static void  main(String[] args){
        double radius =5.0;
        Circle circle = new Circle(radius);
        double ts1 = 2.0, ts2= 3.0, ts3 = 4.0;
        Triangle triangle = new Triangle(ts1, ts2 , ts3);
        System.out.println("Radius of the Circle: " + radius);
        System.out.println("Area of a Circle: " + circle.calculateArea());
        System.out.println("Perimeter of a Circle: " +circle.calculatePerimeter());
        System.out.println();
        System.out.println("Sides of a Triangle: " +ts1  +ts2 +ts3);
        System.out.println("Area of a Triangle: "+ triangle.calculateArea());
        System.out.println("Perimeter of a Triangle: "+ triangle.calculatePerimeter());

    }
}
