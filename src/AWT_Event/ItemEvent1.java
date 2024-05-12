package AWT_Event;
import java.awt.*;
import java.awt.event.*;

public class ItemEvent1 extends Frame implements ItemListener {
	static ItemEvent1 frm=new ItemEvent1();
	static Label lab=new Label("Select a printer");
	static Checkbox box1=new Checkbox("Epson 5900L");
	static Checkbox box2=new Checkbox("HP LaserJet 4p");

	public static void main(String args[])
	{
		CheckboxGroup grp=new CheckboxGroup();
		box1.setCheckboxGroup(grp); // 設定單選
		box2.setCheckboxGroup(grp); // 設定單選
		box1.addItemListener(frm);
		box2.addItemListener(frm);

		frm.setTitle("Item Event");
		frm.setSize(200,150);
		frm.setBackground(Color.pink);
		frm.setLayout(new FlowLayout(FlowLayout.LEFT));
		frm.add(lab);
		frm.add(box1);
		frm.add(box2);
		frm.setVisible(true);
	}

	public void itemStateChanged(ItemEvent e)
	{
		if(box1.getState()==true){
			lab.setText("Epson 5900L");
		}
		else if(box2.getState()==true){
			lab.setText("HP LaserJet 4p");
		}
		else{
			lab.setText("Select a printer");
		}
	}
}
