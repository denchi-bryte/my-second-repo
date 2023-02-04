public class TestSimpleCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The area of the " +
                "circle of radius "+circle1.radius
        + " is "+ circle1.getArea());
        Circle circle2 = new Circle(25);
        System.out.println("The area of the " +
                "circle of radius "+circle2.radius
    + "is "+ circle2.getArea());
        Circle circle3 = new Circle(125);
        System.out.println("The area of the " +
                "circle of radius "+circle3.radius+"" +
                " is " + circle3.getArea());
        // Modify circle radius
        circle2.radius = 100;
        System.out.println("The area of the " +
                "circle of radius "+circle2.radius
        +" is "+circle2.getArea());

    }
}

class Circle{
    // The radius of this Circle
    double radius = 1;

    // Construct a circle object
    Circle(){
    }

    // Return the area of this circle
    Circle(double newRadius){
        radius = newRadius;
    }
    // Return the area of this circle
    double getArea(){
        return radius * radius * Math.PI;
    }
    // Return the perimeter of this circle
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    // Set new radius for this circle
    public void setRadius(double newRadius){
        radius = newRadius;
    }

}
