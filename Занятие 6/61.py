# -- coding: utf-8 --
from tkinter import *


window = Tk()
window.title("Занятие 6")
window.geometry('1000x400')
tab_control = ttk.Notebook(window)
tab1 = ttk.Frame(tab_control)
tab2 = ttk.Frame(tab_control)
tab3 = ttk.Frame(tab_control)
tab4 = ttk.Frame(tab_control)
tab5 = ttk.Frame(tab_control)
tab6 = ttk.Frame(tab_control)
tab7 = ttk.Frame(tab_control)

def z1(): 
    n = int(txt1.get())
    i = 1
    rez = "Ответ: "
    while i ** 2 <= n:
        rez = rez + str(i) + ", "
        i += 1    
    lb1.configure(text=rez)
    
tab_control.add(tab1, text='Квадраты') 
tab_control.pack(expand=1, fill='both')
lb1 = Label(tab1, text="По данному целому числу программа распечатает все квадраты натуральных чисел, не превосходящие число, в порядке возрастания.", font=("Arial Bold", 10))
lb1.grid(column=0, row=0)
txt1 = Entry(tab1, width=15)
txt1.grid(column=0, row=1, sticky=W)
txt1.place(x=20, y=20)
b1 = Button(tab1, text="Вычислить", width=10, command=z1,)
b1.grid(column=3, row=1)
b1.place(x=150, y=20)


def z2(): 
    n = int(txt2.get())
    i = 2
    
    while n % i != 0:
        i += 1    
    rez = "Ответ: " + str(i)
    lb2.configure(text=rez)
    
    
tab_control.add(tab2, text='Делитель') 
tab_control.pack(expand=1, fill='both')
lb2 = Label(tab2, text="Введите целое число, не меньшее 2. Программа выведет его наименьший натуральный делитель, отличный от 1.", font=("Arial Bold", 10))
lb2.grid(column=0, row=0)
txt2 = Entry(tab2,width=15)
txt2.grid(column=1, row=0) 
txt2.place(x=20, y=20)
b2 = Button(tab2, text="Вычислить", width=10, command=z2)
b2.grid(column=3, row=1)
b2.place(x=150, y=20)


def z3(): 
    n = int(txt3.get())
    m = 0
    rez = "Ответ: "
    while 2 ** m < n:
        m += 1
    rez = rez + str(m - 1)        
    lb31.configure(text=rez)


tab_control.add(tab3, text='Степень') 
tab_control.pack(expand=1, fill='both')
lb31 = Label(tab3, text="По данному натуральному числу программа найдет наибольшую целую степень двойки, не превосходящую N, и выведет показатель степени и саму степень.", font=("Arial Bold", 10))
lb31.grid(column=0, row=0)
txt3 = Entry(tab3,width=15)
txt3.grid(column=0, row=1)
txt3.place(x=50, y=20)
b3 = Button(tab3, text="Вычислить",  width=10, command=z3)
b3.grid(column=1, row=1)
b3.place(x=150, y=20)


def z4(): 
    x = int(txt4.get())
    y = int(txt41.get())
    i = 1
    rez = "Ответ: "
    while x < y:
        x *= 1.1
        i += 1
    rez = rez + str(i)  
    lb4.configure(text=rez)
    
    
tab_control.add(tab4, text='Спортсмен') 
tab_control.pack(expand=1, fill='both')
lb4 = Label(tab4, text="В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 10% от предыдущего значения. \n По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров. \n Программа получает на вход действительные числа x и y и должна вывести одно натуральное число.", font=("Arial Bold", 10))
lb4.grid(column=0, row=0)
lb4x = Label(tab4, text="Введите натуральное число х: ")  
lb4x.grid(column=0, row=2)
lb4x.place(x=30, y=50)
txt4 = Entry(tab4,width=15)
txt4.grid(column=1, row=2)
txt4.place(x=200, y=50)
lb4y = Label(tab4, text="Введите натуральное число y: ")  
lb4y.grid(column=0, row=3)
lb4y.place(x=30, y=80)
txt41 = Entry(tab4,width=15)
txt41.grid(column=1, row=3)
txt41.place(x=200, y=80)
b4 = Button(tab4, text="Вычислить", width=10, command=z4)
b4.grid(column=0, row=4)
b4.place(x=30, y=120)

len=0
nn=""
def z5():
    global len, nn
    

    n = int(txt5.get())
    txt5.delete(0,END)

    if n != 0 :
        len = len + 1
        nn = nn + str(n) + ", "
    else:    
        rez = "Ответ: " + str(len)
        lbl5.configure(text=rez)
        l5.configure(text=nn)
        len = 0
        nn = ""
    
tab_control.add(tab5, text='Количество') 
tab_control.pack(expand=1, fill='both')
lb5 = Label(tab5, text="Программа получает на вход последовательность целых неотрицательных чисел, каждое число записано в отдельной строке. \n Последовательность завершается числом 0, при считывании которого программа должна закончить \n  свою работу и вывести количество членов последовательности (не считая завершающего числа 0).", font=("Arial Bold", 10))
lb5.grid(column=0, row=0)
txt5 = Entry(tab5,width=15)
txt5.grid(column=1, row=0)
txt5.place(x=30, y=80)
b5 = Button(tab5, text="Ввод", width=10, command=z5)
b5.grid(column=2, row=0)
b5.place(x=30, y=120)
l5 = Label(tab5, text="")  
l5.grid(column=0, row=2) 
lbl5 = Label(tab5, text=" ")  
lbl5.grid(column=0, row=3)

next = 0
bfr = 0
max1 = 0

def z6():
    global len, next, nn
    

    n = int(txt6.get())
    txt6.delete(0,END)
     
    if n != 0 :
        len = len + 1 
        next = next + n
    else:    
        rez = "Ответ: " + str(next / (len + 1))
        lbl6.configure(text=rez)
        l6.configure(text=nn)
        len  = 0 
        next = 0
        dano = ""


tab_control.add(tab6, text='Среднее значение') 
tab_control.pack(expand=1, fill='both')
lb6 = Label(tab6, text="Программа определит среднее значение всех элементов последовательности, завершающейся числом 0.", font=("Arial Bold", 10))
lb6.grid(column=0, row=1)
txt6 = Entry(tab6,width=15)
txt6.grid(column=1, row=2)
txt6.place(x=30, y=30)
b6 = Button(tab6, text="Ввод", width=10, command=z6)
b6.grid(column=1, row=2)
b6.place(x=150, y=25)
l6 = Label(tab6, text="")  
l6.grid(column=0, row=2)
lbl6 = Label(tab6, text="Ответ: ")  
lbl6.grid(column=0, row=3)
lbl6.place(x=30, y=50)



window.mainloop()
