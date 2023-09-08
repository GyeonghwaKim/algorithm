#부르트포스
import sys
input=sys.stdin.readline
num=1
cnt=0
n=int(input())
while True:
    if "666" in str(num):
        cnt+=1
    if cnt==n:
        print(num)
        break
    num+=1
