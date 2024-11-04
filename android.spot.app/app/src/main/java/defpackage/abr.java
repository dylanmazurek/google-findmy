package defpackage;

import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abr {
    public static final Object a = new adw("provider");
    public static final Object b = new adw("provider");
    public static final Object c = new adw("compositionLocalMap");
    public static final Object d = new adw("providers");
    public static final Object e = new adw("reference");
    public static final Comparator f = new Comparator() { // from class: abq
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return mpd.a(((acz) obj).b, ((acz) obj2).b);
        }
    };

    public static final int a(boolean z) {
        if (z) {
            return 1;
        }
        return 0;
    }

    public static final int b(afw afwVar, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = afwVar.e(i);
            i3++;
        }
        return i3;
    }

    public static final int c(List list, int i) {
        int d2 = d(list, i);
        if (d2 < 0) {
            return -(d2 + 1);
        }
        return d2;
    }

    public static final int d(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int a2 = mpd.a(((acz) list.get(i3)).b, i);
            if (a2 < 0) {
                i2 = i3 + 1;
            } else if (a2 > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final acz e(List list, int i, int i2) {
        int c2 = c(list, i);
        if (c2 < list.size()) {
            acz aczVar = (acz) list.get(c2);
            if (aczVar.b < i2) {
                return aczVar;
            }
            return null;
        }
        return null;
    }

    public static final acz f(List list, int i) {
        int d2 = d(list, i);
        if (d2 >= 0) {
            return (acz) list.remove(d2);
        }
        return null;
    }

    public static final Void g(String str) {
        throw new abf(a.ag(str, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void h(afw afwVar, List list, int i) {
        if (afwVar.z(i)) {
            list.add(afwVar.o(i));
            return;
        }
        int i2 = i + 1;
        int c2 = i + afwVar.c(i);
        while (i2 < c2) {
            h(afwVar, list, i2);
            i2 += afwVar.c(i2);
        }
    }

    public static final void i(String str) {
        throw new abf(a.ag(str, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void j(agb agbVar, afp afpVar) {
        int i;
        int i2;
        int i3 = agbVar.o;
        int i4 = agbVar.p;
        while (i3 < i4) {
            Object w = agbVar.w(i3);
            if (w instanceof abe) {
                abv abvVar = (abv) afpVar;
                abvVar.c((abe) w, agbVar.g() - agbVar.q(i3), -1, -1);
            }
            int n = agbVar.n(agbVar.b, agbVar.h(i3));
            int i5 = i3 + 1;
            int c2 = agbVar.c(agbVar.b, agbVar.h(i5));
            for (int i6 = n; i6 < c2; i6++) {
                int i7 = i6 - n;
                Object obj = agbVar.c[agbVar.d(i6)];
                if (obj instanceof afr) {
                    afr afrVar = (afr) obj;
                    afq afqVar = afrVar.a;
                    if (!(afqVar instanceof aft)) {
                        o(agbVar, i3, i7, obj);
                        int g = agbVar.g() - i7;
                        aav aavVar = afrVar.b;
                        if (aavVar != null && aavVar.a()) {
                            i = agbVar.a(aavVar);
                            i2 = agbVar.g() - agbVar.p(i);
                        } else {
                            i = -1;
                            i2 = -1;
                        }
                        ((abv) afpVar).c(afqVar, g, i, i2);
                    }
                } else if (obj instanceof aeu) {
                    o(agbVar, i3, i7, obj);
                    ((aeu) obj).c();
                }
            }
            i3 = i5;
        }
    }

    public static final void k(agb agbVar, afp afpVar) {
        int i;
        int[] iArr = agbVar.b;
        int i2 = agbVar.o;
        int c2 = agbVar.c(iArr, agbVar.h(i2 + agbVar.j(i2)));
        for (int c3 = agbVar.c(agbVar.b, agbVar.h(agbVar.o)); c3 < c2; c3++) {
            Object obj = agbVar.c[agbVar.d(c3)];
            int i3 = -1;
            if (obj instanceof abe) {
                int g = agbVar.g() - c3;
                abe abeVar = (abe) obj;
                abv abvVar = (abv) afpVar;
                sy syVar = abvVar.b;
                if (syVar == null) {
                    syVar = new sy((byte[]) null);
                    abvVar.b = syVar;
                }
                syVar.g(abeVar);
                abvVar.c(abeVar, g, -1, -1);
            }
            if (obj instanceof afr) {
                int g2 = agbVar.g() - c3;
                afr afrVar = (afr) obj;
                aav aavVar = afrVar.b;
                if (aavVar != null && aavVar.a()) {
                    i3 = agbVar.a(aavVar);
                    i = agbVar.g() - agbVar.p(i3);
                } else {
                    i = -1;
                }
                ((abv) afpVar).c(afrVar.a, g2, i3, i);
            }
            if (obj instanceof aeu) {
                ((aeu) obj).c();
            }
        }
        agbVar.U();
    }

    public static final void l(List list, int i, int i2) {
        int c2 = c(list, i);
        while (c2 < list.size() && ((acz) list.get(c2)).b < i2) {
            list.remove(c2);
        }
    }

    public static final void m(boolean z) {
        if (!z) {
            i("Check failed");
        }
    }

    public static final boolean n(int i) {
        if (i != 0) {
            return true;
        }
        return false;
    }

    private static final void o(agb agbVar, int i, int i2, Object obj) {
        if (obj == agbVar.x(i, i2, abh.a)) {
            return;
        }
        i("Slot table is out of sync");
    }
}
