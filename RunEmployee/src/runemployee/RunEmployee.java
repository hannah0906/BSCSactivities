package runemployee;
import java.util.*;


 class wrongInput extends Exception{
	
	public wrongInput() {
		
	super("Only pick A, B, or C. Try again. \n");
	
	}
}

public class RunEmployee {
	
	 public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

               String wrongText = "Only pick A, B, or C. Try Again. \n";
	       int score = 0;
	       
	    // Arrays to store questions
            String[]q= new String [10];
	       	q[0] = "1. How many brothers does Prince Hans have in Frozen? ";
	       	q[1] = "2. What does Hakuna Matata means? ";
	       	q[2] = "3. The genie was stusk in the lamp for how many years before it was found by aladdin? " ;
	       	q[3] = "4. Who is Mufasa’s trusted advisor in The Lion King? ";
	       	q[4] = "5. What was the first Pixar movie? ";
       		q[5] = "6. What was Rapunzel’s chameleon in Tangled called? ";
	       	q[6] = "7. All you need is a little faith, trust and a little bit of what else? ";
	       	q[7] = "8. Who was the first black Disney princess? ";
	       	q[8] = "9. Who was Experiment 626? ";
	       	q[9] = "10. Princess Jasmine's tiger is named what? ";
		 
	       	
	       	String [] choices1 = new String[3]; // Corrrect answer: C 
		       	choices1[0] = "A. Gringotts";
		       	choices1[1] = "B. Wand";
		       	choices1[2] = "C. Nine and Three-quarters";
	       	
	       	String [] choices2 = new String[3]; // Corrrect answer: A
		       	choices2[0] = "A. Car crash";
		       	choices2[1] = "B. Airplane crash";
		       	choices2[2] = "C. Cancer";
	       		
	       	String []choices3 = new String[3];	// Corrrect answer: B
		       	choices3[0] = "A. Physicians";
		       	choices3[1] = "B. Dentists";
		       	choices3[2] = "C. Mechanics";
	       		
	       	String [] choices4 = new String[3]; // Corrrect answer: B
		       	choices4[0] = "A. Two";
		       	choices4[1] = "B. Six";
		       	choices4[2] = "C. Three";
	       		
	       	String [] choices5 = new String[3];	// Corrrect answer: B
		       	choices5[0] = "A. Broom";
		       	choices5[1] = "B. Wand";
		       	choices5[2] = "C. Pen";
		       	
		    String [] choices6 = new String[3];	// Corrrect answer: A
		       	choices6[0] = "A. Slytherin";
		       	choices6[1] = "B. Hufflepuff";
		       	choices6[2] = "C. Gryffindor";
		       	
			String [] choices7 = new String[3];	// Corrrect answer: A
		       	choices7[0] = "A. Transfiguration";
		       	choices7[1] = "B. History of Magic";
		       	choices7[2] = "C. Defense Against the Dark Arts";
		       	
			String [] choices8 = new String[3];	// Corrrect answer: C
		       	choices8[0] = "A. chaser";
		       	choices8[1] = "B. keeper";
		       	choices8[2] = "C. seeker";
		       	
			String [] choices9 = new String[3];	// Corrrect answer: B
		       	choices9[0] = "A. phoenix feather";
		       	choices9[1] = "B. holly";
		       	choices9[2] = "C. unicorn hair";
		       	
