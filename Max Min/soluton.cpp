
// } Driver Code Ends
// User function Template for C++

class Solution
{
public:
    int findSum(int A[], int N)
    {
        // code here.
        int maxi = INT_MIN, mini = INT_MAX;
        for (int i = 0; i < N; i++)
        {
            if (A[i] > maxi)
                maxi = A[i];
            if (A[i] < mini)
                mini = A[i];
        }
        return maxi + mini;
    }
};

// } Driver Code Ends