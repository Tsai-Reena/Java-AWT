package AWT_Basic;
import java.awt.*;

public class CheckBox2 {

	static Frame frm=new Frame("Checkbox class");
	static Checkbox ckb1=new Checkbox("Epson 5900L",true);
	static Checkbox ckb2=new Checkbox("HP LaserJet",true);
	static Checkbox ckb3=new Checkbox("Other printer");
	static Checkbox ckb4=new Checkbox("black & white printer");
	static Checkbox ckb5=new Checkbox("color printer");

	public static void main(String args[])
	{
		CheckboxGroup grp=new CheckboxGroup(); // 建立群組物件
		frm.setSize(200,150);
		frm.setLayout(null);
		frm.setBackground(Color.yellow);
		ckb1.setBounds(20,40,140,20);
		ckb2.setBounds(20,60,140,20);
		ckb3.setBounds(20,80,140,20);
		ckb4.setBounds(20,100,140,20);
		ckb5.setBounds(20,120,140,20);
		ckb4.setCheckboxGroup(grp);
		ckb5.setCheckboxGroup(grp);
		ckb4.setState(true);
		frm.add(ckb1);
		frm.add(ckb2);
		frm.add(ckb3);
		frm.add(ckb4);
		frm.add(ckb5);
		frm.setVisible(true);
	}

}
