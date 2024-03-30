package array;

import java.util.Scanner;

public class ArraryEX6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 받을 숫자의 개수를 입력하세요");
        int n = scanner.nextInt();// 5라고 하면

        int[] numbers = new int[n];
        int minNumbers, maxNumbers;

        System.out.println(n+ "개의 정수를 입력하세요:");
        for(int i=0; i<n; i++){
            numbers[i] = scanner.nextInt();

        }
        minNumbers = numbers[0];
        maxNumbers = numbers[0];
        for(int i= 1; i< n; i++){
            if(numbers[i]< minNumbers){
                minNumbers = numbers[i];
            }
            if(numbers[i]> maxNumbers){
                maxNumbers=numbers[i];
            }
        }
        System.out.println("가장 작은 정수 :"+minNumbers);
        System.out.println("가장 큰 정수 :" +maxNumbers);


    }
}
