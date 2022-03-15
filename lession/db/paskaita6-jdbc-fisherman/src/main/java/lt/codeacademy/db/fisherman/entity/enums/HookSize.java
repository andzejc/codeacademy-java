package lt.codeacademy.db.fisherman.entity.enums;

import lombok.Getter;

@Getter
public enum HookSize {
    SMALL(1), MEDIUM(2), LARGE(3);

    private final int idx;

    HookSize(int idx) {
        this.idx = idx;
    }

    public static HookSize fromValue(int value) throws IllegalArgumentException {
        try {
            return HookSize.values()[value];
        } catch(ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Unknown enum value :"+ value);
        }
    }
}
