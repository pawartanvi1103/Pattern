class MixedNumberAlphabetPyramid{
   public static void main(String[] args){
     
   int num=1;
   char ch='A';
   for(int i=1; i<=5; i++){
       for(int s=5; s>i; s--){
       System.out.print(" ");
     }
      if(i % 2 != 0){
        for(int j=1; j<=(2 * i -1); j++){
        System.out.print(num + " ");
        num++;
     }
   }else{
       for(int j=1; j<=(2 * i - 1); j++){
         System.out.print(ch + " ");
         ch++;
      }
    }
      System.out.println();
}
}
}
       