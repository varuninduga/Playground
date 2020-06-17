#include<iostream>
int main()
{
  int n = 3,n1,i,j;
  std::cin >> n1;
  for(i=1;i<=n+1;i++)
  {
    for(j=1;j<=i;j++)
      std::cout<<n1;
    n1++;
    std::cout<<"\n";
  }
  n1--;
  for(i=n+1;i>=1;i--)
  {
    for(j=1;j<=i;j++)
      std::cout<<n1;
    n1--;
    std::cout<<"\n";
  }
}