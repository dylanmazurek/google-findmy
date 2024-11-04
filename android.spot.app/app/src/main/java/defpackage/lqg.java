package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum lqg implements ljp {
    TOKEN_TYPE_UNKNOWN(0),
    TOKEN_TYPE_CAR(1),
    UNRECOGNIZED(-1);

    private final int d;

    lqg(int i) {
        this.d = i;
    }

    @Override // defpackage.ljp
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
