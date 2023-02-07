public class Main {
    public static void main(String[] args) {
    CircleWithPrivateDataFields c1 = new CircleWithPrivateDataFields();
   c1.setRadius(3);
   CircleWithPrivateDataFields c2 = new CircleWithPrivateDataFields();
   System.out.println(c1.getNumberOfObjects());
   System.out.println(c1.getArea());
    }
}