package array;

public class ArrayREF1EX {
    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[7];

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
        students[5] = 40;
        students[6] = 30;


        //변수 값 사용
    for(int i = 0; i< 7; i++){
        System.out.println("학생 : "+(i+1) + "점수:" +students[i]);
    }
        System.out.println("학생1 점수:" + students[0]);
        System.out.println("학생2 점수:" + students[1]);
        System.out.println("학생3 점수:" + students[2]);
        System.out.println("학생4 점수:" + students[3]);
        System.out.println("학생5 점수:" + students[4]);
        System.out.println("학생6 점수:" + students[5]);
        System.out.println("학생7 점수:" + students[6]);
    }

}
