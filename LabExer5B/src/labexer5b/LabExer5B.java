/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labexer5b;

/**
 * Paulino, Ma. Hannah Mae Z.
 * BSCS202
 * 05 Laboratory Exercise 2
 * Computer Programming 2
 */

import java.util.*;
public class LabExer5B {
	
	 public static void main(String[] args) {
             
            System.out.println("Disney Quiz (âœ¿â— â€¿â— )");
               Scanner sc = new Scanner(System.in);
               String invalidInputText = "A, B, and C are the only allowed inputs. Try Again. \n";
	       int score = 0;
	       
	        // Arrays to store questions
        String[]q= new String [10];
	       	q[0] = "1. How many brothers does Prince Hans have in Frozen? ";
	       	q[1] = "2. What does Hakuna Matata means? ";
	       	q[2] = "3. The genie was stusk in the lamp for how many years before it was found by aladdin? " ;
	       	q[3] = "4. Who is Mufasaâ€™s trusted advisor in The Lion King? ";
	       	q[4] = "5. What was the first Pixar movie? ";
       		q[5] = "6. What was Rapunzelâ€™s chameleon in Tangled called? ";
	       	q[6] = "7. All you need is a little faith, trust and a little bit of what else? ";
	       	q[7] = "8. Who was the first black Disney princess? ";
	       	q[8] = "9. Who was Experiment 626? ";
	       	q[9] = "10. Princess Jasmine's tiger is named what? ";
		 
	       	
	// choices for question 1 : Correct answer is B
       	String [] posAns1 = new String[3]; 
	       	posAns1[0] = "A. 5";
	       	posAns1[1] = "B. 12";
	       	posAns1[2] = "C. 26";
       	
        // choices for question 2 : Correct answer is C
       	String [] posAns2 = new String[3]; 
	       	posAns2[0] = "A. Your Eyes";
	       	posAns2[1] = "B. To see is to believe";
	       	posAns2[2] = "C. No Worries";
 
        // choices for question 3 : Correct answer is A                
       	String []posAns3 = new String[3];
	       	posAns3[0] = "A. 10,000";
                posAns3[1] = "B. 100";
	       	posAns3[2] = "C. 1,000";
 
        // choices for question 4 : Correct answer is A                
       	String [] posAns4 = new String[3]; 
	       	posAns4[0] = "A. Zazu";
	       	posAns4[1] = "B. Lucas";
	       	posAns4[2] = "C. Fofo";
 
        // choices for question 5 : Correct answer is C                
       	String [] posAns5 = new String[3];	
	       	posAns5[0] = "A. Mickey Mouse";
	       	posAns5[1] = "B. Monster Inc.";
	       	posAns5[2] = "C. Toy Story";
 
        // choices for question 6 : Correct answer is B
        String [] posAns6 = new String[3];	
	       	posAns6[0] = "A. Paris";
	       	posAns6[1] = "B. Pascal";
	       	posAns6[2] = "C. Pastil";

        // choices for question 7 : Correct answer is C
        String [] posAns7 = new String[3];	
	       	posAns7[0] = "A. Fairy dust";
	       	posAns7[1] = "B. Love";
                posAns7[2] = "C. Pixie Dust";
  
        // choices for question 8 : Correct answer is A
        String [] posAns8 = new String[3];
	       	posAns8[0] = "A. Tiana";
	       	posAns8[1] = "B. Rihanna";
	       	posAns8[2] = "C. Diana";
        
        // choices for question 9 : Correct answer is B               
        String [] posAns9 = new String[3];	
	       	posAns9[0] = "A. Lilo";
	       	posAns9[1] = "B. Stitch";
	       	posAns9[2] = "C. Quasimodo";
                
        // choices for question 10 : Correct answer is C      
        String [] posAns10 = new String[3];	
	       	posAns10[0] = "A. Datu";
	       	posAns10[1] = "B. Pharo";
	       	posAns10[2] = "C. Rajah";
		   	
	       	int h = 0; 
	       	char corAns,ans; // answer via user-input , answer via user-input (ignoring the case) since char is used
                
// number 1	       	
	       	do {
	       		System.out.println(q[0]);
	       			for (String num1 : posAns1){
	       				System.out.print("\t" + num1 + "\n");
	       			}
                        
                        // try statement
	       		try {
                        System.out.print("Answer: ");
                        corAns = sc.nextLine().charAt(0);
	       		ans = Character.toUpperCase(corAns);	
                        // if-else statement for A, B, C answers
                            if (ans == 'A' || ans == 'B'|| ans == 'C') {
                            h++;
                            
                                // if correct
		       		if (ans == 'B') {
		       		score = score+1;	
		       		System.out.println("Correct!");
		       		}
                                
                                // if wrong
		       		else {
			       	System.out.println("Wrong!"); 
                                }			
                            }
                            
                                // if input is not A, B, C
		       		else throw new invalidInput();		
	       		}
	       		
                        // catch statement if input is not A, B, C
		       	catch(invalidInput ex){
		              System.out.print(ex.getMessage());
		        }
                        
                        // catch statement is input is blank
	       		catch (StringIndexOutOfBoundsException ex) {
                              System.out.println("Please input an answer.");
	       		}
	       	} while(h == 0); h--;
	       	
// number 2	       	
	       	do {
	       		System.out.println(q[1]);
	       			for (String num2: posAns2){
	       				System.out.print("\t" + num2 + "\n");
	       			}
                        
                        // try statement
	       		try {
	       		System.out.print("Answer: ");                            
                        corAns = sc.nextLine().charAt(0);
	       		ans = Character.toUpperCase(corAns);	
                        
                        // if-else statement for A, B, C answers
                            if (ans == 'A' || ans == 'B'|| ans == 'C') {
                            h++;
                            
                                // if correct
		       		if (ans == 'C') {
		       		score = score+1;	
		       		System.out.println("Correct!");
		       		}
                                
                                // if wrong
		       		else {
			       	System.out.println("Wrong!"); 
                                }			
                            }
                            
                                // if input is not A, B, C
		       		else throw new invalidInput();		
	       		}
	       		
                        // catch statement if input is not A, B, C
		       	catch(invalidInput ex){
		              System.out.print(ex.getMessage());
		        }
                        
                        // catch statement is input is blank
	       		catch (StringIndexOutOfBoundsException ex) {
                              System.out.println("Please input an answer.");
	       		}
	       	} while(h == 0); h--;

// number 3	       	
	       	do {
	       		System.out.println(q[2]);
	       			for (String num3: posAns3){
	       				System.out.print("\t" + num3 + "\n");
	       			}
                        
                        // try statement
	       		try {
                        System.out.print("Answer: ");                       
                        corAns = sc.nextLine().charAt(0);
	       		ans = Character.toUpperCase(corAns);	
                        
                        // if-else statement for A, B, C answers
                            if (ans == 'A' || ans == 'B'|| ans == 'C') {
                            h++;
                            
                                // if correct
		       		if (ans == 'A') {
		       		score = score+1;	
		       		System.out.println("Correct!");
		       		}
                                
                                // if wrong
		       		else {
			       	System.out.println("Wrong!"); 
                                }			
                            }
                            
                                // if input is not A, B, C
		       		else throw new invalidInput();		
	       		}
	       		
                        // catch statement if input is not A, B, C
		       	catch(invalidInput ex){
		              System.out.print(ex.getMessage());
		        }
                        
                        // catch statement is input is blank
	       		catch (StringIndexOutOfBoundsException ex) {
                              System.out.println("Please input an answer.");
	       		}
	       	} while(h == 0); h--;	       	

// number 4
	       	do {
	       		System.out.println(q[3]);
	       			for (String num4: posAns4){
	       				System.out.print("\t" + num4 + "\n");
	       			}
                        
                        // try statement
	       		try {
	       		System.out.print("Answer: ");                            
                        corAns = sc.nextLine().charAt(0);
	       		ans = Character.toUpperCase(corAns);	
                        
                        // if-else statement for A, B, C answers
                            if (ans == 'A' || ans == 'B'|| ans == 'C') {
                            h++;
                            
                                // if correct
		       		if (ans == 'A') {
		       		score = score+1;	
		       		System.out.println("Correct!");
		       		}
                                
                                // if wrong
		       		else {
			       	System.out.println("Wrong!"); 
                                }			
                            }
                            
                                // if input is not A, B, C
		       		else throw new invalidInput();		
	       		}
	       		
                        // catch statement if input is not A, B, C
		       	catch(invalidInput ex){
		              System.out.print(ex.getMessage());
		        }
                        
                        // catch statement is input is blank
	       		catch (StringIndexOutOfBoundsException ex) {
                              System.out.println("Please input an answer.");
	       		}
	       	} while(h == 0); h--;	 
                
// number 5
	       	do {
	       		System.out.println(q[4]);
	       			for (String num5: posAns5){
	       				System.out.print("\t" + num5 + "\n");
	       			}
                        
                        // try statement
	       		try {
	       		System.out.print("Answer: ");                            
                        corAns = sc.nextLine().charAt(0);
	       		ans = Character.toUpperCase(corAns);	
                        
                        // if-else statement for A, B, C answers
                            if (ans == 'A' || ans == 'B'|| ans == 'C') {
                            h++;
                            
                                // if correct
		       		if (ans == 'C') {
		       		score = score+1;	
		       		System.out.println("Correct!");
		       		}
                                
                                // if wrong
		       		else {
			       	System.out.println("Wrong!"); 
                                }			
                            }
                            
                                // if input is not A, B, C
		       		else throw new invalidInput();		
	       		}
	       		
                        // catch statement if input is not A, B, C
		       	catch(invalidInput ex){
		              System.out.print(ex.getMessage());
		        }
                        
                        // catch statement is input is blank
	       		catch (StringIndexOutOfBoundsException ex) {
                              System.out.println("Please input an answer.");
	       		}
	       	} while(h == 0); h--;	 
                                
// number 6	       	
	       	do {
	       		System.out.println(q[5]);
	       			for (String num6: posAns6){
	       				System.out.print("\t" + num6 + "\n");
	       			}

                        // try statement
	       		try {
	       		System.out.print("Answer: ");                            
                        corAns = sc.nextLine().charAt(0);
	       		ans = Character.toUpperCase(corAns);	
                        
                        // if-else statement for A, B, C answers
                            if (ans == 'A' || ans == 'B'|| ans == 'C') {
                            h++;
                            
                                // if correct
		       		if (ans == 'B') {
		       		score = score+1;	
		       		System.out.println("Correct!");
		       		}
                                
                                // if wrong
		       		else {
			       	System.out.println("Wrong!"); 
                                }			
                            }
                            
                                // if input is not A, B, C
		       		else throw new invalidInput();		
	       		}
	       		
                        // catch statement if input is not A, B, C
		       	catch(invalidInput ex){
		              System.out.print(ex.getMessage());
		        }
                        
                        // catch statement is input is blank
	       		catch (StringIndexOutOfBoundsException ex) {
                              System.out.println("Please input an answer.");
	       		}
	       	} while(h == 0); h--;
                
// number 7
	       	do {
	       		System.out.println(q[6]);
	       			for (String num7: posAns7){
	       				System.out.print("\t" + num7 + "\n");
	       			}
                        
                        // try statement
	       		try {
	       		System.out.print("Answer: ");                            
                        corAns = sc.nextLine().charAt(0);
	       		ans = Character.toUpperCase(corAns);	
                        
                        // if-else statement for A, B, C answers
                            if (ans == 'A' || ans == 'B'|| ans == 'C') {
                            h++;
                            
                                // if correct
		       		if (ans == 'C') {
		       		score = score+1;	
		       		System.out.println("Correct!");
		       		}
                                
                                // if wrong
		       		else {
			       	System.out.println("Wrong!"); 
                                }			
                            }
                            
                                // if input is not A, B, C
		       		else throw new invalidInput();		
	       		}
	       		
                        // catch statement if input is not A, B, C
		       	catch(invalidInput ex){
		              System.out.print(ex.getMessage());
		        }
                        
                        // catch statement is input is blank
	       		catch (StringIndexOutOfBoundsException ex) {
                              System.out.println("Please input an answer.");
	       		}
	       	} while(h == 0); h--;
                
// number 8
	       	do {
	       		System.out.println(q[7]);
	       			for (String num8: posAns8){
	       				System.out.print("\t" + num8 + "\n");
	       			}
                        
                        // try statement
	       		try {
	       		System.out.print("Answer: ");                            
                        corAns = sc.nextLine().charAt(0);
	       		ans = Character.toUpperCase(corAns);	
                        
                        // if-else statement for A, B, C answers
                            if (ans == 'A' || ans == 'B'|| ans == 'C') {
                            h++;
                            
                                // if correct
		       		if (ans == 'A') {
		       		score = score+1;	
		       		System.out.println("Correct!");
		       		}
                                
                                // if wrong
		       		else {
			       	System.out.println("Wrong!"); 
                                }			
                            }
                            
                                // if input is not A, B, C
		       		else throw new invalidInput();		
	       		}
	       		
                        // catch statement if input is not A, B, C
		       	catch(invalidInput ex){
		              System.out.print(ex.getMessage());
		        }
                        
                        // catch statement is input is blank
	       		catch (StringIndexOutOfBoundsException ex) {
                              System.out.println("Please input an answer.");
	       		}
	       	} while(h == 0); h--;	 
                
// number 9	 
	       	do {
	       		System.out.println(q[8]);
	       			for (String num9: posAns9){
	       				System.out.print("\t" + num9 + "\n");
	       				}
                        
                        // try statement
	       		try {
	       		System.out.print("Answer: ");                            
                        corAns = sc.nextLine().charAt(0);
	       		ans = Character.toUpperCase(corAns);	
                        
                        // if-else statement for A, B, C answers
                            if (ans == 'A' || ans == 'B'|| ans == 'C') {
                            h++;
                            
                                // if correct
		       		if (ans == 'B') {
		       		score = score+1;	
		       		System.out.println("Correct!");
		       		}
                                
                                // if wrong
		       		else {
			       	System.out.println("Wrong!"); 
                                }			
                            }
                            
                                // if input is not A, B, C
		       		else throw new invalidInput();		
	       		}
	       		
                        // catch statement if input is not A, B, C
		       	catch(invalidInput ex){
		              System.out.print(ex.getMessage());
		        }
                        
                        // catch statement is input is blank
	       		catch (StringIndexOutOfBoundsException ex) {
                              System.out.println("Please input an answer.");
	       		}
	       	} while(h == 0); h--;
                
//number 10
	       	do {
	       		System.out.println(q[9]);
	       		
	       			for (String num10: posAns10){
	       				System.out.print("\t" + num10 + "\n");
	       				}
                                
                        
                        // try statement
	       		try {
	       		System.out.print("Answer: ");                            
                        corAns = sc.nextLine().charAt(0);
	       		ans = Character.toUpperCase(corAns);	
                        
                        // if-else statement for A, B, C answers
                            if (ans == 'A' || ans == 'B'|| ans == 'C') {
                            h++;
                            
                                // if correct
		       		if (ans == 'C') {
		       		score = score+1;	
		       		System.out.println("Correct!");
		       		}
                                
                                // if wrong
		       		else {
			       	System.out.println("Wrong!"); 
                                }			
                            }
                            
                                // if input is not A, B, C
		       		else throw new invalidInput();		
	       		}
	       		
                        // catch statement if input is not A, B, C
		       	catch(invalidInput ex){
		              System.out.print(ex.getMessage());
		        }
                        
                        // catch statement is input is blank
	       		catch (StringIndexOutOfBoundsException ex) {
                              System.out.println("Please input an answer.");
	       		}
                        
	       	} while(h == 0); h--;	 
                
	       	// display total score
		   System.out.println("Your score is: " + score + " / 10.");
	}   
}

class invalidInput extends Exception{
	
	public invalidInput() {
		
	super("A, B, and C are the only allowed inputs. Try Again. \n");
	
	}
}