package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvn implements lyw {
    private final mko a;
    private final Class b;
    private final Class c;

    public kvn(mko mkoVar, Class cls, Class cls2) {
        this.a = mkoVar;
        this.b = cls;
        this.c = cls2;
    }

    @Override // defpackage.lyw
    public final lyv a(mbg mbgVar, lys lysVar, lyt lytVar) {
        try {
            Object a = this.a.a();
            hwx.ai(mbgVar, this.b, true);
            hwx.ai(mbgVar, this.c, false);
            return new kvx(new kvt(lytVar, mbgVar, lysVar, (jis) a));
        } catch (mcb e) {
            return new kwj(mca.b(e));
        }
    }
}
