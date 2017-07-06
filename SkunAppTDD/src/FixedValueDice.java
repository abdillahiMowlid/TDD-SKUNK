
public class FixedValueDice implements Dice {
	
//private int die1;
//private int die2;
private int value;
//private int value2;
//private int value1;

public FixedValueDice(int value){
	this.value= value;
}
	
	//public void roll() {
        
    //die1 = (int)(Math.random()*6) + 1;
    //die2 = (int)(Math.random()*6) + 1;
	//}
         
	//public int getDie1() {
	  // return die1;
	//}
	
	//public int getDie2() {
	   //return die2;
	//}
	
	

	@Override
	public int rollDie1() {
		return value;
	}

	@Override
	public int rollDie2() {
		return value;
		
	//}
	//public int getValue(){
	//return this.value;
	}
}

