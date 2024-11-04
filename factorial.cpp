#include <iostream>
using namespace std;

unsigned long long factorial(int n) {
    if (n <= 1) {
        return 1; 
    }
    return n * factorial(n - 1); 
}

int main() {
    int number;
    cout << "Enter a positive integer: ";
    cin >> number;
        cout << factorial(number) << endl;
    return 0;
}