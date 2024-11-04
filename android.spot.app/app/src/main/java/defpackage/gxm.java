package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxm {
    public static final gxm a;
    public static final gxm b;
    public static final gxm c;
    private static final /* synthetic */ gxm[] d;

    static {
        gxm gxmVar = new gxm("PRIORITY_UNKNOWN", 0);
        a = gxmVar;
        gxm gxmVar2 = new gxm("PRIORITY_NORMAL", 1);
        b = gxmVar2;
        gxm gxmVar3 = new gxm("PRIORITY_HIGH", 2);
        c = gxmVar3;
        gxm[] gxmVarArr = {gxmVar, gxmVar2, gxmVar3};
        d = gxmVarArr;
        mjo.t(gxmVarArr);
    }

    private gxm(String str, int i) {
    }

    public static gxm[] values() {
        return (gxm[]) d.clone();
    }
}
