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
 * 1. ���� main()������ pr�Լ��� show�Լ����ۼ��ض�.(Number��Ŭ������)
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
 * 2. �����ӿ� ������ ����(1~50)�������� �� �ϳ��� ����, 
 * ��ư��+5��, ��-5��, ��/5����ư�� ����� +5�������� ������ ������ +5�Ѱ�������, 
 * ��������ư�� �˸��������� �ϵ��� �����ض�. ��ư�� �� �ѹ��ۿ� ��������.
 *
public class Review0609A extends JFrame{
	Review0609A(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//���� ��
		int num = (int)((Math.random()*50)+1);
		JLabel j1 = new JLabel(Integer.toString(num));
		
		JButton jb1 = new JButton("+5");
		JButton jb2 = new JButton("-5");
		JButton jb3 = new JButton("/5");
		//Ŭ���̺�Ʈ
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
		
		m.put("����",1);
		m.put("����",2);
		m.put("����",3);
		
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

		//Double b[] (wrapper Ŭ����)��
		//�Ǽ� 2���� �ְ� for-each������ ���
		Double b[] = {1.2, 2.3};
		
		for(Double bb:b) {
			System.out.println(bb);
		}
		
	}
}




