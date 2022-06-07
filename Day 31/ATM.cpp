#include <bits/stdc++.h>
using namespace std;

int main()
{
    int cash_withdraw;
    float balance;

    cin >> cash_withdraw >> balance;

    if (cash_withdraw % 5 == 0 && (cash_withdraw + 0.50) <= balance)
    {
        balance = balance - (cash_withdraw + 0.50);
        cout << fixed << setprecision(2) << balance;
    }
    else
    {
        cout << fixed << setprecision(2) << balance;
    }
}