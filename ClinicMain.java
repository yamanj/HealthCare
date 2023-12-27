package HealthCare;
import java.awt.*;
import javax.swing.*;

class ClinicMain {

public static void main(String[] args) {
	
	//search for patient if not found add new patient 
		
	 String[] items = {"One", "Two"};
     JComboBox<String> combo = new JComboBox<String>(items);
     JTextField field1 = new JTextField("1234.56");
     JTextField field2 = new JTextField("9876.54");
     JPanel panel = new JPanel();
     panel.add(combo);
    panel.add(new JLabel("Field 1:"));
    panel.add(field1);
    panel.add(new JLabel("Field 2:"));
    panel.add(field2);
   int result = JOptionPane.showConfirmDialog(null, panel, "Test",
        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    if (result == JOptionPane.OK_OPTION) {
        System.out.println(combo.getSelectedItem()
            + " " + field1.getText()
            + " " + field2.getText());
    } else {
        System.out.println("Cancelled");
    }
}
}
