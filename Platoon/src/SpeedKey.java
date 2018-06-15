import java.security.PublicKey;

public class SpeedKey {
	private double speed;
	private PublicKey PPK;
	private PublicKey CPK;
	
	public SpeedKey(double speed2, PublicKey platoonPublicKey,
			PublicKey carPublicKey) {
		this.speed = speed2;
		this.PPK = platoonPublicKey;
		this.CPK = carPublicKey;
	}
	
}
