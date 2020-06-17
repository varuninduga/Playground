#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  int m1[10][10],m2[10][10],res[10][10];
  int i,j;
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
      cin>>m1[i][j];
    }
  }
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
      cin>>m2[i][j];
    }
  }
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
      res[i][j]=m1[i][j]+m2[i][j];
    }
  }
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
      cout<<res[i][j]<<" ";
    }
    cout<<"\n";
  }
}