import java.util.Arrays;


public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		
		int n;
		int m;
		
		n = (int) (Math.random()*100);
		m = (int) (Math.random()*100);
		
		System.out.println(n);
		System.out.println(m);
		
		
		int A[] = new int[n];
		int B[] = new int[m];
		int C[] = new int[n+m];
		
		
		for(int i=0; i<n; i++){
			
			A[i] = (int) (Math.random()*1000);
			
		}
		
		for(int i=0; i<m; i++){
			
			B[i] = (int) (Math.random()*1000);
			
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		System.out.println();
		System.out.println("Array A");
		
		for(int i=0; i<n; i++){
			
			if((i)%8==0){
				System.out.println();
			}
			System.out.print(A[i]+", ");
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Array B");
		
		
		for(int i=0; i<m; i++){
			
			if((i)%8==0){
				System.out.println();
			}
			System.out.print(B[i]+", ");
			
		}
		
		Merge(A, n, B, m, C);
		
		System.out.println();
		System.out.println();
		System.out.println("Array C");
		
		for(int i=0; i<C.length; i++){
			
			if((i)%8==0){
				System.out.println();
			}
			System.out.print(C[i]+", ");
			
		}
		
	}
	
	public static void Merge(int A[], int n, int B[], int m, int C[]){
		
		while (n>0 && m>0){
			
			if(A[n-1]>=B[m-1]){
				
				C[n+m-1] = A[n-1];
				n--;
				
			}else{
				
				C[n+m-1] = B[m-1];
				m--;
				
			}
		
		}	
			
		if(n>m){
			
			while (n>0){
				
				C[n+m-1] = A[n-1];
				n--;
				
			}
		}else{
			
			while (m>0){
				
				C[n+m-1] = B[m-1];
				m--;
			}
			
		}
		
			
		}
		
	}


