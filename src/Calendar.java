import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Calendar extends JPanel{
	JLabel details;
	JButton back;
	JPanel center;
	GridBagConstraints constraints;
	
	private static final Calendar singleton=new Calendar();
	public static Calendar getSingleton(){
		return singleton;
		
	}
	
	
			
	
	Calendar(){
		
		setLayout(new BorderLayout());
		center=new JPanel();
		center.setLayout(new GridBagLayout());
		constraints=new GridBagConstraints();
		center.add(details=new JLabel("The Calendar!"),constraints);
		add(center,BorderLayout.CENTER);
		
		back=new JButton("Back to mainpage");
		add(back,BorderLayout.NORTH);
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				MainFrame.getSingleton().lay.show(MainFrame.getSingleton().mainPanel,"mainPage");
			}
		});
	}

}
