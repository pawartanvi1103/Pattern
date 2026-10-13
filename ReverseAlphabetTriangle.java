class ReverseAlphabetTriangle{
  public static void main(String[] args){

   for(char i='A'; i<='E'; i++){
     for(char s='E'; s > i; s--){
      System.out.print(" ");
   }
  for(char j=i; j >= 'A'; j--){
   System.out.print(j + "");
  }
   System.out.println();
}
}
}