Given a list of digits, return the smallest number that could be formed from these digits, using the digits only once (ignore duplicates).

Notes:

Only positive integers will be passed to the function (> 0 ), no negatives or zeros.
Input >> Output Examples

minValue ({1, 3, 1})  ==> return (13)
Explanation:

(13) is the minimum number could be formed from {1, 3, 1} , Without duplications

minValue({5, 7, 5, 9, 7})  ==> return (579)
Explanation:

(579) is the minimum number could be formed from {5, 7, 5, 9, 7} , Without duplications

minValue({1, 9, 3, 1, 7, 4, 6, 6, 7}) return  ==> (134679)
Explanation:

(134679) is the minimum number could be formed from {1, 9, 3, 1, 7, 4, 6, 6, 7} , Without duplications

# Explanation 
* Створення пустого списку deduplicatedDigits, де ми будемо зберігати унікальні цифри.
* Сортування вхідного масиву values за зростанням за допомогою Arrays.sort(values). Це допоможе нам згладити однакові цифри поруч одна з одною.
* Запуск циклу for, де індекс i буде ітерувати від 0 до values.length - 1 (останнього індексу масиву).
* Перевірка, чи поточна цифра values[i] не дорівнює наступній цифрі values[i + 1].
* Якщо ці цифри не дорівнюють одна одній, додаємо values[i] до списку deduplicatedDigits. Це допоможе нам відсіяти дублікати.
* Після закінчення циклу додаємо останню цифру масиву (знаходиться за індексом values.length - 1) до списку deduplicatedDigits. Навіть якщо вона є дублікатом останньої унікальної цифри, ми все одно хочемо включити її в наш результат.
* Ініціалізація змінної result як 0. Проходимось по списку deduplicatedDigits:
* Для кожної цифри в deduplicatedDigits оновлюємо result, помножуючи його на 10 і додаючи поточну цифру. Це допомагає нам зібрати цифри в число.
* Повертаємо згенероване число result, яке представляє найменше число, що можна сформувати з унікальних цифр.
