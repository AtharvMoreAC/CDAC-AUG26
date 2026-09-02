#include <iostream>
#include <string>
#include <iomanip>
using namespace std;

class Product {
private:
    int productId;
    string name;
    double price;
    int quantity;

public:

    void acceptDetails() {
        cout << "Enter Product ID: ";
        cin >> productId;

        cout << "Enter Product Name: ";
        cin >> name;

        cout << "Enter Price: ";
        cin >> price;

        cout << "Enter Quantity: ";
        cin >> quantity;
    }

    void displayDetails() const {
        cout << productId << "\t"
             << name << "\t"
             << fixed << setprecision(2) << price << "\t"
             << quantity << "\t"
             << totalValue();
    }

    double totalValue() const {
        return price * quantity;
    }

    bool isLowStock(int threshold) const {
        return quantity < threshold;
    }

    string getName() const {
        return name;
    }
};

// Function Overloading
double reorderCost(int qty, double unitPrice) {
    return qty * unitPrice;
}

double reorderCost(double qty, double unitPrice) {
    return qty * unitPrice;
}

double reorderCost(int qty, double unitPrice, double taxRate) {
    double cost = qty * unitPrice;
    return cost + (cost * taxRate / 100);
}

// Default Argument
double applyDiscount(double price, double discountPercent = 10.0) {
    return price - (price * discountPercent / 100);
}

int main() {
    Product products[5];

    for (int i = 0; i < 5; i++) {
        cout << "\nEnter details for Product " << i + 1 << endl;
        products[i].acceptDetails();
    }


    int threshold;
    cout << "\nEnter Low Stock Threshold: ";
    cin >> threshold;

    cout << "\n===== INVENTORY REPORT =====" << endl;

    cout << "ID\tName\tPrice\tQty\tTotal Value" << endl;

    for (int i = 0; i < 5; i++) {
        products[i].displayDetails();

        if (products[i].isLowStock(threshold)) {
            cout << "  LOW STOCK";
        }

        cout << endl;
    }

    int highestIndex = 0;

    for (int i = 1; i < 5; i++) {
        if (products[i].totalValue() >
            products[highestIndex].totalValue()) {
            highestIndex = i;
        }
    }

    cout << "\nHighest Value Product : " << products[highestIndex].getName()
         << " (Rs. "
         << products[highestIndex].totalValue()
         << ")" << endl;

    cout << "\nLow Stock (threshold: " << threshold << ") : ";

    for (int i = 0; i < 5; i++) {
        if (products[i].isLowStock(threshold)) {
            cout << products[i].getName() << " ";
        }
    }

    cout << "\n===== REORDER COST =====" << endl;

    cout << "Integer Quantity : " << reorderCost(10, 50.0) << endl;
    cout << "Fractional Quantity : " << reorderCost(2.5, 100.0) << endl;
    cout << "With Tax : " << reorderCost(10, 50.0, 18.0) << endl;

    cout << "\n===== DISCOUNT =====" << endl;

    cout << "Default Discount (10%) : " << applyDiscount(1000.0) << endl;
    cout << "Custom Discount (20%) : " << applyDiscount(1000.0, 20.0) << endl;

    return 0;
}