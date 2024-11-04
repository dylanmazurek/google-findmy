package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gri {
    public static final gri a;
    public static final gri b;
    public static final gri c;
    public static final gri d;
    public static final gri e;
    public static final gri f;
    private static final /* synthetic */ gri[] g;

    static {
        gri griVar = new gri("PRODUCTION", 0);
        a = griVar;
        gri griVar2 = new gri("AUTOPUSH", 1);
        b = griVar2;
        gri griVar3 = new gri("AUTOPUSH_QUAL_PLAYGROUND", 2);
        c = griVar3;
        gri griVar4 = new gri("STAGING", 3);
        d = griVar4;
        gri griVar5 = new gri("STAGING_QUAL_QA", 4);
        e = griVar5;
        gri griVar6 = new gri("DEV", 5);
        f = griVar6;
        gri[] griVarArr = {griVar, griVar2, griVar3, griVar4, griVar5, griVar6};
        g = griVarArr;
        mjo.t(griVarArr);
    }

    private gri(String str, int i) {
    }

    public static gri[] values() {
        return (gri[]) g.clone();
    }
}
