import sys
import json

# Get the argument passed from Java
name = sys.argv[1]
personList = sys.argv[2]

# Print the argument (this will be captured by Java)
# Return a result back to Java
result = "Hello " + name
print(result)

python_obj = json.loads(personList)
for obj in python_obj:
    print("Hello, I'm " + obj["name"] + " and I'm " + str(obj["age"]) + " years old")