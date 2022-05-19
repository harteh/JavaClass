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
		System.out.printf("주문 번호 : %d\n", orderNum);
		System.out.printf("주문자 아이디 : %s\n", id);
		System.out.printf("주문날짜 : %s\n", orderDate);
		System.out.printf("주문자 이름 : %s\n", name);
		System.out.printf("주문 상품 번호 : %s\n", productNum);
		System.out.printf("배송 주소 : %s\n", addr);
	}
	
}


public class OrderCtor {
	public static void main(String[] args) {
		// p.152 Q2
		
		//1.
		Order order1 = new Order();
		order1.orderNum = 201803120001L;
		order1.id = "abc123";		
		order1.orderDate = "2018년3월12일";		
		order1.name = "홍길순";
		order1.productNum = "PD0345-12";		
		order1.addr = "서울시 영등포구 여의도동 20번지";
		
		order1.showOrder();
		
		System.out.println("***** 2 *****");
		Order order2 = new Order(12345, "2021-12-23", "이순신", "PD023");
		order2.showOrder();
		

	}
}
