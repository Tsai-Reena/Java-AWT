package AWT_Application;
import java.awt.*;
import java.awt.event.*;

public class Menu1 extends Frame implements ActionListener
{
	static Menu1 frm=new Menu1();
	static Menu menu1=new Menu("Style");
	static Menu menu2=new Menu("Exit");
	static MenuItem mi1=new MenuItem("Plane");
	static MenuItem mi2=new MenuItem("Bold");
	static MenuItem mi3=new MenuItem("Italic");
	static MenuItem mi4=new MenuItem("Close window");
	static MenuBar mb=new MenuBar();
	static Label lab=new Label("Tates differ.",Label.CENTER);

	public void actionPerformed(ActionEvent e){ // 事件處理
		MenuItem mi=(MenuItem)e.getSource(); // 取得觸發的物件
		if(mi==mi1){
			lab.setFont(new Font("Dialog",Font.PLAIN,24));
		}
		else if(mi==mi2){
			lab.setFont(new Font("Dialog",Font.BOLD,24));
		}
		else if(mi==mi3){
			lab.setFont(new Font("Dialog",Font.ITALIC,24));
		}
		else if(mi==mi4){
			frm.dispose();
		}
	}

	public static void main(String args[])
	{
		frm.setTitle("Menu Demo");
		frm.setSize(200,150);
		mb.add(menu1);
		mb.add(menu2);
		menu1.add(mi1);
		menu1.add(mi2);
		menu1.add(mi3);
		menu2.add(mi4);
		// 設定事件傾聽者
		mi1.addActionListener(frm);
		mi2.addActionListener(frm);
		mi3.addActionListener(frm);
		mi4.addActionListener(frm);
		lab.setFont(new Font("Dialog",Font.PLAIN,24));
		frm.setMenuBar(mb);
		frm.add(lab);
		frm.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		frm.setVisible(true);
	}
}
