import java.io.*;

class hw21 {
public static void main(String[] args) throws Exception {
    int y=1911;
    System.out.print("請輸入姓名：");
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(is);
    String name = in.readLine();
    java.util.Scanner type = new java.util.Scanner(System.in);
    System.out.print("請輸入年:");
    int year = type.nextInt();
    System.out.print("請輸入月:");
    InputStreamReader is2 = new InputStreamReader(System.in);
    BufferedReader in2 = new BufferedReader(is2);
    String month = in2.readLine();
    System.out.print("請輸入日:");
    InputStreamReader is3 = new InputStreamReader(System.in);
    BufferedReader in3 = new BufferedReader(is3);
    String day = in3.readLine();
	System.out.println(name+"您好，很高興見到您!\n");
        year=year-y;
        System.out.printf("民國:"+year);
        System.out.printf("月:"+month);
        System.out.printf("日:"+day);
  }
}