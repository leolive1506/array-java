import java.util.Scanner;

import entities.exercicies.RoomRent;

public class Exercicio01 {
  public static final int QUANTITY_ROOM_RENT = 10;

  public static void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("How many will be rented: ");
    RoomRent[] roomRent = new RoomRent[QUANTITY_ROOM_RENT];
    int quantityRoomsRentalStudents = sc.nextInt();

    String name;
    String email;
    int room;
    for (int i = 1; i <= quantityRoomsRentalStudents; i++) {
      System.out.println("Rent #" + i);
      sc.nextLine();
      System.out.print("Name: ");
      name = sc.nextLine();

      System.out.print("Email: ");
      email = sc.next();
      
      System.out.print("Room: ");
      room = sc.nextInt();
      
      roomRent[room] = new RoomRent(room, name, email);
    }

    for (int i = 0; i < roomRent.length; i++) {
      if (roomRent[i] != null) {
        System.out.println(roomRent[i]);
      }
    }

  }
}
