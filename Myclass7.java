import java.util.Scanner;
class Myclass7 {
	public static void main (String[] args){
		Scanner myObj=new Scanner(System.in);
		String userName;
		System.out.println("enter userName");
		userName=myObj.nextLine();
		System.out.println("the username is:" +userName);
	}
}