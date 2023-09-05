class Solution:
    def findSum(self,A,N):
        if len(A) == 0:
            return 0
        else:
            mini = min(A)
            maxi = max(A)
            return mini + maxi
            
        #code here


