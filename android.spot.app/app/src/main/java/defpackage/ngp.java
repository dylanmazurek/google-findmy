package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ngp implements Closeable {
    public abstract long a();

    public abstract nkr b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a.z(b());
    }
}
