#include <iostream>
#include <vector>

int main() {
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int n;
    std::cin >> n;
    std::vector<long long> nums(n);
    for (auto& value : nums) {
        std::cin >> value;
    }

    int write = 0;
    for (const long long value : nums) {
        if (value != 0) {
            nums[write++] = value;
        }
    }
    while (write < n) {
        nums[write++] = 0;
    }

    for (int i = 0; i < n; ++i) {
        if (i > 0) std::cout << ' ';
        std::cout << nums[i];
    }
    std::cout << '\n';
    return 0;
}
