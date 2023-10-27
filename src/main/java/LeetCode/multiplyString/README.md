Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.



Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088"


Constraints:

1 <= num1.length, num2.length <= 200
num1 and num2 consist of digits only.
Both num1 and num2 do not contain any leading zero, except the number 0 itself.

# Explanation of solving :
* int[] result = new int[m + n];: Спочатку ми створюємо масив result, де m та n - це довжини реверсованих рядків num1 та num2. Цей масив використовується для зберігання проміжних результатів множення.
* for (int i = 0; i < m; i++): Ми починаємо перший цикл, який ітерується через символи реверсованого рядка num1.
* for (int j = 0; j < n; j++): У цьому циклі ми ітеруємо через символи реверсованого рядка num2.
* int product = (reversedNum1.charAt(i) - '0') * (reversedNum2.charAt(j) - '0');: Ми обчислюємо добуток двох цифр, взятих з реверсованих рядків num1 та num2. Зверніть увагу, що ми віднімаємо ASCII-коди символів '0', щоб отримати числові значення.
* int sum = product + result[i + j];: Тепер ми додаємо отриманий добуток product до відповідного елемента масиву result, який відповідає позиції в результаті множення.
* result[i + j] = sum % 10;: Отриманий суму відсутніх місць ми зберігаємо в поточній позиції масиву result. Однак ми лише зберігаємо одиниці цифри у даній позиції, використовуючи % 10.
* result[i + j + 1] += sum / 10;: Якщо під час сумування виникає перенос (який може бути більше 10), то ми додаємо цей перенос до наступної позиції в масиві result.
* StringBuilder sb = new StringBuilder();: Ми створюємо об'єкт StringBuilder, який допоможе нам побудувати кінцевий результат у вигляді рядка.
* for (int i = m + n - 1; i >= 0; i--): Тепер ми починаємо ітерувати через масив result в зворотному порядку, починаючи з останньої позиції.
* if (sb.length() > 0 || result[i] != 0): Ми перевіряємо, чи маємо ми необхідні цифри для додавання до результату. Ми пропускаємо ведучі нулі.
* sb.append(result[i]);: Якщо цифра не є ведучим нулем або це перший доданий символ, ми додаємо цю цифру до StringBuilder.
* return sb.length() == 0 ? "0" : sb.toString();: Нарешті, ми повертаємо результат у вигляді рядка, попередньо перевіряючи, чи масив result не був порожнім (якщо так, повертаємо "0") і конвертуючи StringBuilder у рядок.

* int[] result = new int[m + n];: First, we create an array called result, where m and n are the lengths of the reversed strings num1 and num2. This array is used to store intermediate multiplication results.
* for (int i = 0; i < m; i++): We start with the first loop, iterating through the characters of the reversed num1 string.
* for (int j = 0; j < n; j++): Within this loop, we iterate through the characters of the reversed num2 string.
* int product = (reversedNum1.charAt(i) - '0') * (reversedNum2.charAt(j) - '0');: We calculate the product of the two digits taken from the reversed num1 and num2 strings. Note that we subtract the ASCII codes of '0' to get numeric values.
* int sum = product + result[i + j];: Now we add the calculated product product to the corresponding element in the result array, which corresponds to the position in the multiplication result.
* result[i + j] = sum % 10;: We store the sum of the carry-overs in the current position of the result array. However, we only keep the units digit by using % 10.
* result[i + j + 1] += sum / 10;: If there is a carry-over during the addition (which can be greater than 10), we add this carry-over to the next position in the result array.
* StringBuilder sb = new StringBuilder();: We create a StringBuilder object, which will help us build the final result as a string.
* for (int i = m + n - 1; i >= 0; i--): Now, we iterate through the result array in reverse order, starting from the last position.
* if (sb.length() > 0 || result[i] != 0): We check whether we have the necessary digits to add to the result. We skip leading zeros.
* sb.append(result[i]);: If the digit is not a leading zero or it's the first added character, we add this digit to the StringBuilder.
* return sb.length() == 0 ? "0" : sb.toString();: Finally, we return the result as a string, making sure to check if the result array was not empty (in which case we return "0") and converting the StringBuilder to a string.