package AWT_Basic;
import java.awt.*;

public class CardLayout1
{
	static Frame frm=new Frame("Card Layout");
	public static void main(String args[])
	{
		CardLayout card=new CardLayout(5,10);
		frm.setLayout(card);
		frm.setSize(200,150);
		Button btn1=new Button("Button 1");
		Button btn2=new Button("Button 2");
		Button btn3=new Button("Button 3");
		frm.add(btn1,"a");
		frm.add(btn2,"b");
		frm.add(btn3,"c");
		card.show(frm,"b");
		frm.setVisible(true);
	}
}
