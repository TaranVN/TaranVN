# — coding: utf-8 —
x=input()
a=x.find('f')
fs=x.count('f')
if fs==0:
    print('-2')
elif fs==1:
    print('-1')
elif fs>1:
    print('Индекс второго вхождения "f":',x.find('f',a+1))