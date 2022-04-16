#!/usr/bin/python3
# Given a string of even length, return the first half. 
# So the string "WooHoo" yields "Woo".

def first_half(str):
    l = int(len(str)/2)
    return (str[:l])

print(first_half('HelloThere'))
print(first_half(''))
print(first_half('0123456789'))