
import java.util.Random;

public class RadiationSensor {
    private double radiationLevel;

    public RadiationSensor() {
    }
    	
    public double getRadiationValue() {
        Random rD = new Random();
        int value = rD.nextInt(10); //5
        this.radiationLevel = value;
        return this.radiationLevel;
    }

    public String getStatusInfo() {
        if (this.radiationLevel > 4.0D) {
            return "DANGER";
        } else {
        	if((this.radiationLevel>3.0D)&&(this.radiationLevel<4.0D)) {
				return "CRITICAL";
			}
			else {
				return "OK";
			}
           
        }
    }

    public String getName() {
        return "Radiation Sensor";
    }
}

