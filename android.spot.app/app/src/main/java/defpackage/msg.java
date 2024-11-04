package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class msg extends msm {
    public final mro a;

    public msg(mmx mmxVar, Throwable th, boolean z) {
        super(th == null ? new CancellationException(a.af(mmxVar, "Continuation ", " was cancelled normally")) : th, z);
        this.a = new mro(false, mrs.a);
    }
}
