import re
str = input()
result = re.sub(r'[^a-zA-Z]', "", str)
print(result)