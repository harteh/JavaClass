package gui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuiEx18  extends JFrame {
	GuiEx18 (){
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      
      //추가와 동시에 생성
      c.add(new JLabel("이름   "));
      c.add(new JTextField(20));	//열의 개수
      
      c.add(new JLabel("주소   "));
      c.add(new JTextField(20));
      
      c.add(new JLabel("메모   "));
      c.add(new JTextArea(10, 20));
      
      

      setSize(300, 350);
      setVisible(true);
   }

   public static void main(String[] args) {
      new GuiEx18();
   }
}
