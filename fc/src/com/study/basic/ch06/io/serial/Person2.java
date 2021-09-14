package com.study.basic.ch06.io.serial;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// Externalizable 인터페이스
// writerExternal()과 readExternal()메서드를 구현해야 함
// 프로그래머가 직접 객체를 읽고 쓰는 코드를 구현 할 수 있음
public class Person2 implements Externalizable {

    String name;
    String job;

    public Person2() {
    }

    public Person2(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String toString() {
        return name + "," + job;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        //out.writeUTF(job);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        //job = in.readUTF();
    }

}
