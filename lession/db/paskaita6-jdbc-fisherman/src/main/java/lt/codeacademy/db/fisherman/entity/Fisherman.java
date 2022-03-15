package lt.codeacademy.db.fisherman.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lt.codeacademy.db.fisherman.entity.enums.HookSize;

import java.util.Date;

@Builder
@Getter
@ToString
public class Fisherman {

    private final Long id;
    private final String name;
    private final String surname;
    private final int age;
    private final String rod;
    private final HookSize hookSize;
    private final Date startFishingDate;
}
