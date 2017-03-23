# AzerbaijaniWordsComparator
## About
This is a comparator for sorting words in Azerbaijani language in ascending lexicographic order using Java programming language.
## Usage
The idea is very simple! Imagine that you created an array of String objects which are only in Azerbaijani language, for example,

```java 
String[] words = {"Şahnur", "Bədəl", "Akif", "Murad", "Namiq", "Mələk", "Arzu"};
```
Then you want to sort the words using a sort method from a standard library which accepts an array of String objects and a comparator as arguments. 


```java 
Arrays.sort(words, new AzerbaijaniWordsComparator());
```

**P.S.:** This comparator can be used for sorting not only arrays of String objects, but also for sorting ArrayLists, Linkedlists, and other collections of String objects, too!

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
