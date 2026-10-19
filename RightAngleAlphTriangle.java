class RightAngleAlphTriangle{
   public static void main(String[] args){

   for(int i=1; i<=5; i++){
      for(int j=1; j<=i; j++){
       System.out.print((char)('A' + j - 1)+ "\t");
    }
      for(int j=i-1; j>=1; j--){
       System.out.print((char)('A' + j - 1)+ "\t");
    }
      System.out.println();
  }
  }
}