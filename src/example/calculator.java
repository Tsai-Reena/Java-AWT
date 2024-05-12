package example;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.text.*;
public class calculator extends Frame implements ActionListener
{
	static calculator frm = new calculator();
	static Button btn2 = new Button("CE");
	static Button btn4 = new Button("Delete");
	static Button btn5 = new Button("1/x");
	static Button btn6 = new Button("SQR");
	static Button btn7 = new Button("SQRT");
	static Button btn8 = new Button("/");
	static Button btn9 = new Button("7");
	static Button btn10 = new Button("8");
	static Button btn11 = new Button("9");
	static Button btn12 = new Button("*");
	static Button btn13 = new Button("4");
	static Button btn14 = new Button("5");
	static Button btn15 = new Button("6");
	static Button btn16 = new Button("-");
	static Button btn17 = new Button("1");
	static Button btn18 = new Button("2");
	static Button btn19 = new Button("3");
	static Button btn20 = new Button("+");
	static Button btn21 = new Button("+/-");
	static Button btn22 = new Button("0");
	static Button btn23 = new Button(".");
	static Button btn24 = new Button("=");
	static Font fnt = new Font("Serief", Font.PLAIN, 33);
	static Label txf = new Label("", Label.RIGHT);
	static Label lab = new Label("", Label.RIGHT);
	StringBuffer str = new StringBuffer("");
	DecimalFormat df = new DecimalFormat(".######");
	StringBuffer re = new StringBuffer("");
	public static int operater = 0;

