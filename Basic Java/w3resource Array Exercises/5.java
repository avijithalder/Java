package Hello;

public class TryOn {

	public static boolean contains(int arr[],int item)
	{
		for(int n:arr)
		{
			if(item==n)
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50 };

		System.out.println(contains(array, 20));
		System.out.println(contains(array, 15));

	}
}
