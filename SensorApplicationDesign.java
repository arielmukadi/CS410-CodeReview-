
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class SensorApplicationDesign extends JFrame {
	
	public SensorApplicationDesign() {
		setTitle("Sensor Tracker");
		setLayout(new GridLayout(3,1));

		//This block of code could be in its own method
		Isensor rs_adapter = new AdapterRadiationSensor();
		double radiationValue = rs_adapter.getValue();
		String format = rs_adapter.getName()+"("+rs_adapter.getInfo()+")"+"-->"+radiationValue;
	    JLabel radiationLabel = new JLabel(format);
	    SensorsPanel radiationPnl = new SensorsPanel(rs_adapter.getInfo(),rs_adapter.getValue());
	    radiationPnl.add(radiationLabel);
		
		//This block of code could be in its own method
	    Isensor ts_adapter = new AdapterTemperatureSensor();  
	    double tempValue = ts_adapter.getValue();
		format = ts_adapter.getName()+"("+ts_adapter.getInfo()+")"+"-->"+tempValue;
		JLabel tempLabel = new JLabel(format);
		SensorsPanel temperaturePnl = new SensorsPanel(ts_adapter.getInfo(),ts_adapter.getValue());
		temperaturePnl.add(tempLabel);
		
		//This block of code could be in its own method
		Isensor ps_adapter = new AdapterPressureSensor();
		double PressureValue = ps_adapter.getValue();
	    format = ps_adapter.getName()+"("+ps_adapter.getInfo()+")"+"-->"+PressureValue;
		JLabel pressureLabel = new JLabel(format);
		SensorsPanel pressurePnl = new SensorsPanel(ps_adapter.getInfo(),ps_adapter.getValue());
	    pressurePnl.add(pressureLabel);
		
		
		radiationPnl.setBorder(new TitledBorder("RADIATION"));
		add(radiationPnl);
		
		temperaturePnl.setBorder(new TitledBorder("TEMPERATURE"));
		add(temperaturePnl);
		
		pressurePnl.setBorder(new TitledBorder("PRESSURE"));
		add(pressurePnl);
		
		setPreferredSize(new Dimension(610,610));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}

}
