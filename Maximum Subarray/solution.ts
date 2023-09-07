function maxSubArray(nums: number[]): number {
    let currentSum : number = 0;
    let maxSum : number = Number.MIN_SAFE_INTEGER;
   for(const num of nums){
       currentSum += num;
       maxSum = Math.max(currentSum, maxSum);
       if(currentSum <0)currentSum =0; 
   }
   return maxSum;
};