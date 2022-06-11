package composite;

public class Run {
    public static void main(String[] args) {
        // Construct the composite object
        Composite phoneBox = new Composite();

        Leaf phone = new Leaf(50000);

        Composite chargerPackage = new Composite();
        Leaf charger = new Leaf(1200);
        chargerPackage.add(charger);

        Composite headphonesPackage = new Composite();
        Leaf headphones = new Leaf(2000);
        Leaf spareEarBuds = new Leaf(500);
        headphonesPackage.add(headphones);
        headphonesPackage.add(spareEarBuds);

        Leaf mobileUserManual = new Leaf(100);

        phoneBox.add(phone);
        phoneBox.add(chargerPackage);
        phoneBox.add(headphonesPackage);
        phoneBox.add(mobileUserManual);

        // Get value of the package
        System.out.println("Phone Value "+phone.getValue());
        System.out.println("Charger Package Value "+chargerPackage.getValue());
        System.out.println("Headphones Package Value "+headphonesPackage.getValue());
        System.out.println("MobileUserManual Value "+mobileUserManual.getValue());
        System.out.println("Phone package Value "+phoneBox.getValue());
    }
}
