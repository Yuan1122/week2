import java.io.*;

class circle {
  double r;
  int count;

 double area() {
    return 3.14 * r * r;
  }  
}
class Oval{
  double ra;
  double rb;
    int count;

   double area() {
    return 3.14 * ra * rb;
  }  
}
class Rectangle{
  double width, height;
    int count;

  double area() {
    return width*height;
  }  
}

class Triangle{
  double width2,height2;
    int count;

   double area() {
    return width2*height2/2;
  } 
  }  


class hw42 { 
  public static void main(String[] args) {
  int count=0;
  int[] chang=new int[10];
  double[] total=new double[20];
	circle a = new circle();
	Oval b = new Oval();
	Rectangle c = new Rectangle();
	Triangle d = new Triangle();
    for(int i=0;;i++)
	{
	    java.util.Scanner type = new java.util.Scanner(System.in);
        System.out.print("�п�ܺ���->1)���. 2)����. 3)�x��. 4)�T����. -1)���}. : ");
        chang[count] = type.nextInt();
		if(chang[count]==1)
		{
		    java.util.Scanner type1 = new java.util.Scanner(System.in);
            System.out.print("�п�J�b�|:");
            a.r = type1.nextInt();
			total[count]=a.area();
		}
		else if(chang[count]==2)
		{
			java.util.Scanner type2 = new java.util.Scanner(System.in);
            System.out.print("�п�J�u�b:");
            b.ra = type2.nextInt();
			java.util.Scanner type3 = new java.util.Scanner(System.in);
            System.out.print("�п�J���b:");
            b.rb= type3.nextInt();
			total[count]=b.area();
		}
		else if(chang[count]==3)
		{
			java.util.Scanner type4 = new java.util.Scanner(System.in);
            System.out.print("�п�J��:");
            c.width = type4.nextInt();
			java.util.Scanner type5 = new java.util.Scanner(System.in);
            System.out.print("�п�J�e:");
            c.height = type5.nextInt();
			total[count]=c.area();
		}
		else if(chang[count]==4)
		{
			java.util.Scanner type6 = new java.util.Scanner(System.in);
            System.out.print("�п�J��:");
            d.width2 = type6.nextInt();
			java.util.Scanner type7 = new java.util.Scanner(System.in);
            System.out.print("�п�J��:");
            d.height2 = type7.nextInt();
			total[count]=d.area();
		}
		else if(chang[count]==-1)
		    break;
	     count++;
	}
	for(int j=0;j<count;j++)
	{
	    if(chang[j]==1)
	    {
		    System.out.print("��:");
		}
		else if(chang[j]==2)
		{
		    System.out.print("���:");
		}
		else if(chang[j]==3)
		{
		    System.out.print("�x��:");
		}
		else if(chang[j]==4)
		{
		    System.out.print("�T����:");
		}
		System.out.print(""+total[j]);
		System.out.print("\n");
	}

  }
}