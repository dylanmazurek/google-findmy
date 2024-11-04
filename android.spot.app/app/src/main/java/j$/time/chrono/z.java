package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class z extends AbstractC0035d {
    static final j$.time.g d = j$.time.g.f0(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    private final transient j$.time.g a;
    private transient A b;
    private transient int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(j$.time.g gVar) {
        if (!gVar.b0(d)) {
            A l = A.l(gVar);
            this.b = l;
            this.c = (gVar.a0() - l.o().a0()) + 1;
            this.a = gVar;
            return;
        }
        throw new RuntimeException("JapaneseDate before Meiji 6 is not supported");
    }

    private z Z(j$.time.g gVar) {
        if (gVar.equals(this.a)) {
            return this;
        }
        return new z(gVar);
    }

    private z a0(A a, int i) {
        x.d.getClass();
        if (a instanceof A) {
            int a0 = (a.o().a0() + i) - 1;
            if (i == 1 || (a0 >= -999999999 && a0 <= 999999999 && a0 >= a.o().a0() && a == A.l(j$.time.g.f0(a0, 1, 1)))) {
                return Z(this.a.q0(a0));
            }
            throw new RuntimeException("Invalid yearOfEra value");
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 4, this);
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.chrono.InterfaceC0033b
    /* renamed from: M */
    public final InterfaceC0033b k(long j, TemporalUnit temporalUnit) {
        return (z) super.k(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0035d
    public final o S() {
        return this.b;
    }

    @Override // j$.time.chrono.AbstractC0035d
    final InterfaceC0033b U(long j) {
        return Z(this.a.j0(j));
    }

    @Override // j$.time.chrono.AbstractC0035d
    final InterfaceC0033b V(long j) {
        return Z(this.a.k0(j));
    }

    @Override // j$.time.chrono.AbstractC0035d
    final InterfaceC0033b W(long j) {
        return Z(this.a.l0(j));
    }

    @Override // j$.time.chrono.AbstractC0035d
    /* renamed from: X */
    public final InterfaceC0033b q(j$.time.temporal.m mVar) {
        return (z) super.q(mVar);
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.temporal.Temporal
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final z d(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            if (w(aVar) == j) {
                return this;
            }
            int[] iArr = y.a;
            int i = iArr[aVar.ordinal()];
            j$.time.g gVar = this.a;
            if (i == 3 || i == 8 || i == 9) {
                int a = x.d.K(aVar).a(j, aVar);
                int i2 = iArr[aVar.ordinal()];
                if (i2 != 3) {
                    if (i2 != 8) {
                        if (i2 == 9) {
                            return Z(gVar.q0(a));
                        }
                    } else {
                        return a0(A.t(a), this.c);
                    }
                } else {
                    return a0(this.b, a);
                }
            }
            return Z(gVar.d(j, oVar));
        }
        return (z) super.d(j, oVar);
    }

    @Override // j$.time.chrono.InterfaceC0033b
    public final n a() {
        return x.d;
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.chrono.InterfaceC0033b, j$.time.temporal.Temporal
    public final InterfaceC0033b e(long j, TemporalUnit temporalUnit) {
        return (z) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0035d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return this.a.equals(((z) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.chrono.InterfaceC0033b, j$.time.temporal.l
    public final boolean g(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || oVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || oVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || oVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (oVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) oVar).B();
        }
        if (oVar == null || !oVar.q(this)) {
            return false;
        }
        return true;
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.chrono.InterfaceC0033b
    public final int hashCode() {
        x.d.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        return (z) super.k(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.temporal.Temporal
    public final Temporal q(j$.time.g gVar) {
        return (z) super.q(gVar);
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.temporal.l
    public final j$.time.temporal.s r(j$.time.temporal.o oVar) {
        int i;
        if (oVar instanceof j$.time.temporal.a) {
            if (g(oVar)) {
                j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
                int i2 = y.a[aVar.ordinal()];
                j$.time.g gVar = this.a;
                if (i2 != 1) {
                    A a = this.b;
                    if (i2 != 2) {
                        if (i2 != 3) {
                            return x.d.K(aVar);
                        }
                        int a0 = a.o().a0();
                        if (a.p() != null) {
                            return j$.time.temporal.s.j(1L, (r0.o().a0() - a0) + 1);
                        }
                        return j$.time.temporal.s.j(1L, 999999999 - a0);
                    }
                    A p = a.p();
                    if (p != null && p.o().a0() == gVar.a0()) {
                        i = p.o().X() - 1;
                    } else if (gVar.c0()) {
                        i = 366;
                    } else {
                        i = 365;
                    }
                    if (this.c == 1) {
                        i -= a.o().X() - 1;
                    }
                    return j$.time.temporal.s.j(1L, i);
                }
                return j$.time.temporal.s.j(1L, gVar.d0());
            }
            throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar)));
        }
        return oVar.w(this);
    }

    @Override // j$.time.temporal.l
    public final long w(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i = y.a[((j$.time.temporal.a) oVar).ordinal()];
            int i2 = this.c;
            A a = this.b;
            j$.time.g gVar = this.a;
            switch (i) {
                case 2:
                    if (i2 == 1) {
                        return (gVar.X() - a.o().X()) + 1;
                    }
                    return gVar.X();
                case 3:
                    return i2;
                case 4:
                case 5:
                case 6:
                case 7:
                    throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar)));
                case 8:
                    return a.getValue();
                default:
                    return gVar.w(oVar);
            }
        }
        return oVar.n(this);
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.chrono.InterfaceC0033b
    public final long x() {
        return this.a.x();
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.chrono.InterfaceC0033b
    public final InterfaceC0036e z(j$.time.j jVar) {
        return C0038g.S(this, jVar);
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.temporal.Temporal
    public final Temporal e(long j, TemporalUnit temporalUnit) {
        return (z) super.e(j, temporalUnit);
    }
}
