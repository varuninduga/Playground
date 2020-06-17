#include<iostream>
using namespace std;
int main()
{
  float a;
  int b,c;
  std::cin>>a>>b>>c;
  float d = a*b;
  if(d>=c){std::cout<<"Can reach";}
  else{std::cout<<"Cannot reach";}
}