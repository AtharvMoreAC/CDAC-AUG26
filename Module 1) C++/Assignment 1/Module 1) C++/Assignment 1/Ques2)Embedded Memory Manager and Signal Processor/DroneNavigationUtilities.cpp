#include <iostream>
#include <cmath>
using namespace std;

inline double distanceBetween(double x1, double y1, double x2, double y2){
    return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
}

inline double toRadians(double degrees){
    return degrees * (M_PI / 180.0);
}

inline double clamp(double value, double minVal, double maxVal){
    if (value < minVal){
        return minVal;
    }
    else if (value > maxVal){
        return maxVal;
    }
    else{
        return value;
    }
}

inline bool isInSafeZone(double x, double y, double cx, double cy, double radius){
    return distanceBetween(x, y, cx, cy) <= radius;
}


int main(){
    double homeX = 0.0;
    double homeY = 0.0;

    double safeRadius = 50.0;

    double x1 = 10.0;
    double y1 = 20.0;

    double distance1 = distanceBetween(homeX, homeY, x1, y1);

    cout << "Waypoint 1 : (" << x1 << ", " << y1 << ")" << endl;
    cout << "Distance from Home : " << distance1 << endl;

    if (isInSafeZone(x1, y1, homeX, homeY, safeRadius)){
        cout << "Inside Safe Zone" << endl;
    }
    else{
        cout << "Outside Safe Zone" << endl;
    }

    double x2 = 30.0;
    double y2 = 40.0;

    double distance2 = distanceBetween(homeX, homeY, x2, y2);

    cout << "Waypoint 2 : (" << x2 << ", " << y2 << ")" << endl;
    cout << "Distance from Home : " << distance2 << endl;

    if (isInSafeZone(x2, y2, homeX, homeY, safeRadius)){
        cout << "Inside Safe Zone" << endl;
    }
    else{
        cout << "Outside Safe Zone" << endl;
    }

    double x3 = 60.0;
    double y3 = 30.0;

    double distance3 = distanceBetween(homeX, homeY, x3, y3);

    cout << "Waypoint 3 : (" << x3 << ", " << y3 << ")" << endl;
    cout << "Distance from Home : " << distance3 << endl;

    if (isInSafeZone(x3, y3, homeX, homeY, safeRadius)){
        cout << "Inside Safe Zone" << endl;
    }
    else{
        cout << "Outside Safe Zone" << endl;
    }

    return 0;
}