package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngi {
    public static final ngi a;
    public static final ngi b;

    @mkp
    public static final ngi c;
    public static final ngi d;
    public static final ngi e;
    public static final ngi f;
    private static final /* synthetic */ ngi[] h;
    public final String g;

    static {
        ngi ngiVar = new ngi("HTTP_1_0", 0, "http/1.0");
        a = ngiVar;
        ngi ngiVar2 = new ngi("HTTP_1_1", 1, "http/1.1");
        b = ngiVar2;
        ngi ngiVar3 = new ngi("SPDY_3", 2, "spdy/3.1");
        c = ngiVar3;
        ngi ngiVar4 = new ngi("HTTP_2", 3, "h2");
        d = ngiVar4;
        ngi ngiVar5 = new ngi("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        e = ngiVar5;
        ngi ngiVar6 = new ngi("QUIC", 5, "quic");
        f = ngiVar6;
        ngi[] ngiVarArr = {ngiVar, ngiVar2, ngiVar3, ngiVar4, ngiVar5, ngiVar6};
        h = ngiVarArr;
        mjo.t(ngiVarArr);
    }

    private ngi(String str, int i, String str2) {
        this.g = str2;
    }

    public static ngi[] values() {
        return (ngi[]) h.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.g;
    }
}
