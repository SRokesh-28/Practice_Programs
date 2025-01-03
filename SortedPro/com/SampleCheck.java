//  ||
package SortedPro.com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
public class SampleCheck {
	 public static int m=10;
	
	public static void main(String[] args) {
		 m=20;
		 System.out.println(m);
		//int hours[]= {12,12,30,24,24};
		int[] nums = {1,2,3,2};
		String sss="hello";
		String w=sss.concat(" World ");
		System.out.println(w);
		String ss1=new String("hello");
		System.out.println(sss==ss1);
		
		StringBuilder s1=new StringBuilder();
		s1.append(10);
		StringBuilder s2=new StringBuilder();
		s2.append(200);
		//System.out.println(s1+s2);
		
//		System.out.println(subtractProductAndSum(nums));
	}
    static int subtractProductAndSum(int[] nums) {
    	int sum=0;
    	Map<Integer,Integer> map=new HashMap<>();
    	for(int num:nums) {
    		map.put(num, map.getOrDefault(num, 0)+1);
    	}
    	System.out.println(map);
    	List<Integer> uniqueValues = new ArrayList<>();
    	for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueValues.add(entry.getKey());
            }
        }
    	for(int num:uniqueValues) {
    		sum+=num;
    	}
    	return sum;
//    	int count=0;
//        for(int i=0;i<hours.length-1;i++){
//            for(int j=i+1;j<hours.length;j++){
//                if((hours[i]+hours[j])%24==0){
//                    count+=1;
//                 
//                }
//            }
//        }
//        return count;
    	
//    	int count=0;
//    	while(n>0) {
//    		if(n%2!=0) {
//    			n=(n/2);
//    			System.out.println(n);
//    			count+=n;
//    			n=n+1;
//    		}
//    		n=n/2;
//    		count+=n;
//    	}
    	//return count;
    

//        while(n>0){
//        int mod=n%10;
//        n=n/10;
//        System.out.println(mod);
//        System.out.println(n);
//        sum+=mod;
//        multi*=mod;
//        }
//        System.out.print(sum+" "+multi);
//        System.out.println();
      /////  return multi-sum;
    }
}
//		String[] words= {"leet","code"};
//		char x='e';
//		Set<Integer> list=new HashSet<>();
//		for(int i=0;i<words.length;i++){
//            for(int j=0;j<words[i].length();j++){
//                if(words[i].charAt(j)==x){
//                    list.add(i);
//                }
//            }
//        }
//		List<Integer> ans = new ArrayList<>(list);
//		System.out.println(ans);
//		int[] arr= {2,3,4,7,11};
//		int k=5;
//		int count=0;
//	static int[] nums(int[] nums1,int[] nums2) {
//		List<Integer> list=new ArrayList<>();
//		for(int i=0;i<nums1.length;i++){
//            for(int j=0;j<nums2.length;j++){
//                if(nums1[i]==nums2[j]){
//                    list.add(nums2[j]);
//                }
//            }
//        }
//		 List<Integer> list1 = list.stream()
//	                .distinct()
//	                .collect(Collectors.toList());
//		int[] arr=new int[list1.size()];
//		int i=0;
//		for(int num:list1) {
//			arr[i++]=num;
//		}
//		
//		
//		
//		return arr;
//	}
//		int[] nums= {1,1,1,1};
//		Arrays.sort(nums);
//		int count=0;
//		int j=0;
//		while(j<nums.length) {
//		for(int i=j+1;i<nums.length;i++) {
//			if(nums[j]==nums[i]) {
//				count+=1;
//			}
//		}
//		j++;
//		}
//		System.out.println(count);
		
		
		
		
		
//		int[] nums= {1,3,2,1};
//		int[] ans=new int[nums.length*2];
//		for(int i=0;i<nums.length;i++) {
//			ans[i]=nums[i];
//			ans[i+nums.length]=nums[i];
//		}
//		System.out.println(Arrays.toString(ans));
//	}
	//}
//		String s="How Are You";
//		String[] arr=s.split(" ");
//		char[] ans=new char[arr.length*arr.length];
//		System.out.println(Arrays.toString(arr));
//		int j=0;
//		for(int i=0;i<arr[j].length();i++) {
//			for(j=0;j<arr.length;j++) {
//				ans[i] =arr[j].charAt(i);
//			}
//		}
//		int[] digits= {3,9,9,9};
//		int numrow=5;
//		//System.out.println(Arrays.toString(plusOne(digits)));
//		System.out.println(print(numrow));
//	}
//		static int[] plusOne(int[] digits) {
//	        for (int i = digits.length - 1; i >= 0; i--) {
//		if (digits[i] < 9) {
//			digits[i]++;
//			return digits;
//		}
//		digits[i] = 0;
//	}
//	digits = new int[digits.length + 1];
//	digits[0] = 1;
//	return digits;
//	    }
//		static List<List<Integer>> print(int numrow){
//			List<List<Integer>> list=new ArrayList<>();
//			for(int i=3;i<=numrow;i++) {
//				List<Integer> ans=new ArrayList<>();
//				
//				for(int j=1;j<=i;j++) {
//					ans.add(j);
//				}
//				list.add(ans);
//			}
//			return list;
//		}
		
		
//		int n=10000;
//		 int digitCount = (int) Math.log10(n) + 1;
//		System.out.println(digitCount);
//		int[] nums= {3,2,2,3};
//		int val=3;
//		//System.out.println(dupilcate(nums));
//		System.out.println(countval(nums,val));
//		
//	}
//static int countval(int[] nums,int val) {
//	int j=0;
//    for(int i=0;i<nums.length;i++){
//        if(nums[i]!=val){
//         nums[j]=nums[i];
//         j++;
//        }
//    }
//    System.out.println(Arrays.toString(nums));
//    return j;
//	}
//static int dupilcate(int[] nums) {
////	int size=0;
////	if(nums[0]==0) {
////       size=nums[nums.length-1]+1;
////	}
////	else {
////		size=nums[nums.length-1];
////	}
//	int[] ans=new int[nums.length];
//	int j=0;
//		for(int i=0;i<nums.length-1;i++) {
//			if(nums[i]<nums[i+1]) {
//				ans[j]=nums[i];
//				j++;
//				if(i==nums.length-2) {
//					ans[j]=nums[i+1];
//				}
//			}
//		}
//		System.out.println(Arrays.toString(ans));
//		int count=ans.length;
//		return count;
	
//}
