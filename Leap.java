import java.util.Scanner;
class Leap{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
int y=scan.nextInt();
if(y%4==0)
if(y%100==0)
if(y%400==0)
System.out.println("YES");
else
System.out.println(" NO");
else
System.out.println("YES");
else
System.out.println("NO");
}
}
