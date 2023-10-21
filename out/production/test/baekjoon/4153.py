def find_triangle(a,b,c):
    tri=[a,b,c]
    tri.sort()
    if tri[0]**2+tri[1]**2==tri[2]**2:
        return print("right")
    else:
        return print("wrong")
while(True):
    a,b,c=map(int,input().split())
    if a==0 or b==0 or c==0:
        break
    find_triangle(a,b,c)

    