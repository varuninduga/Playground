#include <iostream>
int main()
{
  int flag=0;
  int n,i,j;
  std::cin>>n;
  int s=0;
  int l=n+1;
  int m,k;
  m=n;
  for(int i=1;i<=n;i++)
  {
    for(int j=2;j<l;j++)
    {
      if(i%2!=0)
      {
        std::cout<<i;
        k=i;
        flag=1;
        s=j;
        if(s==m)
        {
          std::cout<<++k;
        }
      }
      if(i%2==0)
      {
        std::cout<<i;
        flag=0;
      }
    }
    std::cout<<"\n";
    if(i<n)
    {
      if(flag==1)
      {
        std::cout<<++k;
      }
    }
  }
  return 0;
}