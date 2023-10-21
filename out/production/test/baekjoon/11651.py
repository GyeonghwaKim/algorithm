import sys
input=sys.stdin.readline

n=int(input())
lst=[]
for i in range(n):
    x,y=map(int,input().split())
    lst.append([x,y])
lst.sort()
lst.sort(key=lambda x:x[1])


for a in lst:
    print(a[0],a[1])