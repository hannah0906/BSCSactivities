basket = []
num = int(input("Enter the number of fruits you would like to catch: ")) #asks user to enter number of fruits

print("Catch any of the following fruits: (1) Apple, (2) Orange, (3) Mango, (4) Guava") #displays possible fruits list
print("Press A for apple, O for orange, M for mango, and G for guava.")
print("---------------------------------------------------------------------------------------")

for i in range (num): #allows user to enter a choice as long as it is within the range    
    choice = input(f"Fruit {i+1} of {num}: ")
    if choice.upper() == 'A':
        basket.append("Apple") #adds apple on the basket when a or A is chosen
           
    elif choice.upper() == 'O':
        basket.append("Orange") #adds orange on the basket when o or O is chosen
        
    elif choice.upper() == 'M':
        basket.append("Mango") #adds mango on the basket when m or M is chosen
               
    elif choice.upper() == 'G':
        basket.append("Guava") #adds guava on the basket when g or G is chosen       

    else:
        print ("Only choose A, O, M, or G. Try Again.") #error message when other letters are chosen
        
print("Your basket now has: ", basket) #displays the content of the basket
print("---------------------------------------------------------------------------------------")
            
while basket:  #allows user to eat a fruit while the basket is not empty   
    eat = input("Press E to eat a fruit: ")
    if eat.upper() == 'E': #if user input is e, last element added is removed
        basket.pop();
        
        if not basket: #if basket is empty, display that here is no more fruit
           print("No more fruits.")
                
        else:
            print("Fruit(s) in the basket: ", basket) #if basket still has fruits, display remaining fruits
            print("---------------------------------------------------------------------------------------")