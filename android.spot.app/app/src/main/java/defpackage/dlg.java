package defpackage;

import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlg implements dkg, djd {
    private final dkf a;
    private final dkh b;
    private int c;
    private int d = -1;
    private dir e;
    private List f;
    private int g;
    private File h;
    private dlh i;
    private volatile bso j;

    public dlg(dkh dkhVar, dkf dkfVar) {
        this.b = dkhVar;
        this.a = dkfVar;
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
        bso bsoVar = this.j;
        if (bsoVar != null) {
            bsoVar.c.cr();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, dje] */
    @Override // defpackage.djd
    public final void b(Object obj) {
        this.a.d(this.e, obj, this.j.c, 4, this.i);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, dje] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, dje] */
    @Override // defpackage.dkg
    public final boolean c() {
        List list;
        List d = this.b.d();
        boolean z = false;
        if (d.isEmpty()) {
            return false;
        }
        dkh dkhVar = this.b;
        dgy a = dkhVar.c.a();
        Class<?> cls = dkhVar.d.getClass();
        Class cls2 = dkhVar.g;
        Class cls3 = dkhVar.j;
        elo eloVar = a.g;
        dto dtoVar = (dto) ((AtomicReference) eloVar.b).getAndSet(null);
        if (dtoVar == null) {
            dtoVar = new dto(cls, cls2, cls3);
        } else {
            dtoVar.a(cls, cls2, cls3);
        }
        synchronized (eloVar.a) {
            list = (List) ((ta) eloVar.a).get(dtoVar);
        }
        ((AtomicReference) eloVar.b).set(dtoVar);
        if (list == null) {
            list = new ArrayList();
            Iterator it = a.h.s(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : a.f.k((Class) it.next(), cls2)) {
                    if (!a.e.g(cls4, cls3).isEmpty() && !list.contains(cls4)) {
                        list.add(cls4);
                    }
                }
            }
            elo eloVar2 = a.g;
            List unmodifiableList = DesugarCollections.unmodifiableList(list);
            synchronized (eloVar2.a) {
                ((ta) eloVar2.a).put(new dto(cls, cls2, cls3), unmodifiableList);
            }
        }
        if (list.isEmpty()) {
            if (File.class.equals(this.b.j)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + String.valueOf(this.b.d.getClass()) + " to " + String.valueOf(this.b.j));
        }
        while (true) {
            if (this.f != null && d()) {
                this.j = null;
                while (!z && d()) {
                    List list2 = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    dnp dnpVar = (dnp) list2.get(i);
                    File file = this.h;
                    dkh dkhVar2 = this.b;
                    this.j = dnpVar.b(file, dkhVar2.e, dkhVar2.f, dkhVar2.h);
                    if (this.j != null && this.b.g(this.j.c.a())) {
                        this.j.c.f(this.b.n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= list.size()) {
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 >= d.size()) {
                    return false;
                }
                this.d = 0;
            }
            dir dirVar = (dir) d.get(this.c);
            Class cls5 = (Class) list.get(this.d);
            diz a2 = this.b.a(cls5);
            dlu h = this.b.h();
            dkh dkhVar3 = this.b;
            this.i = new dlh(h, dirVar, dkhVar3.m, dkhVar3.e, dkhVar3.f, a2, cls5, dkhVar3.h);
            File a3 = dkhVar3.c().a(this.i);
            this.h = a3;
            if (a3 != null) {
                this.e = dirVar;
                this.f = this.b.f(a3);
                this.g = 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, dje] */
    @Override // defpackage.djd
    public final void e(Exception exc) {
        this.a.b(this.i, exc, this.j.c, 4);
    }
}
