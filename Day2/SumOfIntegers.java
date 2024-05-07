import java.util.Scanner;

public class SumOfIntegers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter integer values seperated by space");

        while(sc.hasNext()){
            if(sc.hasNextInt()){
                int num = sc.nextInt();
                sum = sum + num;
            }else{
                // if input is not an integer, consume it to avoid an infinite loop
                sc.next();
                System.out.println("NOn-integer value detected.");
            }
        }
        System.out.println("Total sum of given numbers: " + sum);

        sc.close();
    }
}