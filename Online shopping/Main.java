#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g,h,i;
  std::cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  int a1=(a*b)/100;
  int a3=a-a1;
  int flip=a3+c;
  std::cout<<"In Flipkart Rs."<<flip<<"\n";
  int b1=(d*e)/100;
  int b3=d-b1;
  int snap=b3+f;
  std::cout<<"In Snapdeal Rs."<<snap<<"\n";
  int c1=(g*h)/100;
  int c3=g-c1;
  int amaz=c3+i;
  std::cout<<"In Amazon Rs."<<amaz<<"\n";
  if (flip <= snap && flip <= amaz) { std::cout<<"He will prefer Flipkart";}
  else if (snap < flip && snap < amaz) { std::cout<<"He will prefer Snapdeal";}
  else {std::cout<<"He will prefer Amazon";}
}