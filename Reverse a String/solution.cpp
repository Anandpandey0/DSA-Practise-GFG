class Solution
{
public:
    string reverseWord(string str)
    {
        // Your code goes here
        string revStr = "";
        for (int i = str.length() - 1; i >= 0; i--)
        {
            char a = str[i];
            revStr.push_back(a);
        }
        return revStr;
    }
};
