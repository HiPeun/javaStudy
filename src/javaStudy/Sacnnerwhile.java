package javaStudy;

import java.util.Scanner;

public class Sacnnerwhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("문자열을 입력하세요(exit:종료)");
            String str = scanner.nextLine();
            if(str.equals("exit")){
                break;
            }
        }
    }
}
