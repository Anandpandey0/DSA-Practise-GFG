class Solution{
    public void zigZag(int a[], int n){
        // Code your solution here. 
        boolean flag = true;
        for(int i = 0;i<=n-2;i++){
            if(flag){
                if (a[i] > a[i + 1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = a[i];
                }
            }else{
                if(a[i]<a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = a[i];
                }
            }
            flag =!flag;
        }
    }
}