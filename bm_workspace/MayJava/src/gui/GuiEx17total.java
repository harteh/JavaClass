package gui;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

class Check implements ItemListener {
	JRadioButton jb1;
	JRadioButton jb2;
	JRadioButton jb3;
	
	Check(JRadioButton jb1, JRadioButton jb2, JRadioButton jb3){
		this.jb1=jb1;	this.jb2=jb2;	this.jb3=jb3;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			//체크박스가 선택 되었을 때 라디오버튼 활성화
			jb1.setEnabled(true);
			jb2.setEnabled(true);
			jb3.setEnabled(true);
		}
		else {
			jb1.setEnabled(false);
			jb2.setEnabled(false);
			jb3.setEnabled(false);
		}
	}
}

public class GuiEx17total {
	public static void main(String[] args) {

		JFrame j = new JFrame();
		
		//0행1열로 배치
		j.setLayout(new GridLayout(0, 1));
		
		JCheckBox jc = new JCheckBox("공부 선택");
		
		ButtonGroup bgSet = new ButtonGroup(); 
		JRadioButton jb1 = new JRadioButton("Java"); 
		JRadioButton jb2 = new JRadioButton("Python"); 
		JRadioButton jb3 = new JRadioButton("C#"); 
		
		//라디오버튼 비활성화
		jb1.setEnabled(false);
		jb2.setEnabled(false);
		jb3.setEnabled(false);
		
		//체크박스 선택 시 라디오버튼 활성화
		jc.addItemListener(new Check(jb1,jb2,jb3));
		
		//라디오버튼 클릭 시 이벤트
		jb1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("Java!!");
				}
			}
		});
		jb2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("Python!!");
				}
			}
		});
		jb3.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("C#!!");
				}
			}
		});
		
		
		//setting
		j.add(jc);
		
		bgSet.add(jb1);
		bgSet.add(jb2);
		bgSet.add(jb3);
		j.add(jb1);
		j.add(jb2);
		j.add(jb3);
		
		j.setSize(500, 350);
		j.setVisible(true);
	}
}
