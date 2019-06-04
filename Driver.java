
public class Driver {

	public static void main(String[] args) {
		SensorApplicationDesign app = new SensorApplicationDesign();
		TemperatureSensor temperature = new TemperatureSensor();
		System.out.print(temperature.getTempReport());

	}
}
