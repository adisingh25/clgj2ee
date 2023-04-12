import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class operations extends JFrame implements ActionListener{
	
	JFrame jf = new JFrame("OPERATIONS");
	JPanel jp = new JPanel();
	JLabel jl1 = new JLabel("Enter a number : ");
	JTextField jtf1 = new JTextField(20);
	JLabel jl2 = new JLabel("Enter a number : ");
	JTextField jtf2 = new JTextField(20);
	JButton jb1 = new JButton("+");
	JButton jb2 = new JButton("-");
	JButton jb3 = new JButton("*");
	JButton jb4 = new JButton("/");
	JLabel jl3 = new JLabel("Result : ");
	JTextField jtf3 = new JTextField(20);
	operations() {
		jf.setSize(500,500);
		jf.add(jp);
		jp.add(jl1);
		jp.add(jtf1);
		jp.add(jl2);
		jp.add(jtf2);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jl3);
		jp.add(jtf3);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jf.setVisible(true);
	}
	public static void main(String [] args){
		operations o1 = new operations();
		
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==jb1) {
			int val1 = Integer.parseInt(jtf1.getText());
			int val2 = Integer.parseInt(jtf2.getText());
			Integer res = val1+val2;
			System.out.println(res.toString());
			jtf3.setText(res.toString());
		}
		else if(ae.getSource()==jb2) {
			int val1 = Integer.parseInt(jtf1.getText());
			int val2 = Integer.parseInt(jtf2.getText());
			Integer res = val1-val2;
			System.out.println(res.toString());
			jtf3.setText(res.toString());
		}
		else if(ae.getSource()==jb3) {
			int val1 = Integer.parseInt(jtf1.getText());
			int val2 = Integer.parseInt(jtf2.getText());
			Integer res = val1*+val2;
			System.out.println(res.toString());
			jtf3.setText(res.toString());
		}
		else if(ae.getSource()==jb4) {
			int val1 = Integer.parseInt(jtf1.getText());
			int val2 = Integer.parseInt(jtf2.getText());
			Integer res = val1/val2;
			System.out.println(res.toString());
			jtf3.setText(res.toString());
		}
	}

	

}
