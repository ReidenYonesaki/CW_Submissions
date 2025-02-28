import java.util.ArrayList;
public class Coverting_Arrays {

	public static void main(String[] args) {
		ArrayList<Integer> testArr = new ArrayList<Integer>();
		testArr.add(4);
		testArr.add(5);
		testArr.add(5);
		testArr.add(2);
		testArr.add(1);
		System.out.println(alg1(testArr));
		System.out.println(alg2(testArr));
		System.out.println(alg3(testArr));
		System.out.println(alg4(testArr));
		alg5(testArr);
		System.out.println(" ");
		System.out.println(alg6(testArr));
		System.out.println(alg7(testArr , 2));
		alg8(testArr);
		System.out.println(" ");
		alg9(testArr);
		System.out.println(" ");
		alg10(testArr);
		System.out.println(" ");
		
	}
	
	public static int alg1(ArrayList<Integer> nums){
		int temp = nums.get(0);
		for (int i = 0; i < nums.size(); i++)
		{
			if (nums.get(i)<temp)
			{
				temp = nums.get(1);
			}
		}
		return temp;
	}

	//This will return the index of the smallest number in the array list
		public static int alg2(ArrayList<Integer> nums) {
		    int smallestIndex = 0;
		    for (int i = 0; i < nums.size(); i++) 
		    {
		        if (nums.get(1) < nums.get(smallestIndex))
		        {
		            smallestIndex = i;
		        }
		    }
		    return smallestIndex;
		}
		
		//This will return the average of all numbers in the array list 
		public static int alg3(ArrayList<Integer> nums) {
		    int theAverage = 0;
		    for (int i = 0; i < nums.size(); i++) 
		    {
		        theAverage += nums.get(i);
		    }
		    return theAverage / nums.size();
		}
		
		//If all the numbers in the array list are even then it will return true but if not it will return false
		public static boolean alg4(ArrayList<Integer> nums) {
		    int counter = 0;
		    for (int i = 0; i < nums.size(); i++) 
		    	{
		        if (nums.get(i) % 2 == 0) {
		            counter++;
		        }
		    }

		    if (counter == nums.size()) {
		        return true;
		    }

		    return false;
		}
		
		//if array list has two consecutive 5s then it will return two 0s
		public static void alg5(ArrayList<Integer> nums) {
		    int[] copyArr = new int[nums.size()];

		    for (int i = 0; i < nums.size(); i++) 
		    {
		        copyArr[i] = nums.get(i);
		    }
		    for (int i = 0; i < nums.size(); i++) 
		    {
		        if (nums.get(i) == 5 && nums.get(i+1) == 5) 
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
		public static boolean alg6(ArrayList<Integer> nums)  {
		    for (int i = 0; i < nums.size()-2; i++) 
		    {
		        if (nums.get(i) == nums.get(i+1) && nums.get(i+2) == nums.get(i))
		        {
		            return true;
		        }
		    }
		    return false;
		}
		
		//it passed an int and shows how many times that int was in the array list
		public static int alg7(ArrayList<Integer> nums, int number)  {
		    int counter = 0;
		    for (int i = 0; i < nums.size(); i++) 
		    {
		        if (nums.get(i) == number) {
		            counter++;
		        }
		    }
		    return counter;
		}
		
		//this will return the array list to be backwards
		public static void alg8(ArrayList<Integer> nums)  {
		    int[] copyArr = new int[nums.size()];
		    
		    // This will Reverse the array list 
		    for (int i = 0; i < nums.size(); i++) 
		    {
		        copyArr[i] = nums.get(nums.size() - 1 - i);
		    }

		    // This will Print the reversed array list 
		    for (int num : copyArr) 
		    {
		        System.out.print(num + " ");
		    }
		}

		//this will shift all of the elements to the right 
		public static void alg9(ArrayList<Integer> nums)  {
		    int[] copyArr = new int[nums.size()];
		    int lastElement = nums.get(nums.size() - 1);
		    for (int i = copyArr.length - 1; i > 0; i--) 
		    {
		        copyArr[i] = nums.get(i-1);
		    }

		    copyArr[0] = lastElement;

		    for (int num : copyArr) {
		        System.out.print(num + " ");
		    }
		}
		
		//This has insertion sort and is inserting the array list
		public static void alg10(ArrayList<Integer> nums)  {
		    for (int i = 1; i < nums.size(); i++){
		        int insert = nums.get(i);
		        int j = i - 1;
		        while (j >= 0 && nums.get(i) > insert) 
		        {
		            nums.set(j + 1,j);
		            j--;
		        }

		        nums.set(j+1, insert);
		    }

		    for (int num : nums)
		    {
		        System.out.print(num + " ");
		    }
		}
	}
	

