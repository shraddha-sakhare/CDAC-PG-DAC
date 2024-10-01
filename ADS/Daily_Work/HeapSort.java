//mam's Program class works 
class HeapSort
{
	void heapify(int arr[],int n,int i)// workswapping and balance heap
	{
		int largest = i;//root
		int l = 2 * i + 1;//leftchild
		int r = 2 * i + 2;//rightchild
		
		if(l < n && arr[l] > arr[largest])
			largest=l;
		
		 if(r < n && arr[r] > arr[largest])
			largest=r;
		
		if(largest != i)
		{
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			
		//}
		heapify(arr,n,largest);
		}
		
	}
	
	void heapsort(int arr[])
	{
		int n=arr.length;
		
		//building max heap - insertion 
		for(int i=n/2-1;i > 0;i--) //n/2-1--leaf node always insertion
		{
			heapify(arr,n,i);//max heap
		}
		
		//extract one by one and replace by last
		for(int i=n-1;i>0;i--)  
		{
			//replace root node with last element
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
		//}
		
		heapify(arr,i,0);//balance 
	}
		
	}
	
	void display(int arr[])
	{
		int n= arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+ " ");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		HeapSort h1=new HeapSort();
		int arr[]={99,66,77,44,33,88,11};
		h1.display(arr);
		h1.heapsort(arr);
		h1.display(arr);
		
	}
	
}