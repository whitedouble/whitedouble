
//������
public class Bank {

	public static int money=10000;//Ǯ
	
	//��̨ȡǮ����
	public static void Counter(String name,int num){
		money-=num;
		System.out.println(name+"ȡ�ˣ�"+num+" ʣ��Ǯ����"+money);
	}
	
	//ATMȡǮ����
	public static void Atm(String name,int num){
		money-=num;
		System.out.println(name+"ȡ�ˣ�"+num+" ʣ��Ǯ����"+money);
	}
	
	
}
