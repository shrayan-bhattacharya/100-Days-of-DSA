#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;

    while (t--)
    {
        int temp, hum;
        cin >> temp >> hum;
        if (temp >= 30 && hum >= 90)
            cout << "Hot and Humid";
        else if (temp >= 30 && hum < 90)
            cout << "Hot";
        else if (temp < 30 && hum >= 90)
            cout << "Cool and Humid";
        else if (temp >= 30 && hum >= 90)
            cout << "Cool";
        break;
    }
    return 0;
}