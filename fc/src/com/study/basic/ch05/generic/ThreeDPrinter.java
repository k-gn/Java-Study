package com.study.basic.ch05.generic;

public class ThreeDPrinter {

    // Object를 사용하는 경우는 사용할 때마다 형 변환을 하여야 함
    private Object material;

    public void setMaterial(Object material) {
        this.material = material;
    }

    public Object getMaterial() {
        return material;
    }

}
