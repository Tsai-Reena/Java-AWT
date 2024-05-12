package AWT_Event;
import java.awt.*;
import java.awt.event.*;

public class ActionEvent1 extends Frame implements ActionListener{
	static ActionEvent1 frm=new ActionEvent1();
	static Button btn1=new Button("Yellow");
	static Button btn2=new Button("Green");
	static Button btn3=new Button("Exit");

	public static void main(String args[])
	{
		// 註冊事件傾聽者
		btn1.addActionListener(frm);
		btn2.addActionListener(frm);
		btn3.addActionListener(frm);

		frm.setLayout(new FlowLayout(FlowLayout.CENTER));
		frm.setSize(200,150);
		frm.setTitle("Action Event");
		frm.setBackground(Color.blue);
		btn1.setBackground(Color.white);
		btn2.setBackground(Color.white);
		btn3.setBackground(Color.white);
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		Button btn=(Button)e.getSource(); // 取得事件來源的物件
		if(btn==btn1){ // 如果按下 btn1 按鈕
			frm.setBackground(Color.yellow);
		}
		else if(btn==btn2){
			frm.setBackground(Color.green);
		}
		else{
			System.exit(0);
		}
	}
}
