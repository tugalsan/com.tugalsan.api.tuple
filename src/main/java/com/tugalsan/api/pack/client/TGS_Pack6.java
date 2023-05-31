package com.tugalsan.api.pack.client;

import com.google.gwt.user.client.rpc.IsSerializable;

public class TGS_Tuple6<A, B, C, D, E, F> implements IsSerializable {

    public TGS_Tuple6() {//DTO
    }

    public TGS_Tuple6(A value0, B value1, C value2, D value3, E value4, F value5) {
        this.value0 = value0;
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
        this.value5 = value5;
    }
    public A value0;
    public B value1;
    public C value2;
    public D value3;
    public E value4;
    public F value5;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + value0 + "," + value1 + "," + value2 + "," + value3 + "," + value4 + "," + value5 + "]";
    }

    public boolean isEmpty() {
        return value0 == null;
    }

    public boolean isPresent() {
        return !isEmpty();
    }

    public static <A, B, C, D, E, F> TGS_Tuple6<A, B, C, D, E, F> of(A value0, B value1, C value2, D value3, E value4, F value5) {
        return new TGS_Tuple6(value0, value1, value2, value3, value4, value5);
    }

    public static <A, B, C, D, E, F> TGS_Tuple6<A, B, C, D, E, F> of() {
        return new TGS_Tuple6();
    }
}
