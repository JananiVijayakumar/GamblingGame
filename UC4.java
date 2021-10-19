import java.util.*;
class UC4{
	int EverydayStake=100;
	int EverydayBet=1;
	public void WinOrLoss(){
		int AfterBet=0;
		Random r1=new Random();

		for (int i=1; i<=60; i++)
		{	
			EverydayStake=AfterBet+100;
			int StakeCheck=EverydayStake;
			System.out.println("The Beting amount for day "+i+" is:"+EverydayStake);

			int FPer=EverydayStake/2;
        	        int WinPer=EverydayStake+FPer;
               		int LossPer=EverydayStake-FPer;

			while(EverydayStake>LossPer && EverydayStake<WinPer)
			{
				int WinLoss=r1.nextInt(2);
				if(WinLoss==1)
				{
					//System.out.println("win");
					AfterBet=EverydayStake+EverydayBet;
				}
				else
				{
					//System.out.println("loose");
					AfterBet=EverydayStake-EverydayBet;
				}
				EverydayStake=AfterBet;
				//System.out.println("after play="+afterBet);
			}
			System.out.println("after the beting amount in day "+i+" :"+EverydayStake);

			if(StakeCheck<AfterBet)
			{
				int Profit=AfterBet-StakeCheck;
				System.out.println("profit of day "+i+" is : "+Profit);
			}
			else
			{
				int Loss=StakeCheck-AfterBet;
				System.out.println("Loss of day "+i+" is :"+Loss);
			}
			
		}

	}
	
	public static void main(String[] args){
		UC4 g1=new UC4();
		System.out.println("Welcome to Gambling game");
		System.out.println("The player can start for the day is:"+g1.EverydayStake+"$");
		System.out.println("Minimum amount player can bet every game is:"+g1.EverydayBet+"$");
		g1.WinOrLoss();
		
	}
}