		    String [] choices10 = new String[3];	// Corrrect answer: A
		       	choices10[0] = "A. a threeheaded dog";
		       	choices10[1] = "B. a snake";
		       	choices10[2] = "C. an owl";
		       	
		   	
	       	System.out.println("Harry Potter Quiz: " + "\n");
	       	int i = 0;
	       	char ans,ansUp;
	       	
	       	
	       	do {
	       		System.out.println(questions[0]);
	       		
	       			for (String a: choices1){
	       				System.out.print("\t" + a + "\n");
	       				}
	       			
	       		try {
	       			 ans = sc.nextLine().charAt(0);
	       			 	ansUp = Character.toUpperCase(ans);	
	       				
		       				if (ansUp == 'A' || ansUp == 'B'|| ansUp == 'C')
		       				{
		       					i++;
		       					if (ansUp == 'C') 
		       					{
		       					score = score+1;	
		       					System.out.println("Correct! Current score: " + score);
		       				
		       					}
		       					
		       					else 
		       					{
			       					System.out.println("Wrong! Current score: " + score);
			       				}
		       				}
		       				
		       				else throw new wrongInput();		
	       			}
	       		
		       	catch(wrongInput ex)
		            {       
		              System.out.print(ex.getMessage());
		            }
	       		catch (StringIndexOutOfBoundsException ex) 
	       			{
	       			
	       			System.out.print("Please input an answer. " + wrongText);
	       			}
		       	
	       	}while(i ==0); i--;
	       	
	       	
	      	do {
	       		System.out.println(questions[1]);
	       		
	       			for (String a: choices2){
	       				System.out.print("\t" + a + "\n");
	       				}
	       			
	       		try {
	       			 ans = sc.nextLine().charAt(0);
	       			 	ansUp = Character.toUpperCase(ans);	
	       				
		       				if (ansUp == 'A' || ansUp == 'B'|| ansUp == 'C')
		       				{
		       					i++;
		       					if (ansUp == 'A') 
		       					{
		       					score = score+1;	
		       					System.out.println("Correct! Current score: " + score);
		       				
		       					}
		       					
		       					else 
		       					{
			       					System.out.println("Wrong! Current score: " + score);
			       				}
		       				}
		       				
		       				else throw new wrongInput();
	       			}
	       		
		       	catch(wrongInput ex)
		            {       
		              System.out.print(ex.getMessage());
		            }
	       		catch (StringIndexOutOfBoundsException ex) 
	       			{
	       			
	       			System.out.print("Please input an answer. " + wrongText);
	       			}
		       	
	       	}while(i ==0); i--;
	       	
	       	
	      	do {
	       		System.out.println(questions[2]);
	       		
	       			for (String a: choices3){
	       				System.out.print("\t" + a + "\n");
	       				}
	       			
	       		try {
	       			 ans = sc.nextLine().charAt(0);
	       			 	ansUp = Character.toUpperCase(ans);	
	       				
		       				if (ansUp == 'A' || ansUp == 'B'|| ansUp == 'C')
		       				{
		       					i++;
		       					if (ansUp == 'B') 
		       					{
		       					score = score+1;	
		       					System.out.println("Correct! Current score: " + score);
		       				
		       					}
		       					
		       					else 
		       					{
			       					System.out.println("Wrong! Current score: " + score);
			       				}
		       				}
		       				
		       				else throw new wrongInput();
	       			}
	       		
		       	catch(wrongInput ex)
		            {       
		              System.out.print(ex.getMessage());
		            }
	       		catch (StringIndexOutOfBoundsException ex) 
	       			{
	       			
	       			System.out.print("Please input an answer. " + wrongText);
	       			}
		       	
	       	}while(i ==0); i--;
	       	
	       	
	      	do {
	       		System.out.println(questions[3]);
	       		
	       			for (String a: choices4){
	       				System.out.print("\t" + a + "\n");
	       				}
	       			
	       		try {
	       			 ans = sc.nextLine().charAt(0);
	       			 	ansUp = Character.toUpperCase(ans);	
	       				
		       				if (ansUp == 'A' || ansUp == 'B'|| ansUp == 'C')
		       				{
		       					i++;
		       					if (ansUp == 'B') 
		       					{
		       					score = score+1;	
		       					System.out.println("Correct! Current score: " + score);
		       	
		       					}
		       					
		       					else 
		       					{
			       					System.out.println("Wrong! Current score: " + score);
			       				}
		       				}
		       				
		       				else throw new wrongInput();
	       			}
	       		
		       	catch(wrongInput ex)
		            {       
		              System.out.print(ex.getMessage());
		            }
	       		catch (StringIndexOutOfBoundsException ex) 
	       			{
	       			
	       			System.out.print("Please input an answer. " + wrongText);
	       			}
		       		
	       	}while(i ==0); i--;
	       	
	       	
	      	do {
	       		System.out.println(questions[4]);
	       		
	       			for (String a: choices5){
	       				System.out.print("\t" + a + "\n");
	       				}
	       			
	       		try {
	       			 ans = sc.nextLine().charAt(0);
	       			 	ansUp = Character.toUpperCase(ans);	
	       				
		       				if (ansUp == 'A' || ansUp == 'B'|| ansUp == 'C')
		       				{
		       					i++;
		       					if (ansUp == 'B') 
		       					{
		       					score = score+1;	
		       					System.out.println("Correct! Current score: " + score);
		       					
		       					}
		       					
		       					else 
		       					{
			       					System.out.println("Wrong! Current score: " + score);
			       				}
		       				}
		       				
		       				else throw new wrongInput();
	       			}
	       		
		       	catch(wrongInput ex)
		            {       
		              System.out.print(ex.getMessage());
		            }
	       		catch (StringIndexOutOfBoundsException ex) 
	       			{
	       			
	       			System.out.print("Please input an answer. " + wrongText);
	       			}
		       	
	       	}while(i ==0); i--;
	       	
	       	
	      	do {
	       		System.out.println(questions[5]);
	       		
	       			for (String a: choices6){
	       				System.out.print("\t" + a + "\n");
	       				}
	       			
	       		try {
	       			 ans = sc.nextLine().charAt(0);
	       			 	ansUp = Character.toUpperCase(ans);	
	       				
		       				if (ansUp == 'A' || ansUp == 'B'|| ansUp == 'C')
		       				{
		       					i++;
		       					if (ansUp == 'A') 
		       					{
		       					score = score+1;	
		       					System.out.println("Correct! Current score: " + score);
		       					
		       					}
		       					
		       					else 
		       					{
			       					System.out.println("Wrong! Current score: " + score);
			       				}
		       				}
		       				
		       				else throw new wrongInput();		
	       			}
	       		
		       	catch(wrongInput ex)
		            {       
		              System.out.print(ex.getMessage());
		            }
	       		catch (StringIndexOutOfBoundsException ex) 
	       			{
	       			
	       			System.out.print("Please input an answer. " + wrongText);
	       			}
		       	
	       	}while(i ==0); i--;
	       	
	       	
	      	do {
	       		System.out.println(questions[6]);
	       		
	       			for (String a: choices7){
	       				System.out.print("\t" + a + "\n");
	       				}
	       			
	       		try {
	       			 ans = sc.nextLine().charAt(0);
	       			 	ansUp = Character.toUpperCase(ans);	
	       				
		       				if (ansUp == 'A' || ansUp == 'B'|| ansUp == 'C')
		       				{
		       					i++;
		       					if (ansUp == 'A') 
		       					{
		       					score = score+1;	
		       					System.out.println("Correct! Current score: " + score);
		       				
		       					}
		       					
		       					else 
		       					{
			       					System.out.println("Wrong! Current score: " + score);
			       				}
		       				}
		       				
		       				else throw new wrongInput();
		       				
	       			}
	       		
		       	catch(wrongInput ex)
		            {       
		              System.out.print(ex.getMessage());
		            }
	       		catch (StringIndexOutOfBoundsException ex) 
	       			{
	       			
	       			System.out.print("Please input an answer. " + wrongText);
	       			}
		       	
	       	}while(i ==0); i--;
	       	
	       	
	      	do {
	       		System.out.println(questions[7]);
	       		
	       			for (String a: choices8){
	       				System.out.print("\t" + a + "\n");
	       				}
	       			
	       		try {
	       			 ans = sc.nextLine().charAt(0);
	       			 	ansUp = Character.toUpperCase(ans);	
	       				
		       				if (ansUp == 'A' || ansUp == 'B'|| ansUp == 'C')
		       				{
		       					i++;
		       					if (ansUp == 'C') 
		       					{
		       					score = score+1;	
		       					System.out.println("Correct! Current score: " + score);
		       					
		       					}
		       					
		       					else 
		       					{
			       					System.out.println("Wrong! Current score: " + score);
			       				}
		       				}
		       				
		       				else throw new wrongInput();
	       			}
	       		
		       	catch(wrongInput ex)
	       			{       
		              System.out.print(ex.getMessage());
		            }
	       		catch (StringIndexOutOfBoundsException ex) 
	       			{
	       			
	       			System.out.print("Please input an answer. " + wrongText);
	       			}
		       	
	       	}while(i ==0); i--;
	       	
	       	
	      	do {
	       		System.out.println(questions[8]);
	       		
	       			for (String a: choices9){
	       				System.out.print("\t" + a + "\n");
	       				}
	       			
	       		try {
	       			 ans = sc.nextLine().charAt(0);
	       			 	ansUp = Character.toUpperCase(ans);	
	       				
		       				if (ansUp == 'A' || ansUp == 'B'|| ansUp == 'C')
		       				{
		       					i++;
		       					if (ansUp == 'B') 
		       					{
		       					score = score+1;	
		       					System.out.println("Correct! Current score: " + score);
		       					System.out.print(score);
		       					}
		       					
		       					else 
		       					{
			       					System.out.println("Wrong! Current score: " + score);
			       				}
		       				}
		       				
		       				else throw new wrongInput();
	       			}
	       		
		       	catch(wrongInput ex)
		            {       
		              System.out.print(ex.getMessage());
		            }
	       		catch (StringIndexOutOfBoundsException ex) 
	       			{
	       			
	       			System.out.print("Please input an answer. " + wrongText);
	       			}
		       	
	       	}while(i ==0); i--;
	       	
	       	
	      	do {
	       		System.out.println(questions[9]);
	       		
	       			for (String a: choices10){
	       				System.out.print("\t" + a + "\n");
	       				}
	       			
	       		try {
	       			 ans = sc.nextLine().charAt(0);
	       			 	ansUp = Character.toUpperCase(ans);	
	       				
		       				if (ansUp == 'A' || ansUp == 'B'|| ansUp == 'C')
		       				{
		       					i++;
		       					if (ansUp == 'A') 
		       					{
		       					score = score+1;	
		       					System.out.println("Correct! Current score: " + score);
		       					
		       					}
		       					
		       					else 
		       					{
			       					System.out.println("Wrong! Current score: " + score);
			       				}
		       				}
		       				
		       				else throw new wrongInput();		
	       			}
	       		
		       	catch(wrongInput ex)
		            {       
		              System.out.print(ex.getMessage());
		            }
	       		catch (StringIndexOutOfBoundsException ex) 
	       			{
	       			
	       			System.out.print("Please input an answer. " + wrongText);
	       			}
		       	
	       	}while(i ==0); i--;
	       	
	     
	       	
		   System.out.println("______________________________________");
		   System.out.println("Quiz is done! Your score is: " + score);
	}
	     
	      
}

					
		

