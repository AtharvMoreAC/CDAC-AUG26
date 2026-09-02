#include <iostream>
#include <string>

using namespace std;

class Entity {
    private:
        string name;
        int health;
        int level;
        string types;

    public:

        Entity& setName(const string& name) {
            this->name = name;
            return *this;
        }

        Entity& setHealth(int health) {
            this->health = health;
            return *this;
        }

        Entity& setLevel(int level) {
            this->level = level;
            return *this;
        }

        Entity& setType(const string& types) {
            this->types = types;
            return *this;
        }

        string getName() const {
            return name;
        }

        int getHealth() const {
            return health;
        }

        int getLevel() const {
            return level;
        }

        string getType() const {
            return types;
        }

        void displayInfo() const {
            cout << "Name:" << name << endl;
            cout << "Health:" << health << endl;
            cout << "Level:" << level << endl;
            cout << "Types:" << types << endl;

        }

};

namespace Physics {
    double clamp(double value, double min, double max)
    {
        if(value < min)
            return min;

        if(value > max)
            return max;

        return value;
    }

    double lerp(double a, double b, double t) {
        return a + (b-a)*t;
    }
}

namespace GameMath {
    double clamp(double value, double min, double max)
    {
        if (value < min)
            return min;

        if (value > max)
            return max;

        return value;
    }

    double lerp(double a, double b, double t){
        return a + (b - a) * t;
    }
}

int main() {
    Entity player, enemy, item;
    player.setName("Aragorn").setHealth(100).setLevel(10).setType("Player");
    enemy.setName("orc").setHealth(60).setLevel(5).setType("Enemy");
    item.setName("HealthPotion").setHealth(0).setLevel(1).setType("Item");

    player.displayInfo();
    enemy.displayInfo();
    item.displayInfo();

    cout << "Physics clamp: " << Physics::clamp(120, 0, 100) << endl;
    cout << "Physics lerp: " << Physics::lerp(10, 20, 0.5) << endl;

    cout << "GameMath clamp: " << GameMath::clamp(-10, 0, 100) << endl;
    cout << "GameMath lerp: " << GameMath::lerp(20, 40, 0.5) << endl;

    {
    using namespace Physics;

    cout << "Clamp: " << clamp(150, 0, 100) << endl;
    cout << "Lerp: " << lerp(10, 20, 0.5) << endl;
    }

    int R, C;

    cout << "Enter rows: ";
    cin >> R;

    cout << "Enter columns: ";
    cin >> C;

    int** map = new int*[R];

    for (int i = 0; i < R; i++) {
    map[i] = new int[C];
    }

    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            cout << "Enter value for [" << i << "][" << j << "]: ";
            cin >> map[i][j];
    }
}

    cout << "\nMap:" << endl;
    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            cout << map[i][j] << " ";
    }

    cout << endl;
}

int count0 = 0;
int count1 = 0;
int count2 = 0;
int count3 = 0;
int count4 = 0;

for (int i = 0; i < R; i++) {
    for (int j = 0; j < C; j++) {
        if (map[i][j] == 0)
            count0++;
        else if (map[i][j] == 1)
            count1++;
        else if (map[i][j] == 2)
            count2++;
        else if (map[i][j] == 3)
            count3++;
        else if (map[i][j] == 4)
            count4++;
    }
}

cout << "\nTile 0: " << count0 << endl;
cout << "Tile 1: " << count1 << endl;
cout << "Tile 2: " << count2 << endl;
cout << "Tile 3: " << count3 << endl;
cout << "Tile 4: " << count4 << endl;

for (int i = 0; i < R; i++) {
    delete[] map[i];
}

delete[] map;

    return 0;

}


