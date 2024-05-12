package AWT_Basic;
import java.awt.*;

public class FlowLayout1
{
	static Frame frm=new Frame("Flow Layout");
	public static void main(String args[])
	{
		FlowLayout flow=new FlowLayout(FlowLayout.CENTER,5,10);
		frm.setLayout(flow);
		frm.setSize(200,150);
		TextField txf1=new TextField("This",8);
		TextField txf2=new TextField("is",6);
		TextField txf3=new TextField("Flow Layout",16);
		frm.add(txf1);
		frm.add(txf2);
		frm.add(txf3);
		frm.setVisible(true);
	}
}
