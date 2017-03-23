# AzerbaijaniWordsComparator
## About
This is a comparator for sorting words in Azerbaijani language in ascending lexicographic order using Java programming language.
## Usage
The idea is very simple! Imagine you created an array of String objects which are only in Azerbaijani language, for example,

```java 
String[] words = {"Şahnur", "Bədəl", "Akif", "Murad", "Namiq", "Mələk", "Arzu"};
```
Then you need to use sort method which accepts an array of String objects and a comparator as arguments using Arrays class from java.util package of Java SE.

```java 
Arrays.sort(words, new AzerbaijaniWordsComparator());
```

We will see the output below when we print the elements of array using a loop:

```java
for (String i : words) 
        System.out.println(i);
```

<pre>
<b>Output:</b>
Akif
Arzu
Bədəl
Mələk
Murad
Namiq
Şahnur
</pre>
