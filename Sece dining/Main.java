#include<iostream>
#include<string.h>
int main()
{
  char a[10];
  int b;
  std::cin>>a;
  std::cin>>b;
  if((strcmp(a,"front")==0) && b==1)
    std::cout<<"Left Handed";
  else if((strcmp(a,"rear")==0) && b==1)
    std::cout<<"Right Handed";
  else if((strcmp(a,"front")==0) || b==2)
    std::cout<<"Right Handed";
  else if((strcmp(a,"rear")==0) || b==2)
    std::cout<<"Left Handed";
  else
    std::cout<<"Left Handed";
}