# -- coding: utf-8 --
x=input()
print(x[:x.find('h')]+x[x.rfind('h'):x.find('h'):-1]+x[x.rfind('h'):])