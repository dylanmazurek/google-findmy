package j$.time;

import j$.time.chrono.AbstractC0032a;
import j$.time.chrono.AbstractC0040i;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class v implements Temporal, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    private final int a;
    private final int b;

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.l(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.u.EXCEEDS_PAD);
        nVar.e('-');
        nVar.k(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        nVar.v();
    }

    private v(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private long R() {
        return ((this.a * 12) + this.b) - 1;
    }

    public static v S(int i, int i2) {
        j$.time.temporal.a.YEAR.R(i);
        j$.time.temporal.a.MONTH_OF_YEAR.R(i2);
        return new v(i, i2);
    }

    private v W(int i, int i2) {
        if (this.a == i && this.b == i2) {
            return this;
        }
        return new v(i, i2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 12, this);
    }

    @Override // j$.time.temporal.l
    public final Object B(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.k.e()) {
            return j$.time.chrono.u.d;
        }
        if (qVar == j$.time.temporal.k.i()) {
            return ChronoUnit.MONTHS;
        }
        return j$.time.temporal.k.c(this, qVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal F(Temporal temporal) {
        if (((AbstractC0032a) AbstractC0040i.p(temporal)).equals(j$.time.chrono.u.d)) {
            return temporal.d(R(), j$.time.temporal.a.PROLEPTIC_MONTH);
        }
        throw new RuntimeException("Adjustment only supported on ISO date-time");
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final v e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (u.b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return U(j);
                case 2:
                    return V(j);
                case 3:
                    return V(j$.lang.a.g(j, 10));
                case 4:
                    return V(j$.lang.a.g(j, 100));
                case 5:
                    return V(j$.lang.a.g(j, 1000));
                case 6:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return d(j$.lang.a.d(w(aVar), j), aVar);
                default:
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
        }
        return (v) temporalUnit.n(this, j);
    }

    public final v U(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        long j3 = 12;
        return W(j$.time.temporal.a.YEAR.F(j$.nio.file.attribute.s.f(j2, j3)), ((int) j$.nio.file.attribute.s.g(j2, j3)) + 1);
    }

    public final v V(long j) {
        if (j == 0) {
            return this;
        }
        return W(j$.time.temporal.a.YEAR.F(this.a + j), this.b);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final v d(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            aVar.R(j);
            int i = u.a[aVar.ordinal()];
            int i2 = this.a;
            if (i != 1) {
                if (i != 2) {
                    int i3 = this.b;
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (w(j$.time.temporal.a.ERA) == j) {
                                    return this;
                                }
                                int i4 = 1 - i2;
                                j$.time.temporal.a.YEAR.R(i4);
                                return W(i4, i3);
                            }
                            throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar)));
                        }
                        int i5 = (int) j;
                        j$.time.temporal.a.YEAR.R(i5);
                        return W(i5, i3);
                    }
                    if (i2 < 1) {
                        j = 1 - j;
                    }
                    int i6 = (int) j;
                    j$.time.temporal.a.YEAR.R(i6);
                    return W(i6, i3);
                }
                return U(j - R());
            }
            int i7 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.R(i7);
            return W(i2, i7);
        }
        return (v) oVar.r(this, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Y(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
        dataOutput.writeByte(this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v vVar = (v) obj;
        int i = this.a - vVar.a;
        if (i == 0) {
            return this.b - vVar.b;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.a == vVar.a && this.b == vVar.b) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        v S;
        if (temporal instanceof v) {
            S = (v) temporal;
        } else {
            Objects.a(temporal, "temporal");
            try {
                if (!j$.time.chrono.u.d.equals(AbstractC0040i.p(temporal))) {
                    temporal = g.T(temporal);
                }
                S = S(temporal.n(j$.time.temporal.a.YEAR), temporal.n(j$.time.temporal.a.MONTH_OF_YEAR));
            } catch (c e) {
                throw new RuntimeException("Unable to obtain YearMonth from TemporalAccessor: " + String.valueOf(temporal) + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long R = S.R() - R();
            switch (u.b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return R;
                case 2:
                    return R / 12;
                case 3:
                    return R / 120;
                case 4:
                    return R / 1200;
                case 5:
                    return R / 12000;
                case 6:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return S.w(aVar) - w(aVar);
                default:
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
        }
        return temporalUnit.k(this, S);
    }

    @Override // j$.time.temporal.l
    public final boolean g(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar == j$.time.temporal.a.YEAR || oVar == j$.time.temporal.a.MONTH_OF_YEAR || oVar == j$.time.temporal.a.PROLEPTIC_MONTH || oVar == j$.time.temporal.a.YEAR_OF_ERA || oVar == j$.time.temporal.a.ERA) {
                return true;
            }
            return false;
        }
        if (oVar != null && oVar.q(this)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b << 27) ^ this.a;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        if (j == Long.MIN_VALUE) {
            return e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit);
        }
        return e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.l
    public final int n(j$.time.temporal.o oVar) {
        return r(oVar).a(w(oVar), oVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal q(g gVar) {
        return (v) AbstractC0040i.a(gVar, this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s r(j$.time.temporal.o oVar) {
        long j;
        if (oVar == j$.time.temporal.a.YEAR_OF_ERA) {
            if (this.a <= 0) {
                j = 1000000000;
            } else {
                j = 999999999;
            }
            return j$.time.temporal.s.j(1L, j);
        }
        return j$.time.temporal.k.d(this, oVar);
    }

    public final String toString() {
        String str;
        int i = this.a;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(9);
        if (abs < 1000) {
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(i);
        }
        int i2 = this.b;
        if (i2 < 10) {
            str = "-0";
        } else {
            str = "-";
        }
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    @Override // j$.time.temporal.l
    public final long w(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i = u.a[((j$.time.temporal.a) oVar).ordinal()];
            int i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    int i3 = this.a;
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (i3 < 1) {
                                    i2 = 0;
                                }
                                return i2;
                            }
                            throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar)));
                        }
                        return i3;
                    }
                    if (i3 < 1) {
                        i3 = 1 - i3;
                    }
                    return i3;
                }
                return R();
            }
            return this.b;
        }
        return oVar.n(this);
    }
}
