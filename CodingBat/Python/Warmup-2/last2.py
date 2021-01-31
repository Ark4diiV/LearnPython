# Given a string, return the count of the number of times that a substring
# length 2 appears in the string and also as the last 2 chars of the string,
# so "hixxxhi" yields 1 (we won't count the end substring).


def last2(str):
    if len(str) < 2:
        return 0

    endstr = str[len(str) - 2:]
    counter = 0

    for i in range(len(str) - 2):
        substr = str[i:i + 2]
        if substr == endstr:
            counter += 1

    return counter


print(last2('hixxhi'))
print(last2('xaxxaxaxx'))
print(last2('axxxaaxx'))
