#!/usr/bin/python3
# Return the number of times that the string "hi" appears anywhere in the given string.

def count_hi(str):
  counter = 0
  for i in range(len(str)):
    if str[i:i+2] == 'hi': counter += 1
  return counter

print(count_hi('Hi is no HI on ahI'))
print(count_hi('hiho not HOHIhi'))
print(count_hi('hiHIhi'))