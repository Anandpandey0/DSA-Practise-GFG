class Solution {
  findSum(A, N) {
    if (A.length == 0) return 0;
    else {
      let mini = Math.min(...A);
      let maxi = Math.max(...A);
      return maxi + mini;
    }
    //code here
  }
}
