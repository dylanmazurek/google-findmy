package defpackage;

import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class idg implements jxj {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ idg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v24, types: [jxd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object, java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    @Override // defpackage.jxj
    public final jxp a(jck jckVar, Object obj) {
        Stream filter;
        int i = this.b;
        int i2 = 11;
        if (i != 0) {
            int i3 = 2;
            if (i != 1) {
                if (i != 2) {
                    return new jxp(this.a.a(obj));
                }
                return ((jbw) this.a).a;
            }
            Object obj2 = this.a;
            jis c = ((emz) obj2).a.c();
            if (c == null) {
                filter = Stream.CC.empty();
            } else {
                filter = Collection.EL.stream(c).filter(new ehc(obj2, i3));
            }
            Stream map = filter.map(new eka(obj2, 3));
            int i4 = jis.d;
            Iterable iterable = (Iterable) map.collect(jgr.a);
            jin jinVar = new jin();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                jinVar.h(((jbw) it.next()).a);
            }
            kuv kuvVar = new kuv(jinVar.g());
            jxv jxvVar = jxv.a;
            int i5 = jbn.a;
            jxp jxpVar = new jxp(ivc.Q(jht.b(kuvVar.b).c(new ihq(11)).d()).a(new jxf(kuvVar, new njz(jbu.b()), 2), jxvVar));
            jxpVar.c.a(kuvVar.a, jxv.a);
            return new jbw(jxpVar).a;
        }
        Object obj3 = this.a;
        final idt idtVar = (idt) obj3;
        jua juaVar = idtVar.u;
        Object obj4 = jub.a;
        juaVar.getClass();
        jer i6 = jer.i(idtVar.d);
        jfe jfeVar = new jfe() { // from class: idi
            @Override // defpackage.jfe
            public final Object a() {
                jyz jyzVar;
                jyz f;
                jyz F;
                idt idtVar2 = idt.this;
                jer jerVar = ((ibj) ((jeu) idtVar2.g).a).c;
                if (!jerVar.g()) {
                    F = jyv.a;
                } else {
                    jyz p = iuu.p(bei.d(new icy(idtVar2, 5)), new hxj(idtVar2, 14), idtVar2.d);
                    synchronized (idtVar2.h) {
                        jyz jyzVar2 = (jyz) idtVar2.h.get(jerVar.c());
                        if (jyzVar2 == null) {
                            jyzVar2 = jyv.a;
                        }
                        jyzVar = jyzVar2;
                        f = iuu.E(jyzVar, p).f(new hxl(3), jxv.a);
                        idtVar2.h.put(jerVar.c(), f);
                    }
                    p.c(new hlt(idtVar2, f, jerVar, 5, (byte[]) null), idtVar2.d);
                    F = ivc.F(jyzVar);
                }
                return jbx.d(F).f(new hxj(idtVar2, 13), idtVar2.d);
            }
        };
        jtv jtvVar = new jtv(((ibj) ((jeu) idtVar.g).a).a);
        etw etwVar = new etw(obj3, 5);
        hwx.V(true, "Either executor or scheduledExecutorService needs to be set.");
        ?? r7 = ((jeu) i6).a;
        return new jxp(jbx.d(new jub(jfeVar, jtvVar, etwVar, r7, r7, idtVar.b, juaVar)).h(((ibj) ((jeu) idtVar.g).a).a, TimeUnit.MILLISECONDS, idtVar.d).f(new etl(i2), idtVar.d).b(jtq.class, new etl(12), jxv.a).b(TimeoutException.class, new etl(13), jxv.a));
    }

    public idg(jxd jxdVar, int i) {
        this.b = i;
        this.a = jxdVar;
    }
}
