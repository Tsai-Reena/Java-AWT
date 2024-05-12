package AWT_Basic;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame2 extends Frame {
	Label lab = new Label("Hello World!");
	
	public Frame2 (String str) {
		super(str); // 呼叫父類別 Frame 的建構元
		add(lab);
	}

	public static void main(String[] args) {
		Frame2 frm = new Frame2("Hello World");
		frm.setSize(220, 150);
		frm.setBackground(Color.cyan);
		frm.setLocation(250, 250);
		frm.setVisible(true);
		
		// 關閉視窗功能 (Action Event)
		frm.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

}