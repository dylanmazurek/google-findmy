package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdp {
    public static final kdp a = new kdp("NIST_P256");
    public static final kdp b = new kdp("NIST_P384");
    public static final kdp c = new kdp("NIST_P521");
    public static final kdp d = new kdp("X25519");
    private final String e;

    private kdp(String str) {
        this.e = str;
    }

    public final String toString() {
        return this.e;
    }
}
