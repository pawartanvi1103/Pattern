class  IncreasingStarPatternWithRightSide{
public static void main(String[] args){

for(int i =1; i<=7; i++)
{
for(int j=1 ; j<=i; j++)
{
System.out.print("*");
}

for(int j=1; j<=6-i; j++)
{
System.out.print(" ");
}

if(i < 7)
{
System.out.print("*");
}
System.out.println();
}
}
}