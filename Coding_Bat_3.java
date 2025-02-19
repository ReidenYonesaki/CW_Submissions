//Has 23
public boolean has23(int[] nums) {
  if(nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3)
  {
    return true;
  }
  else
  {
    return false;
  }
}

//No 23
public boolean no23(int[] nums) {
  if(nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3)
  {
    return false;
  }
  else
  {
    return true;
  }
}

//Make Last
public int[] makeLast(int[] nums) {
  int[] Arr = new int[nums.length + nums.length];
  Arr[Arr.length-1] = nums[nums.length-1];
  return Arr;
}

//Double 23
public boolean double23(int[] nums) 
{
  if(nums.length == 2)
  {
    if(nums[0] == 2 && nums[1] == 2)
    {
      return true;
    }
    else if(nums[0] == 3 && nums[1] == 3)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  return false;
}

//Fix 23
public int[] fix23(int[] nums) {
  if(nums[0] == 2 && nums[1] == 3)
  {
    nums[1] = 0;
    return nums;
  }
  else if(nums[1] == 2 && nums[2] == 3)
  {
    nums[2] = 0;
    return nums;
  }
  return nums;
}

// Start 1
public int start1(int[] a, int[] b) {
  int ab = 0;
  if(a.length > 0)
  {
    if(a[0] == 1)
    {
      ab++;
    }
  }
  if(b.length > 0)
  {
    if(b[0] == 1)
  {
    ab++;
  }
}
  return ab;
}

//Bigger Two
public int[] biggerTwo(int[] a, int[] b) {
  int a2 = a[0] + a[1];
  int b2 = b[0] + b[1];
  if(a2 > b2)
  {
    return a;
  }
  else if(b2 > a2)
  {
    return b;
  }
  else
  {
    return a;
  }
}

//Make Middle
public int[] makeMiddle(int[] nums) {
  int middle = nums.length / 2;
  return new int[] {nums[middle-1], nums[middle]};
}

//Plus Two
public int[] plusTwo(int[] a, int[] b) {
  int[] pTwo = new int[]{a[0], a[1], b[0], b[1]};
  return pTwo;
}

//Swap Ends
public int[] swapEnds(int[] nums) 
{
  int temp1 = nums[0];
  int temp2 = nums[nums.length-1];

  nums[0] = temp2;
  nums[nums.length-1] = temp1;
  
  return nums;
}

//Mid Three
public int[] midThree(int[] nums) {
  int middle = nums.length/2;
  return new int[]{nums[middle-1], nums[middle], nums[middle+1]};
}

//Max Triple
public int maxTriple(int[] nums) {
  int first = nums[0];
  int middle = nums[nums.length/2];
  int last = nums[nums.length-1];
  if(middle > last && middle > first)
  {
    return middle;
  }
  else if (first > last && first > middle)
  {
    return first;
  }
  else 
  {
    return last;
  }
}

//Front Piece
public int[] frontPiece(int[] nums) {
  if (nums.length < 2)
  {
    return nums;
  }
  else 
{
  int[] Arr = {nums[0], nums[1]};
  
  return Arr;
  }
}

//Unlucky 1
public boolean unlucky1(int[] nums) {
  if(nums.length < 2)
  {
    return false;
  }
  if(nums[0] == 1 && nums[1] == 3 || nums[1] == 1 && nums[2] == 3)
  {
    return true;
  }
  if(nums[nums.length-2] == 1 && nums[nums.length-1] == 3)
  {
    return true;
  }
  else
  {
    return false;
  }
}

//Make 2
public int[] make2(int[] a, int[] b) {
  if(a.length == 0)
  {
    return new int[] {b[0] , b[1]};
    
  }
  else if (a.length >= 2)
  {
    return new int[] {a[0] , a[1]};
  
  }
  else if (a.length == 1 )
  {
    return new int[] {a[0] , b[0]};
  }
  return new int[] {a[0] , b[0]};
}

//front 11
public int[] front11(int[] a, int[] b) {
  if(a.length == 0 && b.length == 0)
  {
    return a;
  }
  if (a.length == 0)
  {
    return new int[] {b[0]};
  }
  if (b.length == 0)
  {
    return new int[] {a[0]};
  }
  if (a.length >= 1 && b.length >= 1)
  {
    return new int[] {a[0] , b[0]};
  }
  return new int[] {a[0] , b[0]};
}
