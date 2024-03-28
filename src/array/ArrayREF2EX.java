package array;

public class ArrayREF2EX {
    public static void main(String[] args) {
        int[] students = {20,30,40,50,23,23,231,23,1,232,3, };;


        for(int i =0; i <students.length; i++){
            System.out.println("학생:" +(i+1)+"점수"+students[i] );
        }
    }
}
