package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mcw extends map {
    final mah a;
    final lzz b;
    final mdh c;
    final mdi d;
    List e;
    mfv f;
    boolean g;
    boolean h;
    final /* synthetic */ mgu i;
    mrx j;

    public mcw() {
        throw null;
    }

    @Override // defpackage.map
    public final void a() {
        this.i.m.c();
        hwx.V(this.g, "not started");
        this.f.a();
    }

    @Override // defpackage.map
    public final void b() {
        mrx mrxVar;
        this.i.m.c();
        if (this.f == null) {
            this.h = true;
            return;
        }
        if (this.h) {
            if (this.i.B && (mrxVar = this.j) != null) {
                mrxVar.a();
                this.j = null;
            } else {
                return;
            }
        } else {
            this.h = true;
        }
        mgu mguVar = this.i;
        if (!mguVar.B) {
            this.j = mguVar.m.d(new mfy(new mgs(this, 0)), 5L, TimeUnit.SECONDS, this.i.i.a());
        } else {
            this.f.f(mgu.b);
        }
    }

    @Override // defpackage.map
    public final void c(mar marVar) {
        this.i.m.c();
        hwx.V(!this.g, "already started");
        hwx.V(!this.h, "already shutdown");
        hwx.V(!this.i.B, "Channel is being terminated");
        this.g = true;
        mgu mguVar = this.i;
        String b = mguVar.b();
        mdv mdvVar = mguVar.i;
        ScheduledExecutorService a = mdvVar.a();
        mfr mfrVar = new mfr(this, marVar);
        mgu mguVar2 = this.i;
        mfv mfvVar = new mfv(this.a.a, b, mguVar.q, mdvVar, a, mguVar2.m, mfrVar, mguVar2.G, mguVar2.R.c(), this.b, this.c, mguVar2.p);
        lzt lztVar = new lzt();
        lztVar.a = "Child Subchannel started";
        lztVar.b = lzu.CT_INFO;
        lztVar.b(this.i.l.a());
        lztVar.d = mfvVar;
        this.i.E.b(lztVar.a());
        this.f = mfvVar;
        lzw.a(this.i.G.c, mfvVar);
        this.i.v.add(mfvVar);
    }

    @Override // defpackage.map
    public final void d(List list) {
        this.i.m.c();
        this.e = list;
        mfv mfvVar = this.f;
        list.getClass();
        mfv.i(list);
        hwx.K(!list.isEmpty(), "newAddressGroups is empty");
        mfvVar.f.execute(new kvz(mfvVar, DesugarCollections.unmodifiableList(new ArrayList(list)), 14));
    }

    public final String toString() {
        return this.b.toString();
    }

    public mcw(mgu mguVar, mah mahVar) {
        this.i = mguVar;
        this.e = mahVar.a;
        this.a = mahVar;
        lzz b = lzz.b("Subchannel", mguVar.b());
        this.b = b;
        mdi mdiVar = new mdi(b, mguVar.l.a(), "Subchannel for ".concat(mahVar.a.toString()));
        this.d = mdiVar;
        this.c = new mdh(mdiVar, mguVar.l);
    }
}
