package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kle {
    public static final kle a = new kle("SHA256");
    public static final kle b = new kle("SHA384");
    public static final kle c = new kle("SHA512");
    private final String d;

    private kle(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
