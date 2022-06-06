#include <bits/stdc++.h>
using namespace std;

int main()
{
    string word = "WORKATTECH";
    int n = word.length();

    for (int i = 0; i < n; i = i + 2)
    {
        cout << word[i] << word[i + 1] << endl;
    }
    return 0;
}