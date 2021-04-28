package homework2.tasks.task1;

public enum TrimString {

    EXTRASPACE("^ +| +$|( )+"),
    ALLSPACES("\\s+"),
    NOTEXT("[A-Za-z]"),
    NODIGITS("[0-9]"),
    PUNCTUATION("\\p{Punct}");

    private String regexp;

    TrimString(String regexp) {
        this.regexp = regexp;
    }

    public String getRegexp() {
        return regexp;
    }

}
