class MixDecrAlphNoPattern{
  public static void main(String[] args){

  char ch='A';
  int num=1;

  for(int i=1; i<=5; i++){
   for(int s=1; s<i; s++){
     System.out.print("\t");
   }
   for(int j=1; j<=6-i; j++){
     if(i % 2 != 0){
         System.out.print(ch + "\t");
         ch++;
   } else{
          System.out.print(num + "\t");
          num++;
  }
  }
    System.out.println();
}
}
}