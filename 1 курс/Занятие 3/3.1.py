# -- coding: utf-8 --
A = int(input())
B = int(input())
if A >= B:
    print('Первое число не должно быть больше второго')
for i in range (A, B+1):
    print(i)