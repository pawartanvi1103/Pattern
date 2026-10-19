class HallowRightAngleAlphTriangle{
  public static void main(String[] args){

  for(int i=1; i<=5; i++){
   if(i==1){
    System.out.println("A");
  }
  else if(i==5){
    for(int j=1; j<=5; j++){
     System.out.print((char)('A' + j - 1)+ "\t");
    }
    System.out.println();
    }
     else{
          for(int j=1; j<=2; j++){
          if(j==1){
           System.out.print((char)('A' + i - 1)+"\t");
}else{
    for(int s=1; s<i-1; s++){
       System.out.print("\t");
     }
     System.out.print((char)('A' + i)+"\t");
    }
   }
   System.out.println();
  }
  }
  }
 }