package AWT_Application;
import java.awt.*;
import java.awt.event.*;

public class Form2 extends Frame implements ItemListener
{
	static Form2 frm=new Form2();
	static Choice chc=new Choice(); // 下拉表單物件
	static BorderLayout border=new BorderLayout();
	public static void main(String args[])
	{
		frm.setLayout(border);
		frm.setSize(200,150);
		frm.setTitle("Select a color");
		frm.setSize(200,150);
		frm.setBackground(Color.yellow);
		// 加入下拉表單選項
		chc.add("yellow");
		chc.add("orange");
		chc.add("pink");
		chc.add("cyan");
		chc.addItemListener(frm);
		frm.add(chc,border.NORTH);
		frm.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		frm.setVisible(true);
	}
	public void itemStateChanged(ItemEvent e){
		String color=chc.getSelectedItem();
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
		frm.setTitle("you select "+color);
	}
}
