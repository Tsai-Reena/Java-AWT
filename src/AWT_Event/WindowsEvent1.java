package AWT_Event;
import java.awt.*;
import java.awt.event.*;

public class WindowsEvent1 extends Frame {
	static WindowsEvent1 frm=new WindowsEvent1();

	public static void main(String args[])
	{
		frm.setSize(200,150);
		frm.setTitle("Window Event");
		frm.addWindowListener(new WinLis());
		frm.setVisible(true);
	}

	public static class WinLis extends WindowAdapter
	{
		public void windowClosing(WindowEvent e){ // 按下視窗關閉按鈕
			System.out.println("windowClosing() called");
			System.out.println("Closing window...");
			frm.dispose();
			System.out.println("window closed...");
		}
		public void windowClosed(WindowEvent e){ // 關閉視窗
			System.out.println("windowClosed() called");
		}
		public void windowDeactivated(WindowEvent e){ // 變成非作用中視窗
			System.out.println("windowDeactivated() called");
		}
		public void windowActivated(WindowEvent e){ // 變成作用中視窗
			System.out.println("windowActivated() called");
		}
		public void windowDeiconified(WindowEvent e){ // 視窗還原
			System.out.println("windowDeiconified() called");
		}
		public void windowIconified(WindowEvent e){ // 視窗最小化
			System.out.println("windowIconified() called");
		}
		public void windowOpened(WindowEvent e){ // 開啟視窗
			System.out.println("windowOpened() called");
		}
	}
}
