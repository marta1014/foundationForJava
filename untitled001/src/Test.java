import  java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        int num  = 395833821;
//        Scanner sc = new Scanner(System.in); // 创建输入扫描器
//
//        int input_qq = sc.nextInt(); // 从扫描器中获取一个整数
//
//        if(Math.abs(input_qq - num) < 1000) {
//            System.out.print("恭喜你 成功匹配");
//        } else {
//            System.out.print("很抱歉 匹配失败 请重试～");
//        }
        BookList bookList = new BookList();
        Book b1 = new Book("左耳说爱我","marta", 22.0);
        Book b2 = new Book("右耳说爱我","marta", 22.0);
        Book b3 = new Book("左耳说不爱我","marta", 22.0);
        Book b4 = new Book("右耳说不爱我","marta", 22.0);
        Book b5 = new Book("说不爱我","marta", 22.0);
        Book b6 = new Book("左耳不爱我","marta", 22.0);
        bookList.addBooks(b1);
        bookList.addBooks(b2);
        bookList.addBooks(b3);
        bookList.addBooks(b4);
        bookList.addBooks(b5);
        bookList.addBooks(b6);
        System.out.println(bookList.size);
        System.out.println(bookList.books[2].name);
        bookList.removeBooks(2);
        System.out.println(bookList.size);
        System.out.println(bookList.books[2].name);

    }

}
