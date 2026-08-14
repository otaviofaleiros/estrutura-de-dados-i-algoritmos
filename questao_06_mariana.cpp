#include <iostream>

int main() {
    long long x;
    std::cin >> x;

    // The statement counts the verse number twice, plus the sequence from 1 to i.
    const long long total = x * (x + 1) / 2 + 2 * x;
    std::cout << total << '\n';
    return 0;
}
