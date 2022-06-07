
#include <iostream>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        int last = n % 10;
        int copy = n;
        while (copy >= 10)
        {
            copy = copy / 10;
        }
        int first = copy;
        cout << (first + last) << endl;
    }
}