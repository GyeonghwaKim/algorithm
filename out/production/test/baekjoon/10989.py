#계수정렬
import sys
input=sys.stdin.readline
lst=[0]*(10_000+1)
n=int(input())
for i in range(n):
    lst[int(input())]+=1

for j in range(len(lst)):
    if lst[j]!=0:
        for k in range(lst[j]):
            print(j)