	public static void main(String args[])
	{
		frm.setTitle("Calculater");
		frm.setLayout(null);
		frm.setSize(549,840);
		frm.setBackground(Color.cyan.darker());

		btn2.setBounds(20,290,380,80);
		btn2.setFont(fnt);
		btn2.setBackground(Color.gray);
		btn2.setForeground(Color.white);
		btn4.setBounds(410,290,120,80);
		btn4.setFont(fnt);
		btn4.setBackground(Color.gray);
		btn4.setForeground(Color.white);

		btn5.setBounds(20,380,120,80);
		btn5.setFont(fnt);
		btn5.setBackground(Color.gray);
		btn5.setForeground(Color.white);
		btn6.setBounds(150,380,120,80);
		btn6.setFont(fnt);
		btn6.setBackground(Color.gray);
		btn6.setForeground(Color.white);
		btn7.setBounds(280,380,120,80);
		btn7.setFont(fnt);
		btn7.setBackground(Color.gray);
		btn7.setForeground(Color.white);
		btn8.setBounds(410,380,120,80);
		btn8.setFont(fnt);
		btn8.setBackground(Color.gray);
		btn8.setForeground(Color.white);

		btn9.setBounds(20,470,120,80);
		btn9.setFont(fnt);
		btn9.setBackground(Color.gray);
		btn9.setForeground(Color.white);
		btn10.setBounds(150,470,120,80);
		btn10.setFont(fnt);
		btn10.setBackground(Color.gray);
		btn10.setForeground(Color.white);
		btn11.setBounds(280,470,120,80);
		btn11.setFont(fnt);
		btn11.setBackground(Color.gray);
		btn11.setForeground(Color.white);
		btn12.setBounds(410,470,120,80);
		btn12.setFont(fnt);
		btn12.setBackground(Color.gray);
		btn12.setForeground(Color.white);

		btn13.setBounds(20,560,120,80);
		btn13.setFont(fnt);
		btn13.setBackground(Color.gray);
		btn13.setForeground(Color.white);
		btn14.setBounds(150,560,120,80);
		btn14.setFont(fnt);
		btn14.setBackground(Color.gray);
		btn14.setForeground(Color.white);
		btn15.setBounds(280,560,120,80);
		btn15.setFont(fnt);
		btn15.setBackground(Color.gray);
		btn15.setForeground(Color.white);
		btn16.setBounds(410,560,120,80);
		btn16.setFont(fnt);
		btn16.setBackground(Color.gray);
		btn16.setForeground(Color.white);

		btn17.setBounds(20,650,120,80);
		btn17.setFont(fnt);
		btn17.setBackground(Color.gray);
		btn17.setForeground(Color.white);
		btn18.setBounds(150,650,120,80);
		btn18.setFont(fnt);
		btn18.setBackground(Color.gray);
		btn18.setForeground(Color.white);
		btn19.setBounds(280,650,120,80);
		btn19.setFont(fnt);
		btn19.setBackground(Color.gray);
		btn19.setForeground(Color.white);
		btn20.setBounds(410,650,120,80);
		btn20.setFont(fnt);
		btn20.setBackground(Color.gray);
		btn20.setForeground(Color.white);

		btn21.setBounds(20,740,120,80);
		btn21.setFont(fnt);
		btn21.setBackground(Color.gray);
		btn21.setForeground(Color.white);
		btn22.setBounds(150,740,120,80);
		btn22.setFont(fnt);
		btn22.setBackground(Color.gray);
		btn22.setForeground(Color.white);
		btn23.setBounds(280,740,120,80);
		btn23.setFont(fnt);
		btn23.setBackground(Color.gray);
		btn23.setForeground(Color.white);
		btn24.setBounds(410,740,120,80);
		btn24.setFont(fnt);
		btn24.setBackground(new Color(135,206,235));
		btn24.setForeground(Color.black);

		txf.setBounds(20,55,510,45);
		txf.setFont(new Font("Serief",Font.PLAIN,25));
		txf.setBackground(Color.white);
		txf.setForeground(Color.black);
		lab.setBounds(20,105,510,170);
		lab.setFont(fnt);
		lab.setBackground(Color.white);
		lab.setForeground(Color.black);

		btn2.addActionListener(frm);
		btn4.addActionListener(frm);
		btn5.addActionListener(frm);
		btn6.addActionListener(frm);
		btn7.addActionListener(frm);
		btn8.addActionListener(frm);
		btn9.addActionListener(frm);
		btn10.addActionListener(frm);
		btn11.addActionListener(frm);
		btn12.addActionListener(frm);
		btn13.addActionListener(frm);
		btn14.addActionListener(frm);
		btn15.addActionListener(frm);
		btn16.addActionListener(frm);
		btn17.addActionListener(frm);
		btn18.addActionListener(frm);
		btn19.addActionListener(frm);
		btn20.addActionListener(frm);
		btn21.addActionListener(frm);
		btn22.addActionListener(frm);
		btn23.addActionListener(frm);
		btn24.addActionListener(frm);

		frm.add(btn2);
		frm.add(btn4);
		frm.add(btn5);
		frm.add(btn6);
		frm.add(btn7);
		frm.add(btn8);
		frm.add(btn9);
		frm.add(btn10);
		frm.add(btn11);
		frm.add(btn12);
		frm.add(btn13);
		frm.add(btn14);
		frm.add(btn15);
		frm.add(btn16);
		frm.add(btn17);
		frm.add(btn18);
		frm.add(btn19);
		frm.add(btn20);
		frm.add(btn21);
		frm.add(btn22);
		frm.add(btn23);
		frm.add(btn24);
		frm.add(txf);
		frm.add(lab);
		frm.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {System.exit(0);}
		});
		frm.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		Button btn = (Button)e.getSource();
		StringBuffer sr = new StringBuffer(txf.getText());
		String s = sr.toString();
		for(int i = s.length() - 1; i >= 0; i--){
			if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') operater++;
		}
		if(btn != btn2){
			if(btn == btn4){
				str.deleteCharAt(str.length() - 1);
				re.deleteCharAt(re.length() - 1);
				lab.setText(re.toString());
				txf.setText(str.toString());
			}
			else if(btn == btn5){
				str.delete(0, str.length());
				str.append("1/(");
				str.append(lab.getText());
				str.append(")");
				str.append("=");
				float ans=Float.parseFloat(lab.getText());
				ans = 1 / ans;
				txf.setText(str.toString());
				lab.setText(Float.toString(ans));
			}
			else if(btn == btn6){
				str.delete(0,str.length());
				str.append("sqr(");
				str.append(lab.getText());
				str.append(")");
				float ans=Float.parseFloat(lab.getText());
				ans = ans * ans;
				txf.setText(str.toString());
				lab.setText(Float.toString(ans));
			}
			else if(btn == btn7){
				str.delete(0, str.length());
				str.append("sqrt(");
				str.append(lab.getText());
				str.append(")");
				float ans=Float.parseFloat(lab.getText());
				ans = (float)(Math.sqrt(ans));
				txf.setText(str.toString());
				lab.setText(Float.toString(ans));
			}
			else if(btn == btn8){
				re.delete(0, re.length());
				str.append("/");
				txf.setText(str.toString());
				if(operater == 2){
					operater = 0;
					calculate(txf.getText());
				}
			}
			else if(btn == btn9){
				re.append("7");
				str.append("7");
				txf.setText(str.toString());
				lab.setText(re.toString());
			}
			else if(btn == btn10){
				re.append("8");
				str.append("8");
				txf.setText(str.toString());
				lab.setText(re.toString());
			}
			else if(btn == btn11){
				str.append("9");
				re.append("9");
				lab.setText(re.toString());
				txf.setText(str.toString());
			}
			else if(btn == btn12){
				re.delete(0,re.length());
				str.append("*");
				txf.setText(str.toString());
				if(operater == 2){
					operater = 0;
					calculate(txf.getText());
				}
			}
			else if(btn == btn13){
				str.append("4");
				re.append("4");
				lab.setText(re.toString());
				txf.setText(str.toString());
			}
			else if(btn == btn14){
				str.append("5");
				re.append("5");
				lab.setText(re.toString());
				txf.setText(str.toString());
			}
			else if(btn == btn15){
				str.append("6");
				re.append("6");
				lab.setText(re.toString());
				txf.setText(str.toString());
			}
			else if(btn == btn16){
				re.delete(0, re.length());
				str.append("-");
				txf.setText(str.toString());
				if(operater == 2){
					operater = 0;
					calculate(txf.getText());
				}
			}
			else if(btn == btn17){
				str.append("1");
				re.append("1");
				lab.setText(re.toString());
				txf.setText(str.toString());
			}
			else if(btn == btn18){
				str.append("2");
				re.append("2");
				lab.setText(re.toString());
				txf.setText(str.toString());
			}
			else if(btn == btn19){
				str.append("3");
				re.append("3");
				lab.setText(re.toString());
				txf.setText(str.toString());
			}
			else if(btn == btn20){
				re.delete(0, re.length());
				str.append("+");
				txf.setText(str.toString());
				System.out.println(operater);
				if(operater == 2){
					operater = 0;
					calculate(txf.getText());
				}
			}
			else if(btn == btn21){
				String n = re.toString();
				lab.setText(Float.toString(Float.parseFloat(n) * (-1)));
			}
			else if(btn == btn22){
				str.append("0");
				txf.setText(str.toString());
			}
			else if(btn == btn23){
				str.append(".");
				re.append(".");
				lab.setText(re.toString());
				txf.setText(str.toString());
			}
			else if(btn == btn24){
				if(s.charAt(s.length() - 1) != '='){
					str.append("=");
					txf.setText(str.toString());
					operater = 0;
					calculate(txf.getText());
				}
				else{
					StringBuffer sb = new StringBuffer("");
					char ch = 'a';
					for(int i = s.length()-2; i >= 0; i--){
						if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/'){
							ch = s.charAt(i);
							break;
						}
						else sb.append(s.charAt(i));
					}
					sb.reverse();
					float ans = Float.parseFloat(lab.getText());
					if(ch == '+') ans = ans + Float.parseFloat(sb.toString());
					else if(ch == '-') ans = ans - Float.parseFloat(sb.toString());
					else if(ch == '*') ans = ans * Float.parseFloat(sb.toString());
					else if(ch == '/') ans = ans / Float.parseFloat(sb.toString());
					lab.setText(Double.toString(ans));
				}
			}
		}
		else{
			str.delete(0, str.length());
			re.delete(0, re.length());
			txf.setText(str.toString());
			lab.setText("0");
		}
	}

	public void calculate(String string){
		StringBuffer str = new StringBuffer(string);
		Stack box_operater = new Stack();
		Stack box_operand = new Stack();

		str.deleteCharAt(str.length() - 1);
		String s = str.toString();
		float ans = 0;
		int time = 0;

		for(int i = s.length()-1; i >= 0; i--){
			StringBuffer sb=new StringBuffer("");
			int count=0;
			int point_after=0;
			while((s.charAt(i) != '+') && (s.charAt(i) != '-') && (s.charAt(i) != '*') && (s.charAt(i) != '/') && (s.charAt(i) != '(') && (s.charAt(i) != ')'))
			{
				if(s.charAt(i) == '.') point_after=count;
				else{
					sb.append(Character.toString(s.charAt(i)));
					count++;
				}
				if(i == 0) break;
				i--;
			}
			sb.reverse();
			float num = Float.parseFloat(sb.toString());
			for(int j = 0; j < point_after; j++) num = (float)(num * 0.1);
			point_after = 0;
			count = 0;
			box_operand.push(num);
		}

		for(int i = s.length() - 1; i>=0; i--){
			if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') box_operater.push(s.charAt(i));
		}

		if((box_operater.empty()) == false || !(box_operand.empty()) == false){
			if(box_operater.peek().equals('+')){
				ans = (float)(box_operand.pop());
				ans = ans + (float)(box_operand.pop());
				box_operater.pop();
				box_operand.push(ans);
			}
			else if(box_operater.peek().equals('-')){
				ans = (float)(box_operand.pop());
				ans = ans - (float)(box_operand.pop());
				box_operater.pop();
				box_operand.push(ans);
			}
			else if(box_operater.peek().equals('*')){
				ans = (float)(box_operand.pop());
				ans = ans * (float)(box_operand.pop());
				box_operater.pop();
				box_operand.push(ans);
			}
			else if(box_operater.peek().equals('/')){
				ans = (float)(box_operand.pop());
				ans = ans / (float)(box_operand.pop());
				box_operater.pop();
				box_operand.push(ans);
			}
		}
		lab.setText(Float.toString((float)box_operand.pop()));
	}
}