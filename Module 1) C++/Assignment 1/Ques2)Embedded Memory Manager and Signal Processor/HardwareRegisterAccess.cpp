#include <iostream>
using namespace std;

int main()
{
    int statusReg = 0b10110001;
    int controlReg = 0b00000000;
    int dataReg = 0b11001010;


    // regPtr1 - Pointer to const int
    const int* regPtr1 = &statusReg;

    cout << "Status Register : " << *regPtr1 << endl;

    // *regPtr1 = 10;
    // ERROR: Cannot modify the value through a pointer to const.

    // regPtr1 = &dataReg;
    // Repointing is allowed because the pointer itself is not const.


    // regPtr2 - Const pointer to int
    int* const regPtr2 = &controlReg;

    *regPtr2 = 50;

    cout << "Control Register : " << *regPtr2 << endl;

    // regPtr2 = &dataReg;
    // ERROR: Cannot repoint because the pointer itself is const.


    // regPtr3 - Const pointer to const int
    const int* const regPtr3 = &statusReg;

    cout << "Status Register through regPtr3 : "
         << *regPtr3 << endl;

    // *regPtr3 = 10;
    // ERROR: Cannot modify the value because it is const.

    // regPtr3 = &dataReg;
    // ERROR: Cannot repoint because the pointer itself is const.

    return 0;
}