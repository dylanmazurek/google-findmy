package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kar {
    public static final kar a = new kar("SHA1");
    public static final kar b = new kar("SHA224");
    public static final kar c = new kar("SHA256");
    public static final kar d = new kar("SHA384");
    public static final kar e = new kar("SHA512");
    private final String f;

    private kar(String str) {
        this.f = str;
    }

    public final String toString() {
        return this.f;
    }
}
