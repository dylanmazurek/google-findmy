package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum lfe implements ljp {
    CHANNEL_GROUP_UNKNOWN(0),
    ALLOWED(1),
    BANNED(2);

    public final int d;

    lfe(int i) {
        this.d = i;
    }

    public static lfe b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return BANNED;
            }
            return ALLOWED;
        }
        return CHANNEL_GROUP_UNKNOWN;
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
