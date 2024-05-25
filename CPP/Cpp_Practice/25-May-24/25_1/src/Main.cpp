/*
 class Employee
 {
    int EmpId; // Data Member
    string Name; // Data Member
 }
*/

#include <iostream>
using namespace std;

class Employee
{
    int EmpId;
    float Salary;
    void GetData(int x)
    {
        int y,z;
    }
};

class Test1 // empty class
{
    void GetData(int x)
    {
        int y,z;
    }

};

int main()
{
    Test1 t1; // t1 is the object Test1 class.
    cout << "size of Object t1 : " << sizeof(t1)<<endl;

    Employee e1;
    cout << "Size of object e1 : " << sizeof(e1);

    return 0;
}