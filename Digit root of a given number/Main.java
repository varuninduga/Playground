#include <iostream>
int main()
{
  int number, result;
  std::cin>>number;
  if(number)
    result = number % 9 == 0 ? 9 : number % 9 ;
  else
    result = 0;
  std::cout<<result;
  return 0;
}