#!/usr/bin/python3
# Given a non-empty string like "Code" return a string like "CCoCodCode".

def string_splosion(str):
  result = ""
  n = len(str)
  for i in range(n + 1):
    result = result + str[:i]
  return result

print(string_splosion('Code'))
print(string_splosion('abc'))
print(string_splosion('ab'))