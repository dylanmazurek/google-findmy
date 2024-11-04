package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum kye implements ljp {
    DEFAULT_NOT_SHARED(0),
    SHARED_BY_ME(1),
    SHARED_WITH_ME(2),
    SHARED_WITH_ME_PENDING(3),
    UNRECOGNIZED(-1);

    private final int f;

    kye(int i) {
        this.f = i;
    }

    public static kye b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return SHARED_WITH_ME_PENDING;
                }
                return SHARED_WITH_ME;
            }
            return SHARED_BY_ME;
        }
        return DEFAULT_NOT_SHARED;
    }

    @Override // defpackage.ljp
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
