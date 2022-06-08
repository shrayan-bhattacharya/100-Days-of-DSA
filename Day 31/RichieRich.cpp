#include <iostream>
using namespace std;

int main()
{
    int t;
    cin >> t;

    while (t--)
    {
        int a, b, x;
        cin >> a >> b >> x;
        int year = (b - a) / x;
        cout << year << endl;
    }
    return 0;
}