#!/usr/bin/python3
# Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

def make_abba(a, b):
  return a + b + b + a

print(make_abba('Yo', 'Alice'))
print(make_abba('aaa', 'bbb'))
print(make_abba('Bo', 'Ya'))