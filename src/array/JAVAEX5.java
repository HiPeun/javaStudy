package array;
import  java.util.Scanner;
public class JAVAEX5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 받을 숫자의 개수를 입력하세요");
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        int sum= 0;
        double average;

        System.out.println(count+ "정수를 입력하세요");
        for(int i =0; i<count; i++){
            numbers[i] = scanner.nextInt();
            sum += numbers[i];

        }

        average = (double) sum/count ;
        System.out.println("더한 값: " + sum);
        System.out.println("평균:" + average);

    }
}
