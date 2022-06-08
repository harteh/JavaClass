package awtFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * �г��� ������ ������ �� ���̱� ������ ������ ũ�⸦ �Ѿ �� ����
 * ** setBounds ** 
 */
public class  Ex07Panel extends JFrame{
	
	Ex07Panel(){
		Container c = getContentPane();
		setTitle("���̾�α�");
		
		//add Panel class
		c.add(new Dia(), BorderLayout.NORTH); 
		

		//setting
		setSize(500, 350);	    setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class Dia extends Panel {
		JButton j = new JButton("�̸��Է�");
		JTextField j1 = new JTextField(10);
		
		JButton j2 = new JButton("Ȯ��");
		JButton j3 = new JButton("�޽���");
		
		Dia(){
			setBackground(Color.orange);
			add(j);
			add(j1);
			add(j2);
			add(j3);
			
			j.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// input name event
					String name =
							JOptionPane.showInputDialog("�̸� �Է�");	//popUp
					if(name != null) {
						//�̸��� �Է� �ߴٸ�
						j1.setText(name);	//�Է¹��� ���� textFiled �� ��ȯ
					}
				}
			});
			
			j2.addActionListener(new ActionListener() {
				//Ȯ�� ��ư Ŭ���̺�Ʈ
				@Override
				public void actionPerformed(ActionEvent e) {
					int r = JOptionPane.showConfirmDialog(null, "���?",
							"Ȯ��", JOptionPane.YES_NO_OPTION);
					
					if(r == JOptionPane.CLOSED_OPTION) {	
						//�������� �ʰ� â�� ������,
						j1.setText("���������ʾҴ�");
					}
					else if(r == JOptionPane.YES_OPTION){
						j1.setText("��");
					}
					else{
						j1.setText("�ƴϿ�");
					}
				}
			});
			
			j3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog
					(null, "���", "�޽���", JOptionPane.WARNING_MESSAGE);
				}
			});
			
		}
		
	}
	
	public static void main(String[] args) {
		new Ex07Panel();
	}
}
