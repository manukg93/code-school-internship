package code.school.internship.classes_and_objects.homework.homework8;

public class CustomString implements CharSequence {
    // instance fields
    private char[] characters;

    // constructors

    // default constructor
    public CustomString() {
        this.characters = null;
    }

    public CustomString(char[] characters) {
        if (characters != null) {
            this.characters = new char[characters.length];
            for (int i = 0; i < this.characters.length; i++) {
                this.characters[i] = characters[i];
            }
        } else {
            new CustomString();
        }
    }

    public CustomString(int[] unicode_characters) {
        if (unicode_characters != null) {
            this.characters = new char[unicode_characters.length];
            for (int i = 0; i < this.characters.length; i++) {
                if (unicode_characters[i] >= 0 && unicode_characters[i] < 65535) {
                    this.characters[i] = (char) unicode_characters[i];
                } else {
                    System.out.println("Not valid value for unicode_pointer: " + unicode_characters[i]);
                    return;
                }
            }
        } else {
            new CustomString();
        }
    }

    public CustomString(int length) {
        this.characters = new char[length];
    }

    // Getter
    public char[] getCharacters() {
        return characters;
    }

    // public methods
    // returns the number of characters int the CustomString
    public int length() {
        if (this.characters == null) {
            return 0;
        }
        return this.characters.length;
    }

    // gets the character at specified index
    public char charAt(int index) {
        if (index < 0 || index >= this.length()) {
            return 0;
        }
        return this.characters[index];
    }

    // returns the index of specified character within the string
    public int indexOf(int ch) {
        if (ch < 0 || ch > 65535)  {
            return -1;
        }
        if (this.characters == null) {
            return -1;
        }

        for (int i = 0; i < this.length(); i++) {
            if (ch == this.characters[i]) {
                return i;
            }
        }
        return -1;
    }

    // returns the index of the first occurrence of the specified character, starting at the specified index.
    public int indexOf (int ch, int start) {
        if (ch < 0 || ch > 65535) {
            return -1;
        }
        if (start < 0 || start >= this.length()) {
            return -1;
        }
        if (this.characters == null) {
            return -1;
        }

        for (int i = start; i < this.length(); i++) {
            if (ch == this.characters[i]) {
                return i;
            }
        }
        return -1;
    }

    // returns the index within the string of the last occurrence of the specified character
    public int lastIndexOf(int ch) {
        if (ch < 0 || ch > 65535) {
            return -1;
        }
        if (this.characters == null) {
            return -1;
        }

        for (int i = this.characters.length - 1; i >= 0; i--) {
            if (ch == this.characters[i]) {
                return i;
            }
        }

        return -1;
    }

    // returns the index within this string of the first occurrence of the specified substring.
    public int indexOf(CustomString str) {
        if (str == null || str.length() > this.length()) {
            return -1;
        }

        int index = indexOf(str.characters[0]);

        for (int i = index, j = 0; i <= str.length(); i++, j++) {
            if (this.characters[i] != str.characters[j]) {
                return -1;
            }
        }

        return index;
    }

    //
    public boolean contains(CharSequence sequence) {
        if (sequence instanceof CustomString) {
            CustomString seq = (CustomString) sequence;
            return (indexOf(seq) > -1);
        }
        return false;
    }

    //
    public boolean startsWith(String prefix) {
        if (prefix == null) {
            return false;
        }
        if (prefix.length() >= this.length()) {
            return false;
        }
        for (int i = 0; i < prefix.length(); i++) {
            if (this.charAt(i) != prefix.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    //
    public boolean endsWith(String suffix) {
        if (suffix == null || suffix.length() > this.length()) {
            return false;
        }
        for (int i = this.length() - 1, j = suffix.length() - 1; j >= 0; i--, j--) {
            if (suffix.charAt(j) != this.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    //
    public CustomString reverse () {
        char[] reverseCharacters = new char[this.characters.length];

        for (int i = 0, j = reverseCharacters.length - 1; j >= 0; i++, j--) {
            reverseCharacters[j] = this.characters[i];
        }

        return new CustomString(reverseCharacters);
    }

    ////
    //public String toUpperCase(Locale locale) {
    //
    //}

    @Override
    public CharSequence subSequence(int start, int end) {
        CustomString sequence = null;
        if (start < 0 || start >= end) {
            return null;
        }
        if (end >= this.length()) {
            return null;
        }

        sequence = new CustomString(end - start);
        int i = start;
        int j = 0;
        while (i < end) {
            sequence.characters[j] = this.characters[i];
            j++;
            i++;
        }

        return sequence;
    }

    @Override
    public boolean equals(Object obj) {
        CustomString other = null;

        if (obj instanceof CustomString) {
            other = (CustomString) obj;
        }

        if (this.characters.length != other.characters.length) {
            return false;
        }
        for (int i = 0; i < this.characters.length; i++) {
            if ((int) this.characters[i] != (int) other.characters[i]) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        String customString = "";
        if (this.characters != null) {
            for (int i = 0; i < this.characters.length; i++) {
                customString += this.characters[i];
            }
        }
        return customString;
    }
}