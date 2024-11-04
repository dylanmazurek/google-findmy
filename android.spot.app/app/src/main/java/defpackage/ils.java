package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ils implements jxd {
    public final List a;
    public final Executor b;

    public ils(List list, Executor executor) {
        this.a = list;
        this.b = executor;
    }

    @Override // defpackage.jxd
    public final /* bridge */ /* synthetic */ jyz a(Object obj) {
        njz njzVar = (njz) obj;
        int i = ((jmi) this.a).c;
        ArrayList arrayList = new ArrayList(i);
        jmx it = ((jis) this.a).iterator();
        while (it.hasNext()) {
            arrayList.add(((ilq) it.next()).b());
        }
        jxd c = jbn.c(new gfm(this, arrayList, i, 4));
        return jwu.h(hrb.h(jwu.h(ivc.F(((imf) njzVar.a).c.c()), jbn.c(new gfl(njzVar, c, jxv.a, 17, (byte[]) null)), jxv.a)), jbn.c(new gfm(this, i, arrayList, 5)), jxv.a);
    }
}
