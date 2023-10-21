import sys
input=sys.stdin.readline
t=int(input())
lst=[]
for _ in range(t):
    val=input()
    if 'push_front' in val:
        lst.insert(0,int(val.split(' ')[1]))
    elif 'push_back' in val:
        lst.insert(len(lst),int(val.split(' ')[1]))
    elif 'pop_front' in val:
        if not lst:print(-1)
        else:
            print(lst[0])
            del lst[0]
    elif 'pop_back' in val:
        if not lst:print(-1)
        else:
            print(lst[-1])
            del lst[-1]
    elif 'size' in val:
        print(len(lst))
    elif 'empty' in val:
        if not lst:print(1)
        else: print(0)
    elif 'front' in val:
        if not lst: print(-1)
        else: print(lst[0])
    elif 'back' in val:
        if not lst:print(-1)
        else: print(lst[-1])