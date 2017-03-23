
import java.util.Comparator;

public class AzerbaijaniWordsComparator implements Comparator<String> {

    private final String lowerCaseLetters = "abcçdeəfgğhxıijkqlmnoöprsştuüvyz";
    private final String upperCaseLetters = "ABCÇDEƏFGĞHXIİJKQLMNOÖPRSŞTUÜVYZ";
    
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
                        int indexAA = lowerCaseLetters.indexOf(aa);
                        int indexBB = lowerCaseLetters.indexOf(bb);
                        return indexAA < indexBB ? -1 : 1;
                    }
                } else if (Character.isUpperCase(aa) && Character.isUpperCase(bb)) {
                    if (aa == bb) {
                        continue;
                    } else {
                        int indexAA = upperCaseLetters.indexOf(aa);
                        int indexBB = upperCaseLetters.indexOf(bb);
                        return indexAA < indexBB ? -1 : 1;
                    }
                } else if (Character.isLowerCase(aa) && Character.isUpperCase(bb)) {
                    int indexAA = lowerCaseLetters.indexOf(aa);
                    int indexBB = upperCaseLetters.indexOf(bb);
                    if (indexAA == indexBB) {
                        continue;
                    } else {
                        return indexAA < indexBB ? -1 : 1;
                    }
                } else if (Character.isUpperCase(aa) && Character.isLowerCase(bb)) {
                    int indexAA = upperCaseLetters.indexOf(aa);
                    int indexBB = lowerCaseLetters.indexOf(bb);
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
                        int indexAA = lowerCaseLetters.indexOf(aa);
                        int indexBB = lowerCaseLetters.indexOf(bb);
                        return indexAA < indexBB ? -1 : 1;
                    }
                } else if (Character.isUpperCase(aa) && Character.isUpperCase(bb)) {
                    if (aa == bb) {
                        continue;
                    } else {
                        int indexAA = upperCaseLetters.indexOf(aa);
                        int indexBB = upperCaseLetters.indexOf(bb);
                        return indexAA < indexBB ? -1 : 1;
                    }
                } else if (Character.isLowerCase(aa) && Character.isUpperCase(bb)) {
                    int indexAA = lowerCaseLetters.indexOf(aa);
                    int indexBB = upperCaseLetters.indexOf(bb);
                    if (indexAA == indexBB) {
                        continue;
                    } else {
                        return indexAA < indexBB ? -1 : 1;
                    }
                } else if (Character.isUpperCase(aa) && Character.isLowerCase(bb)) {
                    int indexAA = upperCaseLetters.indexOf(aa);
                    int indexBB = lowerCaseLetters.indexOf(bb);
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
