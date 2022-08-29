import sys

k = int(input())
myStack = []
ans = 0

for i in range(k) : 
    n = int(input())

    if n == 0 :
        myStack.pop()
    else :
        myStack.append(n)


result = sum(myStack)
print(result)