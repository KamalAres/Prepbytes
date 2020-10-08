N = int(input())
count = 0
for i in range(N):
  ti,ci = map(int,input().split())
  if(ti+2<=ci):
    count += 1
    
print(count)
