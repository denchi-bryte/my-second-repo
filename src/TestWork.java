
public class TestWork {
    public static void main(String[] args) {
        int num = 100;
        int count = 0;
        while(num <= 1000){
            if((num % 5 == 0 || num % 6 == 0) &&
                    !(num % 5 == 0 && num % 6==0))
            {
                System.out.println(num);
            }
            num++;
            count++;
        }
        System.out.println(count);
    }

}
