
public class Coordinates {
	private double lattitude; // latitude
	private double longitude; // longitude
	
	public Coordinates() {
		updateGPS();
	}
	
	private void updateGPS() {
		// TODO Auto-generated method stub
		// Poll the GPS
		
	}
	
	protected double getLong() {
		return longitude;
	}
	
	protected double getLat() {
		return lattitude;
	}
	
}
