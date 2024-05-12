package AWT_Application;
import java.awt.*;
import java.awt.event.*;

public class Form1 extends Frame implements ItemListener {
	static Form1 frm=new Form1();
	static List lst=new List(); // 表單物件 lst
	public static void main(String args[])
	{
		frm.setLayout(new FlowLayout(FlowLayout.CENTER,10,25));
		frm.setTitle("Select a color");
		frm.setSize(200,150);
		frm.setBackground(Color.yellow);
		lst.add("yellow");
		lst.add("orange");
		lst.add("pink");
		lst.add("cyan");
		lst.addItemListener(frm); // 設定 listener
		frm.add(lst);
		frm.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		frm.setVisible(true);
	}
	public void itemStateChanged(ItemEvent e){
		String color=lst.getSelectedItem(); // 取得被選取的選項名稱
		if(color=="yellow"){
			frm.setBackground(Color.yellow);
		}
		else if(color=="orange"){
			frm.setBackground(Color.orange);
		}
		else if(color=="pink"){
			frm.setBackground(Color.pink);
		}
		else if(color=="cyan"){
			frm.setBackground(Color.cyan);
		}
	}
}
