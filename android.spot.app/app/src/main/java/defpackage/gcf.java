package defpackage;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcf {
    public final Set a = new LinkedHashSet();
    public final Set b = new LinkedHashSet();
    private final Map i = new HashMap();
    public final List c = new ArrayList();
    private final List j = new ArrayList();
    public final Map d = new HashMap();
    public Collection e = null;
    public boolean f = true;
    public Set g = jmo.a;
    public boolean h = false;

    private final gce e(gbo gboVar) {
        gce gceVar = new gce(this.c.size(), this.a.size(), true);
        gbs a = gceVar.a(gboVar, -1);
        ArrayList arrayList = new ArrayList(1);
        frx.y(gboVar, arrayList);
        juv juvVar = a.c;
        if (juvVar == null) {
            juvVar = juv.e;
        }
        gceVar.b(new gco(1, arrayList, juvVar.b));
        this.c.add(gceVar);
        this.i.put(a, gceVar);
        return gceVar;
    }

    private final gce f(List list, int i) {
        gbs gbsVar = (gbs) hzc.W(list);
        gce gceVar = (gce) this.i.get(gbsVar);
        if (gceVar == null) {
            gce gceVar2 = new gce(this.c.size(), i, false);
            this.c.add(gceVar2);
            this.i.put(gbsVar, gceVar2);
            return gceVar2;
        }
        return gceVar;
    }

    private final gce g(gbo gboVar) {
        boolean z;
        String sb;
        int i = gboVar.a;
        if (i != -1) {
            if (i != -2) {
                return (gce) this.c.get(i);
            }
        } else {
            if (!gboVar.b()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(gboVar);
                sb2.append(" has no VE id, it may need to be re-instrumented if it has been reset.");
                gbv gbvVar = gboVar.b;
                if (gbvVar instanceof gbv) {
                    sb2.append("\n\tError occurred on CVE with associated View of type: ");
                    sb2.append(gbv.a(gboVar).getClass().getSimpleName());
                } else {
                    sb2.append("\n\tError occurred on SyntheticNode");
                }
                gbo c = gbvVar.c();
                if (c != null) {
                    sb2.append("\n\t\tAncestry (leaf -> root):");
                }
                while (true) {
                    if (c != null) {
                        gbv gbvVar2 = c.b;
                        if (gbvVar2 != null) {
                            sb2.append("\n\t\t\tView of type: ");
                            sb2.append(gbv.a(c).getClass().getSimpleName());
                            c = gbvVar2.c();
                        } else {
                            sb2.append("\n\t\t\t<Found CVE with no Node attached. Ending traversal.>");
                            sb = sb2.toString();
                            break;
                        }
                    } else {
                        sb = sb2.toString();
                        break;
                    }
                }
                throw new IllegalStateException(sb);
            }
            this.j.add(gboVar);
            gbv gbvVar3 = gboVar.b;
            if (!gbvVar3.e()) {
                gbo c2 = gbvVar3.c();
                if (c2 == null) {
                    gbs a = gboVar.a();
                    nqe nqeVar = gec.a;
                    a.h(nqeVar);
                    if (!a.l.m((ljm) nqeVar.d)) {
                        View a2 = gbv.a(gboVar);
                        while (true) {
                            if (a2 != null) {
                                if (gbv.f(a2)) {
                                    Log.e("GIL", der.b(gboVar, "Unexpected visual element (", ") without parent detected. All visual elements except the root view must have a parent visual element. See also: go/gil-android/instrumentation#requirements."));
                                    break;
                                }
                                Object parent = a2.getParent();
                                if (!(parent instanceof View)) {
                                    break;
                                }
                                a2 = (View) parent;
                            } else {
                                break;
                            }
                        }
                        gboVar.a = -2;
                        return null;
                    }
                    return e(gboVar);
                }
                if (c2.a == -1 && c2.c()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(null);
                    frx.y(c2, arrayList);
                    if (arrayList.size() > 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hwx.U(z);
                    gce f = f(arrayList, this.a.size());
                    gbs a3 = f.a(gboVar, -1);
                    arrayList.set(0, a3);
                    juv juvVar = a3.c;
                    if (juvVar == null) {
                        juvVar = juv.e;
                    }
                    f.b(new gco(1, arrayList, juvVar.b));
                    return f;
                }
                gce g = g(c2);
                if (g != null) {
                    juv juvVar2 = ((gbs) c2.c.b).c;
                    if (juvVar2 == null) {
                        juvVar2 = juv.e;
                    }
                    g.a(gboVar, juvVar2.b);
                    return g;
                }
            } else {
                return e(gboVar);
            }
        }
        return null;
    }

    public final List a() {
        jax c = jbu.c("GIL:LogBatch");
        try {
            ArrayList arrayList = new ArrayList(this.c.size());
            for (gce gceVar : this.c) {
                arrayList.add(new gcp(gceVar.a, gceVar.b, gceVar.c, gceVar.d, gceVar.e, gceVar.f));
            }
            this.c.clear();
            this.i.clear();
            c.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b() {
        jax c = jbu.c("GIL:CreateInsertGrafts");
        try {
            for (gbo gboVar : this.a) {
                if (gboVar.a == -1) {
                    g(gboVar);
                }
            }
            this.a.clear();
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((gbo) it.next()).a = -1;
            }
            this.j.clear();
            c.close();
            jax c2 = jbu.c("GIL:CreateVisibilityGrafts");
            try {
                for (gbo gboVar2 : this.b) {
                    hwx.X(gboVar2.c(), "Not impressed: %s", gboVar2);
                    int d = gboVar2.d();
                    ljj ljjVar = gboVar2.c;
                    int i = ((gbs) ljjVar.b).d;
                    int D = a.D(i);
                    if (D == 0) {
                        D = 1;
                    }
                    if (D != d) {
                        int D2 = a.D(i);
                        if (D2 == 0) {
                            D2 = 1;
                        }
                        int i2 = D2 - 1;
                        if (i2 == 2 || i2 == 4) {
                            if (d != 2) {
                                hwx.V(false, "Repressed VE was visible.");
                                d = 1;
                            }
                        }
                        if (!ljjVar.b.y()) {
                            ljjVar.t();
                        }
                        gbs gbsVar = (gbs) ljjVar.b;
                        gbsVar.d = d - 1;
                        gbsVar.a |= 2;
                        List arrayList = new ArrayList();
                        frx.y(gboVar2, arrayList);
                        gce f = f(arrayList, 0);
                        int D3 = a.D(((gbs) arrayList.get(0)).d);
                        if (D3 != 0 && D3 != 1) {
                            f.b(new gco(3, arrayList, -1));
                        }
                        f.b(new gco(2, arrayList, f.e.size()));
                        gcd gcdVar = new gcd(f);
                        juv juvVar = ((gbs) gboVar2.c.b).c;
                        if (juvVar == null) {
                            juvVar = juv.e;
                        }
                        juw juwVar = juvVar.d;
                        if (juwVar == null) {
                            juwVar = juw.d;
                        }
                        if ((juwVar.a & 2) != 0) {
                            gcdVar.a(gboVar2);
                        }
                    }
                }
                this.b.clear();
                c2.close();
                if (!this.d.isEmpty()) {
                    c2 = jbu.c("GIL:CreateRemoveGrafts");
                    try {
                        for (Map.Entry entry : this.d.entrySet()) {
                            Collection<gbs> collection = (Collection) entry.getValue();
                            for (gbs gbsVar2 : collection) {
                                gbo gboVar3 = (gbo) entry.getKey();
                                int D4 = a.D(gbsVar2.d);
                                if (D4 != 0 && D4 != 1) {
                                }
                                ArrayList arrayList2 = new ArrayList();
                                ljh ljhVar = (ljh) gbsVar2.z(5);
                                ljhVar.w(gbsVar2);
                                ljj ljjVar2 = (ljj) ljhVar;
                                if (!ljjVar2.b.y()) {
                                    ljjVar2.t();
                                }
                                gbs gbsVar3 = (gbs) ljjVar2.b;
                                gbsVar3.d = 1;
                                gbsVar3.a |= 2;
                                arrayList2.add((gbs) ljjVar2.q());
                                if (gboVar3 != null) {
                                    frx.y(gboVar3, arrayList2);
                                }
                                f(arrayList2, 0).b(new gco(3, arrayList2, -1));
                            }
                            collection.clear();
                            this.e = collection;
                        }
                        c2.close();
                        this.d.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } finally {
                try {
                    c2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        } catch (Throwable th3) {
            try {
                c.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final boolean c() {
        if (this.c.isEmpty() && this.a.isEmpty() && this.b.isEmpty() && this.d.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean d(gbo gboVar, int i) {
        if (this.a.contains(gboVar)) {
            return false;
        }
        int D = a.D(((gbs) gboVar.c.b).d);
        if (D == 0) {
            D = 1;
        }
        if (D == i) {
            this.b.remove(gboVar);
            return false;
        }
        this.b.add(gboVar);
        return true;
    }
}
