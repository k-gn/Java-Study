package com.study.basic.ch05.generic;

// 제네릭 타입을 사용하지 않는 경우의 예
// 타입마다 프린터를 만들어야함,,
public class ThreeDPrinter1 {

    private Powder material;

    public void setMaterial(Powder material) {
        this.material = material;
    }

    public Powder getMaterial() {
        return material;
    }

}
