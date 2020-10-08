for _ in range(int(input())):
  hour,minutes = map(int,(input().split()))
  print(180 - abs(180 - abs(minutes*6 - ((hour*60+minutes)//2))))
