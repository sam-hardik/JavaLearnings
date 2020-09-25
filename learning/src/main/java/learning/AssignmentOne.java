package learning;
//Find the missing number in given array
public class AssignmentOne {
	public int missingElementFinder(int arr[]) throws Exception
	{
		
		 if(arr.length==0){
			 throw new Exception("Empty Array Exception");
		 }else{int i, total,n=arr.length;
	        total = (n + 1) * (n + 2) / 2;
	        for (i = 0; i < n; i++)
	            total -= arr[i];
	        return total;}
	}

}
