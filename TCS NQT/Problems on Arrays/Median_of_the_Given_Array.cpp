#include <bits/stdc++.h>
using namespace std;

void getMedian(int arr[], int n)
{
    sort(arr, arr + n);
    if (n % 2 == 0)
    {
        int idx1 = n / 2;
        int idx2 = (n / 2) - 1;
        cout << (arr[idx1] + arr[idx2]) / 2.0;
    }
    else
    {
        cout << arr[(n / 2)];
    }
}

int main()
{
    int arr[] = {4, 7, 1, 2, 5, 6};
    int n = 6;
    cout << "The median of the array is: ";
    getMedian(arr, n);
    return 0;
}