# -- coding: utf-8 --
n=int(input())
a=2
if n<2:
    print("Значение числа не должно быть ниже 2")
else:
    while n % a != 0:
        a += 1
    print(a)
    