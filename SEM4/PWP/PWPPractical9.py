from tkinter import *

root = Tk()
root.title("Practical 9")

def Write():
    with open("C:/RAJ/CollegeWork/SEM4/PWP/Test1.txt", 'w') as F1:
        F1.write(data_entry.get("1.0","end-1c"))
        print(data_entry.get("1.0","end-1c"))

data_entry = Text(root, border=0)
data_entry.pack(padx=20, pady=20)

data_submit = Button(root, text="Submit", command=Write)
data_submit.pack(padx=20, pady=20)

root.mainloop()