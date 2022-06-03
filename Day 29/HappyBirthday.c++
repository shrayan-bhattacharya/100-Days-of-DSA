#include <bits/stdc++.h>
using namespace std;

int main()
{
    string name;
    int dob;
    cin >> name;
    cin >> dob;

    int age = 2020 - dob;
    cout << "Happy Birthday " << name << "! Your current age is " << age;
    return 0;
}