package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbt extends nbu {
    public static final nbt a = new nbt();

    private nbt() {
        super(nby.c, nby.d, nby.e, nby.a);
    }

    @Override // defpackage.nbu, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.mst
    public final String toString() {
        return "Dispatchers.Default";
    }
}
