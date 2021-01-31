# Given a non-empty string like "Code" return a string like "CCoCodCode".


def string_splosion(str):
    substr = ''
    for i in range(len(str)):
        substr += str[:i + 1]
    return substr


print(string_splosion('Code'))
print(string_splosion('abc'))
print(string_splosion('ab'))
