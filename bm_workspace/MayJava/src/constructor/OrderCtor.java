package constructor;

class Order {
	long orderNum;
	String id;
	String orderDate;
	String name;
	String productNum;
	String addr;
	
	Order(){}
	
	Order(long orderNum, String orderDate, String name, String productNum){
		this.orderNum = orderNum;
		this.orderDate = orderDate;
		this.name = name;
		this.productNum = productNum;
	}
	
	void showOrder(){
		System.out.printf("�ֹ� ��ȣ : %d\n", orderNum);
		System.out.printf("�ֹ��� ���̵� : %s\n", id);
		System.out.printf("�ֹ���¥ : %s\n", orderDate);
		System.out.printf("�ֹ��� �̸� : %s\n", name);
		System.out.printf("�ֹ� ��ǰ ��ȣ : %s\n", productNum);
		System.out.printf("��� �ּ� : %s\n", addr);
	}
	
}


public class OrderCtor {
	public static void main(String[] args) {
		// p.152 Q2
		
		//1.
		Order order1 = new Order();
		order1.orderNum = 201803120001L;
		order1.id = "abc123";		
		order1.orderDate = "2018��3��12��";		
		order1.name = "ȫ���";
		order1.productNum = "PD0345-12";		
		order1.addr = "����� �������� ���ǵ��� 20����";
		
		order1.showOrder();
		
		System.out.println("***** 2 *****");
		Order order2 = new Order(12345, "2021-12-23", "�̼���", "PD023");
		order2.showOrder();
		

	}
}
