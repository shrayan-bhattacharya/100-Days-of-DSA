#include <bits/stdc++.h>
using namespace std;

int main()
{
    vector<int> arr = {4, 2, 8, 6, 15, 5, 9, 20};
    sort(arr.begin(), arr.end());
    int mid = (arr.size()) / 2;

    for (int i = 0; i < mid; i++)
    {
        cout << arr[i] << " ";
    }
    for (int i = arr.size() - 1; i >= mid; i--)
    {
        cout << arr[i] << " ";
    }
}