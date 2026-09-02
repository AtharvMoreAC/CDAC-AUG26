#include <iostream>
using namespace std;

int main() {
    int n;

    cout << "Enter number of readings: ";
    cin >> n;

    double readings[100];

    for (int i = 0; i < n; i++){
        cout << "Enter reading " << i + 1 << ": ";
        cin >> readings[i];
    }

    cout << "Valid readings : ";

    int skipped = 0;

    for (int i = 0; i < n; i++) {
        if (readings[i] < 0)
 {
            skipped++;
            continue;
        }

        cout << readings[i] << " ";
    }

    cout << endl;
    cout << "Skipped (errors) : " << skipped << endl;

    for (int i = 0; i < n; i++) {
        if (readings[i] >= 45) {
            cout << "First CRITICAL : Index " << i
                 << " -> " << readings[i] << "C" << endl;

            break;
        }
    }

    double min = 0;
    double max = 0;
    double sum = 0;

    int validCount = 0;

    for (int i = 0; i < n; i++) {
        if (readings[i] < 0)
        {
            continue;
        }

        if (validCount == 0)
        {
            min = readings[i];
            max = readings[i];
        }

        if (readings[i] < min)
        {
            min = readings[i];
        }

        if (readings[i] > max)
        {
            max = readings[i];
        }

        sum = sum + readings[i];
        validCount++;
    }

    double average = sum / validCount;

    cout << "Min : " << min << "C" << endl;
    cout << "Max : " << max << "C" << endl;
    cout << "Avg : " << average << "C" << endl;

    int normal = 0;
    int warning = 0;
    int critical = 0;
    int shutdown = 0;

    for (int i = 0; i < n; i++)
    {
        if (readings[i] < 0)
        {
            continue;
        }
        else if (readings[i] < 30)
        {
            normal++;
        }
        else if (readings[i] < 45)
        {
            warning++;
        }
        else if (readings[i] < 60)
        {
            critical++;
        }
        else
        {
            shutdown++;
        }
    }

    cout << "NORMAL : " << normal << endl;
    cout << "WARNING : " << warning << endl;
    cout << "CRITICAL : " << critical << endl;
    cout << "SHUTDOWN : " << shutdown << endl;

    return 0;
}