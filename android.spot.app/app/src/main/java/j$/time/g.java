package j$.time;

import j$.time.chrono.AbstractC0040i;
import j$.time.chrono.InterfaceC0033b;
import j$.time.chrono.InterfaceC0036e;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class g implements Temporal, j$.time.temporal.m, InterfaceC0033b, Serializable {
    public static final g d = f0(-999999999, 1, 1);
    public static final g e = f0(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    private final int a;
    private final short b;
    private final short c;

    static {
        f0(1970, 1, 1);
    }

    private g(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    private static g S(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                if (i2 != 4 && i2 != 6 && i2 != 9 && i2 != 11) {
                    i4 = 31;
                } else {
                    i4 = 30;
                }
            } else {
                j$.time.chrono.u.d.getClass();
                if (j$.time.chrono.u.q(i)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new RuntimeException("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new RuntimeException("Invalid date '" + k.U(i2).name() + " " + i3 + "'");
            }
        }
        return new g(i, i2, i3);
    }

    public static g T(j$.time.temporal.l lVar) {
        Objects.a(lVar, "temporal");
        g gVar = (g) lVar.B(j$.time.temporal.k.f());
        if (gVar != null) {
            return gVar;
        }
        throw new RuntimeException("Unable to obtain LocalDate from TemporalAccessor: " + String.valueOf(lVar) + " of type " + lVar.getClass().getName());
    }

    private int U(j$.time.temporal.o oVar) {
        int i;
        int i2 = f.a[((j$.time.temporal.a) oVar).ordinal()];
        short s = this.c;
        int i3 = this.a;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return X();
            case 3:
                i = (s - 1) / 7;
                break;
            case 4:
                if (i3 < 1) {
                    return 1 - i3;
                }
                return i3;
            case 5:
                return W().getValue();
            case 6:
                i = (s - 1) % 7;
                break;
            case 7:
                return ((X() - 1) % 7) + 1;
            case 8:
                throw new RuntimeException("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((X() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new RuntimeException("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i3;
            case 13:
                if (i3 >= 1) {
                    return 1;
                }
                return 0;
            default:
                throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar)));
        }
        return i + 1;
    }

    private long Z() {
        return ((this.a * 12) + this.b) - 1;
    }

    private long e0(g gVar) {
        return (((gVar.Z() * 32) + gVar.c) - ((Z() * 32) + this.c)) / 32;
    }

    public static g f0(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.R(i);
        j$.time.temporal.a.MONTH_OF_YEAR.R(i2);
        j$.time.temporal.a.DAY_OF_MONTH.R(i3);
        return S(i, i2, i3);
    }

    public static g g0(int i, k kVar, int i2) {
        j$.time.temporal.a.YEAR.R(i);
        j$.time.temporal.a.DAY_OF_MONTH.R(i2);
        return S(i, kVar.getValue(), i2);
    }

    public static g h0(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.R(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new g(j$.time.temporal.a.YEAR.F(j5 + j2 + (i2 / 10)), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    private static g m0(int i, int i2, int i3) {
        int i4;
        if (i2 != 2) {
            if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
                i3 = Math.min(i3, 30);
            }
        } else {
            j$.time.chrono.u.d.getClass();
            if (j$.time.chrono.u.q(i)) {
                i4 = 29;
            } else {
                i4 = 28;
            }
            i3 = Math.min(i3, i4);
        }
        return new g(i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 3, this);
    }

    @Override // j$.time.temporal.l
    public final Object B(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.k.f()) {
            return this;
        }
        return AbstractC0040i.j(this, qVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal F(Temporal temporal) {
        return AbstractC0040i.a(this, temporal);
    }

    @Override // j$.time.chrono.InterfaceC0033b
    public final InterfaceC0033b M(long j, TemporalUnit temporalUnit) {
        return e(-1L, (ChronoUnit) temporalUnit);
    }

    @Override // java.lang.Comparable
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC0033b interfaceC0033b) {
        if (interfaceC0033b instanceof g) {
            return R((g) interfaceC0033b);
        }
        return AbstractC0040i.b(this, interfaceC0033b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int R(g gVar) {
        int i = this.a - gVar.a;
        if (i == 0) {
            int i2 = this.b - gVar.b;
            if (i2 == 0) {
                return this.c - gVar.c;
            }
            return i2;
        }
        return i;
    }

    public final int V() {
        return this.c;
    }

    public final d W() {
        return d.R(((int) j$.nio.file.attribute.s.g(x() + 3, 7)) + 1);
    }

    public final int X() {
        return (k.U(this.b).R(c0()) + this.c) - 1;
    }

    public final int Y() {
        return this.b;
    }

    @Override // j$.time.chrono.InterfaceC0033b
    public final j$.time.chrono.n a() {
        return j$.time.chrono.u.d;
    }

    public final int a0() {
        return this.a;
    }

    public final boolean b0(InterfaceC0033b interfaceC0033b) {
        if (interfaceC0033b instanceof g) {
            if (R((g) interfaceC0033b) >= 0) {
                return false;
            }
            return true;
        }
        if (x() >= interfaceC0033b.x()) {
            return false;
        }
        return true;
    }

    public final boolean c0() {
        j$.time.chrono.u uVar = j$.time.chrono.u.d;
        long j = this.a;
        uVar.getClass();
        return j$.time.chrono.u.q(j);
    }

    public final int d0() {
        short s = this.b;
        if (s != 2) {
            if (s != 4 && s != 6 && s != 9 && s != 11) {
                return 31;
            }
            return 30;
        }
        if (c0()) {
            return 29;
        }
        return 28;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && R((g) obj) == 0) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        g T = T(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            switch (f.b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return T.x() - x();
                case 2:
                    return (T.x() - x()) / 7;
                case 3:
                    return e0(T);
                case 4:
                    return e0(T) / 12;
                case 5:
                    return e0(T) / 120;
                case 6:
                    return e0(T) / 1200;
                case 7:
                    return e0(T) / 12000;
                case 8:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return T.w(aVar) - w(aVar);
                default:
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
        }
        return temporalUnit.k(this, T);
    }

    @Override // j$.time.temporal.l
    public final boolean g(j$.time.temporal.o oVar) {
        return AbstractC0040i.h(this, oVar);
    }

    @Override // j$.time.chrono.InterfaceC0033b
    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final g e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (f.b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return j0(j);
                case 2:
                    return j0(j$.lang.a.g(j, 7));
                case 3:
                    return k0(j);
                case 4:
                    return l0(j);
                case 5:
                    return l0(j$.lang.a.g(j, 10));
                case 6:
                    return l0(j$.lang.a.g(j, 100));
                case 7:
                    return l0(j$.lang.a.g(j, 1000));
                case 8:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return d(j$.lang.a.d(w(aVar), j), aVar);
                default:
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
        }
        return (g) temporalUnit.n(this, j);
    }

    public final g j0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            short s = this.b;
            int i = this.a;
            if (j2 <= 28) {
                return new g(i, s, (int) j2);
            }
            if (j2 <= 59) {
                long d0 = d0();
                if (j2 <= d0) {
                    return new g(i, s, (int) j2);
                }
                if (s < 12) {
                    return new g(i, s + 1, (int) (j2 - d0));
                }
                int i2 = i + 1;
                j$.time.temporal.a.YEAR.R(i2);
                return new g(i2, 1, (int) (j2 - d0));
            }
        }
        return h0(j$.lang.a.d(x(), j));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        if (j == Long.MIN_VALUE) {
            return e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit);
        }
        return e(-j, chronoUnit);
    }

    public final g k0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        long j3 = 12;
        return m0(j$.time.temporal.a.YEAR.F(j$.nio.file.attribute.s.f(j2, j3)), ((int) j$.nio.file.attribute.s.g(j2, j3)) + 1, this.c);
    }

    public final g l0(long j) {
        if (j == 0) {
            return this;
        }
        return m0(j$.time.temporal.a.YEAR.F(this.a + j), this.b, this.c);
    }

    @Override // j$.time.temporal.l
    public final int n(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return U(oVar);
        }
        return j$.time.temporal.k.a(this, oVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public final g d(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            aVar.R(j);
            int i = f.a[aVar.ordinal()];
            short s = this.c;
            short s2 = this.b;
            int i2 = this.a;
            switch (i) {
                case 1:
                    int i3 = (int) j;
                    if (s == i3) {
                        return this;
                    }
                    return f0(i2, s2, i3);
                case 2:
                    return p0((int) j);
                case 3:
                    return j0(j$.lang.a.g(j - w(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7));
                case 4:
                    if (i2 < 1) {
                        j = 1 - j;
                    }
                    return q0((int) j);
                case 5:
                    return j0(j - W().getValue());
                case 6:
                    return j0(j - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 7:
                    return j0(j - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 8:
                    return h0(j);
                case 9:
                    return j0(j$.lang.a.g(j - w(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7));
                case 10:
                    int i4 = (int) j;
                    if (s2 == i4) {
                        return this;
                    }
                    j$.time.temporal.a.MONTH_OF_YEAR.R(i4);
                    return m0(i2, i4, s);
                case 11:
                    return k0(j - Z());
                case 12:
                    return q0((int) j);
                case 13:
                    if (w(j$.time.temporal.a.ERA) == j) {
                        return this;
                    }
                    return q0(1 - i2);
                default:
                    throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar)));
            }
        }
        return (g) oVar.r(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public final g q(j$.time.temporal.m mVar) {
        if (mVar instanceof g) {
            return (g) mVar;
        }
        return (g) mVar.F(this);
    }

    public final g p0(int i) {
        if (X() == i) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int i2 = this.a;
        long j = i2;
        aVar.R(j);
        j$.time.temporal.a.DAY_OF_YEAR.R(i);
        j$.time.chrono.u.d.getClass();
        boolean q = j$.time.chrono.u.q(j);
        if (i == 366 && !q) {
            throw new RuntimeException("Invalid date 'DayOfYear 366' as '" + i2 + "' is not a leap year");
        }
        k U = k.U(((i - 1) / 31) + 1);
        if (i > (U.S(q) + U.R(q)) - 1) {
            U = U.V();
        }
        return new g(i2, U.getValue(), (i - U.R(q)) + 1);
    }

    public final g q0(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.R(i);
        return m0(i, this.b, this.c);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s r(j$.time.temporal.o oVar) {
        int i;
        long j;
        long j2;
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            if (aVar.B()) {
                int i2 = f.a[aVar.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                return ((j$.time.temporal.a) oVar).k();
                            }
                            if (this.a <= 0) {
                                j2 = 1000000000;
                            } else {
                                j2 = 999999999;
                            }
                            return j$.time.temporal.s.j(1L, j2);
                        }
                        if (k.U(this.b) == k.FEBRUARY && !c0()) {
                            j = 4;
                        } else {
                            j = 5;
                        }
                        return j$.time.temporal.s.j(1L, j);
                    }
                    if (c0()) {
                        i = 366;
                    } else {
                        i = 365;
                    }
                    return j$.time.temporal.s.j(1L, i);
                }
                return j$.time.temporal.s.j(1L, d0());
            }
            throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar)));
        }
        return oVar.w(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r0(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
        dataOutput.writeByte(this.b);
        dataOutput.writeByte(this.c);
    }

    @Override // j$.time.chrono.InterfaceC0033b
    public final String toString() {
        String str;
        int i = this.a;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (abs < 1000) {
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        }
        String str2 = "-";
        short s = this.b;
        if (s >= 10) {
            str = "-";
        } else {
            str = "-0";
        }
        sb.append(str);
        sb.append((int) s);
        short s2 = this.c;
        if (s2 < 10) {
            str2 = "-0";
        }
        sb.append(str2);
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // j$.time.temporal.l
    public final long w(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar == j$.time.temporal.a.EPOCH_DAY) {
                return x();
            }
            if (oVar == j$.time.temporal.a.PROLEPTIC_MONTH) {
                return Z();
            }
            return U(oVar);
        }
        return oVar.n(this);
    }

    @Override // j$.time.chrono.InterfaceC0033b
    public final long x() {
        long j;
        long j2 = this.a;
        long j3 = this.b;
        long j4 = 365 * j2;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + (this.c - 1);
        if (j3 > 2) {
            long j6 = j5 - 1;
            if (!c0()) {
                j5 -= 2;
            } else {
                j5 = j6;
            }
        }
        return j5 - 719528;
    }

    @Override // j$.time.chrono.InterfaceC0033b
    public final InterfaceC0036e z(j jVar) {
        return LocalDateTime.a0(this, jVar);
    }
}
