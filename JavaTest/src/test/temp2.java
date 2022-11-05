package test;

public class temp2 {

	private static int[] testArray = {3, 4, 5};
	public static void main(String[] args) {
		secondTestMethod();

	}
	

	   
	public static int increment (int n)
	{ 
		n++;
		return n; 
	}
	
   public static void firstTestMethod()
   {
       for (int i = 0; i < testArray.length; i++)
       {
        testArray[i] = increment(testArray[i]);
        System.out.print(testArray[i] + " ");
       }
	}
	public static void secondTestMethod()
   {
       for (int element : testArray)
       {
        element = increment(element);
        System.out.print(element + " ");
       }
	}

}
