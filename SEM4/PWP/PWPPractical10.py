from sqlite3 import *

conn = connect('C:/RAJ/CollegeWork/SEM4/PWP/Test.db')
print("DataBase connected...")

# conn.execute('create table Result(Student_Name varchar(20), Enrollment int, Semester int, Branch varchar(10), Subject varchar(10), Grade int)')
print("Table created.")

# conn.execute('insert into Result values ("Raj D. Patel", 81, 4, "I.T.", "PWP", "O")')
# conn.execute('insert into Result values ("Ayush A Vadiya", 40, 4, "I.T.", "PWP", "A+")')
# conn.execute('insert into Result values ("Sarfaraz Master", 83, 4, "I.T.", "PWP", "A")')
# conn.execute('insert into Result values ("Shivang Tailor", 139, 4, "I.T.", "PWP", "A+")')

print("Inserted Into Table.")

cur = conn.execute('select Student_Name, Enrollment, Semester, Branch, Subject, Grade from Result')

for row in cur:
    print()
    print("Name: ", row[0])
    print("Enrollment: ", row[1])
    print("Semester: ", row[2])
    print("Branch: ", row[3])
    print("Subject: ", row[4])
    print("Grade: ", row[5])
    print()

conn.commit()