# -- coding: utf-8 --
x=input()
print(x[:x.find('h')]+x[x.rfind('h')+1:])