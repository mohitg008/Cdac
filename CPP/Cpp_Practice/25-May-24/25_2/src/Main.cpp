#include <iostream>
using namespace std;
class Number
{
public:
    int Num1;
    int Num2;
    void GetData()
    {
        cout << "Enter Num1:" << endl;
        cin >> Num1;
        cout << "Enter Num2:" << endl;
        cin >> Num2;
    }
    void ShowData(/*Number *const this */)
    {
        cout << "Num1:    " << this->Num1 << endl;
        cout << "Num2:    " << this->Num2 << endl;
    }
    void Add(int x, int y)
    {
        
    }
};

int main()
{
    Number n1;
    n1.ShowData();
    n1.GetData();
    n1.ShowData();
    n1.Add(10,30);

    return 0;
}