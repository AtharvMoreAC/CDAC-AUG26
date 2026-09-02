#include <iostream>
#include <string>
using namespace std;

// Employee class
class Employee
{
private:

    // Private data members
    int empId;
    string name;
    string department;
    char grade;
    double basicSalary;
    bool isActive;

    // Shared across all objects - counts total employees created
    static int employeeCount;

public:

    // Default Constructor
    Employee()
    {
        employeeCount++; // Generate employee ID

        // 1st employee = 1001, 2nd employee = 1002
        empId = 1000 + employeeCount;

        // New employee is active by default
        isActive = true;
    }


    // Set employee name
    void setName(const string& n)
    {
        if (n.empty()) // Check if name is empty
        {
            cout << "ERROR: Name cannot be empty." << endl;
        }
        else
        {
            name = n;
        }
    }


    // Set employee department
    void setDepartment(const string& dept)
    {
        // Only these departments are allowed
        if (dept == "Engineering" ||
            dept == "HR" ||
            dept == "Finance" ||
            dept == "Operations")
        {
            department = dept;
        }
        else
        {
            cout << "ERROR: '" << dept
                 << "' is not a registered department." << endl;
        }
    }


    // Set employee grade
    void setGrade(char g)
    {
        // Only grades A, B, C and D are allowed
        if (g == 'A' || g == 'B' || g == 'C' || g == 'D')
        {
            grade = g;
        }
        else
        {
            cout << "ERROR: Invalid grade '" << g
                 << "'. Accepted values: A, B, C, D." << endl;
        }
    }


    // Set basic salary
    void setBasicSalary(double salary)
    {
        // Salary must be between 10,000 and 5,00,000
        if (salary > 10000 && salary < 500000)
        {
            basicSalary = salary;
        }
        else
        {
            cout << "ERROR: Salary must be between Rs.10000 and Rs.500000."
                 << endl;
        }
    }


    // Getter functions
    int getEmpId() const
    {
        return empId;
    }

    string getName() const
    {
        return name;
    }

    string getDepartment() const
    {
        return department;
    }

    char getGrade() const
    {
        return grade;
    }

    double getBasicSalary() const
    {
        return basicSalary;
    }

    bool getIsActive() const
    {
        return isActive;
    }

    // Deactivate employee
    void deactivate()
    {
        isActive = false;
    }

    // Calculate allowances according to employee grade
    double computeAllowances() const
    {
        if (grade == 'A')
        {
            return basicSalary * 0.40;
        }
        else if (grade == 'B')
        {
            return basicSalary * 0.30;
        }
        else if (grade == 'C')
        {
            return basicSalary * 0.20;
        }
        else if (grade == 'D')
        {
            return basicSalary * 0.10;
        }

        return 0;
    }

    // Calculate gross salary
    double computeGrossSalary() const
    {
        return basicSalary + computeAllowances();
    }

    // Calculate tax
    double computeTax() const
    {
        double grossSalary = computeGrossSalary();

        if (grossSalary <= 50000)
        {
            return 0;
        }
        else if (grossSalary <= 100000)
        {
            return (grossSalary - 50000) * 0.10;
        }
        else
        {
            return 5000 + (grossSalary - 100000) * 0.20;
        }
    }

    // Calculate net salary
    double computeNetSalary() const
    {
        return computeGrossSalary() - computeTax();
    }

    // Display employee payslip
    void printPayslip() const
    {
        cout << " =================================" << endl;
        cout << "        EMPLOYEE PAYSLIP" << endl;
        cout << "===================================" << endl;

        cout << "Employee ID : " << empId << endl;
        cout << "Name        : " << name << endl;
        cout << "Department  : " << department << endl;
        cout << "Grade       : " << grade << endl;

        // Check employee status
        if (isActive)
        {
            cout << "Status      : Active" << endl;
        }
        else
        {
            cout << "Status      : Inactive" << endl;
        }

        cout << "-------------------------------" << endl;

        cout << "Basic Salary : Rs. " << basicSalary << endl;
        cout << "Allowances   : Rs. " << computeAllowances() << endl;
        cout << "Gross Salary : Rs. " << computeGrossSalary() << endl;

        cout << "-------------------------------" << endl;

        cout << "Tax Deduction : Rs. " << computeTax() << endl;
        cout << "Net Salary    : Rs. " << computeNetSalary() << endl;

        cout << "==============================" << endl;
    }


    // Static function
    static int getEmployeeCount()
    {
        return employeeCount;
    }


    // Function to accept employee details from user
    void acceptDetails()
    {
        string tempName;
        string tempDepartment;
        char tempGrade;
        double tempSalary;

        // Take employee name
        cout << "Enter Name: ";
        getline(cin >> ws, tempName);
        setName(tempName);

        // Take department
        cout << "Enter Department: ";
        getline(cin, tempDepartment);
        setDepartment(tempDepartment);

        // Take grade
        cout << "Enter Grade: ";
        cin >> tempGrade;
        setGrade(tempGrade);

        // Take basic salary
        cout << "Enter Basic Salary: ";
        cin >> tempSalary;
        setBasicSalary(tempSalary);
    }
};


// Define static variable
int Employee::employeeCount = 0;


int main()
{
    // Employee object on stack
    Employee e1;

    // Employee objects on heap
    Employee* e2 = new Employee();
    Employee* e3 = new Employee();


    cout << "Enter details for Employee 1" << endl;
    e1.acceptDetails();

    cout << "Enter details for Employee 2" << endl;
    e2->acceptDetails();

    cout << "Enter details for Employee 3" << endl;
    e3->acceptDetails();


    // Print payslips
    e1.printPayslip();
    e2->printPayslip();
    e3->printPayslip();


    // Deactivate Employee 3
    e3->deactivate();


    // Check if Employee 3 is inactive
    if (!e3->getIsActive())
    {
        cout << "\n" << e3->getName()
             << " is no longer active. Payroll skipped."
             << endl;
    }


    // Display total number of employees
    cout << "Total Employees Created : "
         << Employee::getEmployeeCount()
         << endl;


    // Delete heap objects
    delete e2;
    delete e3;

    return 0;
}