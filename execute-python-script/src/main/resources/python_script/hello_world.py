# hello.py
import sys

def say_hello(name):
    print("Hello "+ name)

if __name__ == "__main__":
    name = globals().get('name', None)
    say_hello(name)

    names = globals().get('names', [])
    for name1 in names:
        say_hello(name1)
