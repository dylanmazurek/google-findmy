package j$.time;

import j$.time.chrono.AbstractC0040i;
import j$.time.chrono.InterfaceC0033b;
import j$.time.chrono.InterfaceC0036e;
import j$.time.chrono.InterfaceC0042k;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class LocalDateTime implements Temporal, j$.time.temporal.m, InterfaceC0036e, Serializable {
    public static final LocalDateTime c = a0(g.d, j.e);
    public static final LocalDateTime d = a0(g.e, j.f);
    private static final long serialVersionUID = 6207766400415563566L;
    private final g a;
    private final j b;

    private LocalDateTime(g gVar, j jVar) {
        this.a = gVar;
        this.b = jVar;
    }

    private int R(LocalDateTime localDateTime) {
        int R = this.a.R(localDateTime.a);
        if (R == 0) {
            return this.b.compareTo(localDateTime.b);
        }
        return R;
    }

    public static LocalDateTime S(Temporal temporal) {
        if (temporal instanceof LocalDateTime) {
            return (LocalDateTime) temporal;
        }
        if (temporal instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporal).J();
        }
        if (temporal instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporal).toLocalDateTime();
        }
        try {
            return new LocalDateTime(g.T(temporal), j.T(temporal));
        } catch (c e) {
            throw new RuntimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + String.valueOf(temporal) + " of type " + temporal.getClass().getName(), e);
        }
    }

    public static LocalDateTime Z(int i) {
        return new LocalDateTime(g.f0(i, 12, 31), j.Z(0));
    }

    public static LocalDateTime a0(g gVar, j jVar) {
        Objects.a(gVar, "date");
        Objects.a(jVar, "time");
        return new LocalDateTime(gVar, jVar);
    }

    public static LocalDateTime b0(long j, int i, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.R(j2);
        return new LocalDateTime(g.h0(j$.nio.file.attribute.s.f(j + zoneOffset.Z(), 86400)), j.a0((((int) j$.nio.file.attribute.s.g(r5, r7)) * 1000000000) + j2));
    }

    private LocalDateTime e0(g gVar, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j jVar = this.b;
        if (j5 == 0) {
            return i0(gVar, jVar);
        }
        long j6 = j / 24;
        long j7 = j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j8 = 1;
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long i0 = jVar.i0();
        long j10 = (j9 * j8) + i0;
        long f = j$.nio.file.attribute.s.f(j10, 86400000000000L) + (j7 * j8);
        long g = j$.nio.file.attribute.s.g(j10, 86400000000000L);
        if (g != i0) {
            jVar = j.a0(g);
        }
        return i0(gVar.j0(f), jVar);
    }

    private LocalDateTime i0(g gVar, j jVar) {
        if (this.a == gVar && this.b == jVar) {
            return this;
        }
        return new LocalDateTime(gVar, jVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 5, this);
    }

    @Override // j$.time.temporal.l
    public final Object B(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.k.f()) {
            return this.a;
        }
        return AbstractC0040i.k(this, qVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal F(Temporal temporal) {
        return temporal.d(((g) c()).x(), j$.time.temporal.a.EPOCH_DAY).d(b().i0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* renamed from: I */
    public final int compareTo(InterfaceC0036e interfaceC0036e) {
        if (interfaceC0036e instanceof LocalDateTime) {
            return R((LocalDateTime) interfaceC0036e);
        }
        return AbstractC0040i.c(this, interfaceC0036e);
    }

    public final int T() {
        return this.b.V();
    }

    public final int U() {
        return this.b.W();
    }

    public final int V() {
        return this.b.X();
    }

    public final int W() {
        return this.b.Y();
    }

    public final boolean X(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            if (R(localDateTime) <= 0) {
                return false;
            }
            return true;
        }
        long x = this.a.x();
        long x2 = localDateTime.a.x();
        if (x <= x2 && (x != x2 || this.b.i0() <= localDateTime.b.i0())) {
            return false;
        }
        return true;
    }

    public final boolean Y(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            if (R(localDateTime) >= 0) {
                return false;
            }
            return true;
        }
        long x = this.a.x();
        long x2 = localDateTime.a.x();
        if (x >= x2 && (x != x2 || this.b.i0() >= localDateTime.b.i0())) {
            return false;
        }
        return true;
    }

    @Override // j$.time.chrono.InterfaceC0036e
    public final j$.time.chrono.n a() {
        return ((g) c()).a();
    }

    @Override // j$.time.chrono.InterfaceC0036e
    public final j b() {
        return this.b;
    }

    @Override // j$.time.chrono.InterfaceC0036e
    public final InterfaceC0033b c() {
        return this.a;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: c0 */
    public final LocalDateTime e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            int i = h.a[((ChronoUnit) temporalUnit).ordinal()];
            j jVar = this.b;
            g gVar = this.a;
            switch (i) {
                case 1:
                    return e0(this.a, 0L, 0L, 0L, j);
                case 2:
                    LocalDateTime i0 = i0(gVar.j0(j / 86400000000L), jVar);
                    return i0.e0(i0.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    LocalDateTime i02 = i0(gVar.j0(j / 86400000), jVar);
                    return i02.e0(i02.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return d0(j);
                case 5:
                    return e0(this.a, 0L, j, 0L, 0L);
                case 6:
                    return e0(this.a, j, 0L, 0L, 0L);
                case 7:
                    LocalDateTime i03 = i0(gVar.j0(j / 256), jVar);
                    return i03.e0(i03.a, (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return i0(gVar.e(j, temporalUnit), jVar);
            }
        }
        return (LocalDateTime) temporalUnit.n(this, j);
    }

    public final LocalDateTime d0(long j) {
        return e0(this.a, 0L, 0L, j, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        boolean z;
        g gVar;
        long j;
        long j2;
        LocalDateTime S = S(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            if (((ChronoUnit) temporalUnit).compareTo(ChronoUnit.DAYS) < 0) {
                z = true;
            } else {
                z = false;
            }
            j jVar = this.b;
            g gVar2 = this.a;
            if (z) {
                g gVar3 = S.a;
                gVar2.getClass();
                long x = gVar3.x() - gVar2.x();
                j jVar2 = S.b;
                if (x == 0) {
                    return jVar.f(jVar2, temporalUnit);
                }
                long i0 = jVar2.i0() - jVar.i0();
                if (x > 0) {
                    j = x - 1;
                    j2 = i0 + 86400000000000L;
                } else {
                    j = x + 1;
                    j2 = i0 - 86400000000000L;
                }
                switch (h.a[((ChronoUnit) temporalUnit).ordinal()]) {
                    case 1:
                        j = j$.lang.a.g(j, 86400000000000L);
                        break;
                    case 2:
                        j = j$.lang.a.g(j, 86400000000L);
                        j2 /= 1000;
                        break;
                    case 3:
                        j = j$.lang.a.g(j, 86400000L);
                        j2 /= 1000000;
                        break;
                    case 4:
                        j = j$.lang.a.g(j, 86400);
                        j2 /= 1000000000;
                        break;
                    case 5:
                        j = j$.lang.a.g(j, 1440);
                        j2 /= 60000000000L;
                        break;
                    case 6:
                        j = j$.lang.a.g(j, 24);
                        j2 /= 3600000000000L;
                        break;
                    case 7:
                        j = j$.lang.a.g(j, 2);
                        j2 /= 43200000000000L;
                        break;
                }
                return j$.lang.a.d(j, j2);
            }
            g gVar4 = S.a;
            gVar4.getClass();
            boolean z2 = gVar2 instanceof g;
            j jVar3 = S.b;
            if (!z2 ? gVar4.x() > gVar2.x() : gVar4.R(gVar2) > 0) {
                if (jVar3.compareTo(jVar) < 0) {
                    gVar = gVar4.j0(-1L);
                    return gVar2.f(gVar, temporalUnit);
                }
            }
            boolean b0 = gVar4.b0(gVar2);
            gVar = gVar4;
            if (b0) {
                gVar = gVar4;
                if (jVar3.compareTo(jVar) > 0) {
                    gVar = gVar4.j0(1L);
                }
            }
            return gVar2.f(gVar, temporalUnit);
        }
        return temporalUnit.k(this, S);
    }

    public final g f0() {
        return this.a;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // j$.time.temporal.l
    public final boolean g(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            if (aVar.B() || aVar.S()) {
                return true;
            }
            return false;
        }
        if (oVar != null && oVar.q(this)) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: g0 */
    public final LocalDateTime d(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            boolean S = ((j$.time.temporal.a) oVar).S();
            j jVar = this.b;
            g gVar = this.a;
            if (S) {
                return i0(gVar, jVar.d(j, oVar));
            }
            return i0(gVar.d(j, oVar), jVar);
        }
        return (LocalDateTime) oVar.r(this, j);
    }

    public int getDayOfMonth() {
        return this.a.V();
    }

    public int getMonthValue() {
        return this.a.Y();
    }

    public int getYear() {
        return this.a.a0();
    }

    public final LocalDateTime h0(g gVar) {
        return i0(gVar, this.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final void j0(DataOutput dataOutput) {
        this.a.r0(dataOutput);
        this.b.m0(dataOutput);
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
        if (oVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) oVar).S()) {
                return this.b.n(oVar);
            }
            return this.a.n(oVar);
        }
        return j$.time.temporal.k.a(this, oVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal q(g gVar) {
        return i0(gVar, this.b);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s r(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) oVar).S()) {
                j jVar = this.b;
                jVar.getClass();
                return j$.time.temporal.k.d(jVar, oVar);
            }
            return this.a.r(oVar);
        }
        return oVar.w(this);
    }

    @Override // j$.time.chrono.InterfaceC0036e
    public final InterfaceC0042k s(ZoneOffset zoneOffset) {
        return ZonedDateTime.T(this, zoneOffset, null);
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.l
    public final long w(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) oVar).S()) {
                return this.b.w(oVar);
            }
            return this.a.w(oVar);
        }
        return oVar.n(this);
    }
}
