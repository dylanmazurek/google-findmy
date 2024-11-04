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
public final class p implements Temporal, j$.time.temporal.m, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;
    private final j a;
    private final ZoneOffset b;

    static {
        j jVar = j.e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        jVar.getClass();
        R(jVar, zoneOffset);
        j jVar2 = j.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        jVar2.getClass();
        R(jVar2, zoneOffset2);
    }

    private p(j jVar, ZoneOffset zoneOffset) {
        Objects.a(jVar, "time");
        this.a = jVar;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public static p R(j jVar, ZoneOffset zoneOffset) {
        return new p(jVar, zoneOffset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p T(ObjectInput objectInput) {
        return new p(j.h0(objectInput), ZoneOffset.e0(objectInput));
    }

    private long U() {
        return this.a.i0() - (this.b.Z() * 1000000000);
    }

    private p V(j jVar, ZoneOffset zoneOffset) {
        if (this.a == jVar && this.b.equals(zoneOffset)) {
            return this;
        }
        return new p(jVar, zoneOffset);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 9, this);
    }

    @Override // j$.time.temporal.l
    public final Object B(j$.time.temporal.q qVar) {
        boolean z;
        if (qVar != j$.time.temporal.k.h() && qVar != j$.time.temporal.k.j()) {
            boolean z2 = false;
            if (qVar == j$.time.temporal.k.k()) {
                z = true;
            } else {
                z = false;
            }
            if (qVar == j$.time.temporal.k.e()) {
                z2 = true;
            }
            if (!(z | z2) && qVar != j$.time.temporal.k.f()) {
                if (qVar == j$.time.temporal.k.g()) {
                    return this.a;
                }
                if (qVar == j$.time.temporal.k.i()) {
                    return ChronoUnit.NANOS;
                }
                return qVar.a(this);
            }
            return null;
        }
        return this.b;
    }

    @Override // j$.time.temporal.m
    public final Temporal F(Temporal temporal) {
        return temporal.d(this.a.i0(), j$.time.temporal.a.NANO_OF_DAY).d(this.b.Z(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final p e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return V(this.a.e(j, temporalUnit), this.b);
        }
        return (p) temporalUnit.n(this, j);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        p pVar = (p) obj;
        boolean equals = this.b.equals(pVar.b);
        j jVar = this.a;
        j jVar2 = pVar.a;
        if (equals) {
            return jVar.compareTo(jVar2);
        }
        int compare = Long.compare(U(), pVar.U());
        if (compare == 0) {
            return jVar.compareTo(jVar2);
        }
        return compare;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
            j jVar = this.a;
            if (oVar == aVar) {
                return V(jVar, ZoneOffset.c0(((j$.time.temporal.a) oVar).F(j)));
            }
            return V(jVar.d(j, oVar), this.b);
        }
        return (p) oVar.r(this, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.a.equals(pVar.a) && this.b.equals(pVar.b)) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        p pVar;
        if (temporal instanceof p) {
            pVar = (p) temporal;
        } else {
            try {
                pVar = new p(j.T(temporal), ZoneOffset.Y(temporal));
            } catch (c e) {
                throw new RuntimeException("Unable to obtain OffsetTime from TemporalAccessor: " + String.valueOf(temporal) + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long U = pVar.U() - U();
            switch (o.a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return U;
                case 2:
                    return U / 1000;
                case 3:
                    return U / 1000000;
                case 4:
                    return U / 1000000000;
                case 5:
                    return U / 60000000000L;
                case 6:
                    return U / 3600000000000L;
                case 7:
                    return U / 43200000000000L;
                default:
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
        }
        return temporalUnit.k(this, pVar);
    }

    @Override // j$.time.temporal.l
    public final boolean g(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) oVar).S() || oVar == j$.time.temporal.a.OFFSET_SECONDS) {
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
        return j$.time.temporal.k.a(this, oVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal q(g gVar) {
        return (p) AbstractC0040i.a(gVar, this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s r(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) oVar).k();
            }
            j jVar = this.a;
            jVar.getClass();
            return j$.time.temporal.k.d(jVar, oVar);
        }
        return oVar.w(this);
    }

    public final String toString() {
        return this.a.toString() + this.b.toString();
    }

    @Override // j$.time.temporal.l
    public final long w(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.b.Z();
            }
            return this.a.w(oVar);
        }
        return oVar.n(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        this.a.m0(objectOutput);
        this.b.f0(objectOutput);
    }
}
