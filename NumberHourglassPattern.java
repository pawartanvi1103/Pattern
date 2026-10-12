class NumberHourglassPattern{
   public static void main(String[] args){

   for(int i=1; i<=7; i++){
    for(int s=1; s<i && i <= 4; s++){
        System.out.print(" ");
}
    for(int s=7; s >i && i > 4; s--){
         System.out.print(" ");
}
   int count;
    if(i <= 4){
      count= 8-(2 * i - 1);
     } else{
        count = 2 *(i - 4)+ 1;
       }
        for(int j=1; j<=count; j++){
         System.out.print(i + " ");
   }
      System.out.println();
}
}
}