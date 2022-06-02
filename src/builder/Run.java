package builder;

import builder.builders.FluteBuilder;
import builder.directors.Director;
import builder.products.Flute;
import builder.products.components.*;

public class Run {
    public static void main(String[] args) {
        FluteBuilder fluteBuilder = new FluteBuilder();

        // Build Custom Flute
        fluteBuilder.setPitch(PitchType.D);
        fluteBuilder.setHoles(6);
        fluteBuilder.setCleaningCloth(ClothType.SOFT);
        fluteBuilder.setPlayerLevel(PlayerLevel.PROFESSIONAL);
        fluteBuilder.setDecoration(DecorationType.THREAD);
        Flute myCustomFlute = fluteBuilder.build();
        System.out.println("Custom Flute Built Successfully!");
        System.out.println(myCustomFlute.toString());
        System.out.println("=================================");

        // Build using specialized Directors - Example for high demand product variants
        Director director = new Director();

        // Build C# pitched Bansuri with no packaging - Frequently in demand
        FluteBuilder bansuriBuilder = new FluteBuilder();
        director.manufactureCSharpBansuriWithoutPackaging(bansuriBuilder);
        Flute specializedBansuriFlute = bansuriBuilder.build();
        System.out.println("Specialized Bansuri Flute Built Successfully!");
        System.out.println(specializedBansuriFlute.toString());
        System.out.println("=================================");

        // Build G# pitched Venu with packaging and cleaning clothes - Frequently in demand
        FluteBuilder venuBuilder = new FluteBuilder();
        director.manufactureGSharpVenuWithPackaging(bansuriBuilder);
        Flute specializedVenuFlute = bansuriBuilder.build();
        System.out.println("Specialized Venu Flute Built Successfully!");
        System.out.println(specializedVenuFlute.toString());
        System.out.println("=================================");
    }
}
