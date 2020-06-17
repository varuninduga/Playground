#include<iostream>
using namespace std;
int main()
{
  int a;
  float b;
  std::cin>>a>>b;
  if(a==2)
  {
    float c = (float)b*0.5;
    std::cout<<c+b;
  }
  if(a==3)
  {
    float d = (float)b*2;
    std::cout<<d;
  }
  if(a>3)
  {
    std::cout<<"Number of items is more";
  }
}