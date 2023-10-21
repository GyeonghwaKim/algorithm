t=int(input())
xx=0
yy=0
for _ in range(t):
    h,w,n=map(int,input().split())
    xx=n%(h)
    if xx==0:
        xx=h
    yy=(n//h)+1
    if n%h==0:
        yy=n//h
    print(str(xx)+'{0:02d}'.format(yy),sep='')
