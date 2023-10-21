import sys
input=sys.stdin.readline
lst=[]
n=int(input())
for i in range(n):
    x,y=map(int,input().split())
    lst.append([x,y])
lst.sort()
for a in lst:
    print(a[0],a[1])