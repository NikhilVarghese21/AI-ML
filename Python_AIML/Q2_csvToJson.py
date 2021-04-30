import csv
import json


# Function to convert a CSV to JSON which takes the file paths as arguments
def make_json(csvFilePath, jsonFilePath):

    data = {}

    # Open a csv reader called DictReader
    with open(csvFilePath, encoding='utf-8') as csvf:
        csvReader = csv.DictReader(csvf)

        # Convert each row into a dictionary and add it to data
        for rows in csvReader:
            # Setting the column named 'Username' to be the primary key
            key = rows['Username']
            data[key] = rows

    # Open a json writer, and use the json.dumps() to dump data
    with open(jsonFilePath, 'w', encoding='utf-8') as jsonf:
        jsonf.write(json.dumps(data, indent=4))


# Assigning File Paths
csvFilePath = 'Names.csv'
jsonFilePath = 'Names.json'

# Calling the make_json function
make_json(csvFilePath, jsonFilePath)
