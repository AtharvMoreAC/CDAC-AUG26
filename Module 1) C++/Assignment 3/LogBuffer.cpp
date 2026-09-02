#include <iostream>
#include <cstring>
using namespace std;

// LogBuffer class
class LogBuffer {
private:
char* buffer;
int capacity;
int size;

static int instanceCount;

public:
// Constructor
LogBuffer(int capacity) {
    this->capacity = capacity;
    size = 0;

    buffer = new char[capacity];

    buffer[0] = '\0';

    instanceCount++;

    cout << "[LogBuffer Created] capacity=" << capacity << endl;
}

// Copy Constructor - Deep Copy
LogBuffer(const LogBuffer& other) {
    capacity = other.capacity;
    size = other.size;

    buffer = new char[capacity];

    strcpy(buffer, other.buffer);

    instanceCount++;

    cout << "[LogBuffer Deep Copied] capacity=" << capacity << endl;
}

// Copy Assignment Operator
LogBuffer& operator=(const LogBuffer& other)
{
    // Self-assignment check
    if (this == &other) {
        cout << "[Self-assignment detected - no operation]" << endl;
        return *this;
    }

    // Delete old memory
    delete[] buffer;

    // Copy capacity and size
    capacity = other.capacity;
    size = other.size;

    // Allocate new memory
    buffer = new char[capacity];

    // Deep copy
    strcpy(buffer, other.buffer);

    cout << "[LogBuffer Assigned]" << endl;

    return *this;
}
// Destructor
~LogBuffer()
{
    delete[] buffer;

    instanceCount--;

    cout << "[LogBuffer Destroyed]" << endl;
}

// Append message
void append(const char* msg) {
    int messageLength = strlen(msg);

    if (size + messageLength < capacity)
    {
        strcpy(buffer + size, msg);
        size = size + messageLength;
    }
}

// Print buffer
void print() const
{
    cout << buffer << endl;
}

// Clear buffer
void clear()
{
    size = 0;

    buffer[0] = '\0';
}

// Static function
static int getInstanceCount()
{
    return instanceCount;
}

};

// Initialize static member
int LogBuffer::instanceCount = 0;


int main() {

// Objective 1 : Basic usage
LogBuffer log1(256);

log1.append("Server started on port 8080");
log1.append(" | Request received from 192.168.1.10");
log1.print();

// Objective 2 : Deep copy via copy constructor

LogBuffer log2 = log1;

log2.append(" | Cached response sent");

cout << "log1 : ";
log1.print();

cout << "log2 : ";
log2.print();

// Objective 3 : Copy assignment operator

LogBuffer log3(128);

log3 = log1;

cout << "log3 : ";
log3.print();

// Objective 4 : Self-assignment guard

log1 = log1;
log1.print();

// Objective 5 : Static member

cout << "Live LogBuffer objects : " << LogBuffer::getInstanceCount() << endl;

return 0;

}