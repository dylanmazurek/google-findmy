package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hts {
    private static final fma f = new fma();
    public final mko b;
    public final fma e;
    public final Object a = new Object();
    public int c = 0;
    public long d = 0;

    public hts(mko mkoVar, fma fmaVar) {
        this.b = mkoVar;
        this.e = fmaVar;
    }

    public static hts a(final int i) {
        return new hts(new mko() { // from class: htr
            @Override // defpackage.mko, defpackage.mkn
            public final Object a() {
                return Integer.valueOf(i);
            }
        }, f);
    }
}
