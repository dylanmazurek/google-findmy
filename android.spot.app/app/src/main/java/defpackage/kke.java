package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kke {
    public static final kke a = new kke("SHA256");
    public static final kke b = new kke("SHA384");
    public static final kke c = new kke("SHA512");
    public final String d;

    private kke(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
