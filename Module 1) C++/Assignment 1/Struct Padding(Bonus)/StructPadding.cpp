#include <iostream>
using namespace std;


// First structure
struct Layout1
{
    char c1;
    int i;
    char c2;
};


// Second structure
struct Layout2
{
    int i;
    char c1;
    char c2;
};


int main()
{
    // Print size of both structures
    cout << "Size of Layout1 : "
         << sizeof(Layout1)
         << " bytes" << endl;

    cout << "Size of Layout2 : "
         << sizeof(Layout2)
         << " bytes" << endl;

        return 0;
}


 /* STRUCT PADDING EXPLANATION:

1.  The sizes can differ because the members are stored
    in different orders in memory.

2.  Padding means the compiler adds extra unused bytes
    between members or at the end of a structure.
    This helps data be properly aligned in memory and
    can improve CPU access efficiency.

3.  Member order matters because changing the order can
    reduce or increase padding.

 This is important in network packet headers and
 hardware register maps because the exact memory
 layout and position of data members can matter. */