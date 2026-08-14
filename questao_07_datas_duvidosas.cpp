#include <iostream>

int main() {
    int day, month;
    std::cin >> day >> month;

    const bool reversedIsValid = day <= 12;
    const bool interpretationsDiffer = day != month;

    std::cout << (reversedIsValid && interpretationsDiffer
                      ? "DATA INCERTA"
                      : "DATA SEGURA")
              << '\n';
    return 0;
}
