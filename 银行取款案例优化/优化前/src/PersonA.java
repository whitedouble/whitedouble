
//A
public class PersonA extends Thread {

	private Bank bank;
	
	//���캯��
	public PersonA(Bank bank){
		this.bank=bank;
	}
	
	@Override
	public void run(){
		while(bank.money>=100){
			bank.Counter(100);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
