package defpackage;

/* loaded from: classes.dex */
public final class mxe extends mnl {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public Object d;
    final /* synthetic */ ewm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxe(ewm ewmVar, mmx mmxVar) {
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
