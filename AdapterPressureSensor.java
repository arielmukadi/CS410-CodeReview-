
public class AdapterPressureSensor implements Isensor  {
	
 PressureSensor pressure = new PressureSensor(); 
	
	@Override
	public double getValue() {
		return pressure.readValue();
	}

	@Override
	public String getInfo() {
		return pressure.getReport();
	}

	@Override
	public String getName() {
		return pressure.getSensorName();
	}

}
