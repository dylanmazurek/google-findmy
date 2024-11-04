package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mcx implements mfz {
    private final AtomicLong a = new AtomicLong();

    @Override // defpackage.mfz
    public final void a() {
        this.a.getAndAdd(1L);
    }
}
