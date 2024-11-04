package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdr {
    public static final kdr a = new kdr("COMPRESSED");
    public static final kdr b = new kdr("UNCOMPRESSED");
    public static final kdr c = new kdr("LEGACY_UNCOMPRESSED");
    private final String d;

    private kdr(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
