package com.google.ar.core;

import com.google.ar.core.Anchor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HostCloudAnchorFuture extends FutureImpl {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    class CallbackWrapper {
        private final BiConsumer a;

        public CallbackWrapper(BiConsumer biConsumer) {
            this.a = biConsumer;
        }

        public void accept(String str, int i) {
            this.a.accept(str, Anchor.CloudAnchorState.forNumber(i));
        }
    }

    public HostCloudAnchorFuture(Session session, long j, long j2) {
        super(session, j, j2);
    }

    @Override // com.google.ar.core.FutureImpl, com.google.ar.core.Future
    public /* bridge */ /* synthetic */ boolean cancel() {
        return super.cancel();
    }

    public String getResultCloudAnchorId() {
        return nativeGetResultCloudAnchorId(this.session.nativeWrapperHandle, this.nativeFuture);
    }

    public Anchor.CloudAnchorState getResultCloudAnchorState() {
        return Anchor.CloudAnchorState.forNumber(nativeGetResultCloudAnchorState(this.session.nativeWrapperHandle, this.nativeFuture));
    }

    @Override // com.google.ar.core.FutureImpl, com.google.ar.core.Future
    public /* bridge */ /* synthetic */ FutureState getState() {
        return super.getState();
    }

    public native String nativeGetResultCloudAnchorId(long j, long j2);

    public native int nativeGetResultCloudAnchorState(long j, long j2);
}
