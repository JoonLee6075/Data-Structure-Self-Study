import sys

n = int(input())
myCard = list(map(int, sys.stdin.readline().split()))
m = int(input())
checkCard = list(map(int, sys.stdin.readline().split()))

myCard.sort()

def binary_search(array,target, start, end):
    while start <= end:
        mid = (start + end)//2

        if array[mid] == target:
            return mid
        elif array[mid] > target:
            end = mid -1
        else:
            start = mid + 1
    return None
        
for i in range(m):
    if binary_search(myCard , checkCard[i] , 0 , n-1) is not None:
        print("1")
    else:
        print("0")

