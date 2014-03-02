class hw12 {
  public static void main(String[] args) {
    double[] a = {3.7 , 4.2 , 5.6 , 7.5};
    double total = 0.0;
    int count=0;
    for (double x : a)
	{
      total += x;
      count++;
    }
	System.out.println("sum="+total);
    System.out.println("average="+total/count);
  }
}