array = list()
n = input("Enter the number of elements in the array")
print("\nEnter the elements in the array");
for i in range(int(n)):
  n = input()
  array.append(int(n))
print("Enter the location where you wish to insert an element");
m=int(input())
if(m>len(array)):
  print("Invalid Input")
else:
  print("Enter the value to insert");
  p=int(input())
  array.insert(m-1,p)
  print("Array after insertion is")
  print(*array, sep="\n")
  