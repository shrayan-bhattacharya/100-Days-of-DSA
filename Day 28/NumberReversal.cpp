#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int reverse = 0, remainder;

    while (n != 0)
    {
        remainder = n % 10;
        reverse = reverse * 10 + remainder;
        n = n / 10;
    }
    cout << reverse;
}