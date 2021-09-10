package com.study.basic.ch02.basic4;

public class ObjectCopy2 {

    public static void main(String[] args) {

        // # 깊은 복사
        // 각각의 객체를 생성하여 그 객체의 값을 복사하여 배열이 서로 다른 객체를 가리키도록 함

        Book[] library = new Book[5];
        Book[] copyLibaray = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        // 객체 자체를 새로 만들어야 함
//        copyLibaray[0] = new Book();
//        copyLibaray[1] = new Book();
//        copyLibaray[2] = new Book();
//        copyLibaray[3] = new Book();
//        copyLibaray[4] = new Book();

        Book[] copyLibaray2 = library.clone();

        for(int i = 0; i< library.length; i++) {
            copyLibaray[i] = new Book(library[i].getTitle(), library[i].getAuthor());
//            copyLibaray[i].setTitle(library[i].getTitle());
//            copyLibaray[i].setAuthor(library[i].getAuthor());
        }

        library[0].setTitle("나목");
        library[0].setAuthor("박완서");

        System.out.println("======library=========");
        for( Book book : library) {
            book.showBookInfo();
        }

        System.out.println("======copy library=========");
        for( Book book : copyLibaray) {
            book.showBookInfo();
        }

        System.out.println("======copy library2=========");
        for( Book book : copyLibaray2) {
            book.showBookInfo();
        }

        // 2차원 배열 깊은 복사
        int a[][] = {{1,2,3},{4,5,6,},{7,8,9}};
        int[][] b = new int[a.length][a[0].length];

        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[i].length; j++) {
                b[i][j] = a[i][j];
            }
        }
        // or
        for(int i=0; i<b.length; i++){
            System.arraycopy(a[i], 0, b[i], 0, a[0].length);
        }
    }

}
