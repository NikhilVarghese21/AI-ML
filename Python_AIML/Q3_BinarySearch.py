
def binary_search_recursive(arr, low, high, value):
    # Check base case
    if high >= low:
        mid = (high + low) // 2

        # If element to be searched is present at middle.
        if arr[mid] == value:
            return mid

        # If element is smaller than mid, then calling function again with left sub array.
        elif arr[mid] > value:
            return binary_search_recursive(arr, low, mid - 1, value)

        # If element is larger than mid, then calling function again with right sub array.
        else:
            return binary_search_recursive(arr, mid + 1, high, value)
    else:
        # returning -1 when element is not present in array
        return -1


def binary_search_iterative(arr, value):
    low = 0
    high = len(arr) - 1
    mid = 0

    while low <= high:

        mid = (high + low) // 2

        # If value is greater than middle, ignore left half
        if arr[mid] < value:
            low = mid + 1

        # If value is smaller than middle, ignore right half
        elif arr[mid] > value:
            high = mid - 1

        # when value is present at middle
        else:
            return mid

    # returning -1 when value is not present in array
    return -1


# Driver code
Elements = []
try:
    totalElements = int(input("Enter the List Size: "))
    print("Enter Sorted Elements:")
    for elementCount in range(0, totalElements):
        print("Enter Number", elementCount)
        item = int(input())
        Elements.append(item)

    Elements.sort()

    print("Elements Inserted are: ", Elements)
    searchValue = int(input("Enter Element to Search: "))

    # Function calls
    print("\nBinary Search using Recursion: ")
    resultRecursive = binary_search_recursive(Elements, 0, len(Elements)-1, searchValue)

    if resultRecursive != -1:
        print("Element is present at Index", str(resultRecursive))
    else:
        print("Element is not present in List.")

    print("\nBinary Search Iterative: ")
    resultIterative = binary_search_iterative(Elements, searchValue)

    if resultIterative != -1:
        print("Element is present at Index", str(resultIterative))
    else:
        print("Element is not present in List.")

except Exception:
    print("Invalid value.")
