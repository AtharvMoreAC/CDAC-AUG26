//Calculate simple interest

#include <iostream>
using namespace std;
int main(){
	int p,r,t;
	cout<<"Enter the Amount :";
	cin>>p;

	cout<<"Enter the rate of Interest :";
	cin>>r;

	cout<<"Enter the Years :";
	cin>>t;

	cout<<"The Simple Interest Amount is :"<<p*t*r/100;
	return 0;
}
