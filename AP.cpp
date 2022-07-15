#include <iostream>
using namespace std;

int main()
{
    int i, j;
    float a = 3;
    float n, d = 1.5;
    float x = 1;

    cin >> n;
    cout << endl;

    do
    {
        float sum = a + (x - 1) * d;
        cout << sum << endl;
        x++;
    }

    while (x <= n);
}