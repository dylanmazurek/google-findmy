package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kkx {
    public static final kkx a = new kkx("SHA256");
    public static final kkx b = new kkx("SHA384");
    public static final kkx c = new kkx("SHA512");
    private final String d;

    private kkx(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
