import sys
input=sys.stdin.readline

k,n=map(int,input().split())
arr=[0]*k
for i in range(k):
    arr[i]=int(input())
standard=max(arr)
res=0
def binary(low,high):
    if high<low:
        return
    global n
    global res
    mid=(low+high)//2
    temp=0
    for i in arr:
        temp+=i//mid
    if temp>=n:
        res=mid
        binary(mid+1,high)
    else:
        binary(low,mid-1)
binary(0,standard*2)
print(res)