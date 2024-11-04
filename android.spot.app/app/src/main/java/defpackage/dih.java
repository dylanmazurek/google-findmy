package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dih {
    public static final dih a;
    public static final dih b;
    public static final dih c;
    public static final dih d;
    private static final /* synthetic */ dih[] e;

    static {
        dih dihVar = new dih("CLEARED", 0);
        a = dihVar;
        dih dihVar2 = new dih("RUNNING", 1);
        b = dihVar2;
        dih dihVar3 = new dih("SUCCEEDED", 2);
        c = dihVar3;
        dih dihVar4 = new dih("FAILED", 3);
        d = dihVar4;
        dih[] dihVarArr = {dihVar, dihVar2, dihVar3, dihVar4};
        e = dihVarArr;
        mjo.t(dihVarArr);
    }

    private dih(String str, int i) {
    }

    public static dih[] values() {
        return (dih[]) e.clone();
    }
}
