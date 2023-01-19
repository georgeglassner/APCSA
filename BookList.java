import java.util.*;
import java.io.*;

class BookList {

    ArrayList<Book> bookList = new ArrayList<Book>();

    public static void main(String[] args) throws Exception {
        try {
            File myfile = new File("./booklist.csv");
            Scanner rd = new Scanner(myfile);
            String[] bookData;

            rd.nextLine();
            while (rd.hasNext()) {
                bookData = rd.nextLine().split(",");
                //for (int i = 0; i < bookData.length; i++) {
                    //System.out.println(bookData[i]);
                //}
            }

        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
