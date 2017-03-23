# AzerbaijaniWordsComparator
This is a comparator for sorting words in Azerbaijani language in ascending lexicographic order using Java programming language.
# How to Use It?
The idea is very simple! Imagine you created an array of String objects which are only in Azerbaijani language, for example,

```java 
String[] words = {"Şahnur", "Bədəl", "Akif", "Murad", "Namiq", "Mələk", "Arzu"};
```
Then you need to use sort method which accepts an array of String objects and a comparator as arguments using Arrays class from java.util package of Java SE.

```java 
Arrays.sort(words, new AzerbaijaniWordsComparator());
```

When we print elements of arrays using a loop, we will see the followig output:

```java
for (String i : words) 
        System.out.println(i);
```

**Output**<br />Akif<br />Arzu<br />Bədəl<br />Mələk<br />Murad<br />Namiq<br />Şahnur<br />

        
