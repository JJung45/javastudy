package ch7;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button b = new Button("start");
		b.addActionListener(new EventHandler());

	}

}

class EventHandler implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occured!!!!");
	}
}
