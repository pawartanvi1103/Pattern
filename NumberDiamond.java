class NumberDiamond{
  public static void main(String[] args){

   for(int i=1; i<=5; i++){
     for(int s=5; s > i; s--){
       System.out.print(" ");
    }
     System.out.print(i);

    if(i > 1){
       for(int j=1 ; j<=2*i-3; j++){
        System.out.print(" ");
      }
        System.out.print(i);
    }
     System.out.println();
}
   for(int i=4; i >= 1; i--){
    for(int s=5; s > i; s--){
      System.out.print(" ");
   }
    System.out.print(i);
  if(i > 1){
     for(int j=1; j<=2*i-3; j++){
       System.out.print(" ");
    }
    System.out.print(i);
  }
   System.out.println();
}
}
}       