//Bank management system

import java.util.Scanner;
class bank
{
	Scanner sc=new Scanner(System.in);
	int m,t,i;	
	String ch,n;
	double an;
	void account_detail()
	{
		System.out.println("account details");
		System.out.println("Enter account name :");
		n=sc.next();
		System.out.println("Enter account number :");
		an=sc.nextDouble();
		System.out.println("Enter total balance :");
	    t=sc.nextInt();

	}
	void data()
	{
	System.out.println("----------------------------------------------------------------");
	System.out.println("                Bank management system                          ");
	System.out.println("----------------------------------------------------------------");

    do 
    {
	System.out.println("Enter your choice as per conditions : ");
	System.out.println("\n1.View total balance avilable");
	System.out.println("\n2.withdraw the money");
	System.out.println("\n3.debit same money");
	System.out.println("\n4.account details");

	m=sc.nextInt();
	switch(m)
	{
	case 1:
		System.out.println("Total amount present in account");
		System.out.println("Total balance : "+t);
		break;
	case 2:
		System.out.println("Enter amount which you want to withdraw from total balance");
		int wa=sc.nextInt();
		int ra=0;
		if(wa>t)
			System.out.println("please enter correct amount");
		else 
	    ra=(t-wa);
		System.out.println("Total amount :"+ra);
		break;
	case 3:
		System.out.println("Enter amount which you want to add ");
		int da=sc.nextInt();
		int tb=da+t;
		System.out.println("Total amount :"+tb);
		break;
	case 4:
		System.out.println("account details");
		System.out.println("Account Name   :"+n);
		System.out.println("Account Number :"+an);
		break;
	default:
		System.out.println("Please enter correct choice");
		break;
		
	}
	System.out.println("Do you want to continue y/n ");
	ch=sc.next();

	}while(ch.equals("Y"));
    }

    public static void main(String[] args) 
	{
		bank b=new bank();
		b.account_detail();
		b.data();
	
}
}