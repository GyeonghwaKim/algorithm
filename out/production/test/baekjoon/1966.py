import sys
from collections import deque
input=sys.stdin.readline

t=int(input())
for i in range(t):
    n,m=map(int,input().split())
    queue=deque(list(map(int,input().split())))
    count=0
    while queue:
        maxNum=max(queue)
        front=queue.popleft()
        m-=1
        if maxNum==front:
            count+=1
            if m<0:
                print(count)
                break
        else:
            queue.append(front)
            if m<0:
                m=len(queue)-1



'''3
1 0
5
4 2
1 2 3 4
6 0
1 1 9 1 1 1'''

