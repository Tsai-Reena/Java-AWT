package AWT_Basic;
import java.awt.*;

public class Button1 extends Frame{
	static Frame frm = new Frame("Button");
	static Button btn = new Button("Push me");

	public static void main(String args[])
	{
		frm.setLayout(null); // 使用 setBounds 之前，需要先取消 Java 預設的版面配置
		btn.setBounds(45,65,100,40); // 位置大小
		frm.setSize(200,150);
		frm.add(btn);
		frm.setVisible(true);
	}
}
