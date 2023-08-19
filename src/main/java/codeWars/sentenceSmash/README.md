Sentence Smash

Write a function that takes an array of words and smashes them together into a sentence and returns the sentence. You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word. Be careful, there shouldn't be a space at the beginning or the end of the sentence!

Example

['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'

```java
    public static String smash(String... words) {
        StringBuilder sentence = new StringBuilder();

        for (String word : words) {
            sentence.append(word).append(" ");
        }
        String result = sentence.toString().replaceAll(",", "");

        return result.trim();
    }
}
```