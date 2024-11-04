package defpackage;

/* loaded from: classes.dex */
public final class mxl extends mnl {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ ewm c;
    public mxi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxl(ewm ewmVar, mmx mmxVar) {
        super(mmxVar);
        this.c = ewmVar;
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
