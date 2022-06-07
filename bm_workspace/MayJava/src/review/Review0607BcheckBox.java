package review;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/*
 * 체크박스 2개와 일반버튼 1개 만들어
 * 체크박스 하나는 "비활성화"로 이름을 주고
 * 체크박스 하나는 "감추기" 로 이름을  주고
 * 일반버튼 이름은 "button"이라고 한다.
 * 
 * 비활성화 체크박스를 클릭하면 일반 버튼을 비활성화
 * 감추기 체크박스를 클릭하면 일반 버튼을 안보이게 출력해라
 */
public class Review0607BcheckBox {
	public static void main(String[] args) {
		
		JFrame j = new JFrame();
		j.setLayout(new FlowLayout());
		
		JCheckBox jc1 = new JCheckBox("비활성화");
		JCheckBox jc2 = new JCheckBox("감추기");
		
		JButton jb = new JButton("button");
		
		jc1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					jb.setEnabled(false);
				}
				else {
					jb.setEnabled(true);
				}
			}
		});
		
		jc2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					jb.setVisible(false);
				}
				else {
					jb.setVisible(true);
				}
			}
		});
		
		//setting
		j.add(jc1);
		j.add(jc2);
		j.add(jb);
		
		j.setSize(500, 350);
		j.setVisible(true);
		
	}
}
