package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mha extends mfb {
    private static final ReferenceQueue b = new ReferenceQueue();
    private static final ConcurrentMap c = new ConcurrentHashMap();
    public static final Logger a = Logger.getLogger(mha.class.getName());

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mha(mav mavVar) {
        super(mavVar);
        ReferenceQueue referenceQueue = b;
        ConcurrentMap concurrentMap = c;
        new mgz(this, mavVar, referenceQueue, concurrentMap);
    }
}
