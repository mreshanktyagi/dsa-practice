class Solution {
    
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        LinkedList<Integer> stack = new LinkedList<>();
        
        Map<Integer, Integer> idxMap = new HashMap<>();
        
        for(int i = nums2.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && stack.peek() < nums2[i]) {
                stack.pop();
            }
            
            if(stack.isEmpty()) {
                idxMap.put(nums2[i], -1);
            }
            else {
                idxMap.put(nums2[i], stack.peek());
            }
            
            stack.push(nums2[i]);
        }
        
        
        int []res = new int[nums1.length];
        
        for(int i=0; i < nums1.length; i++) {
            res[i] = idxMap.get(nums1[i]);
        }
        
        return res;
    }
    
}