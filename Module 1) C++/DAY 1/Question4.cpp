//Calculate power

#include <iostream>
using namespace std;
int main() {
   int base, power;
   int result = 1;

   cout << "Enter base: ";
   cin >> base;

   cout << "Enter power: ";
   cin >> power;

   for (int i = 1; i <= power; i++) {
       result = result * base;
   }
   cout << "Answer = " << result;
   return 0;
}
