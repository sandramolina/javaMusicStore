package instruments.enums;

public enum Types {
    BRASS("I am mellow and profound"),
    KEYBOARD("I am awesome and everyone wants to know how to play me"),
    STRING("I will make you a rock star"),
    WOODWIND("I am enchanting"),
    PERCUSSION("I am loud and easy going"),
    MISCELANEOUS("Hard to tell lol");

    private final String sound;

    Types(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}


