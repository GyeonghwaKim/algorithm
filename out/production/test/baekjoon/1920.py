n=int(input())
nlst=set(map(int,input().split()))
m=int(input())
mlst=list(map(int,input().split()))

for i in mlst:
    print(1) if i in nlst else print(0)