package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class eki {
    public static final eki a;
    public static final eki b;
    private static final /* synthetic */ eki[] c;

    static {
        eki ekiVar = new eki("NONE", 0);
        a = ekiVar;
        eki ekiVar2 = new eki("NEW_SHARED_OWNER", 1);
        b = ekiVar2;
        eki[] ekiVarArr = {ekiVar, ekiVar2};
        c = ekiVarArr;
        mjo.t(ekiVarArr);
    }

    private eki(String str, int i) {
    }

    public static eki[] values() {
        return (eki[]) c.clone();
    }
}
