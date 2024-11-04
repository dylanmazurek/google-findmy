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
public final class t implements Temporal, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    private final int a;

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.l(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.u.EXCEEDS_PAD);
        nVar.v();
    }

    private t(int i) {
        this.a = i;
    }

    public static t R(int i) {
        j$.time.temporal.a.YEAR.R(i);
        return new t(i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 11, this);
    }

    @Override // j$.time.temporal.l
    public final Object B(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.k.e()) {
            return j$.time.chrono.u.d;
        }
        if (qVar == j$.time.temporal.k.i()) {
            return ChronoUnit.YEARS;
        }
        return j$.time.temporal.k.c(this, qVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal F(Temporal temporal) {
        if (((AbstractC0032a) AbstractC0040i.p(temporal)).equals(j$.time.chrono.u.d)) {
            return temporal.d(this.a, j$.time.temporal.a.YEAR);
        }
        throw new RuntimeException("Adjustment only supported on ISO date-time");
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final t e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            int i = s.b[((ChronoUnit) temporalUnit).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                                return d(j$.lang.a.d(w(aVar), j), aVar);
                            }
                            throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                        }
                        return T(j$.lang.a.g(j, 1000));
                    }
                    return T(j$.lang.a.g(j, 100));
                }
                return T(j$.lang.a.g(j, 10));
            }
            return T(j);
        }
        return (t) temporalUnit.n(this, j);
    }

    public final t T(long j) {
        if (j == 0) {
            return this;
        }
        return R(j$.time.temporal.a.YEAR.F(this.a + j));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final t d(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            aVar.R(j);
            int i = s.a[aVar.ordinal()];
            int i2 = this.a;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (w(j$.time.temporal.a.ERA) == j) {
                            return this;
                        }
                        return R(1 - i2);
                    }
                    throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar)));
                }
                return R((int) j);
            }
            if (i2 < 1) {
                j = 1 - j;
            }
            return R((int) j);
        }
        return (t) oVar.r(this, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void V(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((t) obj).a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        if (this.a == ((t) obj).a) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        t R;
        if (temporal instanceof t) {
            R = (t) temporal;
        } else {
            Objects.a(temporal, "temporal");
            try {
                if (!j$.time.chrono.u.d.equals(AbstractC0040i.p(temporal))) {
                    temporal = g.T(temporal);
                }
                R = R(temporal.n(j$.time.temporal.a.YEAR));
            } catch (c e) {
                throw new RuntimeException("Unable to obtain Year from TemporalAccessor: " + String.valueOf(temporal) + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long j = R.a - this.a;
            int i = s.b[((ChronoUnit) temporalUnit).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                                return R.w(aVar) - w(aVar);
                            }
                            throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
                        }
                        return j / 1000;
                    }
                    return j / 100;
                }
                return j / 10;
            }
            return j;
        }
        return temporalUnit.k(this, R);
    }

    @Override // j$.time.temporal.l
    public final boolean g(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar == j$.time.temporal.a.YEAR || oVar == j$.time.temporal.a.YEAR_OF_ERA || oVar == j$.time.temporal.a.ERA) {
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
        return this.a;
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
        return (t) AbstractC0040i.a(gVar, this);
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
        return Integer.toString(this.a);
    }

    @Override // j$.time.temporal.l
    public final long w(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i = s.a[((j$.time.temporal.a) oVar).ordinal()];
            int i2 = this.a;
            int i3 = 1;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (i2 < 1) {
                            i3 = 0;
                        }
                        return i3;
                    }
                    throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar)));
                }
                return i2;
            }
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        return oVar.n(this);
    }
}
