//first last 6
public boolean firstLast6(int[] nums) {
  if(nums[0]==6 || nums[nums.length-1]==6)
  {
    return true;
  }
    return false;
}
//same first last
public boolean sameFirstLast(int[] nums) {
  if((nums.length>0) && (nums[0]==nums[nums.length -1]))
  {
    return true;
  }
    return false;
}
//make pi
public int[] makePi() {
  int[] makePi={3,1,4};
  return makePi;
}
//common end
public boolean commonEnd(int[] a, int[] b) {
  if(a[0] == b[0] || a[a.length - 1] == b[b.length - 1])
  {
    return true;
  }
    return false;
}
//sum 3
public int sum3(int[] nums){
return nums[0]+nums[1]+nums[2];
}
