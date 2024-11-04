package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hft implements hcq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hft(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.hcq
    public final hcu a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                heh hehVar = (heh) this.a;
                int i2 = hehVar.a;
                hdw a = hdy.a();
                a.e(i2);
                a.a = hehVar.b;
                a.d(hehVar.c);
                a.f(hehVar.d);
                a.h(hehVar.e);
                a.g(hehVar.f);
                a.b = hehVar.g;
                a.c(hehVar.h);
                return new hcp(a.a());
            }
            hcp hcpVar = new hcp((hdy) this.a);
            hcpVar.j(hdg.COMMON_ACTION_CARD);
            return hcpVar;
        }
        return (hcu) this.a;
    }
}
