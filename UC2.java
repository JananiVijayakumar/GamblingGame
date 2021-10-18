import java.util.*;
public class UC2 {
public void WinOrLose(){
 
Random r1=new Random();
int Gambling=r1.nextInt(2);
if(Gambling==1){
System.out.println("Gambler is win");
}
else{
System.out.println("Gambler is win");
}
}
public static void main(String[] args)
{
System.out.println("welcome to gambling game");
UC2 uc1=new UC2();
uc1.WinOrLose();
}
}