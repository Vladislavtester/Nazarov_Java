package Homework;

public class Massive {
    public static void main(String[] args) {
        int[] nums2 = {15, 6, 3, 5, 4, 2, 25, 9, 30};
        int n =3;
        for (int i=0; i<nums2.length;i++){
            if (nums2[i] % n == 0) {
                System.out.println(nums2[i]);
            }
        }
    }
}