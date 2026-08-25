//Calculate compound interest

#include <iostream>
using namespace std;
int main() {

    double P, R, T;
    double A, CI;

    cout << "Enter Principal Amount: ";
    cin >> P;
    cout << "Enter Rate of Interest: ";
    cin >> R;
    cout << "Enter Time in Years: ";
    cin >> T;

    A = P;

    for (int i = 1; i <= T; i++) {
        A = A * (1 + R / 100);
    }

    CI = A - P;
    cout << "Final Amount = " << A << endl;
    cout << "Compound Interest = " << CI << endl;
    return 0;
}
