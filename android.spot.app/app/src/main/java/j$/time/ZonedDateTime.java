package j$.time;

import j$.time.chrono.AbstractC0040i;
import j$.time.chrono.InterfaceC0033b;
import j$.time.chrono.InterfaceC0042k;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class ZonedDateTime implements Temporal, InterfaceC0042k, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    private final LocalDateTime a;
    private final ZoneOffset b;
    private final ZoneId c;

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    private static ZonedDateTime F(long j, int i, ZoneId zoneId) {
        ZoneOffset d = zoneId.S().d(Instant.ofEpochSecond(j, i));
        return new ZonedDateTime(LocalDateTime.b0(j, i, d), zoneId, d);
    }

    public static ZonedDateTime R(Temporal temporal) {
        if (temporal instanceof ZonedDateTime) {
            return (ZonedDateTime) temporal;
        }
        try {
            ZoneId R = ZoneId.R(temporal);
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            if (temporal.g(aVar)) {
                return F(temporal.w(aVar), temporal.n(j$.time.temporal.a.NANO_OF_SECOND), R);
            }
            return T(LocalDateTime.a0(g.T(temporal), j.T(temporal)), R, null);
        } catch (c e) {
            throw new RuntimeException("Unable to obtain ZonedDateTime from TemporalAccessor: " + String.valueOf(temporal) + " of type " + temporal.getClass().getName(), e);
        }
    }

    public static ZonedDateTime S(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        Objects.a(zoneId, "zone");
        return F(instant.U(), instant.V(), zoneId);
    }

    public static ZonedDateTime T(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.a(localDateTime, "localDateTime");
        Objects.a(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.e S = zoneId.S();
        List g = S.g(localDateTime);
        if (g.size() == 1) {
            zoneOffset = (ZoneOffset) g.get(0);
        } else if (g.size() == 0) {
            j$.time.zone.b f = S.f(localDateTime);
            localDateTime = localDateTime.d0(f.q().getSeconds());
            zoneOffset = f.r();
        } else if (zoneOffset == null || !g.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) g.get(0);
            Objects.a(zoneOffset, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZonedDateTime V(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.c;
        g gVar = g.d;
        LocalDateTime a0 = LocalDateTime.a0(g.f0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.h0(objectInput));
        ZoneOffset e0 = ZoneOffset.e0(objectInput);
        ZoneId zoneId = (ZoneId) r.a(objectInput);
        Objects.a(zoneId, "zone");
        if ((zoneId instanceof ZoneOffset) && !e0.equals(zoneId)) {
            throw new IllegalArgumentException("ZoneId must match ZoneOffset");
        }
        return new ZonedDateTime(a0, zoneId, e0);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 6, this);
    }

    @Override // j$.time.temporal.l
    public final Object B(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.k.f()) {
            return this.a.f0();
        }
        return AbstractC0040i.l(this, qVar);
    }

    @Override // j$.time.chrono.InterfaceC0042k
    public final /* synthetic */ long Q() {
        return AbstractC0040i.o(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime e(long j, TemporalUnit temporalUnit) {
        boolean z;
        if (temporalUnit instanceof ChronoUnit) {
            ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
            if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                z = true;
            } else {
                z = false;
            }
            ZoneOffset zoneOffset = this.b;
            ZoneId zoneId = this.c;
            LocalDateTime localDateTime = this.a;
            if (z) {
                return T(localDateTime.e(j, temporalUnit), zoneId, zoneOffset);
            }
            LocalDateTime e = localDateTime.e(j, temporalUnit);
            Objects.a(e, "localDateTime");
            Objects.a(zoneOffset, "offset");
            Objects.a(zoneId, "zone");
            if (zoneId.S().g(e).contains(zoneOffset)) {
                return new ZonedDateTime(e, zoneId, zoneOffset);
            }
            return F(AbstractC0040i.n(e, zoneOffset), e.V(), zoneId);
        }
        return (ZonedDateTime) temporalUnit.n(this, j);
    }

    @Override // j$.time.chrono.InterfaceC0042k
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime i(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        LocalDateTime localDateTime = this.a;
        localDateTime.getClass();
        return F(AbstractC0040i.n(localDateTime, this.b), localDateTime.V(), zoneId);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void X(DataOutput dataOutput) {
        this.a.j0(dataOutput);
        this.b.f0(dataOutput);
        this.c.W((ObjectOutput) dataOutput);
    }

    @Override // j$.time.chrono.InterfaceC0042k
    public final j$.time.chrono.n a() {
        return ((g) c()).a();
    }

    @Override // j$.time.chrono.InterfaceC0042k
    public final j b() {
        return this.a.b();
    }

    @Override // j$.time.chrono.InterfaceC0042k
    public final InterfaceC0033b c() {
        return this.a.f0();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC0040i.d(this, (InterfaceC0042k) obj);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            int i = x.a[aVar.ordinal()];
            LocalDateTime localDateTime = this.a;
            ZoneId zoneId = this.c;
            if (i != 1) {
                ZoneOffset zoneOffset = this.b;
                if (i != 2) {
                    return T(localDateTime.d(j, oVar), zoneId, zoneOffset);
                }
                ZoneOffset c0 = ZoneOffset.c0(aVar.F(j));
                if (!c0.equals(zoneOffset) && zoneId.S().g(localDateTime).contains(c0)) {
                    return new ZonedDateTime(localDateTime, zoneId, c0);
                }
                return this;
            }
            return F(j, localDateTime.V(), zoneId);
        }
        return (ZonedDateTime) oVar.r(this, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedDateTime)) {
            return false;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
        if (this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c)) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime R = R(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            ZonedDateTime i = R.i(this.c);
            ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
            int compareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
            LocalDateTime localDateTime = this.a;
            LocalDateTime localDateTime2 = i.a;
            if (compareTo >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return localDateTime.f(localDateTime2, temporalUnit);
            }
            return OffsetDateTime.R(localDateTime, this.b).f(OffsetDateTime.R(localDateTime2, i.b), temporalUnit);
        }
        return temporalUnit.k(this, R);
    }

    @Override // j$.time.temporal.l
    public final boolean g(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a) && (oVar == null || !oVar.q(this))) {
            return false;
        }
        return true;
    }

    @Override // j$.time.chrono.InterfaceC0042k
    public final ZoneOffset h() {
        return this.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.chrono.InterfaceC0042k
    public final InterfaceC0042k j(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        return T(this.a, zoneId, this.b);
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
            int i = x.a[((j$.time.temporal.a) oVar).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return this.a.n(oVar);
                }
                return this.b.Z();
            }
            throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return AbstractC0040i.e(this, oVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal q(g gVar) {
        return T(LocalDateTime.a0(gVar, this.a.b()), this.c, this.b);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s r(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar != j$.time.temporal.a.INSTANT_SECONDS && oVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.a.r(oVar);
            }
            return ((j$.time.temporal.a) oVar).k();
        }
        return oVar.w(this);
    }

    @Override // j$.time.chrono.InterfaceC0042k
    /* renamed from: toLocalDateTime, reason: merged with bridge method [inline-methods] */
    public LocalDateTime J() {
        return this.a;
    }

    public final String toString() {
        String localDateTime = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = localDateTime + zoneOffset.toString();
        ZoneId zoneId = this.c;
        if (zoneOffset != zoneId) {
            return str + "[" + zoneId.toString() + "]";
        }
        return str;
    }

    @Override // j$.time.chrono.InterfaceC0042k
    public final ZoneId u() {
        return this.c;
    }

    @Override // j$.time.temporal.l
    public final long w(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i = x.a[((j$.time.temporal.a) oVar).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return this.a.w(oVar);
                }
                return this.b.Z();
            }
            return AbstractC0040i.o(this);
        }
        return oVar.n(this);
    }
}
