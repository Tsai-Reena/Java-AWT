package AWT_Basic;
import java.awt.*;

public class CheckBox1 {

	static Frame frm=new Frame("Checkbox class");
	static Checkbox ckb1=new Checkbox("Epson 5900L",true);
	static Checkbox ckb2=new Checkbox("HP LaserJet",true);
	static Checkbox ckb3=new Checkbox("Other printer");

	public static void main(String args[])
	{
		frm.setSize(200,150);
		frm.setLayout(null);
		frm.setBackground(Color.yellow);
		ckb1.setBounds(20,40,140,20);
		ckb2.setBounds(20,60,140,20);
		ckb3.setBounds(20,80,140,20);
		frm.add(ckb1);
		frm.add(ckb2);
		frm.add(ckb3);
		frm.setVisible(true);
	}

}
