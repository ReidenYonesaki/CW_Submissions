//Reverse 3
public int[] reverse3(int[] nums) {
  int temp = nums[0];
  int temp2 = nums[1];
  int temp3 = nums[2];
  
  nums[0] = temp3;
  nums[1] = temp2;
  nums[2] = temp;
  
  return nums;
}

//Max End 3
public int[] maxEnd3(int[] nums) {
  if(nums[0] > nums[2])
  {
    nums[2] = nums[0];
    nums[1] = nums[0];
  }
 else if(nums[2] >= nums[0])
 {
   nums[1] = nums[2];
   nums[0] = nums[2];
   
 }
 return nums;
}

//Sum 2
public int sum2(int[] nums) {
  if(nums.length==0)
  {
    return 0;
  }
  if(nums.length==1)
 {
   return nums[0];
 }
 else
 {
   return nums[0] + nums[1];
 }
}

//Middle Way
public int[] middleWay(int[] a, int[] b) {
  int[] temp = {a[1], b[1]};
  return temp;
}

//Make Ends
public int[] makeEnds(int[] nums) {
  int[] temp = {nums[0], nums[nums.length-1]};
  return temp;
}
