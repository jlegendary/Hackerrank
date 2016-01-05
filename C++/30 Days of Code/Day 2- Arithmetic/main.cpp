#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    double M;
    double T;
    double X;
    
    cin >> M >> T >> X;

    double tip = T/100 * M;
    double tax = X/100 * M;
    double total = M + tip + tax;

    int t = round(total);

    cout << "The final price of the meal is $" << t << "." << endl;
    return 0;
}