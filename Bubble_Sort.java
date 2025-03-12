
public class Bubble_Sort {

	public static void main(String[] args) {
		int[] nums={-8 ,5,2,3,4, -20,6, 0};
		bubbleSort(nums);

	}
	//bubble sort its looks at two numbers and see if the first is bigger than the other and if it is than it flips it 
		public static void bubbleSort (int[] arr)
		{
		//It something that can keep the while going and something you can change in the while
		boolean test = true;
		//the while will keep it running until it is sorted
		while (test)
		{
			//stops the while loop if there are no swaps
			test = false;
			for (int x = 0; x < arr.length-1; x++)
			{
				//Grabbing the current element and grabbing the element next to it
				if (arr[x]>= arr[x+1])
				{
					//this allows the while loop to continue
					test=true;
					//This swaps the two elements
					int temp = arr[x];
					arr[x] = arr[x+1];
					arr[x+1] = temp;
				}
			}
			 //Prints out the sorted array

		}
		
	    for (int x = 0; x < arr.length; x++)
	    {
	    	System.out.print(arr[x]);
	    }
			
		}	

}
