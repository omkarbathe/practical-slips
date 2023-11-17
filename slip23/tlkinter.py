from tkinter import *
parent = Tk()
parent.geometry(400*400)
parent.title("-Welcome to Python tkinter Basic exercises-")
my_label = Label(parent, text="Hello", font=("Arial Bold", 70))
my_label.pack()
parent.mainloop()