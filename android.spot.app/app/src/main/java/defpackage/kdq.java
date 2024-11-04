package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdq {
    public static final kdq a = new kdq("SHA1");
    public static final kdq b = new kdq("SHA224");
    public static final kdq c = new kdq("SHA256");
    public static final kdq d = new kdq("SHA384");
    public static final kdq e = new kdq("SHA512");
    private final String f;

    private kdq(String str) {
        this.f = str;
    }

    public final String toString() {
        return this.f;
    }
}
