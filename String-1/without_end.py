#!/usr/bin/python3
# Given a string, return a version without the first and last char, so "Hello" yields "ell". 
# The string length will be at least 2.

def without_end(str):
  l = int(len(str))
  return str[1:l-1]

print(without_end('Chocolate!'))
print(without_end('coding'))
print(without_end('java'))
print(without_end('ab'))