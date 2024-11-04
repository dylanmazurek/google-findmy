package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum lfb implements ljp {
    APP_BLOCK_STATE_UNKNOWN(0),
    ALLOWED(1),
    BANNED(2);

    public final int d;

    lfb(int i) {
        this.d = i;
    }

    public static lfb b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return BANNED;
            }
            return ALLOWED;
        }
        return APP_BLOCK_STATE_UNKNOWN;
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
