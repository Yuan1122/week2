import java.io.*;

class hw22 {
  public static void main(String[] args) throws Exception {
    double sum;
    java.util.Scanner type = new java.util.Scanner(System.in);
    System.out.print("�п�J�Ʀr1:");
    double number1 = type.nextDouble();
    java.util.Scanner type1 = new java.util.Scanner(System.in);
    System.out.print("�п�J�Ʀr2:");
    double number2 = type1.nextDouble();
     java.util.Scanner type2 = new java.util.Scanner(System.in);
    System.out.print("�п�ܹB��覡1)+.2)-.3)*.4)/:");
    int ch = type2.nextInt();
        switch(ch) {  
            case 1: 
                sum=number1+number2;
                System.out.println(""+sum); 
                break; 
            case 2: 
                sum=number1-number2;
                System.out.println(""+sum); 
                break; 
            case 3: 
                sum=number1*number2;
                System.out.println(""+sum); 
                break; 
            case 4: 
                if(number2==0)
                { 
                    System.out.println("error!\n");
                    break; 
                } 
                sum=number1/number2;
                System.out.println(""+sum); 
                break; 
            default: 
                System.out.println("��J���~!\n");
		}
	}
}