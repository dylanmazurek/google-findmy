package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avz implements awi {
    final /* synthetic */ awd a;
    final /* synthetic */ int b;
    final /* synthetic */ awi c;
    private final /* synthetic */ awi d;
    private final /* synthetic */ int e;

    public avz(awi awiVar, awd awdVar, int i, awi awiVar2, int i2) {
        this.e = i2;
        this.a = awdVar;
        this.b = i;
        this.c = awiVar2;
        this.d = awiVar;
    }

    @Override // defpackage.awi
    public final int a() {
        if (this.e != 0) {
            return this.d.a();
        }
        return this.d.a();
    }

    @Override // defpackage.awi
    public final int b() {
        if (this.e != 0) {
            return this.d.b();
        }
        return this.d.b();
    }

    @Override // defpackage.awi
    public final Map c() {
        if (this.e != 0) {
            return this.d.c();
        }
        return this.d.c();
    }

    @Override // defpackage.awi
    public final void d() {
        if (this.e != 0) {
            this.a.d = this.b;
            this.c.d();
            awd awdVar = this.a;
            Set entrySet = awdVar.j.entrySet();
            zc zcVar = new zc(awdVar, 10);
            entrySet.getClass();
            Iterator it = entrySet.iterator();
            while (it.hasNext()) {
                if (((Boolean) zcVar.a(it.next())).booleanValue()) {
                    it.remove();
                }
            }
            return;
        }
        this.a.c = this.b;
        this.c.d();
        awd awdVar2 = this.a;
        awdVar2.g(awdVar2.c);
    }

    @Override // defpackage.awi
    public final void e() {
        if (this.e != 0) {
            this.d.e();
        } else {
            this.d.e();
        }
    }
}
