import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0};
        int m = 3;
        int[] nums2 = {2,5};
        int n = 2;

        merge(nums1, m, nums2, n);

        for(int i : nums1){
            System.out.print(i);
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> nums1List = new ArrayList<>();
        for(int i : nums1){
            nums1List.add(i);
        }

        for(int i : nums2){
            for(int j : nums1){
                if (i <= j){
                    j = i;
                    for(int k = nums1List.indexOf(j)+1; j < nums1.length; i++){
                        nums1[k] = nums1[k+1];
                    }
                    continue;
                }
            }
        }
    }
}