package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.chrono.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0035d implements InterfaceC0033b, Temporal, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceC0033b R(n nVar, Temporal temporal) {
        InterfaceC0033b interfaceC0033b = (InterfaceC0033b) temporal;
        AbstractC0032a abstractC0032a = (AbstractC0032a) nVar;
        if (abstractC0032a.equals(interfaceC0033b.a())) {
            return interfaceC0033b;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + abstractC0032a.l() + ", actual: " + interfaceC0033b.a().l());
    }

    private long T(InterfaceC0033b interfaceC0033b) {
        if (a().K(j$.time.temporal.a.MONTH_OF_YEAR).d() == 12) {
            j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
            long w = w(aVar) * 32;
            j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_MONTH;
            return (((interfaceC0033b.w(aVar) * 32) + interfaceC0033b.n(aVar2)) - (w + j$.time.temporal.k.a(this, aVar2))) / 32;
        }
        throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object B(j$.time.temporal.q qVar) {
        return AbstractC0040i.j(this, qVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Temporal F(Temporal temporal) {
        return AbstractC0040i.a(this, temporal);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public InterfaceC0033b k(long j, TemporalUnit temporalUnit) {
        return R(a(), j$.time.temporal.k.b(this, j, temporalUnit));
    }

    @Override // java.lang.Comparable
    /* renamed from: N */
    public final /* synthetic */ int compareTo(InterfaceC0033b interfaceC0033b) {
        return AbstractC0040i.b(this, interfaceC0033b);
    }

    public o S() {
        return a().O(j$.time.temporal.k.a(this, j$.time.temporal.a.ERA));
    }

    abstract InterfaceC0033b U(long j);

    abstract InterfaceC0033b V(long j);

    abstract InterfaceC0033b W(long j);

    @Override // j$.time.temporal.Temporal
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public InterfaceC0033b q(j$.time.temporal.m mVar) {
        return R(a(), mVar.F(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof InterfaceC0033b) && AbstractC0040i.b(this, (InterfaceC0033b) obj) == 0) {
            return true;
        }
        return false;
    }

    @Override // j$.time.chrono.InterfaceC0033b, j$.time.temporal.Temporal
    public long f(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        InterfaceC0033b E = a().E(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            switch (AbstractC0034c.a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return E.x() - x();
                case 2:
                    return (E.x() - x()) / 7;
                case 3:
                    return T(E);
                case 4:
                    return T(E) / 12;
                case 5:
                    return T(E) / 120;
                case 6:
                    return T(E) / 1200;
                case 7:
                    return T(E) / 12000;
                case 8:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return E.w(aVar) - w(aVar);
                default:
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
        }
        Objects.a(temporalUnit, "unit");
        return temporalUnit.k(this, E);
    }

    @Override // j$.time.chrono.InterfaceC0033b, j$.time.temporal.l
    public /* synthetic */ boolean g(j$.time.temporal.o oVar) {
        return AbstractC0040i.h(this, oVar);
    }

    @Override // j$.time.chrono.InterfaceC0033b
    public int hashCode() {
        long x = x();
        return ((AbstractC0032a) a()).hashCode() ^ ((int) (x ^ (x >>> 32)));
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int n(j$.time.temporal.o oVar) {
        return j$.time.temporal.k.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public /* synthetic */ j$.time.temporal.s r(j$.time.temporal.o oVar) {
        return j$.time.temporal.k.d(this, oVar);
    }

    @Override // j$.time.chrono.InterfaceC0033b
    public String toString() {
        String str;
        long w = w(j$.time.temporal.a.YEAR_OF_ERA);
        long w2 = w(j$.time.temporal.a.MONTH_OF_YEAR);
        long w3 = w(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(((AbstractC0032a) a()).l());
        sb.append(" ");
        sb.append(S());
        sb.append(" ");
        sb.append(w);
        String str2 = "-";
        if (w2 >= 10) {
            str = "-";
        } else {
            str = "-0";
        }
        sb.append(str);
        sb.append(w2);
        if (w3 < 10) {
            str2 = "-0";
        }
        sb.append(str2);
        sb.append(w3);
        return sb.toString();
    }

    @Override // j$.time.chrono.InterfaceC0033b
    public long x() {
        return w(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.chrono.InterfaceC0033b
    public InterfaceC0036e z(j$.time.j jVar) {
        return C0038g.S(this, jVar);
    }

    @Override // j$.time.temporal.Temporal
    public InterfaceC0033b d(long j, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return R(a(), oVar.r(this, j));
        }
        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar)));
    }

    @Override // j$.time.temporal.Temporal
    public InterfaceC0033b e(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        if (!z) {
            if (!z) {
                return R(a(), temporalUnit.n(this, j));
            }
            throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
        switch (AbstractC0034c.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return U(j);
            case 2:
                return U(j$.lang.a.g(j, 7));
            case 3:
                return V(j);
            case 4:
                return W(j);
            case 5:
                return W(j$.lang.a.g(j, 10));
            case 6:
                return W(j$.lang.a.g(j, 100));
            case 7:
                return W(j$.lang.a.g(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.lang.a.d(w(aVar), j), (j$.time.temporal.o) aVar);
            default:
                throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
        }
    }
}
