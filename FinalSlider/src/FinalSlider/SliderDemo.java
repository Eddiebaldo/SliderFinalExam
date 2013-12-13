package FinalSlider;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.*;



public class SliderDemo extends JFrame{

	
		
	//creates sliders, labels, and panels 
		JSlider redSlider;
		JSlider greenSlider;
		JSlider blueSlider;
		
		JLabel redLabel;
		JLabel greenLabel;
		JLabel blueLabel;
		
		JPanel colorPanel;
		JPanel slidersAndlabels;
		JPanel sliders;
		JPanel labels;
		
		public SliderDemo(){
			redSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
			greenSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
			blueSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
		
			redLabel = new JLabel("Red = 0");
			greenLabel = new JLabel("Green = 0");
			blueLabel = new JLabel("Blue = 0");
		
			//creates event
			Listener e = new Listener();
			
			//registers listener
			redSlider.addChangeListener(e);
			greenSlider.addChangeListener(e);
			blueSlider.addChangeListener(e);
		
			colorPanel = new JPanel();
			colorPanel.setBackground(Color.BLACK);
			
			//container holds all panels
			
			Container container = this.getContentPane();
			//CHECK WORK change gridlayout
			container.setLayout(new GridLayout(2,1,3,3));
			
			sliders = new JPanel();
			labels = new JPanel();
			slidersAndlabels = new JPanel();
			
			//adds to grid and makes the look
			container.add(colorPanel);
			container.add(slidersAndlabels);
			//container.add(sliders);
			//container.add(labels);
			slidersAndlabels.add(sliders);
			slidersAndlabels.add(labels);
			
			
			sliders.setBorder(new CompoundBorder(new TitledBorder("Choose Colors"), 
					new EmptyBorder(2,2,2,2)));
			sliders.setLayout(new GridLayout(3,1,2,2));
			sliders.add(redSlider);
			sliders.add(greenSlider);
			sliders.add(blueSlider);
			
			labels.setLayout(new GridLayout(3,1,2,2));
			labels.add(redLabel);
			labels.add(greenLabel);
			labels.add(blueLabel);
			
		}
		//new class for ChangeListener
		public class Listener implements ChangeListener{
			public void stateChanged(ChangeEvent e){
				int r = redSlider.getValue();
				int g = greenSlider.getValue();
				int b = blueSlider.getValue();
			
				redLabel.setText("Red = " + r);
				greenLabel.setText("Green = " + g);
				blueLabel.setText("Blue = " + b);
			
				
				colorPanel.setBackground(new Color(r,g,b));
				
			}
		}
}
