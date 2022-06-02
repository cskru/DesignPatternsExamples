package builder.directors;

import builder.builders.FluteBuilder;
import builder.products.components.BoxType;
import builder.products.components.ClothType;
import builder.products.components.DecorationType;
import builder.products.components.PitchType;

public class Director {
    public void manufactureCSharpBansuriWithoutPackaging(FluteBuilder fluteBuilder) {
        fluteBuilder.setPitch(PitchType.CSharp);
        fluteBuilder.setHoles(6);
        fluteBuilder.setCleaningCloth(ClothType.NONE);
        fluteBuilder.setBox(BoxType.NONE);
    }

    public void manufactureGSharpVenuWithPackaging(FluteBuilder fluteBuilder) {
        fluteBuilder.setPitch(PitchType.GSharp);
        fluteBuilder.setHoles(8);
        fluteBuilder.setCleaningCloth(ClothType.SOFT);
        fluteBuilder.setBox(BoxType.RECTANGULAR);
        fluteBuilder.setDecoration(DecorationType.BANDS);
    }
}
