import java.util.*;
import java.io.*;

class BookList {

    ArrayList<Book> bookList = new ArrayList<Book>();

    public static void main(String[] args) throws Exception {
        try {
            File myfile = new File("./booklist.csv");
            Scanner rd = new Scanner(myfile);
            String [] bookData;
            String 

            rd.nextLine();
            while (rd.hasNext()){
                bookLine = rd.nextLine();
                bookData = bookLine.split(",");
                bookList.add(new)
                
                    

                }
            }

        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
