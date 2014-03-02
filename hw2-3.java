import java.io.*;

class hw23 {
  public static void main(String[] args) throws Exception {
    java.util.Scanner type = new java.util.Scanner(System.in);
    System.out.print("請輸入西元年份:");
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