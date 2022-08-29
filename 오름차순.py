n = int(input())
myArray = []


for i in range(n):
   myArray.append(int(input()))

myArray.sort()
for j in myArray:
    print(j)