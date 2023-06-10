class Solution {
    public int reverse(int x) {
        int rev=0;
        int rem;
        while(x!=0){
            rem=x%10;
             if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10) // (rev*10) this value should not be greater than max integer value and should not less than the minimum integer value so check it
             {
                return 0;
             }
            rev=(rev*10)+rem;
            x=x/10;
        }
        return rev;
    }
}
