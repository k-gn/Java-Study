package com.app.thejava;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
	기본적으로 어노테이션 정보는 클래스 까진 남는다.
	하지만, 런타임 시엔 존재하지 않는다.

	런타임까지 애노테이션을 가지고 있도록해야 리플렉션 시 조회가 된다.
 */
@Retention(RetentionPolicy.RUNTIME)
/*
	어노테이션을 지정할 수 있는 타겟 정의
 */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
/*
	어노테이션이 상속되도록 정의
 */
@Inherited
public @interface MyAnnotation {

	/*
		원시타입과 박싱 타입값들을 선언해줄 수 있다.
		추가로 기본값들을 가질 수 있다.
	 */
	String name() default "no name";

	int number() default 100;

	/*
		value 값은 어노테이션 사용 시 (key = value) 형태가 아닌 (value) 형태로 사용할 수 있다.
	 */
	String value() default "no value";
}
