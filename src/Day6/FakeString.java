package Day6;

public class FakeString extends MyString {
    public FakeString(char... chars) {
        super(chars);
    }

    @Override
    public boolean equals(Object obj) {
        return true; // This is the importance of making a class final which is what String is
    }
}