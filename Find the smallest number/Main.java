#include<iostream>
int main()
{
  int a,b;
  std::cin>>a;
  std::cin>>b;
  (a<b)?std::cout<<a<<" is smallest number":std::cout<<b<<" is smallest number";
}