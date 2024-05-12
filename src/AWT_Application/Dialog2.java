package AWT_Application;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Dialog2 extends Frame implements ActionListener
{
	static Dialog2 frm=new Dialog2();
	static FileDialog fdlg=new FileDialog(frm,"Open");
	static Button btn=new Button("Open");
	static TextArea txa=new TextArea();
	static BorderLayout border=new BorderLayout();

	public void actionPerformed(ActionEvent e){ // 當 Open 按鈕按下時，執行下列程式碼
		fdlg.setVisible(true); // 顯示檔案對話方塊
		
		// 以下程式碼是按下檔案對話方塊內的 "開啟" 按鍵之後才會執行
		String fname=fdlg.getDirectory()+fdlg.getFile(); // 取得路徑名稱
		try{
			FileInputStream fi=new FileInputStream(fname);
			byte ba[]=new byte[fi.available()];
			fi.read(ba); // 讀檔到 byte 陣列中
			txa.setText(new String(ba)); // 將陣列內容寫到 txa 物件內
			fi.close();
		}
		catch(IOException ioe){
		};
	}

	public static void main(String args[])
	{
		frm.setTitle("Dialog Demo");
		frm.setLayout(border);
		frm.setSize(200,150);
		frm.add(txa,border.CENTER);
		frm.add(btn,border.SOUTH);
		btn.addActionListener(frm);
		frm.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		frm.setVisible(true);
	}
}