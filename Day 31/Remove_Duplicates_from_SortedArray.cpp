// Using set

int removeDuplicates(int arr[])
{
    set<int> set;
    for (int i = 0; i < 7; i++)
    {
        set.insert(arr[i]);
    }
    int k = set.size();
    int j = 0;
    for (int x : set)
    {
        arr[j++] = x;
    }
    return k;
}
int main()
{
    int arr[] = {1, 1, 2, 2, 2, 3, 3};
    int k = removeDuplicates(arr);
    cout << "The array after removing duplicate elements is " << endl;
    for (int i = 0; i < k; i++)
    {
        cout << arr[i] << " ";
    }
}

// Optimal approach
#include <bits/stdc++.h>

using namespace std;
int removeDuplicates(int arr[])
{
    int i = 0;
    for (int j = 1; j < 7; j++)
    {
        if (arr[i] != arr[j])
        {
            i++;
            arr[i] = arr[j];
        }
    }
    return i + 1;
}
int main()
{
    int arr[] = {1, 1, 2, 2, 2, 3, 3};
    int k = removeDuplicates(arr);
    cout << "The array after removing duplicate elements is " << endl;
    for (int i = 0; i < k; i++)
    {
        cout << arr[i] << " ";
    }
}