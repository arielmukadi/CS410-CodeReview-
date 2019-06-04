import java.util.Random;

public class TemperatureSensor {
	
	private double temperature;
	public TemperatureSensor() {}

	public double senseTemperature() {
		Random r = new Random();
		int value = r.nextInt(700); //400
		this.temperature = value;
		return this.temperature;
	}

	public String getTempReport() {

		if (this.temperature > 300.0D) {
			return "DANGER";			
		} 
		else {
			
			if((this.temperature>235.0D)&&(this.temperature<300)) {
				return "CRITICAL";
			}
			else {
				return "OK";
			}
		}
	}
	public String getSensorType() {
		return "Temperature Sensor";
	}
}

