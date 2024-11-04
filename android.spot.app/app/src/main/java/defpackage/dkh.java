package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkh {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public dgr c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public div h;
    public Map i;
    public Class j;
    public boolean k;
    public boolean l;
    public dir m;
    public dgs n;
    public dkp o;
    public boolean p;
    public boolean q;
    public dks r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final diz a(Class cls) {
        diz dizVar = (diz) this.i.get(cls);
        if (dizVar == null) {
            Iterator it = this.i.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    dizVar = (diz) entry.getValue();
                    break;
                }
            }
        }
        if (dizVar == null) {
            if (this.i.isEmpty() && this.p) {
                throw new IllegalArgumentException(der.b(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods."));
            }
            return dok.b;
        }
        return dizVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dld b(Class cls) {
        dld dldVar;
        dld dldVar2;
        dld dldVar3;
        dgy a = this.c.a();
        dse dseVar = a.a;
        AtomicReference atomicReference = dseVar.c;
        Class cls2 = this.g;
        Class cls3 = this.j;
        dto dtoVar = (dto) atomicReference.getAndSet(null);
        if (dtoVar == null) {
            dtoVar = new dto();
        }
        dtoVar.a(cls, cls2, cls3);
        synchronized (dseVar.b) {
            dldVar = (dld) dseVar.b.get(dtoVar);
        }
        dseVar.c.set(dtoVar);
        dse dseVar2 = a.a;
        if (dse.a.equals(dldVar)) {
            return null;
        }
        if (dldVar == null) {
            ArrayList arrayList = new ArrayList();
            for (Class cls4 : a.f.k(cls, cls2)) {
                for (Class cls5 : a.e.g(cls4, cls3)) {
                    arrayList.add(new dkk(cls, cls4, cls5, a.f.j(cls, cls4), a.e.f(cls4, cls5), a.b));
                }
            }
            if (arrayList.isEmpty()) {
                dldVar2 = null;
            } else {
                dldVar2 = new dld(cls, cls2, cls3, arrayList, a.b);
            }
            dse dseVar3 = a.a;
            synchronized (dseVar3.b) {
                rx rxVar = dseVar3.b;
                dto dtoVar2 = new dto(cls, cls2, cls3);
                if (dldVar2 != null) {
                    dldVar3 = dldVar2;
                } else {
                    dldVar3 = dse.a;
                }
                rxVar.put(dtoVar2, dldVar3);
            }
            return dldVar2;
        }
        return dldVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dmc c() {
        return this.r.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List, java.lang.Object] */
    public final List d() {
        if (!this.l) {
            this.l = true;
            this.b.clear();
            List e = e();
            int size = e.size();
            for (int i = 0; i < size; i++) {
                bso bsoVar = (bso) e.get(i);
                if (!this.b.contains(bsoVar.a)) {
                    this.b.add(bsoVar.a);
                }
                for (int i2 = 0; i2 < bsoVar.b.size(); i2++) {
                    if (!this.b.contains(bsoVar.b.get(i2))) {
                        this.b.add((dir) bsoVar.b.get(i2));
                    }
                }
            }
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List e() {
        if (!this.k) {
            this.k = true;
            this.a.clear();
            List c = this.c.a().c(this.d);
            int size = c.size();
            for (int i = 0; i < size; i++) {
                bso b = ((dnp) c.get(i)).b(this.d, this.e, this.f, this.h);
                if (b != null) {
                    this.a.add(b);
                }
            }
        }
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List f(File file) {
        return this.c.a().c(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(Class cls) {
        if (b(cls) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dlu h() {
        return this.c.f;
    }
}
