package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcm {
    public static final String a;
    public static final String b;

    static {
        String replaceAll = String.valueOf(fgq.c / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
        a = replaceAll;
        b = "ma".concat(String.valueOf(replaceAll));
    }
}
