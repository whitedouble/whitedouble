
//���������
public class Main {

	//������ں���
	public static void main(String[] args){
		Bank bank=new Bank();
		PersonA a=new PersonA(bank);
		a.start();
		PersonB b=new PersonB(bank);
		b.start();
	}
}
