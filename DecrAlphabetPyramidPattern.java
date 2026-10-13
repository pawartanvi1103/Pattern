class DecrAlphabetPyramidPattern{
   public static void main(String[] args){

    for(int i=5; i>=1; i--){
     for(int s=5; s>i; s--){
        System.out.print(" ");
   }
      for(char j='A'; j<'A' + i; j++){
          System.out.print(j + " ");
  }
   System.out.println();
}
}
}