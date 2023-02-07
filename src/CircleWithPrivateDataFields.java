public class CircleWithPrivateDataFields {
    private double radius = 1;
    private static int numberOfObjects = 0;

    public CircleWithPrivateDataFields(){
        radius = 1.0;
        numberOfObjects++;
    }
    public CircleWithPrivateDataFields (double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        radius = newRadius;
    }
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }


}