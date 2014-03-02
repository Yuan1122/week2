import java.io.*;
class hw31 {
  double []r=new double[10];
  int cir=0;
  int count=0;
  int atk;
  double Arc(){
    return 3.14*2*r[atk]*cir/360;
  }
  double Pie(){
    return 3.14*r[atk]*r[atk]*cir/360;
  }
  
  public static void main(String[] args) {
    hw31 c = new hw31();
	for(int i=0;;i++)
	{
	    java.util.Scanner type = new java.util.Scanner(System.in);
        System.out.print("請輸入半徑(-1離開):");
        c.r[c.count] = type.nextInt();
		if(c.r[c.count]==-1)
		    break;
		c.count++;
	}
	c.count--;
	java.util.Scanner type1 = new java.util.Scanner(System.in);
    System.out.print("請輸入想選擇的編號(需介於0~"+c.count+")");
    c.atk = type1.nextInt();
	java.util.Scanner type2 = new java.util.Scanner(System.in);
    System.out.print("請輸入角度:");
    c.cir = type2.nextInt();
	System.out.print("Arc:"+c.Arc()"\n");
	System.out.print("Pie:"+c.Pie());
    

  }
}