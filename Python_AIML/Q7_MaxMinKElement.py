test_tup = (3, 7, 1, 18, 9)

print("The original tuple is : ", test_tup)

K = 2

# Maximum and Minimum K elements in Tuple using slicing and sorted()
List = list(test_tup)
sortedList = sorted(test_tup)
result = tuple(sortedList[:K] + sortedList[-K:])

print("The Minimum and Maximum K Elements are  : ", result)
