package j$.time;

import j$.time.chrono.AbstractC0040i;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class OffsetDateTime implements Temporal, j$.time.temporal.m, Comparable<OffsetDateTime>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;
    private final LocalDateTime a;
    private final ZoneOffset b;

    static {
        LocalDateTime localDateTime = LocalDateTime.c;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        R(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.d;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        R(localDateTime2, zoneOffset2);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.a(localDateTime, "dateTime");
        this.a = localDateTime;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public static OffsetDateTime R(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime S(Instant instant, ZoneId zoneId) {
        Objects.a(instant, "instant");
        Objects.a(zoneId, "zone");
        ZoneOffset d = zoneId.S().d(instant);
        return new OffsetDateTime(LocalDateTime.b0(instant.U(), instant.V(), d), d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OffsetDateTime U(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.c;
        g gVar = g.d;
        return new OffsetDateTime(LocalDateTime.a0(g.f0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.h0(objectInput)), ZoneOffset.e0(objectInput));
    }

    private OffsetDateTime V(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        if (this.a == localDateTime && this.b.equals(zoneOffset)) {
            return this;
        }
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 10, this);
    }

    @Override // j$.time.temporal.l
    public final Object B(j$.time.temporal.q qVar) {
        if (qVar != j$.time.temporal.k.h() && qVar != j$.time.temporal.k.j()) {
            if (qVar == j$.time.temporal.k.k()) {
                return null;
            }
            j$.time.temporal.q f = j$.time.temporal.k.f();
            LocalDateTime localDateTime = this.a;
            if (qVar == f) {
                return localDateTime.f0();
            }
            if (qVar == j$.time.temporal.k.g()) {
                return localDateTime.b();
            }
            if (qVar == j$.time.temporal.k.e()) {
                return j$.time.chrono.u.d;
            }
            if (qVar == j$.time.temporal.k.i()) {
                return ChronoUnit.NANOS;
            }
            return qVar.a(this);
        }
        return this.b;
    }

    @Override // j$.time.temporal.m
    public final Temporal F(Temporal temporal) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.a;
        return temporal.d(localDateTime.f0().x(), aVar).d(localDateTime.b().i0(), j$.time.temporal.a.NANO_OF_DAY).d(this.b.Z(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return V(this.a.e(j, temporalUnit), this.b);
        }
        return (OffsetDateTime) temporalUnit.n(this, j);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int i;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.b;
        ZoneOffset zoneOffset2 = this.b;
        if (zoneOffset2.equals(zoneOffset)) {
            i = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.a;
            localDateTime.getClass();
            long n = AbstractC0040i.n(localDateTime, zoneOffset2);
            LocalDateTime localDateTime2 = offsetDateTime2.a;
            localDateTime2.getClass();
            int compare = Long.compare(n, AbstractC0040i.n(localDateTime2, offsetDateTime2.b));
            if (compare == 0) {
                i = localDateTime.b().X() - localDateTime2.b().X();
            } else {
                i = compare;
            }
        }
        if (i == 0) {
            return toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        }
        return i;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            int i = n.a[aVar.ordinal()];
            ZoneOffset zoneOffset = this.b;
            LocalDateTime localDateTime = this.a;
            if (i != 1) {
                if (i != 2) {
                    return V(localDateTime.d(j, oVar), zoneOffset);
                }
                return V(localDateTime, ZoneOffset.c0(aVar.F(j)));
            }
            return S(Instant.ofEpochSecond(j, localDateTime.V()), zoneOffset);
        }
        return (OffsetDateTime) oVar.r(this, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        if (this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16, types: [j$.time.OffsetDateTime] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        if (temporal instanceof OffsetDateTime) {
            temporal = (OffsetDateTime) temporal;
        } else {
            try {
                ZoneOffset Y = ZoneOffset.Y(temporal);
                g gVar = (g) temporal.B(j$.time.temporal.k.f());
                j jVar = (j) temporal.B(j$.time.temporal.k.g());
                if (gVar != null && jVar != null) {
                    temporal = new OffsetDateTime(LocalDateTime.a0(gVar, jVar), Y);
                } else {
                    temporal = S(Instant.T(temporal), Y);
                }
            } catch (c e) {
                throw new RuntimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + String.valueOf(temporal) + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            ZoneOffset zoneOffset = temporal.b;
            ZoneOffset zoneOffset2 = this.b;
            OffsetDateTime offsetDateTime = temporal;
            if (!zoneOffset2.equals(zoneOffset)) {
                offsetDateTime = new OffsetDateTime(temporal.a.d0(zoneOffset2.Z() - zoneOffset.Z()), zoneOffset2);
            }
            return this.a.f(offsetDateTime.a, temporalUnit);
        }
        return temporalUnit.k(this, temporal);
    }

    @Override // j$.time.temporal.l
    public final boolean g(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a) && (oVar == null || !oVar.q(this))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
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
            int i = n.a[((j$.time.temporal.a) oVar).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return this.a.n(oVar);
                }
                return this.b.Z();
            }
            throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return j$.time.temporal.k.a(this, oVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal q(g gVar) {
        return V(this.a.h0(gVar), this.b);
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

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    public final String toString() {
        return this.a.toString() + this.b.toString();
    }

    @Override // j$.time.temporal.l
    public final long w(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i = n.a[((j$.time.temporal.a) oVar).ordinal()];
            ZoneOffset zoneOffset = this.b;
            LocalDateTime localDateTime = this.a;
            if (i != 1) {
                if (i != 2) {
                    return localDateTime.w(oVar);
                }
                return zoneOffset.Z();
            }
            localDateTime.getClass();
            return AbstractC0040i.n(localDateTime, zoneOffset);
        }
        return oVar.n(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        this.a.j0(objectOutput);
        this.b.f0(objectOutput);
    }
}
