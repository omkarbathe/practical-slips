import tkinter as tk
parent = tk.Tk()
parent.geometry('400x400')
parent.title("bold text")
my_label = tk.Label(parent, text="Hello", font=("Arial Bold", 70))
my_label.pack()
parent.mainloop()
