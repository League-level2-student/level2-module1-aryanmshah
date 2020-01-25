package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	ArrayList<String> names = new ArrayList<String>();
	
	
	
public static void main(String[] args) {
	GuestBook book=new GuestBook();
	book.setup();
}
JButton button=new JButton();
JButton button1=new JButton();
void setup(){
	
	JFrame frame=new JFrame();
	frame.setVisible(true);
			JPanel panel=new JPanel();
	frame.add(panel);
	
	panel.add(button);
	panel.add(button1);
	button.setText("add name");
	button1.setText("view names");
	button.addActionListener(this);
	button1.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button) {
		
		
	String b=JOptionPane.showInputDialog("add name");
	names.add(b);
	
	
	}
	
	String c="";
	if (e.getSource()==button1) {
		for (int i = 0; i < names.size(); i++) {
			
			c=c+names.get(i) +" ";
		
		}
		JOptionPane.showConfirmDialog(null, c);
	}
	}















}