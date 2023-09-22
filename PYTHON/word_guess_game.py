import random
names = ["yash","kunal","aakash","sumit"]
name = random.choice(names)
X = [*name]
gx = []
for x in range(len(X)) :
    gx.append("_")
for i in range(len(X)) :
    while(gx!=X) :
    
            gx.append(input("Enter a character : "))
            if (gx[i] == X[i]) :
                print("That's a correct guess!")
                gx[i] = X[i]
                print(gx)
                continue
            else :
                print("That was as wrong guess, guess the character again")
                print(gx)


                
            
                


