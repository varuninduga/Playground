#include<iostream>
using namespace std;
int main()
{
  int a,b,c,e,f,g;
  std::cin>>a>>b>>c;
  e=75*b;
  f=30*c;
  g=e+f;
  if(g<=a)
  {
    std::cout<<"Boat is stable";
  }
  else
    std::cout<<"Boat will drow";
}