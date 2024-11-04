package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avx implements awi {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ Map c;
    final /* synthetic */ avy d;
    final /* synthetic */ awd e;
    final /* synthetic */ moh f;

    public avx(int i, int i2, Map map, avy avyVar, awd awdVar, moh mohVar) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = avyVar;
        this.e = awdVar;
        this.f = mohVar;
    }

    @Override // defpackage.awi
    public final int a() {
        return this.b;
    }

    @Override // defpackage.awi
    public final int b() {
        return this.a;
    }

    @Override // defpackage.awi
    public final Map c() {
        return this.c;
    }

    @Override // defpackage.awi
    public final void d() {
        azd azdVar;
        if (this.d.n() && (azdVar = ((ayh) this.e.a.s()).g) != null) {
            this.f.a(azdVar.k);
        } else {
            this.f.a(this.e.a.s().k);
        }
    }

    @Override // defpackage.awi
    public final void e() {
    }
}
