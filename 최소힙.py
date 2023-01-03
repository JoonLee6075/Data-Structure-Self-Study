import sys
import heapq


num = int(input())
heap = []


for count in range(num):
    num = int(sys.stdin.readline())

    if num != 0:
        heapq.heappush(heap , num)
    else:
        try:
            print(heapq.heappop(heap))
        except:
            print(0)