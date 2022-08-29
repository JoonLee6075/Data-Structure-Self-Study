nums = input()

myList = []

myList = list(map(int, str(nums)))
myList.sort(reverse = True)

for i in myList:
    print(i , end="")