package Day6;

public class MyString {

    private char[] chars;

    public MyString(char... chars) {
        this.chars = chars;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof MyString s) {
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == s.chars[i]) return false;
            }
            return true;
        }
        return false;
    }
}