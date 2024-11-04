package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewf {
    public final Object a;
    public Object b;
    private final Object c;
    private final Object d;

    public ewf(Map map, ewf ewfVar) {
        this.c = new cfm(eul.a(euk.UNKNOWN));
        this.b = jdl.a;
        this.a = map;
        this.d = ewfVar;
        ewfVar.c(new ela(this, 9));
    }

    private final void k(lqc lqcVar, boolean z) {
        if (lqcVar == null && this.b == null) {
            return;
        }
        boolean p = eyf.p((lqc) this.b, lqcVar);
        this.b = lqcVar;
        if (!p || z) {
            ((dhx) this.d).i();
        }
        ((dhx) this.c).i();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [lqz, java.lang.Object] */
    public final lqc a() {
        Object obj = this.b;
        if (obj != null) {
            return (lqc) obj;
        }
        jis jisVar = ((ewc) this.a.a()).c;
        if (jisVar != null && !jisVar.isEmpty()) {
            jer jerVar = ((ewc) this.a.a()).l;
            if (jerVar.g()) {
                ((ewc) this.a.a()).q(jdl.a);
                h((lqc) eyf.c(jisVar, (String) jerVar.c()).f());
            }
        }
        return (lqc) this.b;
    }

    public final void b(ewk ewkVar) {
        ((dhx) this.c).h(ewkVar);
    }

    public final void c(ewk ewkVar) {
        ((dhx) this.d).h(ewkVar);
    }

    public final void d(lqc lqcVar) {
        k(lqcVar, false);
    }

    public final void e(lqc lqcVar) {
        k(lqcVar, true);
    }

    public final void f(ewk ewkVar) {
        ((dhx) this.c).j(ewkVar);
    }

    public final void g(ewk ewkVar) {
        ((dhx) this.d).j(ewkVar);
    }

    public final void h(lqc lqcVar) {
        k(lqcVar, false);
    }

    public final cfk i() {
        if (!((jer) this.b).g()) {
            j();
        }
        return (cfk) this.c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final void j() {
        if (((jer) this.b).g()) {
            Object obj = this.c;
            cfl cflVar = (cfl) ((cfm) obj).h.b(((jer) this.b).c());
            if (cflVar != null) {
                cflVar.c();
            }
            this.b = jdl.a;
        }
        lqc a = ((ewf) this.d).a();
        if (a == null) {
            ((cfk) this.c).i(eul.a(euk.UNKNOWN));
            return;
        }
        ?? r1 = this.a;
        lqd lqdVar = a.d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        lqf b = lqf.b(lqdVar.c);
        if (b == null) {
            b = lqf.UNRECOGNIZED;
        }
        euj eujVar = (euj) r1.get(b);
        if (eujVar == null) {
            ((cfk) this.c).i(eul.a(euk.UNKNOWN));
            return;
        }
        jer i = jer.i(eujVar.a());
        this.b = i;
        Object obj2 = this.c;
        cfm cfmVar = (cfm) obj2;
        cfmVar.o((cfk) i.c(), new euc(this.c, 6));
    }

    public ewf(lqz lqzVar) {
        this.a = lqzVar;
        this.c = new dhx((short[]) null);
        this.d = new dhx((short[]) null);
    }
}
