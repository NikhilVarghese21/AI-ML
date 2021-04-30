def count_occurrences(string, substring):
    # Initialize count and start to 0
    count = 0
    start = 0

    while start < len(string):
        # find() method finds the first occurrence of the specified value or returns -1 if not found.
        position = string.find(substring, start)
        if position != -1:
            start = position + 1
            count += 1
        else:
            break
    return count


# Driver Code
string = input("Enter String: ")
substring = input("Enter Pattern: ")

print("Total Substring in String = ", count_occurrences(string, substring))
