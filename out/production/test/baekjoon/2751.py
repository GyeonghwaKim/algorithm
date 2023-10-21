import sys
input=sys.stdin.readline

n=int(input())
lst=[]
for i in range(n):
    lst.append(int(input()))
for a in sorted(lst):
    print(a)
