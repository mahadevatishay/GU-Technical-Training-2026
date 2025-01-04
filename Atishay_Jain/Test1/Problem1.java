import java.util.*;

public class Problem1 {
    public int checkSeeSaw(int[] nums) {
        int right = 0;
        int left = 0;
        
        for (int i = 0; i < nums.length; i++) {
            right += nums[i];
        }
        
        for (int i = 0; i < nums.length; i++) {
            right -= nums[i];
            if (left == right) {
                return i;
            }
            left += nums[i];
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        Problem1 ss = new Problem1();
        int result = ss.checkSeeSaw(nums);
        
        System.out.println(result);
        
        sc.close();
    }
}

//time complexity-O(n)
//space complexoty-O(1) 
