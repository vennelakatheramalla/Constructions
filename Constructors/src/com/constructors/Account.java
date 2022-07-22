package com.constructors;

public class Account {
	public Integer accountId;
	public String accountname;
	public long accountnumber;
	public String accountcreatedate;
	//default constructor
	public Account(){
	}
	//parameter constructor
	public Account(Integer accountId,String accountname,long accountnumber,String accountcreatedate){
		this.accountId= accountId;
		this.accountname=accountname;
		this.accountnumber=accountnumber;
		this.accountcreatedate=accountcreatedate;
	}
	//save method
	public void save() {
		System.out.println("Dislpaying account");
	}
//creating method
	public void displayDetails(){
		System.out.println("The accountId is:" +accountId);
		System.out.println("The accountname is:" +accountname);
		System.out.println("The accountnumber is:" +accountnumber);
		System.out.println("The accountcreatedate is:" +accountcreatedate);
		
	}
	
	public static void main(String[] args) {
		Account account=new Account(1235674,"Vennela",76453724l,"17-04-2022");
		account.displayDetails();
		Account Account=new Account();
		Account.save();
		
		
		
	}

}
