public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    double calculateArea(){
        double S = (side1 + side2 + side3)/2;
        return  Math.sqrt(S*(S-side1)* (S-side2)*(S-side3));
    }
        @Override
        double calculatePerimeter() {
            return side1 + side2 + side3;

        }
    }

