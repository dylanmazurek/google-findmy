package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpr {
    public static final gpr a;
    public static final gpr b;
    public static final gpr c;
    private static final /* synthetic */ gpr[] d;

    static {
        gpr gprVar = new gpr("INVALID", 0);
        a = gprVar;
        gpr gprVar2 = new gpr("SYSTEM_TRAY", 1);
        b = gprVar2;
        gpr gprVar3 = new gpr("IN_APP", 2);
        c = gprVar3;
        gpr[] gprVarArr = {gprVar, gprVar2, gprVar3};
        d = gprVarArr;
        mjo.t(gprVarArr);
    }

    private gpr(String str, int i) {
    }

    public static gpr[] values() {
        return (gpr[]) d.clone();
    }
}
