package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khc {
    public static final khc a = new khc("SHA1");
    public static final khc b = new khc("SHA224");
    public static final khc c = new khc("SHA256");
    public static final khc d = new khc("SHA384");
    public static final khc e = new khc("SHA512");
    private final String f;

    private khc(String str) {
        this.f = str;
    }

    public final String toString() {
        return this.f;
    }
}
