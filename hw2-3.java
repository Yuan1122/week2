import java.io.*;

class hw23 {
  public static void main(String[] args) throws Exception {
    java.util.Scanner type = new java.util.Scanner(System.in);
    System.out.print("�п�J�褸�~��:");
    int number = type.nextInt();
    for(int i=0;i<number;i++)
    {
        if(i%400 == 0 || ( i%4 == 0 && i%100 != 0))
		{
			System.out.print( i + "\t");
		}
    }  
	}
}