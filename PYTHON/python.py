N = int(input()) #input N
array = [1,2,3,4,5,6,7,8,9]
for i in range(N) : #N times command input
    command = input()
    if command.split(" ")[0] == "print" : #command is being split at  " "(whitespaces), this makes new list containing contents of command.[0] represents index of array, since first string is determinign the command
        print(array)
    if command.split(" ")[0] == "sort" :
        array.sort()
    if command.split(" ")[0] == "pop" :
        array = array[:-1]
    if command.split(" ")[0] == "append" :
        array += [int(command.split(" ")[1])]
    if command.split(" ")[0] == "insert" : 
        array.insert(int(command.split(" ")[1]),int(command.split(" ")[2]))
    if command.split(" ")[0] == "remove" :
        array.remove(int(command.split(" ")[1]))
    if command.split(" ")[0] == "reverse" :
        array.reverse()
    