#include <iostream>
int main()
{
  int x, times=0;
  std::cin>>x;
  std::cout<<x<<"\n";
  while (x!=1)
  {
    if ((x%2)==1)
    {
      x=(3*x)+1;
      std::cout<<x<<"\n";
      times=times+1;
    }
    else
    {
      x=x/2;
      std::cout<<x<<"\n";
      times=times+1;
    }
  }
  std::cout<<times;
}