# -- coding: utf-8 --
n=int(input())
if n>9:
    print('Число не должно быть больше девяти')
for i in range(1, n+1):
    for a in range(1, i+1):
        print(a, sep='', end='')