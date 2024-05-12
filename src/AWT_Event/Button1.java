package AWT_Event;
import java.awt.*;
import java.awt.event.*;

public class Button1 extends Frame implements ActionListener {
	static Button1 frm=new Button1();
	static Button btn=new Button("Click Me");

	public static void main(String args[])
	{
		btn.addActionListener(frm); // 把 frm 向 btn 註冊
		frm.setLayout(new FlowLayout());
		frm.setBackground(Color.green);
		frm.setTitle("Action Event");
		frm.setSize(200,150);
		frm.add(btn);
		frm.setVisible(true);
	}

	public void actionPerformed(ActionEvent e){ // 事件發生的處理動作
		frm.setBackground(Color.yellow);
	}
}
