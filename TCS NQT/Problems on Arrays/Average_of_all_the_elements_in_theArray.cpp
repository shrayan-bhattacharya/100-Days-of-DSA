#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n = 5, sum = 0, avg = 0;
    int array[] = {1, 2, 3, 4, 5};

    for (int i = 0; i < n; i++)
    {
        sum += array[i];
        avg = sum / n;
    }
    cout << avg;
}