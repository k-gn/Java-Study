package com.study.basic.ch06.io.serial;

import java.io.*;

// serialization 이란? (직렬화)
// 인스턴스의 상태를 그대로 파일 저장하거나 네트워크로 전송하고 (serialization) 이를 다시 복원(deserializatio) 하는 방식
// 자바에서는 보조 스트림을 활용하여 직렬화를 제공함

// ObjectInputStream(InputStream in)
//      InputStream을 생성자의 매개변수로 받아 ObjectInputStream을 생성합니다.
// ObjectOutputStream(OutputStream out)
//      OutputStream을 생성자의 매개변수로 받아 ObjectOutputStream을 생성합니다.

// Serializable 인터페이스
// 직렬화는 인스턴스의 내용이 외부로 유출되는 것이므로 프로그래머가 해당 객체에 대한 직렬화 의도를 표시해야 함
// 직렬화 시 없으면 에러가 발생한다.
// 구현 코드가 없는 marker interface
// transient : 직렬화 하지 않으려는 멤버 변수에 사용함, 직렬화 때 무시된다. (Socket등 직렬화 할 수 없는 객체)
// 대부분 자바 클래스들은 Serializable를 이미 구현하고 있다!
class Person implements Serializable {

    private static final long serialVersionUID = -1503252402544036183L;

    String name;
    String job;
//    transient String job;

    public Person() {}

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String toString()
    {
        return name + "," + job;
    }
}


public class SerializationTest {

    public static void main(String[] args) throws ClassNotFoundException {

        Person2 personAhn = new Person2("이순신", "대표이사");
        Person2 personKim = new Person2("김유신", "상무이사");

        try(FileOutputStream fos = new FileOutputStream("serial.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(personAhn);
            oos.writeObject(personKim);

        }catch(IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream("serial.out");
            ObjectInputStream ois = new ObjectInputStream(fis)){

            Person2 p1 = (Person2)ois.readObject();
            Person2 p2 = (Person2)ois.readObject();

            System.out.println(p1);
            System.out.println(p2);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

