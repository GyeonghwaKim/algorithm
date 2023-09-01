arr=[list(map(int,input().split()))for _ in range(9)]
max=0
max_row=0
max_col=0
for i in range(9):
    for j in range(9):
        if max<=arr[i][j]:
            max=arr[i][j]
            max_row=i+1
            max_col=j+1
print(max)
print(max_row,max_col)
