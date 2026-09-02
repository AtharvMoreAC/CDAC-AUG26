#include <iostream>
#include <string>
using namespace std;

class Patient {
private:
    int patientId;
    string name;
    int age;
    string ward;
    const string bloodGroup;

public:

    Patient() : bloodGroup("o+") {
        patientId = 0;
        name = "Unknown";
        age = 0;
        ward = "General";

        cout << "[Constructor] Default patient registered" << endl;

    }

    Patient(int id, const string& patientName) : bloodGroup("O+") {
    patientId = id;
    name = patientName;
    age = 0;
    ward = "General";

    cout << "[Constructor] Emergency: " << name << endl;
}

    Patient(int id, const string& patientName, int patientAge,
        const string& patientWard, const string& bg) : bloodGroup(bg)
{
    patientId = id;
    name = patientName;
    age = patientAge;
    ward = patientWard;

    cout << "[Constructor] Full admission: " << name << endl;
}

void displayRecord() const {
    cout << "\nPatient Record:" << endl;
    cout << "ID : " << patientId << endl;
    cout << "Name : " << name << endl;
    cout << "Age : " << age << endl;
    cout << "Ward : " << ward << endl;
    cout << "Blood Grp : " << bloodGroup << endl;
}

void transferWard(const string& newWard) {
    ward = newWard;
    cout << "Ward Transfer: " << name << " -> " << ward << endl;
}

~Patient() {
    cout << "[Destructor] Patient " << name << " discharged." << endl;
}

};

int main() {
    Patient p1;
    Patient p2(1001, "Raj Patel");
    Patient p3(1002, "Meera Joshi", 34, "Cardiology", "B+");

    Patient* patients = new Patient[4];

    for (int i = 0; i < 4; i++) {
        patients[i].displayRecord();
    }

    p2.transferWard("ICU");

    delete[] patients;


    return 0;
}