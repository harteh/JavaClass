package gui;

/**
 * ItemListener -> JCheckbox, JRadioButton, JCheckBoxMenuItem
 */

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class GuiEx11JcheckBox extends JFrame {
	
	GuiEx11JcheckBox (){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//�ߺ����� ����
		JCheckBox j = new JCheckBox("�ڹ�");
		
		j.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("�ڹ� ��Դ�");
				}
				
			}
		});
		
		
		c.add(j);
		
		setSize(350, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuiEx11JcheckBox();
	}
}
