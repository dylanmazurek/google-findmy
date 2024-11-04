package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum lon implements ljp {
    TOS_VERSION_UPDATED(0),
    TOS_VERSION_IGNORED(1),
    TOS_VERSION_MISSING(2);

    private final int d;

    lon(int i) {
        this.d = i;
    }

    public static lon b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return TOS_VERSION_MISSING;
            }
            return TOS_VERSION_IGNORED;
        }
        return TOS_VERSION_UPDATED;
    }

    @Override // defpackage.ljp
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
