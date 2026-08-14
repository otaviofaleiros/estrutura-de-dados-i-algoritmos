#include <algorithm>
#include <iostream>
#include <string>

int main() {
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);

    int n;
    std::string text;
    std::cin >> n >> text;

    std::reverse(text.begin(), text.end());
    std::cout << text << '\n';
    return 0;
}
