import time
import random

#header
print("----------------STI COLLEGE----------------")
print("This is the official library chatbot of STI College Ortigas-Cainta.")    
print("-------------------------------------------")
time.sleep(2)
        
#greetings
print("Good day! Welcome to STI College Ortigas-Cainta Library Chatbot.")
time.sleep(1)
print("I am Hannah. I will be assisting you with your book-borrowing concern today.")
time.sleep(1)
name = input("How do you want me to adress you? ")
time.sleep(2)

#assessing mood
mood = input("Nice to meet you, " + name + "! How are you? ")
if mood.lower() in ["good", "fine"]:
    print("That is good to hear, " + name + "!" )
            
elif mood.lower() in ["bad", "stressed"]:
    print("Uh oh! Don't worry, " + name + ". I am here to help you.")
            
else:
    print("I actually feel the same. Let's get through this together, " + name + "!") 
            
time.sleep(2)
        
#student info & concern
sname = input("What is your surname? ")
time.sleep(2)
        
prog = input("Can I also know what program are you enrolled to? ")
time.sleep(2)

print("Nice choice! I would also consider taking that.")
time.sleep(1)
subj = input("What subjects do you want help with? ")
time.sleep(2)
        
print("That seems really hard, but say less! I will do my best to assist you with your " + subj.upper() + " subject.")
time.sleep(1)
        
topic = input("What specific topic are you having a hard time with? ")
time.sleep(2)
        
#answering the problems
print("You are on the right hands, " + name + ".")
time.sleep(1);
print("I will be the best help that you will have with " + topic.upper() + ".")
time.sleep(2);
list = input("Do you want me to provide a HARDCOPY or a SOFTCOPY of the list of books available in the library that can help you? ")
        
if "HARDCOPY" in list.upper():
    print("Oh, you wanted to have a hardcopy. I will be printing it for you right now.")
    time.sleep(1);
    print("Just head to the library on your convenient time to get your copy!")
            
elif "SOFTCOPY" in list.upper():
    print("Oh, you wanted to have a softcopy. I will be compiling it for you right now.")
    time.sleep(1);
    print("Just wait for a few minutes and I will be emailing it to your school email, " + sname.lower() + "123@or-ca.sti.edu.ph")
            
else:
    print("We will be emailing you regarding that!")
        
#moving to close
time.sleep(2);
print(" ")
print("Processing...")
print(" ")
print("All done, " + name + ".")
time.sleep(1);
print(" ")

yn = input("Did I help you with your concern? ")
        
if "yes" in yn.lower():
    print("Whew! I am glad I did.")
            
elif "no" in yn.lower():
    print("Oh no. Apologies for that, " + name + ".")
            
else:
    print("I hope I really helped you out, " + name + ".")
            
time.sleep(1);
yeno = input("While you were here, do you want me to provide you some study tips? ")
        
if "yes" in yeno.lower():
    print("Cool! Here's a tip for you.")
    tips = ["Study in a quiet environment.", "Turn off your electronics when studying.", "Be sure that you are not hungry while studying."]
    print(random.choice(tips))
            
elif "no" in yeno.lower():
    print("Oh no. Apologies for that, " + name + ".")
           
else:
    print("Just head to the library if you need some!")

time.sleep(1)
print(" ")
        
#suggestion
print("It was nice working with you, " + name + "!")
time.sleep(1)
inp = input("The library chatbot is always looking forward to improve! Do you have any feedback or suggestions? ")
time.sleep(2)
print("Your input is valuable! Thank you!")
time.sleep(1)
        
#closing
print(" ")
print("Have a very fantastic and productive day, " + name + ".")
time.sleep(1)
        
print(" ")
print("If you have more concerns, feel free to contact us!")
time.sleep(1)
        
#contact details
print("-------------------------------------------")
print("STI COLLEGE ORTIGAS-CAINTA LIBRARY")
time.sleep(1)
print("Email: stiLibrary@or-ca.sti.edu.ph")
time.sleep(1)
print("Contact Number: 099-456-7234")
time.sleep(1)
print("Landline: 654-908-234")
time.sleep(1)
print("Address: Ortigas-Cainta Extension, Cainta, Rizal, Philippines")
time.sleep(1)
print("-------------------------------------------")
