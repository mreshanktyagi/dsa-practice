class Solution {
    public int bulbSwitch(int n) {
        if(n == 0) {
            return 0;
        }
        
        if(n <= 2) {
            return 1;
        }
        
        return (int) Math.sqrt(n);
    }
}