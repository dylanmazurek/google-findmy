package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxv {
    public static final gxv a;
    public static final gxv b;
    public static final gxv c;
    private static final /* synthetic */ gxv[] d;

    static {
        gxv gxvVar = new gxv("CLEARTEXT", 0);
        a = gxvVar;
        gxv gxvVar2 = new gxv("ENCRYPTED", 1);
        b = gxvVar2;
        gxv gxvVar3 = new gxv("PLACEHOLDER", 2);
        c = gxvVar3;
        gxv[] gxvVarArr = {gxvVar, gxvVar2, gxvVar3};
        d = gxvVarArr;
        mjo.t(gxvVarArr);
    }

    private gxv(String str, int i) {
    }

    public static gxv[] values() {
        return (gxv[]) d.clone();
    }
}
