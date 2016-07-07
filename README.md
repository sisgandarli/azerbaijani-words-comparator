# AzerbaijaniWordsComparator
This is Comparator for sorting words in Azerbaijani language in ascending lexicographic order using Java programming language.
# How to Use It?
The idea is very simple! Imagine you created an array of String objects which are only in Azerbaijani language, for example,

```java String[] words = {"Şahnur", "Bədəl", "Akif", "Murad", "Namiq", "Mələk", "Arzu"};```

They you need to use sort method which accepts array of String objects and Comparator as arguments using Arrays class from standart Java libraries!

```java 
Arrays.sort(words, new AzerbaijaniWordsComparator());
```

When we will print elements of arrays using a loop, we will see the followig output:

```java
for (String i : words) 
        System.out.println(i);
```

**Output**<br />Akif<br />Arzu<br />Bədəl<br />Mələk<br />Murad<br />Namiq<br />Şahnur<br />

        
