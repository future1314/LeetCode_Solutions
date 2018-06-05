# 46. Permutations

Linked questions: [31 Next Permutation](GoogleMedium/31.md)


Given a collection of distinct numbers, return all possible permutations.

For example,

[1,2,3] have the following permutations:

[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].

```java
public class Solution {
    private List<List<Integer>> mList = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        
        permute_(nums, 0, nums.length-1);
        return mList;
    }
    
    private void swap(int[] nums, int x, int y){
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }
    private void permute_(int[] nums, int start, int end){
        if(start == end){
            List<Integer> m = new ArrayList<>();
            for(int i: nums){
                m.add(i);
            }
            mList.add(m);
            return;
        }
        
        for(int i= start; i<=end; i++){
            swap(nums, i, start);
            permute_(nums, start+1, end);
            swap(nums, start, i);
        }
    }
}
```