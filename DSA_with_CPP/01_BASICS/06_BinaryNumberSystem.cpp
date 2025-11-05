#include <iostream>
using namespace std;

int main(){
    // Binary Number System
    // The binary number system is a base-2 numeral system that uses two symbols, typically 0 and 1, to represent numbers.
    // Each digit in a binary number is referred to as a bit.
    int n;
    cout << "Enter a decimal number: ";
    cin >> n;

    // Convert decimal to binary
    int ans = 0;
    int pow = 1;

    while(n>0){
        int rem = n%2;
        n = n/2;
        ans += rem * pow;
        pow *= 10;
    }

    cout << "Binary representation : " << ans << endl;

    //Binary to Decimal
    int binary;
    cout << "Enter a binary number: ";
    cin >> binary;

    int decimal = 0;
    int power = 1; // 2^0 = 1

    while(binary >0){
        int lastdigit = binary %10;
        binary = binary /10;
        decimal += lastdigit * power;
        power = power * 2;
        
    }
    cout << "Decimal representation : " << decimal << endl;
    return 0;
}