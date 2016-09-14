abstract class Bank {

	abstract void getRateOfInterest(float interest);
}

class SBI extends Bank {

	void getRateOfInterest(float interest) {
	
		System.out.println("SBI bank interest rate is - " + interest);
	}
}

class ICICI extends Bank {

	void getRateOfInterest(float interest) {
	
		System.out.println("ICICI bank interest rate is - " + interest);
	}
}

class AXIS extends Bank {

	void getRateOfInterest(float interest) {
	
		System.out.println("AXIS bank interest rate is - " + interest);
	}
}

class Interest {

	 public static void main(String[] args) 
          { 
                SBI s = new SBI();
				s.getRateOfInterest(8);
				
                ICICI i = new ICICI();
				i.getRateOfInterest(7);
				
                AXIS a = new AXIS();
				a.getRateOfInterest(9);
          }
}