import sys

k = int(input())



for i in range(k) :
    myStack = list(input())
    sum = 0

    for i in myStack : 
        if i == "(" : 
            sum += 1
        if i == ")" :
            sum -= 1
        if sum < 0 :
            print("NO")
            break

    

    if sum > 0 : 
        print("NO")

    if sum == 0 :
        print("YES")
    

 
