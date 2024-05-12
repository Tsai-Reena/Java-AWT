package AWT_Event;
import java.awt.*;
import java.awt.event.*;

public class KeyEvent1 extends Frame implements KeyListener {
	static KeyEvent1 frm=new KeyEvent1();
	static TextField txf=new TextField(18);
	static TextArea txa=new TextArea("",4,19,TextArea.SCROLLBARS_NONE);

	public void keyPressed(KeyEvent e){ // 當按鍵按下時
		txa.setText("");
		txa.append("keyPressed called\n");
	}
	public void keyReleased(KeyEvent e){ // 當按鍵放開時
		txa.append("keyReleased called\n");
	}
	public void keyTyped(KeyEvent e){ // 鍵入文字時
		txa.append("keyTyped called\n");
	}

	public static void main(String args[])
	{
		frm.setSize(200,150);
		frm.setBackground(Color.pink);
		frm.setTitle("Key Event");
		txf.addKeyListener(frm);
		frm.setLayout(new FlowLayout(FlowLayout.CENTER));
		txa.setEditable(false); // 不可編輯
		frm.add(txf);
		frm.add(txa);
		frm.setVisible(true);
	}
}
