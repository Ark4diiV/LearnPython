#!/usr/bin/python3
# Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
# The string length will be at least 2.

def extra_end(str):
  l = len(str)
  return str[l-2:] + str[l-2:] + str[l-2:]

print(extra_end('Candy'))
print(extra_end('Hello'))
print(extra_end('Code'))