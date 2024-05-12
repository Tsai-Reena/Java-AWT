package AWT_Event;
import java.awt.*;
import java.awt.event.*;

public class MouseEvent1 extends Frame implements MouseListener {
	static MouseEvent1 frm=new MouseEvent1();
	static Button btn=new Button("Click Me!!");
	static TextArea txa=new TextArea("",2,5,TextArea.SCROLLBARS_NONE);
	static BorderLayout border=new BorderLayout(2,5);

	public void mouseEntered(MouseEvent e){ // 滑鼠指標進入 btn 上方
		txa.setText("Mouse entered\n");
	}
	public void mouseClicked(MouseEvent e){ // 按下並放開滑鼠按鈕
		txa.setText("Mouse clicked\n");
	}
	public void mouseExited(MouseEvent e){ // 滑鼠指標離開 btn 上方
		txa.setText("Mouse exited\n");
	}
	public void mousePressed(MouseEvent e){ // 按下滑鼠按鈕
		txa.setText("Mouse pressed\n");
	}
	public void mouseReleased(MouseEvent e){ // 放開滑鼠按鈕
		txa.setText("Mouse released\n");
	}

	public static void main(String args[])
	{
		frm.setSize(200,150);
		frm.setTitle("Mouse Event");
		frm.setLayout(border);
		btn.addMouseListener(frm); // 設定listener
		txa.setEditable(false);
		frm.add(btn,border.WEST);
		frm.add(txa,border.CENTER);
		frm.setVisible(true);
	}
}
