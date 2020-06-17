#include<iostream>
using namespace std;
int power(int x,int y)
{
    if(y==0)
      return 1;
    else if(y==1)
      return x;
    else
      return (x*power(x,y-1));
}
int main()
{
  int a,n;
  std::cout<<"Enter the value of a"<<"\n";
  std::cin>>a;
  std::cout<<"Enter the value of n"<<"\n";
  std::cin>>n;
  std::cout<<"The value of "<<a<<" power "<<n<<" is "<<power(a,n);
}