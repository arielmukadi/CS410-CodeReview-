
public class AdapterRadiationSensor implements Isensor{
	
	RadiationSensor radiation = new RadiationSensor();

	@Override
	public double getValue() {	
		return radiation.getRadiationValue();
	}
	
	@Override
	public String getInfo() {
		return radiation.getStatusInfo();
	}
	
	@Override
	public String getName() {
		return radiation.getName();
	}

}
