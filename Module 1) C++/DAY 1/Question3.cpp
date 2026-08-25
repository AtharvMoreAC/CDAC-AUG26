// Swap Numbers

#include <iostream>
using namespace std; 
int main(){
int a , b, c;
cout<<"Enter 1st number";
cin>>a;
cout<<"Enter 2nd number";
cin>>b;

c=a;
a=b;
b=c;
cout<<"1st num after swap = "<<endl<<a<<endl<<"2nd num after swap = "<<endl<<b;
return 0;
}
