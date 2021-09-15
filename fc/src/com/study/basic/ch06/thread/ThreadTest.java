package com.study.basic.ch06.thread;

// # Thread 란?
// - process
// 실행 중인 프로그램
// 프로그램이 실행되면 OS로 부터 메모리를 할당받아 프로세스 상태가 됨
// - thread
// 하나의 프로세스는 하나 이상의 thread를 가지게 되고, 실제 작업을 수행하는 단위는 thread임

// - multi-threading
// 여러 thread가 동시에 수행되는 프로그래밍, 여러 작업이 동시에 실행되는 효과
// thread는 각각 자신만의 작업 공간(변수나 값들)을 가짐 ( context )
// 각 thread 사이에서 공유하는 자원이 있을 수 있음 (자바에서는 static instance)
// 여러 thread가 자원을 공유하여 작업이 수행되는 경우 서로 자원을 차지하려는 race condition이 발생할 수 있음
// 이렇게 여러 thread가 공유하는 자원중 경쟁이 발생하는 부분을 critical section 이라고 함(공유자원은 보호되어야 한다)
// 임계영역 : 프로세스간 공유자원을 접근하는데 문제가 발생하지 않도록 한번에 하나의 프로세스만 이용하도록 보장해야하는 영역
// critical section에 대한 동기화(일종의 순차적 수행)를 구현하지 않으면 오류가 발생할 수 있음
// 어떤 쓰레드가 쓸 때는 다른 쓰레드가 못쓰게 락을 걸고, 다쓰면 락을 푼다.
// 교착 상태(膠着狀態, 영어: deadlock)란 두 개 이상의 작업이 서로 상대방의 작업이 끝나기 만을 기다리고 있기 때문에 결과적으로 아무것도 완료되지 못하는 상태
// - DeakLock 발생 조건
// 상호 배제 (Mutual Exclusion) : 한 자원에 대해 여러 쓰레드 동시 접근 불가
// 점유와 대기 (Hold and Wait) : 자원을 가지고 있는 상태에서 다른 쓰레드가 사용하고 있는 자원 반납을 기다리는 것
// 비선점 (Non Preemptive) : 다른 쓰레드의 자원을 실행 중간에 강제로 가져올 수 없음
// 환형대기 (Circle Wait) : 각 쓰레드가 순환적으로 다음 쓰레드가 요구하는 자원을 가지고 있는 것
// 위의 4가지 조건을 모두 충족할 경우 데드락이 발생


// - 자바의 Thread 생성
// 1. Thread 클래스 상속하여 만들기
// 2. Runnable 인터페이스 구현하여 만들기 (자바는 다중 상속이 허용되지 않으므로 이미 다른 클래스를 상속한 경우 thread를 만들기 위해 Runnable interface를 구현하도록 한다.)
class MyThread extends Thread {

    public void run() { // 쓰레드가 시작될 때 실행될 메소드

        int i;
        for(i = 0; i<200; i++) {
            System.out.print(i + "\t");
        }
    }
}

public class ThreadTest {

    public static void main(String[] args) {
        // 지금까진 main 스레드가 기본적으로 하나 동작하고 있었다.
        System.out.println(Thread.currentThread() + " start"); // 현재 스레드
        // 스레드 생성
        // 스케쥴러에 의해 서로 다른 스레드가 스위치 되면서 실행된다.
        MyThread th1 = new MyThread();
        th1.start();

        MyThread th2 = new MyThread();
        th2.start();
        System.out.println(Thread.currentThread() + " end");
    }

}

