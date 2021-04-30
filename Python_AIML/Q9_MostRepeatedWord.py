count = 0
word = ""
maxCount = 0
words = []

# Opening Text file in read mode
file = open("Text", "r")

# Gets each line till end of file is reached
for line in file:
    # Splits each line into words
    string = line.split(" ")
    # Appending each word in string to words.
    for s in string:
        words.append(s)

    # Checking the most repeated word in a file
for i in range(0, len(words)):
    count = 1
    # Checks for the count of ith word in the file.
    for j in range(i + 1, len(words)):
        if words[i] == words[j]:
            count = count + 1

    # If maxCount is less than count then storing value of count in maxCount and corresponding word to variable word
    if count > maxCount:
        maxCount = count
        word = words[i]

print("Most Repeated Word is : ", word)
file.close()
