package defpackage;

import android.os.Trace;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awd implements abe {
    public final ayr a;
    public abt b;
    public int c;
    public int d;
    public int l;
    public int m;
    public awk n;
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final avy g = new avy(this);
    public final avw h = new avw(this);
    public final HashMap i = new HashMap();
    private final axd o = new axd(null);
    public final Map j = new LinkedHashMap();
    public final aiu k = new aiu(new Object[16]);

    public awd(ayr ayrVar, awk awkVar) {
        this.a = ayrVar;
        this.n = awkVar;
    }

    private final Object l(int i) {
        Object obj = this.e.get((ayr) this.a.A().get(i));
        obj.getClass();
        return ((avv) obj).a;
    }

    private static final void m(ayr ayrVar) {
        ayrVar.r().A = 3;
        ayw q = ayrVar.q();
        if (q != null) {
            q.v = 3;
        }
    }

    @Override // defpackage.abe
    public final void a() {
        i(true);
    }

    @Override // defpackage.abe
    public final void b() {
        f();
    }

    @Override // defpackage.abe
    public final void c() {
        i(false);
    }

    public final ayr d(int i) {
        ayr ayrVar = new ayr(true, 2, null);
        ayr ayrVar2 = this.a;
        ayrVar2.g = true;
        ayrVar2.G(i, ayrVar);
        ayrVar2.g = false;
        return ayrVar;
    }

    public final ayr e(Object obj) {
        int i;
        if (this.l == 0) {
            return null;
        }
        int size = this.a.A().size() - this.m;
        int i2 = size - this.l;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            if (i4 >= i2) {
                if (amr.i(l(i4), obj)) {
                    i = i4;
                    break;
                }
                i4--;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            while (true) {
                if (i3 >= i2) {
                    Object obj2 = this.e.get((ayr) this.a.A().get(i3));
                    obj2.getClass();
                    avv avvVar = (avv) obj2;
                    if (avvVar.a != awz.a) {
                        i3--;
                    } else {
                        avvVar.a = obj;
                        i4 = i3;
                        i = i4;
                        break;
                    }
                } else {
                    i4 = i3;
                    i = -1;
                    break;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            k(i4, i2);
        }
        this.l--;
        ayr ayrVar = (ayr) this.a.A().get(i2);
        Object obj3 = this.e.get(ayrVar);
        obj3.getClass();
        avv avvVar2 = (avv) obj3;
        avvVar2.f = new aee(true, agw.a);
        avvVar2.e = true;
        avvVar2.d = true;
        return ayrVar;
    }

    public final void f() {
        mnw mnwVar = ayr.b;
        ayr ayrVar = this.a;
        ayrVar.g = true;
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            afs afsVar = ((avv) it.next()).c;
            if (afsVar != null) {
                afsVar.b();
            }
        }
        this.a.Q();
        ayrVar.g = false;
        this.e.clear();
        this.f.clear();
        this.m = 0;
        this.l = 0;
        this.i.clear();
        h();
    }

    public final void g(int i) {
        moh mohVar;
        this.l = 0;
        int size = (this.a.A().size() - this.m) - 1;
        if (i <= size) {
            this.o.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    this.o.add(l(i2));
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.o.clear();
            amz a = amy.a();
            if (a != null) {
                mohVar = a.j();
            } else {
                mohVar = null;
            }
            amz c = amy.c(a);
            boolean z = false;
            while (size >= i) {
                try {
                    ayr ayrVar = (ayr) this.a.A().get(size);
                    Object obj = this.e.get(ayrVar);
                    obj.getClass();
                    avv avvVar = (avv) obj;
                    Object obj2 = avvVar.a;
                    if (this.o.contains(obj2)) {
                        this.l++;
                        if (avvVar.a()) {
                            m(ayrVar);
                            avvVar.b();
                            z = true;
                        }
                    } else {
                        ayr ayrVar2 = this.a;
                        ayrVar2.g = true;
                        this.e.remove(ayrVar);
                        afs afsVar = avvVar.c;
                        if (afsVar != null) {
                            afsVar.b();
                        }
                        this.a.R(size, 1);
                        ayrVar2.g = false;
                    }
                    this.f.remove(obj2);
                    size--;
                } finally {
                    amy.g(a, c, mohVar);
                }
            }
            if (z) {
                amy.h();
            }
        }
        h();
    }

    public final void h() {
        int size = this.a.A().size();
        if (this.e.size() == size) {
            if ((size - this.l) - this.m >= 0) {
                if (this.i.size() == this.m) {
                    return;
                }
                throw new IllegalArgumentException("Incorrect state. Precomposed children " + this.m + ". Map size " + this.i.size());
            }
            throw new IllegalArgumentException("Incorrect state. Total children " + size + ". Reusable children " + this.l + ". Precomposed children " + this.m);
        }
        throw new IllegalArgumentException("Inconsistency between the count of nodes tracked by the state (" + this.e.size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
    }

    public final void i(boolean z) {
        moh mohVar;
        boolean z2;
        this.m = 0;
        this.i.clear();
        int size = this.a.A().size();
        if (this.l != size) {
            this.l = size;
            amz a = amy.a();
            if (a != null) {
                mohVar = a.j();
            } else {
                mohVar = null;
            }
            amz c = amy.c(a);
            for (int i = 0; i < size; i++) {
                try {
                    ayr ayrVar = (ayr) this.a.A().get(i);
                    avv avvVar = (avv) this.e.get(ayrVar);
                    if (avvVar != null && avvVar.a()) {
                        m(ayrVar);
                        if (z) {
                            afs afsVar = avvVar.c;
                            if (afsVar != null) {
                                synchronized (((abw) afsVar).b) {
                                    if (((abw) afsVar).d.b > 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2 || !((abw) afsVar).c.isEmpty()) {
                                        Trace.beginSection("Compose:deactivate");
                                        try {
                                            abv abvVar = new abv(((abw) afsVar).c);
                                            if (z2) {
                                                agb c2 = ((abw) afsVar).d.c();
                                                try {
                                                    abr.j(c2, abvVar);
                                                    c2.A(true);
                                                    ((abw) afsVar).a.e();
                                                    abvVar.b();
                                                } finally {
                                                }
                                            }
                                            abvVar.a();
                                        } finally {
                                        }
                                    }
                                    ((abw) afsVar).k.d();
                                    ((abw) afsVar).l.d();
                                    ((abw) afsVar).m.d();
                                    ((abw) afsVar).e.a();
                                    ((abw) afsVar).f.a();
                                    ((abw) afsVar).i.T();
                                }
                            }
                            avvVar.f = new aee(false, agw.a);
                        } else {
                            avvVar.b();
                        }
                        avvVar.a = awz.a;
                    }
                } catch (Throwable th) {
                    amy.g(a, c, mohVar);
                    throw th;
                }
            }
            amy.g(a, c, mohVar);
            this.f.clear();
        }
        h();
    }

    public final void j(ayr ayrVar, Object obj, mol molVar) {
        boolean z;
        moh mohVar;
        HashMap hashMap = this.e;
        Object obj2 = hashMap.get(ayrVar);
        if (obj2 == null) {
            obj2 = new avv(obj, avl.a);
            hashMap.put(ayrVar, obj2);
        }
        avv avvVar = (avv) obj2;
        afs afsVar = avvVar.c;
        if (afsVar != null) {
            synchronized (((abw) afsVar).b) {
                if (((abw) afsVar).m.e > 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
        } else {
            z = true;
        }
        if (avvVar.b == molVar && !z && !avvVar.d) {
            return;
        }
        avvVar.b = molVar;
        amz a = amy.a();
        if (a != null) {
            mohVar = a.j();
        } else {
            mohVar = null;
        }
        amz c = amy.c(a);
        try {
            ayr ayrVar2 = this.a;
            mnw mnwVar = ayr.b;
            ayrVar2.g = true;
            mol molVar2 = avvVar.b;
            afs afsVar2 = avvVar.c;
            abt abtVar = this.b;
            if (abtVar != null) {
                boolean z2 = avvVar.e;
                alf alfVar = new alf(-1750409193, true, new xx(avvVar, molVar2, 3));
                if (afsVar2 == null || ((abw) afsVar2).j) {
                    afsVar2 = new abw(abtVar, new bag(ayrVar));
                }
                if (!z2) {
                    ((abw) afsVar2).h(alfVar);
                } else {
                    abp abpVar = ((abw) afsVar2).i;
                    abpVar.m = 100;
                    abpVar.l = true;
                    ((abw) afsVar2).h(alfVar);
                    abp abpVar2 = ((abw) afsVar2).i;
                    if (abpVar2.p || abpVar2.m != 100) {
                        ael.a("Cannot disable reuse from root if it was caused by other groups");
                    }
                    abpVar2.m = -1;
                    abpVar2.l = false;
                }
                avvVar.c = afsVar2;
                avvVar.e = false;
                ayrVar2.g = false;
                amy.g(a, c, mohVar);
                avvVar.d = false;
                return;
            }
            throw new IllegalStateException("parent composition reference not set");
        } catch (Throwable th) {
            amy.g(a, c, mohVar);
            throw th;
        }
    }

    public final void k(int i, int i2) {
        mnw mnwVar = ayr.b;
        ayr ayrVar = this.a;
        ayrVar.g = true;
        ayrVar.O(i, i2, 1);
        ayrVar.g = false;
    }
}
