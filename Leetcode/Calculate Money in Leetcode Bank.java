class Solution {
    public int totalMoney(int n) {
        if(n<=7) return (n*(n+1))/2;
        int continues=n/7;
        int rem=n%7;
        int count=continues+1;
        int ans=0;
        int csp=continues-1;
        ans=continues*28;
        ans=ans+7*(csp*(csp+1))/2;
        System.out.println(ans);
        if(rem!=0)
        {
            int fp=(rem*(rem+1))/2;
            int sp=(count-1)*rem;
            int total=fp+sp;
            ans+=total;
        }
        return ans;
    }
}