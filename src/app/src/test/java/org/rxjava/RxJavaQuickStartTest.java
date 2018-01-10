package org.rxjava;

import org.junit.Test;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

import static java.lang.System.out;

/**
 * Created by test on 2018/1/9.
 */

public class RxJavaQuickStartTest {
    @Test
    public void quickStart() {
        Observable.just("Hello Rxjava").subscribe(
                x -> out.println(x)
        );
    }
}
