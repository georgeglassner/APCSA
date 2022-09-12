public class HotelRoom{ //creates HotelClass and 4 variables
    int roomNumber;
    Person guestOne;
    Person guestTwo;
    int c = 0;

    HotelRoom(int rn){ //hotel method constructor 
    roomNumber = rn;
    
}

void checkIn(Person guest){ //check in method constructor
    if(guestOne == null){ // assigns guest to guestOne if guestOne has not been assigned yet 
        guestOne = guest;
    
    }
    else if(guestOne != null && guestTwo == null){ //assigns guest to guestTwo if guestOne is full and guestTwo is null
        guestTwo = guest;

    }
    else if(guestOne != null && guestTwo != null){ //if both guests are full, prints romm capacity warning
        System.out.println("There is no space in this room!");
    }
 
    System.out.println(guest.name + " checked into room number " + roomNumber +"!"); //prints out name of guest, if check in is succesful
    }




void checkOut(Person guest){ //constructor for check out methodf
    if(guest == guestOne){ //checks out guestOne if guestOne is assigned a guest
        guestOne = null;
        System.out.println(guest.name + " has checked out of room number " + roomNumber + "!" );// prints out check out confirmation if check out is successful
    }
    else if (guest == guestTwo){ //checks out guestTwo if guestTwo is assigned a guest
        guestTwo = null; 
        System.out.println(guest.name + " has checked out of room number " + roomNumber + "!" ); // prints out check out confirmation if check out is successful
    }
}


int checkCapacity(){ //check capacity constructor 
     int c = 0; //creats variable c
    if(guestOne != null){ //if guestOne is assigned, add one to capacity
        c++;
    
    }

    if(guestTwo != null){ //if guestTwo is assigned, add one to capacity
        c++;
    }
    return(c); //returns capacity value
}



void printGuestInfo(){ //print guest info constructor
    if(guestOne != null){ //prints guest info if guestOne is assigned 
        System.out.println(guestOne.name + " is a resident at the hotel. He is  " + guestOne.age + " years old and his hair color is " + guestOne.hairColor);

    }
    if(guestTwo != null){ //prints guest info if guestTwo is assigned 
        System.out.println(guestTwo.name + " is a resident at the hotel. He is " + guestTwo.age + " years old and his hair color is " + guestTwo.hairColor);
    }

}



}
