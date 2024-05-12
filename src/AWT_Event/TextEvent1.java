package AWT_Event;
import java.awt.*;
import java.awt.event.*;

public class TextEvent1 extends Frame implements TextListener{
	static TextEvent1 frm=new TextEvent1();
	static TextArea txa1=new TextArea("",6,10,TextArea.SCROLLBARS_NONE);
	static TextArea txa2=new TextArea("",6,10,TextArea.SCROLLBARS_NONE);

	// 當 txa1 物件裡面的文字改變時，執行下列程式碼
	public void textValueChanged(TextEvent e)
	{
		txa2.setText(txa1.getText());
	}

	public static void main(String args[])
	{
		frm.setSize(200,150);
		//frm.setSize(505,805);
		frm.setBackground(Color.black);
		frm.setTitle("Text Event");
		frm.setLayout(new FlowLayout(FlowLayout.CENTER));
		txa1.setBackground(Color.white);
		txa2.setBackground(Color.white);
		txa1.setEditable(true);
		txa2.setEditable(false);
		txa1.addTextListener(frm);
		frm.add(txa1);
		frm.add(txa2);
		frm.setVisible(true);
	}
}
