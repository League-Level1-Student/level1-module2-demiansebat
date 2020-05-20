package _07_tea_party;
	public class TeaParty {
        public String welcome(String name, boolean isWoman, boolean isKnighted) {
        	String welcome="Hello ";
			
			if(isWoman) {
				welcome+= "Ms. ";
			}
			else {
				
				if(isKnighted) {
					welcome+= "Sir ";
				}
				else {
					welcome+= "Mr. ";
				}
			}
			welcome+= name;
			
        	 /**
        	  * Jane Austen is a woman, so say “Hello Ms. Austen”. 
        	  * George Orwell is a man, so say “Hello Mr. Orwell”. 
        	  * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
        	  */ 
			return welcome;
        }
}
