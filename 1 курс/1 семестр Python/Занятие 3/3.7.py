# -- coding: utf-8 --
n = int(input())
x=1
y=0
for i in range(1, n + 1):
    x*= i
    y=y+x
print(y)