import java.util.*;

public class Knight implements Runnable {
	
	Sword leftSword;
	Sword rightSword;
	boolean warPlanning = true;
	private long totalTime = 0;
	
	void beAKnight(String action) {
		String threadName = Thread.currentThread().getName();
		long systemTime = System.currentTimeMillis();
		Random rand = new Random();
		long x = rand.nextInt(1000 - 300 + 1)+300;
		totalTime += x;
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted");
			e.printStackTrace();
		}

		System.out.println(threadName + " " + systemTime + ": " + action);
	}
	
	@Override
	public void run() {
		
		while(totalTime < 5000) {
			
			 if (warPlanning) {
		            beAKnight("War planning");
		            warPlanning = false;
		        }
			 
			 for (Map.Entry<Sword, Knight> Temp : RoundTable.pickedSwords.entrySet()) {
				 
				 if (Temp.getValue() == null) {
					 
	                    if (leftSword == null) {  	
	                    	
	                        leftSword = Temp.getKey();
	                        
	                        RoundTable.pickedSwords.put(leftSword, this);
	                        beAKnight("picked up " + leftSword.getName() + " in left hand");
	                        
	                        
	                    } else if (rightSword == null) {
	                    	
	                        rightSword = Temp.getKey();
	                        RoundTable.pickedSwords.put(rightSword, this);
	                        

	                        beAKnight("picked up " + rightSword.getName() + " in right hand - training");
	                        beAKnight("right arm done");
	                        beAKnight("left arm done. back to war planning");
	                        
	                        
	                        RoundTable.pickedSwords.put(leftSword,null);
	                        RoundTable.pickedSwords.put(rightSword,null);
	                        
	                        
	                        leftSword = null;
	                        rightSword = null;
	                        warPlanning = true;

	                    }
	                    
	                    break;
	                }
			}
		}
		
		beAKnight("Enough training for today");
		
	}
	
	

}
