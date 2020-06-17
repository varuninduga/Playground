#include<iostream>
int main()
{
  int a,b,gcd;
  std::cin >> a >> b;
  int i;
  for(i = 1; i <= a && i <= b; i++)
  {
    if((a % i == 0) && (b % i == 0))
    {
      gcd = i;
    }
  }
  std::cout << "G.C.D of "<< a << " and " << b << " = " << gcd;
  return 0;
}