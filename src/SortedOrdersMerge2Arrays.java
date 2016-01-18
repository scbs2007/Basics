
public class SortedOrdersMerge2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]={1,2,3,4,5};
		int arr2[]={1,3,5,6,7,0,0,0,0,0};
		int i, j, k;
		i=j=(int)Math.min(arr1.length, arr2.length) - 1 ;
		k=(int)Math.max(arr1.length, arr2.length) - 1;
		while(i>=0 && j>=0)
		{
			if(arr1[j] < arr2[i])
			{	arr2[k] = arr2[i];
				--i;
			}
			else
			{
				arr2[k] = arr1[j];
				--j;
			}
			k--;
		}
		while(i>=0)
		{
			arr2[k] = arr2[i--];
			k--;
		}
		while(j>=0)
		{
			arr2[k] = arr1[j--];
			k--;
		}
		for(i =0; i<arr2.length; ++i)
		{
			System.out.print(arr2[i]);
		}
	}

}
