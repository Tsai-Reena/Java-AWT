package AWT_Application;
import java.awt.*;
import java.awt.event.*;

public class Dialog1 extends Frame implements ActionListener, ItemListener
{
	static Dialog1 frm=new Dialog1();
	static Button Change_btn=new Button("Change Color");
	
	// 按鈕
	static Button Ok_btn=new Button("Ok");
	static Button Cancel_btn=new Button("Cancel");
	
	// 核取方塊
	static Checkbox ckb1=new Checkbox("White");
	static Checkbox ckb2=new Checkbox("Yellow");
	static Dialog dig=new Dialog(frm);
	static Color clr;

	public void actionPerformed(ActionEvent e){
		Button btn=(Button)e.getSource(); // 取得被按下的按鈕
		if(btn==Change_btn){
			dig.setLocation(120,80);
			dig.setVisible(true); // 顯示對話方塊
		}
		else if(btn==Ok_btn){
			frm.setBackground(clr);
			dig.setVisible(false); // 隱藏對話方塊
		}
		else if(btn==Cancel_btn){
			dig.setVisible(false); // 隱藏對話方塊
		}
	}
	public void itemStateChanged(ItemEvent e){ // 選擇顏色
		if(ckb1.getState()){
			clr=Color.white;
		}
		else if(ckb2.getState()){
			clr=Color.yellow;
		}
	}

	public static void main(String args[])
	{
		frm.setSize(200,150);
		frm.setLayout(new FlowLayout(FlowLayout.CENTER,5,30));
		CheckboxGroup grp=new CheckboxGroup(); // 群組物件
		ckb1.setCheckboxGroup(grp);
		ckb2.setCheckboxGroup(grp);
		frm.setTitle("Frame");
		frm.setBackground(Color.pink);
		dig.setLayout(null);
		dig.setTitle("Dialog"); // 設定對話方塊標題
		dig.setSize(150,120); // 設定對話方塊大小
		ckb1.setBounds(20,50,60,20);
		ckb2.setBounds(20,70,60,20);
		Ok_btn.setBounds(85,45,50,20);
		Cancel_btn.setBounds(85,70,50,20);
		
		// 加入對話方塊
		dig.add(Ok_btn);
		dig.add(Cancel_btn);
		dig.add(ckb1);
		dig.add(ckb2);
		
		// 設定 listener
		Change_btn.addActionListener(frm);
		Cancel_btn.addActionListener(frm);
		Ok_btn.addActionListener(frm);
		ckb1.addItemListener(frm);
		ckb2.addItemListener(frm);
		frm.add(Change_btn);
		frm.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		frm.setVisible(true);
	}
}
