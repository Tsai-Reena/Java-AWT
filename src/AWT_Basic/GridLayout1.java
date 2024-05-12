package AWT_Basic;
import java.awt.*;

public class GridLayout1
{
	static Frame frm=new Frame("Grid Layout");
	public static void main(String args[])
	{
		GridLayout grid=new GridLayout(3,5);
		frm.setLayout(grid);
		frm.setSize(200,150);
		for(int i=1;i<=15;i++){
			frm.add(new Button(Integer.toString(i)));
		}
		frm.setVisible(true);
	}
}