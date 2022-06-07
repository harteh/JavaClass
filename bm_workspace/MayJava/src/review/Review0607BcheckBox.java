package review;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/*
 * üũ�ڽ� 2���� �Ϲݹ�ư 1�� �����
 * üũ�ڽ� �ϳ��� "��Ȱ��ȭ"�� �̸��� �ְ�
 * üũ�ڽ� �ϳ��� "���߱�" �� �̸���  �ְ�
 * �Ϲݹ�ư �̸��� "button"�̶�� �Ѵ�.
 * 
 * ��Ȱ��ȭ üũ�ڽ��� Ŭ���ϸ� �Ϲ� ��ư�� ��Ȱ��ȭ
 * ���߱� üũ�ڽ��� Ŭ���ϸ� �Ϲ� ��ư�� �Ⱥ��̰� ����ض�
 */
public class Review0607BcheckBox {
	public static void main(String[] args) {
		
		JFrame j = new JFrame();
		j.setLayout(new FlowLayout());
		
		JCheckBox jc1 = new JCheckBox("��Ȱ��ȭ");
		JCheckBox jc2 = new JCheckBox("���߱�");
		
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
