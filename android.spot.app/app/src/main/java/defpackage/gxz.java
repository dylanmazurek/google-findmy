package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxz extends Enum {
    public static final gxz a;
    public static final gxz b;
    public static final gxz c;
    public static final gxz d;
    public static final gxz e;
    public static final gxz f;
    public static final gxz g;
    public static final gxz h;
    public static final gxz i;
    public static final gxz j;
    public static final gxz k;
    private static final /* synthetic */ gxz[] l;

    static {
        gxz gxzVar = new gxz("UNKNOWN", 0);
        a = gxzVar;
        gxz gxzVar2 = new gxz("INVALID_PAYLOAD", 1);
        b = gxzVar2;
        gxz gxzVar3 = new gxz("SILENT_NOTIFICATION", 2);
        c = gxzVar3;
        gxz gxzVar4 = new gxz("HANDLED_BY_APP", 3);
        d = gxzVar4;
        gxz gxzVar5 = new gxz("USER_SUPPRESSED", 4);
        e = gxzVar5;
        gxz gxzVar6 = new gxz("INVALID_TARGET_STATE", 5);
        f = gxzVar6;
        gxz gxzVar7 = new gxz("WORK_PROFILE", 6);
        g = gxzVar7;
        gxz gxzVar8 = new gxz("UNICORN_OR_GRIFFIN_ACCOUNT", 7);
        h = gxzVar8;
        gxz gxzVar9 = new gxz("SEARCH_DISCOVER_DISABLED", 8);
        i = gxzVar9;
        gxz gxzVar10 = new gxz("SEARCH_OUTSIDE_CONTEXT_FENCE", 9);
        j = gxzVar10;
        gxz gxzVar11 = new gxz("SEARCH_ACCOUNT_MISSING_OR_MISMATCH", 10);
        k = gxzVar11;
        gxz[] gxzVarArr = {gxzVar, gxzVar2, gxzVar3, gxzVar4, gxzVar5, gxzVar6, gxzVar7, gxzVar8, gxzVar9, gxzVar10, gxzVar11};
        l = gxzVarArr;
        mjo.t(gxzVarArr);
    }

    private gxz(String str, int i2) {
        super(str, i2);
    }

    public static gxz[] values() {
        return (gxz[]) l.clone();
    }
}
