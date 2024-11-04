package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aty extends CancellationException {
    public static final aty a = new aty();

    private aty() {
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(auv.b);
        return this;
    }
}
