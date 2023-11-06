# -- coding: utf-8 --
x=input()
fs=x.count('f')
if fs==0:
    print('В данной строке нет символа "f"')
elif fs==1:
    print('Индекс символа "f":',x.find('f'))
elif fs>1:
    print('Индекс первого символа "f":',x.find('f'),end=', '), print('индекс последнего символа "f":',x.rfind('f'))