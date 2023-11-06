# -- coding: utf-8 --
A=int(input())
B=int(input())
if B>A:
    print('Первое число должно быть больше второго')
else:
    for i in range (A, B-1, -1):
        if i%2==1:
            print(i)