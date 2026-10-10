class DecreasingNumberTriangle{
   public static void main(String[] args){

   for(int i=9; i>=1; i-=2)
   {
     for(int s=9; s>i; s-=2)
     {
       System.out.print(" ");
   }
    for(int j=1 ; j<=i; j++)
    {
       System.out.print(j + " ");
}
  System.out.println();
}
}
}