package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuiEx19append  extends JFrame {
	
	JTextField j = new JTextField(20);
	JTextArea j1 = new JTextArea(10, 20);
	
	GuiEx19append (){
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      
      JLabel jl = new JLabel("enterŰ�� �Է�");
      c.add(j);
      c.add(jl);
      c.add(new JScrollPane(j1));	//��ũ�ѹ� ����
      
      j.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			JTextField jt = (JTextField) e.getSource();
			j1.append(jt.getText());	
			//textarea�� textfield�� ���� ���ڿ��� �߰��Ѵ�
			
			jt.setText(" ");
			//textfield�� �������� �ʱ�ȭ�Ѵ�.
		}
	});
      

      setSize(300, 350);
      setVisible(true);
   }

   public static void main(String[] args) {
      new GuiEx19append();
   }
}
