import java.io.*;
class hw41 {
  double []ra=new double[10];
  double []rb=new double[10];
  int cir=0;
  int count=0;
  int atk;
  double as;
  double Arc(){
    as=3.14*2*rb[atk]+4*ra[atk]-4*rb[atk];
    return as*cir/360;
  }
  double Pie(){
    return 3.14*ra[atk]*rb[atk]*cir/360;
  }
  
  public static void main(String[] args) {
    hw41 c = new hw41();
	for(int i=0;;i++)
	{
	    java.util.Scanner type = new java.util.Scanner(System.in);
        System.out.print("請輸入短軸(-1結束):");
        c.ra[c.count] = type.nextInt();
		if(c.ra[c.count]==-1)
		    break;
	    java.util.Scanner type1 = new java.util.Scanner(System.in);
        System.out.print("請輸入長軸:");
        c.rb[c.count] = type1.nextInt();

		c.count++;
	}
	c.count--;
	java.util.Scanner type2 = new java.util.Scanner(System.in);
    System.out.print("請輸入選擇的編號(需介於0~"+c.count+")");
    c.atk = type2.nextInt();
	java.util.Scanner type3 = new java.util.Scanner(System.in);
    System.out.print("請輸入角度:");
    c.cir = type3.nextInt();
	System.out.print("Arc:"+c.Arc());
	System.out.print("Pie:"+c.Pie());
    

  }
}