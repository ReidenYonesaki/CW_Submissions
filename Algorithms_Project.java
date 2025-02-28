public class Algorithms_Project {

	public static void main(String[] args) 
	{
		//This is the main method and will print out the answers
		int[] nums={4,5,5,2,1};
		System.out.println(alg1(nums));
		System.out.println(alg2(nums));    
		System.out.println(alg3(nums));    
		System.out.println(alg4(nums));
		alg5(nums);
		System.out.println(" ");
		System.out.println(alg6(nums,7));
		System.out.println(alg7(nums,5));
		alg8(nums);
		System.out.println(" ");
		alg9(nums);
		System.out.println(" ");
		alg10(nums);    
		System.out.println(" ");
	}
	
	//This will return the smallest number in the array
	public static int alg1(int[] nums) {
	    int temp = nums[0];
	    for (int i = 0; i < nums.length; i++) 
	    {
	        if (nums[i] < temp) {
	            temp = nums[i];
	    }
	  }
	    return temp;
	}
	
	//This will return the index of the smallest number in the array
	public static int alg2(int[] nums) {
	    int smallestIndex = 0;
	    for (int i = 0; i < nums.length; i++) 
	    {
	        if (nums[i] < nums[smallestIndex]) 
	        {
	            smallestIndex = i;
	        }
	    }
	    return smallestIndex;
	}
	
	//This will return the average of all numbers in the array
	public static int alg3(int[] nums) {
	    int theAverage = 0;
	    for (int i = 0; i < nums.length; i++) 
	    {
	        theAverage += nums[i];
	    }
	    return theAverage / nums.length;
	}
	
	//If all the numbers in the array are even then it will return true but if not it will return false
	public static boolean alg4(int[] nums) {
	    int counter = 0;
	    for (int i = 0; i < nums.length; i++) 
	    	{
	        if (nums[i] % 2 == 0) {
	            counter++;
	        }
	    }

	    if (counter == nums.length) {
	        return true;
	    }

	    return false;
	}
	
	//if array has two consecutive 5s then it will return two 0s
	public static void alg5(int[] nums) {
	    int[] copyArr = new int[nums.length];

	    for (int i = 0; i < nums.length; i++) 
	    {
	        copyArr[i] = nums[i];
	    }
	    for (int i = 0; i < copyArr.length; i++) 
	    {
	        if (nums[i] == 5 && nums[i + 1] == 5) 
	        {
	            copyArr[i] = 0;
	            copyArr[i + 1] = 0;
	        }
	    }
	    for (int num : copyArr) {
	        System.out.print(num + " ");
	    }
	}
	
	//If a number is shown 3 times it will be true but if not it will be false
	public static boolean alg6(int[] nums, int number) {
	    for (int i = 0; i < nums.length; i++) 
	    {
	        if (nums[i] == number && nums[i + 1] == number && nums[i + 2] == number) 
	        {
	            return true;
	        }
	    }
	    return false;
	}
	
	//it passed an int and shows how many times that int was in the array
	public static int alg7(int[] nums, int number) {
	    int counter = 0;
	    for (int i = 0; i < nums.length; i++) 
	    {
	        if (nums[i] == number) {
	            counter++;
	        }
	    }
	    return counter;
	}
	
	//this will return the array to be backwards
	public static void alg8(int[] nums) {
	    int[] copyArr = new int[nums.length];
	    
	    // Reverse the array
	    for (int i = 0; i < nums.length; i++) 
	    {
	        copyArr[i] = nums[nums.length - 1 - i];
	    }

	    // Print the reversed array
	    for (int num : copyArr) 
	    {
	        System.out.print(num + " ");
	    }
	}

	//this will shift all of the elements to the right 
	public static void alg9(int[] nums) {
	    int[] copyArr = new int[nums.length];
	    int lastElement = nums[nums.length - 1];
	    for (int i = copyArr.length - 1; i > 0; i--) 
	    {
	        copyArr[i] = nums[i - 1];
	    }

	    copyArr[0] = lastElement;

	    for (int num : copyArr) {
	        System.out.print(num + " ");
	    }
	}
	
	//This has insertion sort and is inserting the array
	public static void alg10(int[] nums) {
	    for (int i = 1; i < nums.length; i++){
	        int insert = nums[i];
	        int j = i - 1;
	        while (j >= 0 && nums[j] > insert) 
	        {
	            nums[j + 1] = nums[j];
	            j--;
	        }

	        nums[j + 1] = insert;
	    }

	    for (int num : nums)
	    {
	        System.out.print(num + " ");
	    }
	}
}
