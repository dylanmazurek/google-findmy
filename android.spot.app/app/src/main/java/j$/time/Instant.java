package j$.time;

import j$.time.chrono.AbstractC0040i;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class Instant implements Temporal, j$.time.temporal.m, Comparable<Instant>, Serializable {
    public static final Instant EPOCH = new Instant(0, 0);
    public static final Instant c = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant d = ofEpochSecond(31556889864403199L, 999999999);
    private static final long serialVersionUID = -665713676816604388L;
    private final long a;
    private final int b;

    private Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    private static Instant S(long j, int i) {
        if ((i | j) == 0) {
            return EPOCH;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new Instant(j, i);
        }
        throw new RuntimeException("Instant exceeds minimum or maximum instant");
    }

    public static Instant T(Temporal temporal) {
        if (temporal instanceof Instant) {
            return (Instant) temporal;
        }
        Objects.a(temporal, "temporal");
        try {
            return ofEpochSecond(temporal.w(j$.time.temporal.a.INSTANT_SECONDS), temporal.n(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (c e) {
            throw new RuntimeException("Unable to obtain Instant from TemporalAccessor: " + String.valueOf(temporal) + " of type " + temporal.getClass().getName(), e);
        }
    }

    private Instant W(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(j$.lang.a.d(j$.lang.a.d(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    private long Y(Instant instant) {
        long h = j$.lang.a.h(instant.a, this.a);
        long j = instant.b - this.b;
        if (h > 0 && j < 0) {
            return h - 1;
        }
        if (h < 0 && j > 0) {
            return h + 1;
        }
        return h;
    }

    public static Instant now() {
        a.b.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    public static Instant ofEpochMilli(long j) {
        long j2 = 1000;
        return S(j$.nio.file.attribute.s.f(j, j2), ((int) j$.nio.file.attribute.s.g(j, j2)) * 1000000);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return S(j$.lang.a.d(j, j$.nio.file.attribute.s.f(j2, 1000000000L)), (int) j$.nio.file.attribute.s.g(j2, 1000000000L));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 2, this);
    }

    @Override // j$.time.temporal.l
    public final Object B(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.k.i()) {
            return ChronoUnit.NANOS;
        }
        if (qVar != j$.time.temporal.k.e() && qVar != j$.time.temporal.k.k() && qVar != j$.time.temporal.k.j() && qVar != j$.time.temporal.k.h() && qVar != j$.time.temporal.k.f() && qVar != j$.time.temporal.k.g()) {
            return qVar.a(this);
        }
        return null;
    }

    @Override // j$.time.temporal.m
    public final Temporal F(Temporal temporal) {
        return temporal.d(this.a, j$.time.temporal.a.INSTANT_SECONDS).d(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    @Override // java.lang.Comparable
    /* renamed from: R */
    public final int compareTo(Instant instant) {
        int compare = Long.compare(this.a, instant.a);
        if (compare != 0) {
            return compare;
        }
        return this.b - instant.b;
    }

    public final long U() {
        return this.a;
    }

    public final int V() {
        return this.b;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: X */
    public final Instant e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (e.b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return W(0L, j);
                case 2:
                    return W(j / 1000000, (j % 1000000) * 1000);
                case 3:
                    return W(j / 1000, (j % 1000) * 1000000);
                case 4:
                    return W(j, 0L);
                case 5:
                    return W(j$.lang.a.g(j, 60), 0L);
                case 6:
                    return W(j$.lang.a.g(j, 3600), 0L);
                case 7:
                    return W(j$.lang.a.g(j, 43200), 0L);
                case 8:
                    return W(j$.lang.a.g(j, 86400), 0L);
                default:
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
        }
        return (Instant) temporalUnit.n(this, j);
    }

    public final void Z(DataOutput dataOutput) {
        dataOutput.writeLong(this.a);
        dataOutput.writeInt(this.b);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.S(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.S(this, zoneId);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            aVar.R(j);
            int i = e.a[aVar.ordinal()];
            int i2 = this.b;
            long j2 = this.a;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (j != j2) {
                                return S(j, i2);
                            }
                        } else {
                            throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar)));
                        }
                    } else {
                        int i3 = ((int) j) * 1000000;
                        if (i3 != i2) {
                            return S(j2, i3);
                        }
                    }
                } else {
                    int i4 = ((int) j) * 1000;
                    if (i4 != i2) {
                        return S(j2, i4);
                    }
                }
            } else if (j != i2) {
                return S(j2, (int) j);
            }
            return this;
        }
        return (Instant) oVar.r(this, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        if (this.a == instant.a && this.b == instant.b) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        Instant T = T(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            int i = e.b[((ChronoUnit) temporalUnit).ordinal()];
            int i2 = this.b;
            long j = this.a;
            switch (i) {
                case 1:
                    return j$.lang.a.d(j$.lang.a.g(j$.lang.a.h(T.a, j), 1000000000L), T.b - i2);
                case 2:
                    return j$.lang.a.d(j$.lang.a.g(j$.lang.a.h(T.a, j), 1000000000L), T.b - i2) / 1000;
                case 3:
                    return j$.lang.a.h(T.toEpochMilli(), toEpochMilli());
                case 4:
                    return Y(T);
                case 5:
                    return Y(T) / 60;
                case 6:
                    return Y(T) / 3600;
                case 7:
                    return Y(T) / 43200;
                case 8:
                    return Y(T) / 86400;
                default:
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
        }
        return temporalUnit.k(this, T);
    }

    @Override // j$.time.temporal.l
    public final boolean g(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar == j$.time.temporal.a.INSTANT_SECONDS || oVar == j$.time.temporal.a.NANO_OF_SECOND || oVar == j$.time.temporal.a.MICRO_OF_SECOND || oVar == j$.time.temporal.a.MILLI_OF_SECOND) {
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
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isAfter(Instant instant) {
        if (compareTo(instant) > 0) {
            return true;
        }
        return false;
    }

    public boolean isBefore(Instant instant) {
        if (compareTo(instant) < 0) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        if (j == Long.MIN_VALUE) {
            return e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit);
        }
        return e(-j, chronoUnit);
    }

    public Instant minus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.n(this);
    }

    public Instant minusSeconds(long j) {
        if (j == Long.MIN_VALUE) {
            return W(Long.MAX_VALUE, 0L).W(1L, 0L);
        }
        return W(-j, 0L);
    }

    @Override // j$.time.temporal.l
    public final int n(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i = e.a[((j$.time.temporal.a) oVar).ordinal()];
            int i2 = this.b;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            j$.time.temporal.a.INSTANT_SECONDS.F(this.a);
                        }
                        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar)));
                    }
                    return i2 / 1000000;
                }
                return i2 / 1000;
            }
            return i2;
        }
        return j$.time.temporal.k.d(this, oVar).a(oVar.n(this), oVar);
    }

    public Instant plus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.k(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal q(g gVar) {
        return (Instant) AbstractC0040i.a(gVar, this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s r(j$.time.temporal.o oVar) {
        return j$.time.temporal.k.d(this, oVar);
    }

    public long toEpochMilli() {
        int i = this.b;
        long j = this.a;
        if (j < 0 && i > 0) {
            return j$.lang.a.d(j$.lang.a.g(j + 1, 1000), (i / 1000000) - 1000);
        }
        return j$.lang.a.d(j$.lang.a.g(j, 1000), i / 1000000);
    }

    public final String toString() {
        return DateTimeFormatter.e.a(this);
    }

    public Instant truncatedTo(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.NANOS) {
            return this;
        }
        Duration q = temporalUnit.q();
        if (q.getSeconds() <= 86400) {
            long F = q.F();
            if (86400000000000L % F == 0) {
                long j = ((this.a % 86400) * 1000000000) + this.b;
                return W(0L, (j$.nio.file.attribute.s.f(j, F) * F) - j);
            }
            throw new RuntimeException("Unit must divide into a standard day without remainder");
        }
        throw new RuntimeException("Unit is too large to be used for truncation");
    }

    @Override // j$.time.temporal.l
    public final long w(j$.time.temporal.o oVar) {
        int i;
        if (oVar instanceof j$.time.temporal.a) {
            int i2 = e.a[((j$.time.temporal.a) oVar).ordinal()];
            int i3 = this.b;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return this.a;
                        }
                        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar)));
                    }
                    i = i3 / 1000000;
                } else {
                    i = i3 / 1000;
                }
                return i;
            }
            return i3;
        }
        return oVar.n(this);
    }
}
