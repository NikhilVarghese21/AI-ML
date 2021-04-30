
# Converting Key-Value list Dictionary to Lists of List Using list comprehension

Elements = {'id': [1, 2], 'name': ["Ronaldo", "Messi"], 'goat': [True, False]}

print("The original Dictionary is : ", Elements)

result = [[key] + val for key, val in Elements.items()]

print("The converted List is : ", result)
