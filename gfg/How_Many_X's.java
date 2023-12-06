class Solution {
    int countX(int L, int R, int X) {
        // code here
        int ans=0;
        for(int i=L+1;i<R;i++)
        {
            int c=0;
            int num=i;
            while(num>0)
            {
                int ld=num%10;
                if(ld==X) c++;
                num/=10;
            }
            ans+=c;
        }
        return ans;
    }
};