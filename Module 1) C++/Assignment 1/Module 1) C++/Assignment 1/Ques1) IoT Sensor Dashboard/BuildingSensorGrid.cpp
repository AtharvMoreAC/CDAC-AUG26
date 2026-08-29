#include <iostream>
using namespace std;

int main() {

    double temperature[3][3];


    for (int floor = 0; floor<3;floor++){

        for (int room =0; room<3;room++){
            cout << "Enter temperature for Floor " << floor+1 << ", Room " << room+1 << ": ";
            cin >> temperature[floor][room];
        }
    }
        cout << "\tRooms1\tRooms2\tRooms3" << endl;
    for (int floor = 0; floor<3;floor++){
        cout << "Floor " << floor+1 << "\t";
        for (int room =0; room<3;room++){
            cout << temperature[floor][room] << "\t";
        }
        cout << endl;
    }

    // Hottest Room

    double hottest = temperature[0][0];
    int hotFloor = 0;
    int hottestRoom = 0;

    for (int floor = 0; floor < 3; floor++) {
        for (int room = 0; room < 3; room++) {
            if (temperature[floor][room] > hottest) {
                hottest = temperature[floor][room];
                hotFloor = floor;
                hottestRoom = room;
            }
        }
    }

    cout << "Hottest Room  : Floor " << hotFloor + 1 << ", Room " << hottestRoom + 1 << "--->"<< hottest << "C" << endl;

    // Hottest Floor and Average Temperature
    int hottestFloor = 0;
    double highestAverage = 0;

    for(int floor = 0; floor<3;floor++){
        double floorSum = 0;

        for(int room = 0; room<3;room++){
            floorSum += temperature[floor][room];

        }
        double floorAverage = floorSum/3;
        
        if (floorAverage > highestAverage){
            highestAverage = floorAverage;
            hottestFloor = floor;

        }

    }
        cout <<"Hottest Floor: Floor"<<hottestFloor + 1 << "avg" << highestAverage <<"C"<<endl;

        //Rooms at WARNING or above 
        
        int warningorabove=0;
        for (int floor = 0; floor<3;floor++){
            for (int room =0;room<3;room++){
                if (temperature[floor][room]>=30){
                    warningorabove++;
                }
            }
        }
        cout << "Rooms at WARNING or above : " << warningorabove << endl;
        return 0;
}