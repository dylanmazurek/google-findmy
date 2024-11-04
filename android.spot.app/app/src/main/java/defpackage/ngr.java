package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngr {
    public static final ngr a;
    public static final ngr b;
    public static final ngr c;
    public static final ngr d;
    public static final ngr e;
    private static final /* synthetic */ ngr[] g;
    public final String f;

    static {
        ngr ngrVar = new ngr("TLS_1_3", 0, "TLSv1.3");
        a = ngrVar;
        ngr ngrVar2 = new ngr("TLS_1_2", 1, "TLSv1.2");
        b = ngrVar2;
        ngr ngrVar3 = new ngr("TLS_1_1", 2, "TLSv1.1");
        c = ngrVar3;
        ngr ngrVar4 = new ngr("TLS_1_0", 3, "TLSv1");
        d = ngrVar4;
        ngr ngrVar5 = new ngr("SSL_3_0", 4, "SSLv3");
        e = ngrVar5;
        ngr[] ngrVarArr = {ngrVar, ngrVar2, ngrVar3, ngrVar4, ngrVar5};
        g = ngrVarArr;
        mjo.t(ngrVarArr);
    }

    private ngr(String str, int i, String str2) {
        this.f = str2;
    }

    public static ngr[] values() {
        return (ngr[]) g.clone();
    }
}
