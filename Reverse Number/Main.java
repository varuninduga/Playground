#include <iostream>
#include<math.h>
int main()
{
  int n,rev=0,rem;
  std::cin>>n;
  while(n!=0)
  {
    rem = n % 10;
    rev = rev * 10 + rem;
    n = n / 10;
  }
  std::cout<<rev<<"\n";
  return 0;
}