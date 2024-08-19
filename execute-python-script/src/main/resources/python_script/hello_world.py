# hello.py
import sys

def add(val1, val2):
    return val1+val2

if __name__ == "__main__":
    name = globals().get('name', None)
    print("Hello "+ name)

    names = globals().get('names', [])
    for name1 in names:
        print("Hello "+ name)

    person = globals().get('person', {})
    print("Hello I'm " + person["name"] + " and I'm " + str(person["age"]) + " years old")


