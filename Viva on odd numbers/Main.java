#include<iostream>
int main()
{
  int a,n=0;
  float s=0.0;
  do
  {
    std::cin>>a;
    if(a%2!=0&&a>0)
    {
      s=s+1;
      n=n+1;
    }
    else if(a%2==0&&a>0)
    {
      s=s-0.5;
    }
    else if(a<0)
    {
      s=s-1.0;
      break;
    }
  }while(n<3);
  std::cout<<s;
}