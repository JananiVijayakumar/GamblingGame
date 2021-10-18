import java.util.*;
public class UC3 {
public static int stake = 100;
public static final int WIN = 1;
public static final int LOSE = 0;
public static final int BET =1;
public static void main(String[] args) {
System.out.println("gambling :" +stake);
while(stake >= 50 && stake<=150){
			Random r=new Random();
			int  rand = r.nextInt(2);
			if (rand == WIN){
			stake = (stake + BET);
			}
			else{
			stake = (stake - BET);
			}
			}
			System.out.println("after beting :" +stake);
		}
		}