class Student:
    # Constructor
    def __init__(self, name, rollno, age, marks ):
        self.name = name
        self.rollno = rollno
        self.age = age
        self.marks = marks

    # Function to create and append new student
    def accept(self, rollno, name, age, marks):
        student = Student(name, rollno, age, marks)
        studentDetails.append(student)

    # Function to display student details
    def display(self, student):
        print("RollNo : ", student.rollno)
        print("Name : ", student.name)
        print("Age : ", student.age)
        print("Marks : ", student.marks)
        print("\n")

    # Search Function
    def search(self, rollno):
        for student in range(studentDetails.__len__()):
            if studentDetails[student].rollno == rollno:
                return student

    # Delete Function
    def delete(self, rollno):
        student = obj.search(rollno)
        if student is None:
            print("Student not Found.")
        else:
            del studentDetails[student]

    # Update Function
    def update(self, rollno, marks):
        student = obj.search(rollno)
        if student is None:
            print("Student not Found.")
        else:
            marks = marks
            studentDetails[student].marks = marks;


# Create a list to add Students
studentDetails = []
# an object of Student class
obj = Student('', 0, 0, 0)

ch = 'Y'

while ch == 'Y':
    print("\n MENU")
    print("1. Accept Student")
    print("2. Display Student")
    print("3. Search Student")
    print("4. Delete Student")
    print("5. Update Student")

    choice = int(input("Enter your Choice: "))
    if choice == 1:
        print("Enter Student Details")
        rollno = input("Enter Roll No: ")
        name = input("Enter Name: ")
        age = input("Enter Age: ")
        marks = input("Enter Marks: ")
        obj.accept(rollno, name, age, marks)

    elif choice == 2:
        if studentDetails.__len__() == 0:
            print("No Record Found.")
        else:
            print("\nList of Students\n")
            for i in range(studentDetails.__len__()):
                obj.display(studentDetails[i])

    elif choice == 3:
        rollno = input("Enter Roll No of Student to Search: ")
        student = obj.search(rollno)
        if student is None:
            print("Student not Found.")
        else:
            obj.display(studentDetails[student])

    elif choice == 4:
        rollno = input("Enter Roll No of Student to Delete: ")
        obj.delete(rollno)

    elif choice == 5:
        rollno = input("Enter Roll No of Student to Update: ")
        marks = input("Enter Marks of Student: ")
        obj.update(rollno, marks)

    else:
        print("Invalid Input")
        exit()

    ch = input("Do you want to Continue (Y or N): ")
