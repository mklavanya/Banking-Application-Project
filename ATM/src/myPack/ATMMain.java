package myPack;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		//create constructor for ATMOprtnIMPL
		ATMOprtnIMPL op=new ATMOprtnIMPL();
		int atmnumber=12345;
		int atmpin=123;
		Scanner in=new Scanner(System.in);
		System.out.println("Eneter the ATM number");
		int atmnum=in.nextInt();
		System.out.println("Eneter the ATM PIN");
		int pin=in.nextInt();
		if((atmnumber==atmnum)&&(atmpin==pin))
		{
			while(true)
			{
				
	System.out.println("1.View Balance\n 2.Withdraw Amount\n  3.Deposit\n "
			+ "4.View MiniStatement\n 5.exit");
	System.out.println("Enter your choice");
	int ch=in.nextInt();
	if(ch==1)
	{
		op.viewBalance();
	}
	else if(ch==2)
	{
		System.out.println("Enetr the amount to withdraw");
		double withdrawAmount=in.nextDouble();
		op.withdrawAmnt(withdrawAmount);
	}
	else if(ch==3)
	{
		System.out.println("Enetr the amount to Deposit");
		double  depositAmount=in.nextDouble();
		op.depositAmnt(depositAmount);
	}
	else if(ch==4)
	{
		op.viewMiniStatement();
	}
	else if(ch==5)
	{
		System.out.println("Collect your ATM card\n Thank you for Using ATM Service!!!");
		System.exit(0);
	}
	else
	{
		System.out.println("Please enter correct choice");
	}
			}
		}
		
		else
		{
			System.out.println("Incorrect ATM or PIN");	
			System.exit(0);
		}

	}

}
