
public class AdapterTemperatureSensor implements Isensor{
	TemperatureSensor temperature = new TemperatureSensor();

	@Override
	public double getValue() {
		return temperature.senseTemperature();
	}

	@Override
	public String getInfo() {
		return temperature.getTempReport();
	}
 
	@Override
	public String getName() {
		return temperature.getSensorType();
	}

}
