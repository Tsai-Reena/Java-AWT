package AWT_Event;
import java.awt.*;
import java.awt.event.*;

public class MouseEvent2 extends Frame implements MouseMotionListener {
	static MouseEvent2 frm=new MouseEvent2();
	static Label labx=new Label();
	static Label laby=new Label();
	static Label lab=new Label();

	public static void main(String args[])
	{
		frm.setSize(200,150);
		frm.setTitle("Mouse Event");
		frm.setLayout(null);
		frm.addMouseMotionListener(frm); // 設定 Listener
		labx.setBounds(40,40,40,20);
		laby.setBounds(100,40,40,20);
		lab.setBounds(40,80,100,40);
		frm.add(labx);
		frm.add(laby);
		frm.add(lab);
		frm.setVisible(true);
	}

	public void mouseMoved(MouseEvent e){ // 當滑鼠移動時
		labx.setText("x="+e.getX()); // 顯示 X 座標
		laby.setText("y="+e.getY()); // 顯示 Y 座標
		lab.setText("Mouse Moved!!");
	}
	public void mouseDragged(MouseEvent e){ // 當滑鼠拖曳時
		labx.setText("x="+e.getX()); // 顯示 X 座標
		laby.setText("y="+e.getY()); // 顯示 Y 座標
		lab.setText("Mouse Dragged!!");
	}
}
