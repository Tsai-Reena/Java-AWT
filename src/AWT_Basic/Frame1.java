package AWT_Basic;
import java.awt.*;
import java.awt.event.*;

public class Frame1 {
	static Frame frm = new Frame("Hello World!");
	static Label lab = new Label("Label");

	public static void main(String[] args) {
		frm.setSize(220, 150); // 視窗的長寬
		frm.setBackground(Color.yellow);
		frm.setLocation(250, 250); // 視窗的位置
		frm.add(lab);
		frm.setVisible(true); // 把視窗顯示出來
		
		// 關閉視窗功能 (Action Event)
		frm.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
