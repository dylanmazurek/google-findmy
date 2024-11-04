package defpackage;

/* loaded from: classes.dex */
public final class mxf extends mnl {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public mzv d;
    final /* synthetic */ ewm e;
    public ewm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxf(ewm ewmVar, mmx mmxVar) {
        super(mmxVar);
        this.e = ewmVar;
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
