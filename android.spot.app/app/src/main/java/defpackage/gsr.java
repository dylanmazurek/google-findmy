package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsr {
    public static final gsr a;
    public static final gsr b;
    public static final gsr c;
    public static final gsr d;
    private static final /* synthetic */ gsr[] f;
    public final int e;

    static {
        gsr gsrVar = new gsr("UNKNOWN", 0, 0);
        a = gsrVar;
        gsr gsrVar2 = new gsr("SIGNED_IN", 1, 1);
        b = gsrVar2;
        gsr gsrVar3 = new gsr("SIGNED_OUT_ZWIEBACK", 2, 2);
        c = gsrVar3;
        gsr gsrVar4 = new gsr("SIGNED_OUT_YOUTUBE_VISITOR", 3, 3);
        d = gsrVar4;
        gsr[] gsrVarArr = {gsrVar, gsrVar2, gsrVar3, gsrVar4};
        f = gsrVarArr;
        mjo.t(gsrVarArr);
    }

    private gsr(String str, int i, int i2) {
        this.e = i2;
    }

    public static gsr[] values() {
        return (gsr[]) f.clone();
    }
}
