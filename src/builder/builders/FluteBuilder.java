package builder.builders;

import builder.products.Flute;
import builder.products.components.*;

public class FluteBuilder {
    private PitchType pitch;
    private int holes;
    private PlayerLevel playerLevel;
    private DecorationType decoration;
    private BoxType box;
    private ClothType cleaningCloth;

    public void setPitch(PitchType pitch) {
        this.pitch = pitch;
    }

    public void setHoles(int holes) {
        this.holes = holes;
    }

    public void setPlayerLevel(PlayerLevel playerLevel) {
        this.playerLevel = playerLevel;
    }

    public void setDecoration(DecorationType decoration) {
        this.decoration = decoration;
    }

    public void setBox(BoxType box) {
        this.box = box;
    }

    public void setCleaningCloth(ClothType cleaningCloth) {
        this.cleaningCloth = cleaningCloth;
    }

    public Flute build() {
        if(pitch == null)
            throw new RuntimeException("Please mention the pitch");
        if(holes != 6 && holes != 8)
            throw new RuntimeException("Please mention if you want Bansuri (6 holes) or Venu (8 holes)");
        if(playerLevel == null)
            playerLevel = PlayerLevel.INTERMEDIATE;
        if(decoration == null)
            decoration = DecorationType.BANDS;
        if(box == null)
            box = BoxType.CYLINDER;
        if(cleaningCloth == null)
            cleaningCloth = ClothType.SOFT;
        return new Flute(pitch, holes, playerLevel, decoration,box, cleaningCloth);
    }
}
