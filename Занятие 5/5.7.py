# -- coding: utf-8 --
x= int(input())
ys=0
while x!=0:
    y= int(input())
    if y!=0 and x<y:
        ys+=1
    x=y
print(ys)