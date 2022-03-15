package lt.codeacademy.db.fisherman.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lt.codeacademy.db.fisherman.entity.enums.HookSize;

@Builder
@Getter
@ToString
public class Fish {

    private final Long id;
    private final String name;
    private final int weight;
    private final String favoriteFood;
    private final HookSize hookSize;
}
