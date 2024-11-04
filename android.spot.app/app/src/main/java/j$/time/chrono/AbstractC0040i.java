package j$.time.chrono;

import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;

/* renamed from: j$.time.chrono.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0040i {
    public static Temporal a(InterfaceC0033b interfaceC0033b, Temporal temporal) {
        return temporal.d(interfaceC0033b.x(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static int b(InterfaceC0033b interfaceC0033b, InterfaceC0033b interfaceC0033b2) {
        int compare = Long.compare(interfaceC0033b.x(), interfaceC0033b2.x());
        if (compare == 0) {
            return ((AbstractC0032a) interfaceC0033b.a()).l().compareTo(interfaceC0033b2.a().l());
        }
        return compare;
    }

    public static int c(InterfaceC0036e interfaceC0036e, InterfaceC0036e interfaceC0036e2) {
        int compareTo = interfaceC0036e.c().compareTo(interfaceC0036e2.c());
        if (compareTo == 0) {
            int compareTo2 = interfaceC0036e.b().compareTo(interfaceC0036e2.b());
            if (compareTo2 == 0) {
                return ((AbstractC0032a) interfaceC0036e.a()).l().compareTo(interfaceC0036e2.a().l());
            }
            return compareTo2;
        }
        return compareTo;
    }

    public static int d(InterfaceC0042k interfaceC0042k, InterfaceC0042k interfaceC0042k2) {
        int compare = Long.compare(interfaceC0042k.Q(), interfaceC0042k2.Q());
        if (compare == 0) {
            int X = interfaceC0042k.b().X() - interfaceC0042k2.b().X();
            if (X == 0) {
                int compareTo = interfaceC0042k.J().compareTo(interfaceC0042k2.J());
                if (compareTo == 0) {
                    int compareTo2 = interfaceC0042k.u().l().compareTo(interfaceC0042k2.u().l());
                    if (compareTo2 == 0) {
                        return ((AbstractC0032a) interfaceC0042k.a()).l().compareTo(interfaceC0042k2.a().l());
                    }
                    return compareTo2;
                }
                return compareTo;
            }
            return X;
        }
        return compare;
    }

    public static int e(InterfaceC0042k interfaceC0042k, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i = AbstractC0041j.a[((j$.time.temporal.a) oVar).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return interfaceC0042k.J().n(oVar);
                }
                return interfaceC0042k.h().Z();
            }
            throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return j$.time.temporal.k.a(interfaceC0042k, oVar);
    }

    public static int f(o oVar, j$.time.temporal.a aVar) {
        if (aVar == j$.time.temporal.a.ERA) {
            return oVar.getValue();
        }
        return j$.time.temporal.k.a(oVar, aVar);
    }

    public static long g(o oVar, j$.time.temporal.o oVar2) {
        if (oVar2 == j$.time.temporal.a.ERA) {
            return oVar.getValue();
        }
        if (!(oVar2 instanceof j$.time.temporal.a)) {
            return oVar2.n(oVar);
        }
        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar2)));
    }

    public static boolean h(InterfaceC0033b interfaceC0033b, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) oVar).B();
        }
        if (oVar != null && oVar.q(interfaceC0033b)) {
            return true;
        }
        return false;
    }

    public static boolean i(o oVar, j$.time.temporal.o oVar2) {
        if (oVar2 instanceof j$.time.temporal.a) {
            if (oVar2 != j$.time.temporal.a.ERA) {
                return false;
            }
            return true;
        }
        if (oVar2 == null || !oVar2.q(oVar)) {
            return false;
        }
        return true;
    }

    public static Object j(InterfaceC0033b interfaceC0033b, j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.k.k() || qVar == j$.time.temporal.k.j() || qVar == j$.time.temporal.k.h() || qVar == j$.time.temporal.k.g()) {
            return null;
        }
        if (qVar == j$.time.temporal.k.e()) {
            return interfaceC0033b.a();
        }
        if (qVar == j$.time.temporal.k.i()) {
            return ChronoUnit.DAYS;
        }
        return qVar.a(interfaceC0033b);
    }

    public static Object k(InterfaceC0036e interfaceC0036e, j$.time.temporal.q qVar) {
        if (qVar != j$.time.temporal.k.k() && qVar != j$.time.temporal.k.j() && qVar != j$.time.temporal.k.h()) {
            if (qVar == j$.time.temporal.k.g()) {
                return interfaceC0036e.b();
            }
            if (qVar == j$.time.temporal.k.e()) {
                return interfaceC0036e.a();
            }
            if (qVar == j$.time.temporal.k.i()) {
                return ChronoUnit.NANOS;
            }
            return qVar.a(interfaceC0036e);
        }
        return null;
    }

    public static Object l(InterfaceC0042k interfaceC0042k, j$.time.temporal.q qVar) {
        if (qVar != j$.time.temporal.k.j() && qVar != j$.time.temporal.k.k()) {
            if (qVar == j$.time.temporal.k.h()) {
                return interfaceC0042k.h();
            }
            if (qVar == j$.time.temporal.k.g()) {
                return interfaceC0042k.b();
            }
            if (qVar == j$.time.temporal.k.e()) {
                return interfaceC0042k.a();
            }
            if (qVar == j$.time.temporal.k.i()) {
                return ChronoUnit.NANOS;
            }
            return qVar.a(interfaceC0042k);
        }
        return interfaceC0042k.u();
    }

    public static Object m(o oVar, j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.k.i()) {
            return ChronoUnit.ERAS;
        }
        return j$.time.temporal.k.c(oVar, qVar);
    }

    public static long n(InterfaceC0036e interfaceC0036e, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        return ((interfaceC0036e.c().x() * 86400) + interfaceC0036e.b().j0()) - zoneOffset.Z();
    }

    public static long o(InterfaceC0042k interfaceC0042k) {
        return ((interfaceC0042k.c().x() * 86400) + interfaceC0042k.b().j0()) - interfaceC0042k.h().Z();
    }

    public static n p(j$.time.temporal.l lVar) {
        Objects.a(lVar, "temporal");
        n nVar = (n) lVar.B(j$.time.temporal.k.e());
        u uVar = u.d;
        if (nVar == null) {
            Objects.a(uVar, "defaultObj");
            return uVar;
        }
        return nVar;
    }
}
