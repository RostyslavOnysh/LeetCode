#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

class Solution {
public:
    string reverseWords(string s) {
        int n = s.length();
        int wordStart = -1;

        for (int i = 0; i <= n; i++) {
            if (i == n || s[i] == ' ') {
                if (wordStart != -1) {
                    reverse(s.begin() + wordStart, s.begin() + i);
                    wordStart = -1;
                }
            } else if (wordStart == -1) {
                wordStart = i;
            }
        }
        reverse(s.begin(), s.end());

        int storeIndex = 0;
        bool inWord = false;

        for (int i = 0; i < n; i++) {
            if (s[i] != ' ') {
                if (inWord) {
                    s[storeIndex++] = s[i];
                } else {
                    if (storeIndex != 0) s[storeIndex++] = ' ';
                    s[storeIndex++] = s[i];
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        s.erase(s.begin() + storeIndex, s.end());
        return s;
    }
};

int main() {
    Solution sol;
    string test = "  hello world  ";
    string result = sol.reverseWords(test);
    cout << '"' << result << '"' << endl;
    return 0;
}