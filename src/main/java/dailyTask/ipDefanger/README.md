# Task 

Реалізуй метод defangIPAddress(), який приймає рядок з дійсною IPv4-адресою address і повертає змінену версію цієї IP-адреси.

У зміненій IP-адресі кожна крапка '.' замінена на "[.]".

## Приклади:

defangIPAddress("1.1.1.1") == "1[.]1[.]1[.]1"
defangIPAddress("255.100.50.0") == "255[.]100[.]50[.]0"





```java 
public String defangIPAddress(String address) {
StringBuilder result = new StringBuilder();

    for (char c : address.toCharArray()) {
        if (c == '.') {
            result.append("[.]");
        } else {
            result.append(c);
        }
    }

    return result.toString();
}
```

# Algorithmic Explanation:

* We have an input string address, which is a valid IPv4 address.
* Create a StringBuilder object named result to construct the new string.
* Start a for-each loop that iterates through each character c in the input string address.
* Inside the loop:
1. Check if the current character c is a period ('.'). If so, append "[.]" to the result object (this replaces the period with [.]).
2. If the current character c is not a period, simply append it to result.
*After the loop completes, return the string obtained from result using the toString() method.

# Reasoning for the Chosen Approach:
Using StringBuilder efficiently builds the new string, as it operates by modifying the string in place, reducing unnecessary memory overhead for creating new string objects upon each change.
# Algorithmic Complexity:
The time complexity of this solution is ***O(n)***, where n is the length of the input string. We go through each character only once.
* Memory: Constant additional memory is used for the StringBuilder object, i.e., O(1), as its size doesn't depend on the input data's size.
This code is efficient and aligns well with your goal of using StringBuilder for optimized string manipulation.



