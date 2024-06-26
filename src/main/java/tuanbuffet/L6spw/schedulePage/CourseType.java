package tuanbuffet.L6spw.schedulePage;

public enum CourseType {
    KidsBox("Kid's Box"),
    ChatRoomForTeens("Chat room for teens"),
    FourCorners("Four Corners");

    private final String value;

    private CourseType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}