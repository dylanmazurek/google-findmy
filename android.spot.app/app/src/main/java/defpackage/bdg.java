package defpackage;

import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdg {
    private static final aql a = new aql(0.0f, 0.0f, 10.0f, 10.0f);

    public static final View a(bbz bbzVar, int i) {
        Object obj;
        Iterator it = bbzVar.a.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ayr) ((Map.Entry) obj).getKey()).d == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (blu) entry.getValue();
    }

    public static final se b(bfi bfiVar) {
        bfh a2 = bfiVar.a();
        se seVar = new se((byte[]) null);
        if (a2.b.d() && a2.b.ad()) {
            aql b = a2.b();
            g(new Region(Math.round(b.b), Math.round(b.c), Math.round(b.d), Math.round(b.e)), a2, seVar, a2, new Region());
        }
        return seVar;
    }

    public static final bdf c(List list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((bdf) list.get(i2)).a == i) {
                return (bdf) list.get(i2);
            }
        }
        return null;
    }

    public static final bgk d(bfe bfeVar) {
        ArrayList arrayList = new ArrayList();
        bfn bfnVar = bfd.a;
        bev bevVar = (bev) bej.b(bfeVar, bfd.a);
        if (bevVar != null && ((Boolean) ((moh) bevVar.a).a(arrayList)).booleanValue()) {
            return (bgk) arrayList.get(0);
        }
        return null;
    }

    public static final boolean e(ayr ayrVar, ayr ayrVar2) {
        ayr o = ayrVar2.o();
        if (o == null) {
            return false;
        }
        if (!amr.i(o, ayrVar) && !e(ayrVar, o)) {
            return false;
        }
        return true;
    }

    public static final boolean f(bfh bfhVar) {
        bfe bfeVar = bfhVar.c;
        if (!bfeVar.b) {
            Set keySet = bfeVar.a.keySet();
            if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    if (((bfn) it.next()).c) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    private static final void g(Region region, bfh bfhVar, se seVar, bfh bfhVar2, Region region2) {
        boolean z;
        aow aowVar;
        aql e;
        aql aqlVar;
        ayr ayrVar;
        if (bfhVar2.b.d() && bfhVar2.b.ad()) {
            z = false;
        } else {
            z = true;
        }
        if (!region.isEmpty() || bfhVar2.e == bfhVar.e) {
            if (!z || bfhVar2.d) {
                if (bfhVar2.c.b) {
                    bek.h(bfhVar2.b);
                    aowVar = bfhVar2.a;
                } else {
                    aowVar = bfhVar2.a;
                }
                aow bX = aowVar.bX();
                bfe bfeVar = bfhVar2.c;
                bfn bfnVar = bfd.a;
                Object b = bej.b(bfeVar, bfd.b);
                if (!bX.k.t) {
                    e = aql.a;
                } else if (b == null) {
                    e = nd.g(qg.g(bX, 8));
                } else {
                    azq g = qg.g(bX, 8);
                    if (!g.j()) {
                        e = aql.a;
                    } else {
                        avs i = nd.i(g);
                        aqj S = g.S();
                        long N = g.N(g.O());
                        S.a = -aqn.b(N);
                        S.b = -aqn.a(N);
                        S.c = g.q() + aqn.b(N);
                        S.d = g.ce() + aqn.a(N);
                        while (true) {
                            if (g != i) {
                                g.ah(S, false, true);
                                if (S.b()) {
                                    e = aql.a;
                                    break;
                                } else {
                                    g = g.u;
                                    g.getClass();
                                }
                            } else {
                                e = iy.e(S);
                                break;
                            }
                        }
                    }
                }
                int round = Math.round(e.b);
                int round2 = Math.round(e.c);
                int round3 = Math.round(e.d);
                int round4 = Math.round(e.e);
                region2.set(round, round2, round3, round4);
                int i2 = bfhVar2.e;
                if (i2 == bfhVar.e) {
                    i2 = -1;
                }
                if (region2.op(region, Region.Op.INTERSECT)) {
                    seVar.d(i2, new bfi(bfhVar2, region2.getBounds()));
                    List i3 = bfhVar2.i();
                    for (int size = i3.size() - 1; size >= 0; size--) {
                        g(region, bfhVar, seVar, (bfh) i3.get(size), region2);
                    }
                    if (f(bfhVar2)) {
                        region.op(round, round2, round3, round4, Region.Op.DIFFERENCE);
                        return;
                    }
                    return;
                }
                if (bfhVar2.d) {
                    bfh g2 = bfhVar2.g();
                    if (g2 != null && (ayrVar = g2.b) != null && ayrVar.d()) {
                        aqlVar = g2.b();
                    } else {
                        aqlVar = a;
                    }
                    seVar.d(i2, new bfi(bfhVar2, new Rect(Math.round(aqlVar.b), Math.round(aqlVar.c), Math.round(aqlVar.d), Math.round(aqlVar.e))));
                    return;
                }
                if (i2 == -1) {
                    seVar.d(-1, new bfi(bfhVar2, region2.getBounds()));
                }
            }
        }
    }
}
