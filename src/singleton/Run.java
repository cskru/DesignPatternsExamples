package singleton;

public class Run {
    public static void main(String[] args) {
        Prototype violinPrototype = ViolinPrototype.getInstrumentPrototype();
        Prototype newViolin1 = violinPrototype.clone();

        System.out.println("Prototype1 and NewViolin1 are identical? : "+ violinPrototype.equals(newViolin1));
        System.out.println("Prototype1 and NewViolin1 are same objects? : "+ (violinPrototype == newViolin1));

        Prototype violinPrototype2 = ViolinPrototype.getInstrumentPrototype(); // Doesn't create another copy of prototype
        Prototype newViolin2 = violinPrototype2.clone();

        System.out.println("Prototype2 and NewViolin2 are identical? : "+ violinPrototype2.equals(newViolin2));
        System.out.println("Prototype2 and NewViolin1 are same objects? : "+ (violinPrototype2 == newViolin2));

        System.out.println("==============================");

        System.out.println("Singleton because:");
        System.out.println("Prototype1 and Prototype2 are same objects? : "+ (violinPrototype == violinPrototype2));
    }
}
