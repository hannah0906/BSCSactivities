def find_sum(n): #recursive functiom for finding the sum of the first n integers
    
    #Conditional Statement
    if n==0: #returns 0 is n is zero since no positive integer precedes it
        return 0
    else:
        return n + find_sum(n-1) #if user-input is not 0, the function will call itself to perform the addition of first n integers

#input      
n = int(input("Enter a number: ")) #will ask the user to input a number for n

#displays the result for the sum of the first n integers using the recursive function
print("The sum of the first " + str(n) + " integer is " + str(find_sum(n)) + ".") 