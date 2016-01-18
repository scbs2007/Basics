
public class TestingArray {

	public static int[] addElements(int arr[])
	{
		for(int i=0;i<arr.length;++i)
		{
			arr[i]=i;
		}
		return arr;
	}
	public static void disp(int arr[])
	{
		for(int i=0;i<arr.length;++i)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[10];
		arr = addElements(arr);
		disp(arr);
	}

}
