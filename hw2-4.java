import java.io.*;

class hw24 {
  public static void main(String[] args) {
           int count=0;
           int[] grade=new int[10];
           for(int i=0;;i++)
           {         
               java.util.Scanner type = new java.util.Scanner(System.in);
               System.out.print("�п�J����(-1���}) : ");
               grade[count] = type.nextInt();
			   if(grade[count]==-1)
			       break;
               if(grade[count]>100||grade[count]<-1)
               {
                    System.out.print("error!\n");
                    i--;
                    count--;
               } 
               count++;
           }
		       count--;
               java.util.Scanner type1 = new java.util.Scanner(System.in);
               System.out.print("�п�J��ܪ��s��(�ݤ���0~"+count+")");
               int j = type1.nextInt();
               System.out.print(j+":"+grade[j]+"\n");
  }
}