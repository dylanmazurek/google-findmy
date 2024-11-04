package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvy {
    public static final kvy a = new kvy(1, null, null, null);
    public final lys b;
    public final int c;
    public final kuv d;
    private final jyz e;

    public kvy(int i, kuv kuvVar, jyz jyzVar, lys lysVar) {
        this.c = i;
        this.d = kuvVar;
        this.e = jyzVar;
        this.b = lysVar;
    }

    public static kvy b(mca mcaVar, mbc mbcVar) {
        mcaVar.getClass();
        hwx.V(!mcaVar.f(), "Error status must not be ok");
        return new kvy(2, new kuv(mcaVar, mbcVar), null, null);
    }

    public static kvy c(jyz jyzVar) {
        jyzVar.getClass();
        return new kvy(4, null, jyzVar, null);
    }

    public final jyz a() {
        boolean z;
        if (this.c == 4) {
            z = true;
        } else {
            z = false;
        }
        hwx.U(z);
        return this.e;
    }
}
