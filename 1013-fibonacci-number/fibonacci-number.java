class Solution {
    int i = 0, j = 1, x = 0;
    public int fib(int n) {
        if (n == 0 || n == 1){
            return n;
        }
        else{
            for (int a = 0; a < n; a++){
                i = j;
                j = x;
                x = i + j;
            }
        }
        return x;
    }
}