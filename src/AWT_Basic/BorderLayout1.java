package AWT_Basic;
import java.awt.*;

public class BorderLayout1
{
	static Frame frm=new Frame("Border Layout");
	public static void main(String args[])
	{
		BorderLayout border=new BorderLayout(2,5);
		frm.setSize(200,150);
		frm.setLayout(border);
		Button btn1=new Button("East");
		Button btn2=new Button("West");
		Button btn3=new Button("South");
		Button btn4=new Button("North");
		Button btn5=new Button("Center");
		frm.add(btn1,border.EAST);
		frm.add(btn2,border.WEST);
		frm.add(btn3,border.SOUTH);
		frm.add(btn4,border.NORTH);
		frm.add(btn5,border.CENTER);
		frm.setVisible(true);
	}
}