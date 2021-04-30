Elements = []
try:
    totalElements = int(input("Enter the List Size: "))
    print("Enter Elements:")
    for elementCount in range(0, totalElements):
        print("Enter Number", elementCount,)
        item = int(input())
        Elements.append(item)

    print("Inserted Elements are: ", Elements)

    odd_count = len(list(filter(lambda element: (element % 2 != 0), Elements)))
    even_count = len(list(filter(lambda element: (element % 2 == 0), Elements)))

    print("Odd Numbers in the List: ", odd_count)
    print("Even Numbers in the List: ", even_count)

except Exception:
    print("Invalid Input.")
