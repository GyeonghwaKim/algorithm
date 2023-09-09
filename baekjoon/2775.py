from functools import lru_cache as cache
import sys
input=sys.stdin.readline
@cache(maxsize=None)
def people_live(k,n):
    if n==0:
        return 0
    elif k==0:
        return n
    else:
        return people_live(k,n-1)+people_live(k-1,n)

t=int(input())
for i in range(t):
    k=int(input())
    n=int(input())

    print(people_live(k,n))

    
