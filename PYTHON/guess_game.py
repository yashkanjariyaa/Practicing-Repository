import random
print("Enter two numbers to define a range, both numbers are inclusive")
num1 = int(input("Enter num1 : "))
num2 = int(input("Enter num2 : "))
myList = []
range1_2 = int(((num2-num1)/2)+num1)
range1_4 = int(((range1_2-num1)/2)+num1)
for x in range(num1,num2+1):
    myList.append(x)
numg = 0  
num = random.choice(myList)
while(num!=numg):
        numg = int(input("Enter your guess"))
        if (numg>=myList[range1_2]) and (num<myList[range1_2]) :
            print("Your guess is too large")
        elif (numg<myList[range1_2]) and (num>=myList[range1_2]) :
             print("Your guess is too less")
        elif (numg<myList[range1_2]) and (num<myList[range1_2]) :
            if (numg<(myList[range1_2]-range1_4)) and (numg>=(myList[range1_2]-range1_4))  :
                  print("Your guess is a bit less")
            elif (numg>=(myList[range1_2]-range1_4)) and (numg<(myList[range1_2]-range1_4))  :      
                  print("Your guess is a bit large")
            elif (numg>=(myList[range1_2]-range1_4)) and (numg>=(myList[range1_2]-range1_4))  :
                    if(numg>num):
                        print("Your guess is a bit large")
                    elif(numg<num):
                        print("Your guess is a bit less")
                    else :
                         print("You're correct!")
            elif (numg<(myList[range1_2]-range1_4)) and (numg<(myList[range1_2]-range1_4))  :
                    if(numg>num):
                        print("Your guess is a bit large")
                    elif(numg<num):
                        print("Your guess is a bit less")
                    else :
                         print("You're correct!")
        elif (numg>myList[range1_2]) and (num>myList[range1_2]) :
            if (numg<(myList[range1_2]+range1_4)) and (numg>=(myList[range1_2]+range1_4))  :
                  print("Your guess is a bit less")
            elif (numg>=(myList[range1_2]+range1_4)) and (numg<(myList[range1_2]+range1_4))  :      
                  print("Your guess is a bit large")
            elif (numg>=(myList[range1_2]+range1_4)) and (numg>=(myList[range1_2]+range1_4))  :
                    if(numg>num):
                        print("Your guess is a bit large")
                    elif(numg<num):
                        print("Your guess is a bit less")
                    else :
                         print("You're correct!")
            elif (numg<(myList[range1_2]+range1_4)) and (numg<(myList[range1_2]+range1_4))  :
                    if(numg>num):
                        print("Your guess is a bit large")
                    elif(numg<num):
                        print("Your guess is a bit less")
                    else :
                         print("You're correct!")   
print(numg)