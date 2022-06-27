package Integer;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
    public static void main(String[] args) {
    	int[] numsss = {4,1,2,1,2};
    	int[] numsss2 = {2,2,1};
    	int[] numsss3 = {1,2,1};
    	System.out.println(singleNumberFunctionXOR(numsss));
    	System.out.println(singleNumberFunctionSet(numsss));
    	System.out.println(singleNumberFunctionSet(numsss2));
    	System.out.println(singleNumberFunctionSet(numsss3));
        
    }

    public static int singleNumberFunctionXOR(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans = ans ^ nums[i];
          
        }
        return ans;
    }
    
    public static int singleNumberFunctionSet(int[] nums) {
    	if (nums.length == 0) {
    		return nums[0];
    	}
    	List<Integer> temp = new ArrayList<>();
    	for (int i = 0; i < nums.length; i++) {
    		if (temp.indexOf(nums[i]) != -1) {
    			int delete = temp.indexOf(nums[i]);
    			temp.remove(delete);
    		} else {
    			temp.add(nums[i]);
    		}
    	}
  
    	return temp.get(0);
    }
}
