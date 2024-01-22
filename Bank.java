class bank{
	int accbal;
	bank(int accbal){
		this.accbal=accbal;
		System.out.println("the initial balance is "+accbal);
	}
		
	bank deposit(int dep) {
		  accbal=accbal+dep;
		  System.out.println("Deposited amount is "+dep);
		  System.out.println("availabale balance is "+accbal);
		         return this;
		         
	}
	
	void withdraw(int with) {
		 this.accbal=accbal-with;
		 System.out.println("withdrawl amount is  "+with);
		 System.out.println("withdrawl amount is  "+accbal);
		 
	}
	
	public static void main(String[] args) {
		new bank(1000).deposit(100).withdraw(500);
	}
	
		
		
		
	}
	