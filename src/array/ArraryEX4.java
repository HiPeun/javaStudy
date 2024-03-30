package array;
import java.util.Scanner;
public class ArraryEX4 {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int[] numbers = new int[5];
     int sum = 0;
     double average;

        System.out.println("정수 값을 입력하세요");
     for(int i = 0; i< 5; i++){
         numbers[i] = scanner.nextInt();
         sum += numbers[i];

     }

     average = (double) sum /5;
        System.out.println("더한 값 "+ sum);
        System.out.println("평균 값 "+ average);

}
}
