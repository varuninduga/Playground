#include<iostream>
int fact(int x)
{
  if(x==0)
    return 1;
  else
    return (x*fact(x-1));
}
int main()
{
  int a;
  std::cin>>a;
  std::cout<<"The factorial of "<<a<<" is "<<fact(a);
}