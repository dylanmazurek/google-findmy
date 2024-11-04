package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum lcu implements ljp {
    APP_BLOCK_STATE_UNKNOWN(0),
    ALLOWED(1),
    BANNED(2);

    public final int d;

    lcu(int i) {
        this.d = i;
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
