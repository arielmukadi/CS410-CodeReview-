
import java.util.Random;

public class PressureSensor {
    private double pressure;

    public PressureSensor() {
    }
 
    public double readValue() {
        Random rD = new Random();
        int value = rD.nextInt(10);
        this.pressure =value;
        return this.pressure;
    }

    public String getReport() {
    	
        if (this.pressure > 6.58D) {
            return "DANGER";
        } else {
        	if((this.pressure>5.0D)&&(this.pressure<6.58D)) {
				return "CRITICAL";
			}
			else {
				return "OK";
			}
        }
    }

    public String getSensorName() {
        return "Pressure Sensor";
    }
}

