import java.awt.geom.Point2D;
import java.security.PublicKey;

/** Platoon Software
 * 
 * Overseen by: Professor Henry Hexmoor
 * 
 * Programmed by: Allen Millington
 * 
 * Thesis Written By: Suray Alsamaraee & Maha Almaghshi
 * 
 * Thesis Available Online at
 * http://warse.org/IJISCS/static/pdf/file/ijiscs01722018.pdf
 * https://doi.org/10.30534/ijiscs/2018/01722018
 * 
 * To start off, my objective is to get a functional
 * simulation based on Java talking directly to a database.
 * 
 * Very Rough Outline: 1) Outline Code from Thesis 2)
 * Implement Database 3) Make server-compatible 4) Port to
 * Android Auto? 5) Threading the verification process?
 * 
 * From there, the priority is between Android Auto or
 * actually getting the database on a separate server.
 * 
 * I should really have committed this to GitHub by now so
 * it shows revisioning... Now my comments look out of
 * order.
 * 
 * Thinking about it, I should really port this to Android
 * Auto next.
 * 
 * Pros: GPS integration will be easier Maps / navigation,
 * telecommunication, and other potential android benefits
 * Server communication easier?
 * 
 * Cons: Security risk if android not updated regularly
 * Hardware may need to be updated every 5 years or so
 * (guess) Higher development costs as updating android can
 * cause bugs
 * 
 * Android uses java so striping from Android should be easy
 * if needed. The difficult part is porting it to
 * Android. */

public class ServerDemo {
	// Array simulation until I get the database set up.
	static PlatoonMember aPlatoon[] = new PlatoonMember[10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Nothing to see here, move along
		// (Under Construction)
		
	}
	
	@SuppressWarnings("unused")
	public static PublicKey joinPlatoon(Point2D coord1,
			Point2D coord2, PublicKey pub) {
		
		// TODO Poll SERVER for Platoon to join.
		
		// Figure 1 of thesis
		
		/* After talking to one of the authors, it seems like it
		 * will be better just to let the server decide than to
		 * follow Figure 1's instructions. The cars will not be
		 * talking to each other in this model, only to the Platoon
		 * Cloud Database / server. Networking cars to each other is
		 * beyond the scope of this project */
		
		/* Ultimately, if there is a Platoon nearby, it adds the car
		 * to the platoon. Else, it makes a new platoon. Then it
		 * broadcasts Platoon Public Key to the car requesting to
		 * join the Platoon Cloud. */
		
		// SERVER
		if (true) {
			// Add to nearby platoon
		}
		else {
			// Make car platoon leader
		}
		// return PlatoonPublicKey
		return null;
		// /SERVER
		
	}
	
	// Collect Speed Information
	public static void collectSpeed(Block currentBlock) {
		
		double BCSI2 = 0;
		
		/* Periodically, the PC will seek to collect the speed
		 * information transaction from PL; therefore, PC will
		 * request PL for its speed status. Then, PL will send the
		 * transaction of speed information to PC. */
		
		// huh, okay. So that's going to be a bit more difficult.
		
		// Find platoon leaders from the SERVER database
		
		// For now, I'm going to assume that all members of aPlatoon
		// are leaders
		
		// Request speed status from car to server
		// The cars should respond with their speed (block) and
		// public key
		
		for (PlatoonMember leaders : aPlatoon) {
			
			// Verify Speed Information
			
			/* The algorithm will sort and classify the received
			 * transaction. The received transaction will already be
			 * appended with PK of the PM vehicle that transmitted the
			 * transaction */
			
			// I think it's going to be faster to poll the database if
			// the Platoon Public Key is also included with the
			// request.
			
			/* While the new transaction is downloading in the PC
			 * buffer, the PC has already maintained the former
			 * transaction. */
			
			// Good idea for threaded implementation as improvement.
			// Right now, it's lower priority than the rest of the
			// project and currently beyond my abilities without more
			// research. Not marking as a todo until later
			
			if (verifyBlockChain(currentBlock)) {
				
				/* In the signature checking step, the PC will compare
				 * the hash value that is calculated from the first
				 * and second part of an incoming transaction with its
				 * signature. */
				
				// I almost created a new method in block to do this,
				// including a corresponding constructor that took a
				// block
				// XD
				
				// signature checking step
				if (currentBlock.calculateHash()
						.equals(currentBlock.getHash()))
					
					/* Buffering and Comparison of Speed
					 * Information */
					
					/* BCSI consists of two portions. The first
					 * portion is the buffering that will take care of
					 * storing the incoming transaction one by one,
					 * which has the speed information. */
					
					// So store Platoon Leader generated blocks into
					// the database. TODO
					
					/* The second portion of BCSI will compare the
					 * data of speed information that is already
					 * stored with the transaction. */
					
					

					;
				
			}
			
		}
		
	}
	
	private static boolean verifyBlockChain(Block currentBlock) {
		
		/* The PC will be able to check whether the first part of
		 * the new transaction has the same hash value as the third
		 * component of the previous transaction */
		
		// Verify that the previous hash section of this block
		// matches the signature for the last block.
		
		// FIXME Load last block from Database
		// new Block (double data, String previousHash);
		Block oldBlock = new Block(70, "0");
		
		// returns true if the current block's previous hash equals
		// the hash of the old block.
		return (currentBlock.getPreviousHash()
				.equals(oldBlock.getHash()));
		
	}
	
	public static Block requestBlock() {
		// Looks up most recent block for platoon and sends to car
		return null;
	}
	
}
