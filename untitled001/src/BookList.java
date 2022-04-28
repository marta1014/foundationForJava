public class BookList {
    Book[] books = new Book[99];
    int size = 0;

    public void addBooks(Book bk) {
       books[size] = bk;
       size++;
    }

    public void removeBooks(int idx) {
        for (int i = idx; i < size; i++) {
            books[i-1] = books[i]; // 后位转移至前一位
        }
        books[size-1] = null; // 置空最后一位
        size--;
    }
}
