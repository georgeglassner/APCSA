public class HotelRoom{
    int roomNumber;
    Person guestOne;
    Person guestTwo;
    int c = 0;
HotelRoom(int rn){
    roomNumber = rn;
    
}

void checkIn(Person guest){
    if(guestOne == null){
        guestOne = guest;
    
    }
    else if(guestOne != null && guestTwo == null){
        guestTwo = guest;

    }
    else if(guestOne != null && guestTwo != null){
        System.out.println("There is no space in this room!");
    }
 
    System.out.println(guest.name + " checked into room number " + roomNumber +"!");
    }




void checkOut(Person guest){
    if(guest == guestOne){
        guestOne = null;
        System.out.println(guest.name + " has checked out of room number " + roomNumber + "!" );
    }
    else if (guest == guestTwo){
        guestTwo = null; 
        System.out.println(guest.name + " has checked out of room number " + roomNumber + "!" );
    }
}


int checkCapacity(){
     int c = 0;
    if(guestOne != null){
        c++;
    
    }

    if(guestTwo != null){
        c++;
    }

    return(c);
}



void printGuestInfo(){
    if(guestOne != null){
        System.out.println(guestOne.name + " is a resident at the hotel. He is  " + guestOne.age + " years old and his hair color is " + guestOne.hairColor);

    }
    if(guestTwo != null){
        System.out.println(guestTwo.name + " is a resident at the hotel. He is " + guestTwo.age + " years old and his hair color is " + guestTwo.hairColor);
    }

}



}
