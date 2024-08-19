import sys

# Get the argument passed from Java
arg_from_java = sys.argv[1]

# Print the argument (this will be captured by Java)
print("Received argument: " + arg_from_java)

# Return a result back to Java
result = "Hello from Python"
print(result)