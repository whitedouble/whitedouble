
//银行类
public class Bank {

	public int money=10000;//钱
	
	//柜台取钱函数
	public void Counter(int num){
		money-=num;
		System.out.println("A取了："+num+" 剩余钱数："+money);
	}
	
	//ATM取钱函数
	public void Atm(int num){
		money-=num;
		System.out.println("B取了："+num+" 剩余钱数："+money);
	}
	
	
}
