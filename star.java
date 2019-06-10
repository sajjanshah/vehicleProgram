public class star {
	public static void main(String[] args){
		/*

		to print the output as following
		*****
		****
		***
		**
		*

		*/
		int i,j;
		int n=5;
		for(i=1;i<=n;i++) {
			for(j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}


