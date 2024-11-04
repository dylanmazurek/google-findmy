package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ice implements iay {
    final /* synthetic */ Set a;
    final /* synthetic */ iay b;
    final /* synthetic */ Set c;
    final /* synthetic */ Set d;

    public ice(Set set, iay iayVar, Set set2, Set set3) {
        this.a = set;
        this.b = iayVar;
        this.c = set2;
        this.d = set3;
    }

    @Override // defpackage.iay
    public final void f(fze fzeVar) {
        lim b = ifv.b(fzeVar.a());
        if (this.a.contains(b)) {
            this.b.f(fzeVar);
            return;
        }
        if (!this.c.contains(b)) {
            if (this.d.contains(b)) {
                this.a.add(b);
                this.b.f(fzeVar);
            } else {
                this.c.add(b);
            }
        }
    }

    @Override // defpackage.iay
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.iay
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.iay
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.iay
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.iay
    public final void b(int i) {
    }
}
