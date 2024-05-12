package AWT_Event;
import java.awt.*;
import java.awt.event.*;

public class Button2 {
	static Frame frm=new Frame();
	static Button btn=new Button("Click Me");

	public static void main(String args[])
	{
		frm.setBackground(Color.green);
		frm.setLayout(new FlowLayout());
		frm.setTitle("Action Event");
		btn.addActionListener(new ActLis());
		frm.setSize(200,150);
		frm.add(btn);
		frm.setVisible(true);
	}

	// 定義內部類別 ActLis，並實作 ActionListener 介面
	static class ActLis implements ActionListener
	{
		public void actionPerformed(ActionEvent e){
			frm.setBackground(Color.yellow);
		}
	}
}
