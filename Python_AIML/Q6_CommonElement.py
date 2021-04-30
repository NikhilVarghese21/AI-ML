list1 = []
list2 = []

try:
    totalElements_list1 = int(input("Enter the Size of List 1: "))
    print("Enter Elements:")
    for elementCount in range(0, totalElements_list1):
        print("Enter Number", elementCount)
        item = int(input())
        list1.append(item)

    totalElements_list2 = int(input("Enter the Size of List 2: "))
    print("Enter Elements:")
    for elementCount in range(0, totalElements_list2):
        print("Enter Number", elementCount)
        item = int(input())
        list2.append(item)

    print("Elements in List 1: ", list1)
    print("Elements in List 2: ", list2)

    flag = 0

    for element in list1:
        if element in list2:
            flag = 1

    # checking condition
    if flag == 1:
        print("There is a common element in List 1 and List 2.")
    else:
        print("There is no common element in List 1 and List 2.")

except Exception:
    print("Invalid Input.")
