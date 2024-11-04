package com.google.ar.core;

import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VpsAvailabilityFuture extends FutureImpl {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    class CallbackWrapper {
        private final Consumer a;

        public CallbackWrapper(Consumer consumer) {
            this.a = consumer;
        }

        public void accept(int i) {
            this.a.accept(VpsAvailability.forNumber(i));
        }
    }

    public VpsAvailabilityFuture(Session session, long j, long j2) {
        super(session, j, j2);
    }

    @Override // com.google.ar.core.FutureImpl, com.google.ar.core.Future
    public /* bridge */ /* synthetic */ boolean cancel() {
        return super.cancel();
    }

    public VpsAvailability getResult() {
        return VpsAvailability.forNumber(nativeGetResult(this.session.nativeWrapperHandle, this.nativeFuture));
    }

    @Override // com.google.ar.core.FutureImpl, com.google.ar.core.Future
    public /* bridge */ /* synthetic */ FutureState getState() {
        return super.getState();
    }

    public native int nativeGetResult(long j, long j2);
}
