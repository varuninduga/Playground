#include<iostream>
#include<math.h>
int main()
{
  int a;
  std::cin>>a;
  int b = (1/sqrt(a))*a;
  int c = a + b + 1;
  std::cout<<c;
}