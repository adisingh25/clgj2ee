import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SampleWindow extends JFrame implements ActionListener{

	JFrame jf = new JFrame("Sample Window");
	JPanel jp = new JPanel();
	JLabel jl1 = new JLabel("Enter a number : ");
	JTextField jtf1 = new JTextField(20);
	JTextField jtf2 = new JTextField(20);
	JButton jb1 = new JButton("Click me");
	SampleWindow() {
		jf.setSize(500,500);
		jf.add(jp);
		jp.add(jl1);
		jp.add(jtf1);
		jp.add(jtf2);
		jp.add(jb1);
		jb1.addActionListener(this);
		jf.setVisible(true);
	}
	public static void main(String [] args){
		SampleWindow s1 = new SampleWindow();
		
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==jb1) {
			String s = jtf1.getText();
			System.out.println(s);
			jtf2.setText(s);
		}
	}
	
}
