package review;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*
public class Review0609A {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
 */
/*
 * 1. 다음 main()을보고 pr함수와 show함수를작성해라.(Number는클래스명)
 *
class Number {
	static void pr(int n){
		System.out.println(n);
	}
	
	void show(double n) {
		System.out.println(n);
	}
}

public class Review0609A {
	public static void main(String[] args) {
		Number.pr(100);
		Number n = new Number();
		n.show(3.14);
	}
}
*/
/*
 * 2. 프레임에 임의의 정수(1~50)범위에서 수 하나를 띄우고, 
 * 버튼“+5”, “-5”, “/5”버튼을 만들어 +5를누르면 임의의 수에서 +5한값을띄우고, 
 * 나머지버튼도 알맞은연산을 하도록 구현해라. 버튼은 단 한번밖에 못누른다.
 *
public class Review0609A extends JFrame{
	Review0609A(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//랜덤 수
		int num = (int)((Math.random()*50)+1);
		JLabel j1 = new JLabel(Integer.toString(num));
		
		JButton jb1 = new JButton("+5");
		JButton jb2 = new JButton("-5");
		JButton jb3 = new JButton("/5");
		//클릭이벤트
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = Integer.parseInt(j1.getText()) +5;
				j1.setText(Integer.toString(result));
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = Integer.parseInt(j1.getText()) -5;
				j1.setText(Integer.toString(result));
			}
		});
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = (Integer.parseInt(j1.getText()) /5);
				j1.setText(Integer.toString(result));
			}
		});
		
		//setting
		c.add(j1);
		c.add(jb1);
		c.add(jb2);
		c.add(jb3);
		setSize(100, 200);       setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Review0609A();
	}
}
*/
/*
 * etc.
 *
public class Review0609A {
	public static void main(String[] args) {

		HashMap<String, Integer> m =
				new HashMap<String, Integer>();
		
		m.put("세종",1);
		m.put("태조",2);
		m.put("정조",3);
		
		//Entry Set
		Set<Entry<String, Integer>> s = m.entrySet();
		
		for(Entry<String, Integer> m1:s) {
			System.out.println(m1.getValue());
			System.out.println(m1.getKey());
		}
		//Entry Set
		
		//
		Set<String> keys = m.keySet();
		Iterator<String> it = keys.iterator();
		
		int max = 0;
		String str="";
		while(it.hasNext()) {
			String name = it.next();
			int n = m.get(name);
			
			if(max<n) {
				max = n;
				str=name;
			}
		}
		System.out.println(str+" "+max);
	}
}
*/
/*
 * 3
 */
public class Review0609A {
	public static void main(String[] args) {

		//Double b[] (wrapper 클래스)에
		//실수 2개를 넣고 for-each문으로 출력
		Double b[] = {1.2, 2.3};
		
		for(Double bb:b) {
			System.out.println(bb);
		}
		
	}
}




