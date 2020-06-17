#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int a,i;
  cin>>a;
  int male=0,female=0;
  int *arr=(int*)malloc(a*sizeof(int));
  for(i=0;i<a;i++){
    cin>>arr[i];
  }
  for(i=0;i<a;i++){
    if(arr[i]%2!=0){
      male++;
    }
    else if(arr[i]%2==0){
      female++;
    }
  }
  cout<<male<<"\n";
  cout<<female;
  return 0;
}