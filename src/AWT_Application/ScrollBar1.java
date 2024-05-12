package AWT_Application;
import java.awt.*;
import java.awt.event.*;

public class ScrollBar1 extends Frame implements AdjustmentListener
{
	static ScrollBar1 frm=new ScrollBar1();
	static Scrollbar scr=new Scrollbar(); // 建立垂直卷軸
	static Label lab1=new Label("Silence is golden.",Label.CENTER);
	static Label lab2=new Label("size=20",Label.CENTER);
	static BorderLayout border=new BorderLayout(5,5);

	public void adjustmentValueChanged(AdjustmentEvent e){
		int size=scr.getValue(); // 取得 scr 數值
		lab1.setFont(new Font("Dialog",Font.PLAIN,24)); // 設定字型樣式
		lab2.setText("size="+size);
	}

	public static void main(String args[])
	{
		frm.setSize(300,150);
		frm.setLayout(border);
		frm.setTitle("Scrollbar Demo");
		scr.addAdjustmentListener(frm);
		scr.setValues(20,4,12,40); // 設定 scr 相關數值
		frm.add(scr,border.EAST);
		frm.add(lab1,border.CENTER);
		frm.add(lab2,border.SOUTH);
		lab1.setFont(new Font("Dialog",Font.PLAIN,24));
		lab2.setBackground(Color.orange);
		frm.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		frm.setVisible(true);
	}
}
