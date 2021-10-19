import java.util.*;
public class UC5{

	int EverydayBet=1;
	public void WinOrLoss(){
		int AfterBet=0;
		Random r1=new Random();

		for (int j=1; j<=12; j++)
		{
			int WinCount=0;
			int LossCount=0;
			int Profit=0;
			int Loss=0;
			int EverydayStake=0;
			System.out.println("Month : "+j);
			for (int i=1; i<=30; i++)
			{	
				EverydayStake=AfterBet+100;
				int StakeCheck=EverydayStake;
				System.out.println("Beting amount for day "+i+" is:"+EverydayStake);

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
				System.out.println("after the beting amount of day "+i+" : "+EverydayStake);

				if(StakeCheck<AfterBet)
				{
					int ProfitAmount=AfterBet-StakeCheck;
					WinCount++;
					Profit +=Profit;
					System.out.println("profit of the day "+i+" is : "+Profit);
				}
				else
				{
					int LossAmount=StakeCheck-AfterBet;
					LossCount++;
					Loss +=Loss;
					System.out.println("loss of the day "+i+" is :"+LossAmount);
				}
			
			}
			System.out.println("Winning amount for each month is : "+j+" is::"+WinCount);
			System.out.println(" profit amount of month"+j+" is :"+Profit);
			System.out.println("Lossing amount for each month is : "+j+" is::"+LossCount);
			System.out.println("loss amount of month "+j+" is :"+Loss);
		}

	}
	
	public static void main(String[] args){
		UC5 uc5=new UC5();
		System.out.println("Welcome to gambling game");
		System.out.println("The player can start for the day is:100$");
		System.out.println("Minimum amount player can bet every game is:"+uc5.EverydayBet+"$");
		uc5.WinOrLoss();
		
	}
}