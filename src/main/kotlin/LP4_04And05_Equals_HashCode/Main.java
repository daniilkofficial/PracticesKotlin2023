package LP4_04And05_Equals_HashCode;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Москва", "Зеленая", 150);
        Address address2 = new Address("Москва", "Зеленая", 150);
//        Address address2 = address1;
//        address2.setNumberOfHouse(100);
//        System.out.println(address2.getNumberOfHouse());

//        address1.hashCode(); // хешкодов может быть около 2 млрд, и может совпасть

        if (address1.equals(address2)) { // сравниваем ссылки на объект
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }
        System.out.println(address1.hashCode());
        System.out.println(address2.hashCode());
    }
}
