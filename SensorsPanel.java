import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class SensorsPanel extends JPanel{
		
		String status;
		double x ; 
		
		public SensorsPanel(String status , double x) {
			this.status = status;
			this.x = x ;
		}
		
		public void paint(Graphics g) {
			super.paint(g);
			
			if(status.equals("OK")) {
				g.setColor(Color.GREEN);
			}
			else if(status.equals("CRITICAL")) {
				g.setColor(Color.YELLOW);
			}
			else {
				g.setColor(Color.RED);
			}
			
			g.fillRect(10, 50,(int) x, 110);
		}
		
	}
