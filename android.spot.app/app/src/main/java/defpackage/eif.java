package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class eif {
    public static final eif a;
    public static final eif b;
    public static final eif c;
    private static final /* synthetic */ eif[] d;

    static {
        eif eifVar = new eif("AVAILABLE", 0);
        a = eifVar;
        eif eifVar2 = new eif("DISABLED", 1);
        b = eifVar2;
        eif eifVar3 = new eif("UNAVAILABLE", 2);
        c = eifVar3;
        eif[] eifVarArr = {eifVar, eifVar2, eifVar3};
        d = eifVarArr;
        mjo.t(eifVarArr);
    }

    private eif(String str, int i) {
    }

    public static eif[] values() {
        return (eif[]) d.clone();
    }
}
