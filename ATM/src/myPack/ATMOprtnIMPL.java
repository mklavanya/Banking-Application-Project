package myPack;

import java.util.*;

public class ATMOprtnIMPL implements ATMOprtn{
	ATMPrj atm=new ATMPrj();
	Map<Double,String>ministmnt=new HashMap<>();
	@Override
	public void viewBalance() {
		System.out.println("Available Balance:"+atm.getBalance());
		
	}

	@Override
	public void withdrawAmnt(double withdrawAmount) {
		if(withdrawAmount%500==0)
		{
			if(withdrawAmount<=atm.getBalance())
			{
				ministmnt.put(withdrawAmount, "Amount Withdrawn");
				System.out.println("Collect the cash:"+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				viewBalance();
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
		}
		else
		{
			System.out.println("Please enter the amount in multiple of 500");
		}
	}

	@Override
	public void depositAmnt(double depositAmount) {
		
		ministmnt.put(depositAmount, "Amount Deposited");
		System.out.println(depositAmount+"Deposited Successfully!!");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();
		
	}

	@Override
	public void viewMiniStatement() {
		for(Map.Entry<Double, String>m:ministmnt.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
