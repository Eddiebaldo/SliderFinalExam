package FinalSlider;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;



public class Demo {

	public static void main(String args[]){
		SliderDemo gui = new SliderDemo();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.setTitle("Sliders Demo");
		
		
		// make the frame half the height and width
		  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		  int height = screenSize.height;
		  int width = screenSize.width;
		  gui.setSize(width/2, height/2);
		  

		  // here's the part where I center the jframe on screen
		  gui.setLocationRelativeTo(null);
		//gui.setSize(350,220);
	}
}
