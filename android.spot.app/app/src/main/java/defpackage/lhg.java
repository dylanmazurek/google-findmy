package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum lhg implements ljp {
    VALUE_ORIGIN_UNKNOWN(0),
    IN_MEMORY_CACHE(1),
    PERSISTENT_CACHE(2),
    CACHE_MISS(3);

    public final int e;

    lhg(int i) {
        this.e = i;
    }

    @Override // defpackage.ljp
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
