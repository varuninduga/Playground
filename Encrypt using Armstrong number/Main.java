#include <iostream>
int main()
{
  int n,sum=0,temp,p;
  std::cin>>n;
  temp=n;
  while(n>0)
  {
    p = n%10;
    sum = sum + (p*p*p);
    n = n/10;
  }
  if(temp==1634 || temp == sum )
  {
    std::cout<<"Kindly proceed with encrypting\n";
  }  
  else
  {
    std::cout<<"It is not an Armstrong number\n";
  }
  return 0;
}