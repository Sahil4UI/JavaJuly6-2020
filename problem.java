
public class problem {
	public static void main(String[] args) {
		int amountdeposit = 50000;
		int days =400;
		double totalinterest = 0,totalsum=0;
		
		if (days > 365)
		{
			totalinterest = (amountdeposit *8.5)/100;
		}
		else if (days == 365)
		{
			totalinterest = (amountdeposit*9)/100;
		}
		else if (days < 364) 
		{
			totalinterest = (amountdeposit*7.5)/100;
		}
		else if (days <= 180)
		{	
			totalinterest = (amountdeposit*5.5)/100;
		}
		totalsum = amountdeposit + totalinterest;
		System.out.println("total sum :"+totalsum);
		
	}
}
