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

    int uniqueCount = 1;
    for (int i = 1; i < n; ++i) {
        if (nums[i] != nums[uniqueCount - 1]) {
            nums[uniqueCount++] = nums[i];
        }
    }

    std::cout << uniqueCount << '\n';
    for (int i = 0; i < uniqueCount; ++i) {
        if (i > 0) std::cout << ' ';
        std::cout << nums[i];
    }
    std::cout << '\n';
    return 0;
}
