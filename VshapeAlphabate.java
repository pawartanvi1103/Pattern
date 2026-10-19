class VshapeAlphabate{
  public static void main(String[] args){

  char ch ='A';
  for(int i=1; i<=5; i++){
    for(int j=1; j<=i; j++){
    System.out.print(" ");
  }
   System.out.print(ch);
   ch++;

   for(int j=1; j<=9-2*i; j++){
     System.out.print(" ");
}
 if(i != 5){
     System.out.println((char)('I' - i + 1));
}
}
}
}