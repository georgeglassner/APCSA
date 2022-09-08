public class HotelRoom{
    int roomNumber;
    Person guestOne;
    Person guestTwo;
HotelRoom(int rn){
    roomNumber = rn;
    
}

void checkIn(Person guest){
    if(guestOne == null){
        guestOne = guest;
    if(guestOne != null && guestTwo != null){
        System.out.println("There is no space in this room!");
    }
 
    System.out.println(guest.name + "checked into room number" + roomNumber +"!");
    }


}

void checkOut(Person guest){

}

void printGuestInfo(){

}




}
