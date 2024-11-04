package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mfe implements mjq {
    @Override // defpackage.mjq
    public final /* bridge */ /* synthetic */ Object a() {
        return Executors.newCachedThreadPool(mfh.h("grpc-default-executor-%d"));
    }

    @Override // defpackage.mjq
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    public final String toString() {
        return "grpc-default-executor";
    }
}
