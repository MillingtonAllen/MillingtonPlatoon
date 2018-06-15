
/**
 * Block based on
 * medium.com/programmers-blockchain/create-simple-blockchain-java-tutorial-from-scratch-6eed3cb03fa
 */

import java.util.Date;

public class Block {
	
	// TODO change back to private after testing
	private String hash; // holds digital signature
	private String previousHash;
	private double speedData; // holds data
	
	private long timestamp;
	
	// Block constructor
	public Block(double speedData, String previousHash) {
		this.speedData = speedData;
		this.previousHash = previousHash;
		this.timestamp = new Date().getTime();
		
		this.hash = calculateHash(); // Last step
	}
	
	public String calculateHash() {
		String calculatedhash = StringUtil.applySha256(
				previousHash + Long.toString(timestamp) + speedData);
		return calculatedhash;
	}
	
	public String getPreviousHash() {
		return previousHash;
	}
	
	public String getHash() {
		return hash;
	}
		
}
