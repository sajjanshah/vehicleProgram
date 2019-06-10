public class Stars {

	public String fullname;
	Stars (String fullname) {
		this.fullname = fullname;
	}

	public static void main(String args[]){
		Stars a1 = new Stars("Rahul");
		a1.getTriangle1();
	}
	
	
	/*
	
	To get output as following triangle
	*
	**
	***
	****
	*****
	*/
	public void getTriangle() {
		int n=5;
		int i,j;
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=i;j++)
			{	
				System.out.print("*");
			}	
			System.out.println();
			
		}
	}
	
	
	/*
	To get output as following triangle
	  *****
	  ****
	  ***
	  **
	  *
	*/
	public void getTriangle1() {
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

