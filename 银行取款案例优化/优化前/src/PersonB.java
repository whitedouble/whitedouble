
public class PersonB extends Thread{

	private Bank bank;
	
	//���캯��
	public PersonB(Bank bank){
		this.bank=bank;
	}
	
	@Override
	public void run(){
		while(bank.money>=150){
			bank.Atm(150);
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
