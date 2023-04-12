import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main extends JFrame implements ActionListener {
	
	JFrame jf = new JFrame("Student INFO Index");
	JPanel jp = new JPanel();
	JLabel jl1 = new JLabel("Enter  name : ");
	JTextField jtf1 = new JTextField(20);
	JLabel jl2 = new JLabel("Enter  USN : ");
	JTextField jtf2 = new JTextField(20);
	JLabel jl3 = new JLabel("Enter  Address : ");
	JTextField jtf3 = new JTextField(20);
	JLabel jl5 = new JLabel("Enter  age : ");
	JTextField jtf5 = new JTextField(20);
	JLabel jl6 = new JLabel("Enter  sem 1 : ");
	JTextField jtf6 = new JTextField(20);
	JLabel jl7 = new JLabel("Enter  sem 2 : ");
	JTextField jtf7 = new JTextField(20);
	JLabel jl8 = new JLabel("Enter  sem 3 : ");
	JTextField jtf8 = new JTextField(20);
	JLabel jl9 = new JLabel("Enter  sem 4 : ");
	JTextField jtf9 = new JTextField(20);
	JLabel jl10 = new JLabel("Enter  sem 5 : ");
	JTextField jtf10 = new JTextField(20);
	JLabel jl11 = new JLabel("Enter  sem 6 : ");
	JTextField jtf11 = new JTextField(20);
	JLabel jl12 = new JLabel("Enter  sem 7 : ");
	JTextField jtf12 = new JTextField(20);
	JLabel jl13 = new JLabel("Enter  sem 8 : ");
	JTextField jtf13 = new JTextField(20);

	JButton jb1 = new JButton("compute");
	JLabel jl20 = new JLabel("Result : ");
	JTextField jtf20 = new JTextField(20);
	
	Main(){
		jf.setSize(500,500);
		jf.add(jp);
		jp.add(jl1);
		jp.add(jtf1);
		jp.add(jl2);
		jp.add(jtf2);
		jp.add(jl3);
		jp.add(jtf3);
		jp.add(jl5);
		jp.add(jtf5);
		jp.add(jl6);
		jp.add(jtf6);
		jp.add(jl7);
		jp.add(jtf7);
		jp.add(jl8);
		jp.add(jtf8);
		jp.add(jl9);
		jp.add(jtf9);
		jp.add(jl10);
		jp.add(jtf10);
		jp.add(jl11);
		jp.add(jtf11);
		jp.add(jl12);
		jp.add(jtf12);
		jp.add(jl13);
		jp.add(jtf13);
		jp.add(jb1);
		jp.add(jl20);
		jp.add(jtf20);
		jb1.addActionListener(this);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		Main obj1 = new Main();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = jtf1.getText();
		String usn = jtf2.getText();
		String address = jtf3.getText();
		String age = jtf5.getText();
		if(name.equals("") || usn.equals("") || address.equals("") || age.equals("") || jtf6.getText().equals("") || jtf7.getText().equals("") || jtf8.getText().equals("") || jtf9.getText().equals("") || jtf10.getText().equals("") || jtf11.getText().equals("") || jtf12.getText().equals("") || jtf13.getText().equals("")){
			jtf20.setText("Fields cannot be empty");
			return;
		}
		int a = 0;
		try{
			a = Integer.parseInt(age);
		}catch(NumberFormatException e1){
			System.out.println(e1);
			jtf20.setText("invalid age");
			return;
			
		}
		double sem1 = Double.parseDouble(jtf6.getText());
		double sem2 = Double.parseDouble(jtf7.getText());
		double sem3 = Double.parseDouble(jtf8.getText());
		double sem4 = Double.parseDouble(jtf9.getText());
		double sem5 = Double.parseDouble(jtf10.getText());
		double sem6 = Double.parseDouble(jtf11.getText());
		double sem7 = Double.parseDouble(jtf12.getText());
		double sem8 = Double.parseDouble(jtf13.getText());
		
		if(checkMarks(sem1) || checkMarks(sem2) || checkMarks(sem3) || checkMarks(sem4) || checkMarks(sem5) || checkMarks(sem6) || checkMarks(sem7) || checkMarks(sem8)){
			jtf20.setText("cgpa must be between 0 to 10");
			return;
		}
		Double cgpa = (sem1 + sem2 + sem3 + sem4 + sem5 + sem6 + sem7 + sem8)/8;
		
		jtf20.setText(cgpa.toString());
		
	}
	
	private boolean checkMarks(double sem){
		if(sem > 10.0 || sem < 0.0){
			return true;
		}
		return false;
	}
		
	
	
}
