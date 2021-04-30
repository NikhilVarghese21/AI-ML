import json


class Employee:
    def __init__(self, empid, name, salary, department):
        self.empid = empid
        self.name = name
        self.salary = salary
        self.department = department


# main function
if __name__ == "__main__":

    # Employee objects
    emp1 = Employee("1001", "Ziyech", 100000, "Finance")
    emp2 = Employee("1002", "Ronaldo", 500000, "IT")
    emp3 = Employee("1003", "Thiago", 200000, "IT")

    # Converting to JSON format
    jsonEmp1 = json.dumps(emp1.__dict__)
    jsonEmp2 = json.dumps(emp2.__dict__)
    jsonEmp3 = json.dumps(emp3.__dict__)

    # printing created JSON objects
    print(jsonEmp1)
    print(jsonEmp2)
    print(jsonEmp3)
