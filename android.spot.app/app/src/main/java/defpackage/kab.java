package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kab {
    public static final kab a = new kab("ENABLED");
    public static final kab b = new kab("DISABLED");
    public static final kab c = new kab("DESTROYED");
    private final String d;

    private kab(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
