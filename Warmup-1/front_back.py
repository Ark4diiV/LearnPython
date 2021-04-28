#!/usr/bin/python3
# Given a string, return a new string where the first and last chars have been exchanged.

def front_back(str):
  l = len(str)
  if l <= 1: return str 
  middle = str[1:l-1]
  return str[l-1:] + middle + str[:1]

print(front_back('code'))
print(front_back('a'))
print(front_back('ab'))
