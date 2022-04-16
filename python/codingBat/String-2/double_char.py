#!/usr/bin/python3
# Given a string, return a string where for every char in the original, there are two chars.

def double_char(str):
  newStr = ""
  for i in range(len(str)):
    newStr = newStr + str[i:i+1] + str[i:i+1]
  return newStr

print(double_char('Hi-There'))
print(double_char('Word!'))
print(double_char('aa'))