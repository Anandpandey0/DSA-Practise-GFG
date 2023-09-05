//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java
class Solution {
    public static int findSum(int A[], int N) {
        // code here
        int maxi = Integer.MIN_VALUE, mini = Integer.MAX_VALUE;
        for (int i : A) {
            if (i > maxi)
                maxi = i;
            if (i < mini)
                mini = i;
        }
        return maxi + mini;
    }
}
