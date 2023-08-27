#User function Template for python3

class Solution:
    def reverseWord(self, s):
        
        str = list(s)
        str.reverse()
        return "".join(str)

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == "__main__":
    t = int(input())
    while(t>0):
        s = input()
        ob = Solution()
        print(ob.reverseWord(s))
        t = t-1

# } Driver Code Ends




#Time limit exceeded solution:
#User function Template for python3 1117 test cases passed.

class Solution:
    def reverseWord(self, s):
        
        str = ""
        for i in s:
            str = i + str
        return str