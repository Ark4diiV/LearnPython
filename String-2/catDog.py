#!/usr/bin/python3
# Return true if the string "cat" and "dog" appear the same number of times in the given string.

def cat_dog(str):
  catCounter = 0
  dogCounter = 0
  for i in range(len(str)):
    if str[i:i+3] == 'cat': catCounter += 1
    if str[i:i+3] == 'dog': dogCounter += 1
  return (catCounter == dogCounter)

print(cat_dog('1cat1cadodog'))
print(cat_dog('catxdogxdogxcat'))
print(cat_dog('dogdogcat'))