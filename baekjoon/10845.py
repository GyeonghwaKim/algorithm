'''15
push 1
push 2
front
back
size
empty
pop
pop
pop
size
empty
pop
push 3
empty
front'''
import sys
input=sys.stdin.readline
t=int(input())
lst=list()
for i in range(t):
    val=input()
    if 'push' in val:
        lst.append(int(val.split(' ')[1]))
    elif 'pop' in val:
        if not lst:print(-1)
        else:print(lst.pop(0))
    elif 'size' in val:
        print(len(lst))
    elif 'empty' in val:
        if not lst:print(1)
        else:print(0)
    elif 'front' in val:
        if not lst:print(-1)
        else: print(lst[0])
    elif 'back' in val:
        if not lst:print(-1)
        else: print(lst[-1])
