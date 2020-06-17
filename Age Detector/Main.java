#include<iostream>
int main()
{
  int a,b;
  std::cin>>a>>b;
  if(a>b)
  {
    int x = 1900+a;
    int y = 2000+b;
    int c = abs(x-y);
    std::cout<<c;
  }
  else
  {
    int x = 2000+a;
    int y = 2000+b;
    int d = abs(y-x);
    std::cout<<d;
  }
}