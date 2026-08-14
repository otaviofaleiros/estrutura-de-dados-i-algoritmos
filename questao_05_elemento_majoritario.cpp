#include <iostream>

int main() {
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int n;
    std::cin >> n;

    long long candidate = 0;
    int balance = 0;
    for (int i = 0; i < n; ++i) {
        long long value;
        std::cin >> value;
        if (balance == 0) candidate = value;
        balance += (value == candidate) ? 1 : -1;
    }

    std::cout << candidate << '\n';
    return 0;
}
