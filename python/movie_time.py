from collections import deque #import statemnets

movies = deque([])
snacks = deque([])

for i in range (3): #restrict number of user input to 3 for movies
    movChoice = input(f"Enter movie {i+1} of 3: ")
    movies.append(movChoice) #adds item to the movie queue

for h in range (3): #for loop to restrict user input to 3 for snacks
    foodChoice = input(f"Enter snacks/beverage {h+1} of 3: ")
    snacks.append(foodChoice) #adds item to the snacks queue
        
print("-------------------------------------------------")
print("Movies to watch are: ", movies ) #displays movies queue
print("Snacks available are: ", snacks) #displays snacks queue
print("-------------------------------------------------")

while snacks: #executes when snacks queue is not empty
        
    choice = input("Press S each time you finish a snack: ")

    if choice.upper() == 'S':
        snacks.popleft() #removes the head of the queue if s is entered
            
        if not snacks: #displays an error message if snacks queue is empty
            print("No more snacks.")

        else: #displays available snacks if snacks queue is not empty
            print("Snack(s) available: ", snacks)
            print("-------------------------------------------------")
            
    else:
        print("Invalid input.")
 