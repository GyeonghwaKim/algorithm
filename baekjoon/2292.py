n=int(input())
max=1
cnt=1
while True:
    if (n==1)or(n<=max):
        break
    max+=6*cnt
    cnt+=1
print(cnt)
