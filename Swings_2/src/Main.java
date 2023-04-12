import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main extends JFrame implements ActionListener {
	
	JFrame jf1 = new JFrame("Validation INFO Index");
	JPanel jp1 = new JPanel();
	JFrame jf2 = new JFrame("Billing Counter");
	JPanel jp2 = new JPanel();
	JLabel jl1 = new JLabel("Enter  name : ");
	JTextField jtf1 = new JTextField(20);
	JLabel jl2 = new JLabel("Enter  password : ");
	JTextField jtf2 = new JTextField(20);

	JLabel jl6 = new JLabel("Enter  the customer id  : ");
	JTextField jtf6 = new JTextField(20);
	JLabel jl7 = new JLabel("Enter  the mobile number : ");
	JTextField jtf7 = new JTextField(20);
	JLabel jl8 = new JLabel("Enter  the item name: ");
	JTextField jtf8 = new JTextField(20);
	JLabel jl9 = new JLabel("Enter  the item id : ");
	JTextField jtf9 = new JTextField(20);
	JLabel jl10 = new JLabel("Enter  quantity : ");
	JTextField jtf10 = new JTextField(20);
//	JLabel jl10 = new JLabel("Enter  quantity : ");
	JTextField jtf11 = new JTextField(20);

	JButton jb1 = new JButton("Validate");
	JButton jb2 = new JButton("Submit");
//	JLabel jl20 = new JLabel("Result : ");
//	JTextField jtf20 = new JTextField(20);
	
	Main(){
		jf1.setSize(500,500);
		jf1.add(jp1);
		jf2.setSize(500,500);
		jf2.add(jp2);
		jp1.add(jl1);
		jp1.add(jtf1);
		jp1.add(jl2);
		jp1.add(jtf2);
		
		jp2.add(jl6);
		jp2.add(jtf6);
		jp2.add(jl7);
		jp2.add(jtf7);
		jp2.add(jl8);
		jp2.add(jtf8);
		jp2.add(jl9);
		jp2.add(jtf9);
		jp2.add(jl10);
		jp2.add(jtf10);
	
		jp1.add(jb1);
		jp2.add(jb2);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jf1.setVisible(true);
		jf2.setVisible(false);
	}
	public static void main(String[] args) {
		Main obj1 = new Main();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jb1) {
			String name = jtf1.getText();
			String usn = jtf2.getText();
			
			if(name.equalsIgnoreCase("aditya") && usn.equalsIgnoreCase("adi")) {
				jf2.setVisible(true);
			}
		}
		if(e.getSource()==jb2) {
			jf2.setVisible(true);
			String val1 = jtf6.getText();
			String val2 = jtf7.getText();
			String val3 = jtf8.getText();
			String val4 = jtf9.getText();
			String val5 = jtf10.getText();
			String finalBill = "Customer id : " + val1 + " Mobile Number : " + val2 + " Item name : " + val3 + " Item id : " + val4 + " Quantity : " + val5; 
			JOptionPane.showMessageDialog(jtf11, "Thank you for you purchase" + finalBill);
			System.out.println("------Bill------");
			System.out.println("Customer id : " + val1);
			System.out.println("Mobile Number : " + val2);
			System.out.println("Item name : " + val3);
			System.out.println("Item id : " + val4);
			System.out.println("Quantity : " + val5);
			
		}
	}
	
	
	
}
