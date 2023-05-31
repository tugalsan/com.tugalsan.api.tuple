package com.tugalsan.api.pack.client;

import com.google.gwt.user.client.rpc.IsSerializable;

public class TGS_Tuple1<A> implements IsSerializable {

    public TGS_Tuple1() {//DTO
    }

    public TGS_Tuple1(A value0) {
        this.value0 = value0;
    }
    public A value0;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + value0 + "]";
    }

    public boolean isEmpty() {
        return value0 == null;
    }

    public boolean isPresent() {
        return !isEmpty();
    }

    public static <A> TGS_Tuple1<A> of(A value0) {
        return new TGS_Tuple1(value0);
    }

    public static <A> TGS_Tuple1<A> of() {
        return new TGS_Tuple1();
    }
}
