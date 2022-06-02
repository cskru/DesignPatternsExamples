package builder.products;

import builder.products.components.*;

public class Flute {
    private final PitchType pitch;
    private final int holes;
    private final PlayerLevel playerLevel;
    private final DecorationType decoration;
    private final BoxType box;
    private final ClothType cleaningCloth;

    public Flute(PitchType pitch, int holes, PlayerLevel playerLevel, DecorationType decoration, BoxType box, ClothType cleaningCloth) {
        this.pitch = pitch;
        this.holes = holes;
        this.playerLevel = playerLevel;
        this.decoration = decoration;
        this.box = box;
        this.cleaningCloth = cleaningCloth;
    }

    @Override
    public String toString() {
        return "Flute{" +
                "pitch=" + pitch +
                ", holes=" + holes +
                ", playerLevel=" + playerLevel +
                ", decoration=" + decoration +
                ", box=" + box +
                ", cleaningCloth=" + cleaningCloth +
                '}';
    }
}
