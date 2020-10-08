def isFascinating(num):
  a = int(str(num)[0])
  b = int(str(num)[1])
  c = int(str(num)[2])
  d = int(str(num)[3])
  if((a!=b)and(a!=c)and(a!=d)):
    if((b!=c)and(b!=d)):
      if(c!=d):
        return True
      else:
        return False
    else:
      return False
  else:
    return False
T = int(input())
for _ in range(T):
  N = int(input())
  N = N+1;
  while(isFascinating(N)==False):
    N = N+1
    
  print(N)
  
