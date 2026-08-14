#include <iostream>
#include <unordered_map>
#include <vector>

int main() {
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int n;
    long long target;
    std::cin >> n >> target;

    std::unordered_map<long long, int> indexByValue;
    for (int i = 0; i < n; ++i) {
        long long value;
        std::cin >> value;

        const auto complement = indexByValue.find(target - value);
        if (complement != indexByValue.end()) {
            std::cout << complement->second << ' ' << i << '\n';
            return 0;
        }

        indexByValue[value] = i;
    }

    return 0;
}
