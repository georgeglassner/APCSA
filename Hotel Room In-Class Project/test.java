class test{
 public static void main(String[] args) {
    int c = 0;
    Person Gabe = new Person(6.01, 16, "Gabe", "Brown");
    Person George = new Person(5.5, 16, "George", "Dirty Blonde");

    HotelRoom Marriot = new HotelRoom(1);
    Marriot.checkIn(Gabe);
    Marriot.checkIn(George);

    Marriot.checkOut(Gabe);

    c = Marriot.checkCapacity();
    System.out.println(c);

    Marriot.printGuestInfo();
    }
}