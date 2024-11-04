package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ndy implements ljp {
    UNKNOWN(0),
    CRONET(1);

    public final int c;

    ndy(int i) {
        this.c = i;
    }

    public static ndy b(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return CRONET;
        }
        return UNKNOWN;
    }

    @Override // defpackage.ljp
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
