
import java.util.Comparator;

public class AzerbaijaniWordsComparator implements Comparator<String> {

    private static final char[] lowerCaseLetters = {
        'a', 'b', 'c', 'ç', 'd', 'e', 'ə', 'f', 'g', 'ğ', 'h', 'x', 'ı', 'i', 'j', 'k', 'q', 'l', 'm', 'n', 'o', 'ö', 'p', 'r', 's', 'ş', 't', 'u', 'ü', 'v', 'y', 'z'
    };
    private static final char[] upperCaseLetters = {
        'A', 'B', 'C', 'Ç', 'D', 'E', 'Ə', 'F', 'G', 'Ğ', 'H', 'X', 'I', 'İ', 'J', 'K', 'Q', 'L', 'M', 'N', 'O', 'Ö', 'P', 'R', 'S', 'Ş', 'T', 'U', 'Ü', 'V', 'Y', 'Z'
    };

    private static final int findIndexOfLowerCaseLetter(char a) {
        for (int i = 0; i < lowerCaseLetters.length; i++) {
            if (lowerCaseLetters[i] == a) {
                return i;
            }
        }
        return -1;
    }

    private static final int findIndexOfUpperCaseLetter(char a) {
        for (int i = 0; i < upperCaseLetters.length; i++) {
            if (upperCaseLetters[i] == a) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int compare(String a, String b) {
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                char aa = a.charAt(i);
                char bb = b.charAt(i);
                if (Character.isLowerCase(aa) && Character.isLowerCase(bb)) {
                    if (aa == bb) {
                        continue;
                    } else {
                        int indexAA = findIndexOfLowerCaseLetter(aa);
                        int indexBB = findIndexOfLowerCaseLetter(bb);
                        return indexAA < indexBB ? -1 : 1;
                    }
                } else if (Character.isUpperCase(aa) && Character.isUpperCase(bb)) {
                    if (aa == bb) {
                        continue;
                    } else {
                        int indexAA = findIndexOfUpperCaseLetter(aa);
                        int indexBB = findIndexOfUpperCaseLetter(bb);
                        return indexAA < indexBB ? -1 : 1;
                    }
                } else if (Character.isLowerCase(aa) && Character.isUpperCase(bb)) {
                    int indexAA = findIndexOfLowerCaseLetter(aa);
                    int indexBB = findIndexOfUpperCaseLetter(bb);
                    if (indexAA == indexBB) {
                        continue;
                    } else {
                        return indexAA < indexBB ? -1 : 1;
                    }
                } else if (Character.isUpperCase(aa) && Character.isLowerCase(bb)) {
                    int indexAA = findIndexOfUpperCaseLetter(aa);
                    int indexBB = findIndexOfLowerCaseLetter(bb);
                    if (indexAA == indexBB) {
                        continue;
                    } else {
                        return indexAA < indexBB ? -1 : 1;
                    }
                }
            }
        } else {
            int min = Math.min(a.length(), b.length());
            for (int i = 0; i < min; i++) {
                char aa = a.charAt(i);
                char bb = b.charAt(i);
                if (Character.isLowerCase(aa) && Character.isLowerCase(bb)) {
                    if (aa == bb) {
                        continue;
                    } else {
                        int indexAA = findIndexOfLowerCaseLetter(aa);
                        int indexBB = findIndexOfLowerCaseLetter(bb);
                        return indexAA < indexBB ? -1 : 1;
                    }
                } else if (Character.isUpperCase(aa) && Character.isUpperCase(bb)) {
                    if (aa == bb) {
                        continue;
                    } else {
                        int indexAA = findIndexOfUpperCaseLetter(aa);
                        int indexBB = findIndexOfUpperCaseLetter(bb);
                        return indexAA < indexBB ? -1 : 1;
                    }
                } else if (Character.isLowerCase(aa) && Character.isUpperCase(bb)) {
                    int indexAA = findIndexOfLowerCaseLetter(aa);
                    int indexBB = findIndexOfUpperCaseLetter(bb);
                    if (indexAA == indexBB) {
                        continue;
                    } else {
                        return indexAA < indexBB ? -1 : 1;
                    }
                } else if (Character.isUpperCase(aa) && Character.isLowerCase(bb)) {
                    int indexAA = findIndexOfUpperCaseLetter(aa);
                    int indexBB = findIndexOfLowerCaseLetter(bb);
                    if (indexAA == indexBB) {
                        continue;
                    } else {
                        return indexAA < indexBB ? -1 : 1;
                    }
                }
            }
            return a.length() < b.length() ? -1 : 1;
        }
        return 0;
    }
}
