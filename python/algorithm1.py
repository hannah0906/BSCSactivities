#User-input 1
#User have to input the first number
firstNum = int(input("Enter first number: "))

#User-input 2
#User have to input the second number
secondNum = int(input("Enter second number: "))

#Condition 1: Test if the first number is less than the second number
if firstNum < secondNum:
    print(firstNum," is less than ",secondNum) #prints if condition 1 is true, otherwise proceeds to condition 2

#Condition 2: Test if the first number is equal to the second number    
elif firstNum == secondNum:
    print(firstNum," is equal to ",secondNum) #prints if condition 2 is true, otherwise proceeds to condition 3

#Condition 3: Test if the first number is greater than the second number    
elif firstNum > secondNum:
    print(firstNum," is greater than ",secondNum) #prints if condition 3 is true, otherwise proceeds to condition 4

#Condition 4: Executes if none of the conditions above are satisfied
else:
    print("Try Again.")