import sys

N = int(input())

myList = [0] * 10001

for i in range(N):
    input_num = int(sys.stdin.readline())
    myList[input_num] = myList[input_num] + 1

for i in range(10001):
    if myList[i] != 0 :
        for j in range(myList[i]):
            print(i)

