
//������
public class Bank {

	public int money=10000;//Ǯ
	
	//��̨ȡǮ����
	public void Counter(int num){
		money-=num;
		System.out.println("Aȡ�ˣ�"+num+" ʣ��Ǯ����"+money);
	}
	
	//ATMȡǮ����
	public void Atm(int num){
		money-=num;
		System.out.println("Bȡ�ˣ�"+num+" ʣ��Ǯ����"+money);
	}
	
	
}
