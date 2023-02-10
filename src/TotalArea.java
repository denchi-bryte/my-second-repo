public class TotalArea {
    public static void main(String[] args) {
        System.out.println("Radius\t\t\t Area");


        // Create an array of objects
        CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];
        int sum = 0;
        for(int i = 0; i < circleArray.length; i++){
            int radius = (int)(Math.random()*10);
            circleArray[i] = new CircleWithPrivateDataFields(radius);
            System.out.println(radius+"\t\t\t"+circleArray[i].getArea());
            sum += circleArray[i].getArea();
        }
        System.out.printf("The total area of circles is %4.4f", (double)sum);



    }
}
