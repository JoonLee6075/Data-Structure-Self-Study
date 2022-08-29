import sys

sc = int(sys.stdin.readline())

myStack = []

for _ in range(sc) :
    word = sys.stdin.readline().split()
    order = word[0]

    if order == "push" : 
        value = word[1]
        myStack.append(value)
    
    elif order == "pop" : 
        if len(myStack) == 0 :
            print(-1)
        else :
            print(myStack.pop())

    elif order == "size" :
        print(len(myStack))
    elif order == "empty" : 
        if(len(myStack) == 0) : 
            print(1)
        else :
            print(0)
    elif order == "top" : 
        if(len(myStack) == 0) : 
            print(-1)
        else :
            print(myStack[-1])
    