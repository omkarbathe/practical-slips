import tkinter as tk

def select():
    color=var.get();
    root['bg']=color
    
root=tk.Tk();
root.title("Color change")
root.geometry("300x300")
var=tk.StringVar(root)
var.set('red')

choice=['red','blue','yellow','white']
option=tk.OptionMenu(root,var,*choice)
option.pack(side='left',padx=20,pady=10,anchor='nw')

button=tk.Button(root,text="check value selected",command=select)
button.pack(side='left',padx=20,pady=10,anchor='nw')

root.mainloop()
