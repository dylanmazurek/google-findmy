package defpackage;

import java.io.File;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkd implements dkg, djd {
    private final List a;
    private final dkh b;
    private final dkf c;
    private int d = -1;
    private dir e;
    private List f;
    private int g;
    private File h;
    private volatile bso i;

    public dkd(List list, dkh dkhVar, dkf dkfVar) {
        this.a = list;
        this.b = dkhVar;
        this.c = dkfVar;
    }

    private final boolean d() {
        if (this.g < this.f.size()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, dje] */
    @Override // defpackage.dkg
    public final void a() {
        bso bsoVar = this.i;
        if (bsoVar != null) {
            bsoVar.c.cr();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, dje] */
    @Override // defpackage.djd
    public final void b(Object obj) {
        this.c.d(this.e, obj, this.i.c, 3, this.e);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, dje] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, dje] */
    @Override // defpackage.dkg
    public final boolean c() {
        while (true) {
            boolean z = false;
            if (this.f != null && d()) {
                this.i = null;
                while (!z && d()) {
                    List list = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    dnp dnpVar = (dnp) list.get(i);
                    File file = this.h;
                    dkh dkhVar = this.b;
                    this.i = dnpVar.b(file, dkhVar.e, dkhVar.f, dkhVar.h);
                    if (this.i != null && this.b.g(this.i.c.a())) {
                        this.i.c.f(this.b.n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= this.a.size()) {
                return false;
            }
            dir dirVar = (dir) this.a.get(this.d);
            dkh dkhVar2 = this.b;
            File a = dkhVar2.c().a(new dke(dirVar, dkhVar2.m));
            this.h = a;
            if (a != null) {
                this.e = dirVar;
                this.f = this.b.f(a);
                this.g = 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, dje] */
    @Override // defpackage.djd
    public final void e(Exception exc) {
        this.c.b(this.e, exc, this.i.c, 3);
    }
}
