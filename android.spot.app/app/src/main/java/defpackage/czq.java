package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czq implements cyz, czr {
    public final boolean a;
    public final czw b;
    public final czw c;
    public final czw d;
    public final int e;
    private final List f = new ArrayList();

    public czq(dcu dcuVar, dcs dcsVar) {
        this.a = dcsVar.d;
        this.e = dcsVar.e;
        czw a = dcsVar.a.a();
        this.b = a;
        czw a2 = dcsVar.b.a();
        this.c = a2;
        czw a3 = dcsVar.c.a();
        this.d = a3;
        dcuVar.i(a);
        dcuVar.i(a2);
        dcuVar.i(a3);
        a.h(this);
        a2.h(this);
        a3.h(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(czr czrVar) {
        this.f.add(czrVar);
    }

    @Override // defpackage.czr
    public final void d() {
        for (int i = 0; i < this.f.size(); i++) {
            ((czr) this.f.get(i)).d();
        }
    }

    @Override // defpackage.cyz
    public final String g() {
        throw null;
    }

    @Override // defpackage.cyz
    public final void f(List list, List list2) {
    }
}
