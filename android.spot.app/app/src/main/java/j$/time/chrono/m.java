package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
final class m implements InterfaceC0042k, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    private final transient C0038g a;
    private final transient ZoneOffset b;
    private final transient ZoneId c;

    private m(ZoneId zoneId, ZoneOffset zoneOffset, C0038g c0038g) {
        Objects.a(c0038g, "dateTime");
        this.a = c0038g;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
        Objects.a(zoneId, "zone");
        this.c = zoneId;
    }

    static m F(n nVar, Temporal temporal) {
        m mVar = (m) temporal;
        AbstractC0032a abstractC0032a = (AbstractC0032a) nVar;
        if (abstractC0032a.equals(mVar.a())) {
            return mVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + abstractC0032a.l() + ", actual: " + mVar.a().l());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceC0042k R(ZoneId zoneId, ZoneOffset zoneOffset, C0038g c0038g) {
        Objects.a(c0038g, "localDateTime");
        Objects.a(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new m(zoneId, (ZoneOffset) zoneId, c0038g);
        }
        j$.time.zone.e S = zoneId.S();
        LocalDateTime S2 = LocalDateTime.S(c0038g);
        List g = S.g(S2);
        if (g.size() == 1) {
            zoneOffset = (ZoneOffset) g.get(0);
        } else if (g.size() == 0) {
            j$.time.zone.b f = S.f(S2);
            c0038g = c0038g.U(f.q().getSeconds());
            zoneOffset = f.r();
        } else if (zoneOffset == null || !g.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) g.get(0);
        }
        Objects.a(zoneOffset, "offset");
        return new m(zoneId, zoneOffset, c0038g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m S(n nVar, Instant instant, ZoneId zoneId) {
        ZoneOffset d = zoneId.S().d(instant);
        Objects.a(d, "offset");
        return new m(zoneId, d, (C0038g) nVar.D(LocalDateTime.b0(instant.U(), instant.V(), d)));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 3, this);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object B(j$.time.temporal.q qVar) {
        return AbstractC0040i.l(this, qVar);
    }

    @Override // j$.time.chrono.InterfaceC0042k
    public final InterfaceC0036e J() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC0042k
    public final /* synthetic */ long Q() {
        return AbstractC0040i.o(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0042k e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return F(a(), this.a.e(j, temporalUnit).F(this));
        }
        return F(a(), temporalUnit.n(this, j));
    }

    @Override // j$.time.chrono.InterfaceC0042k
    public final n a() {
        return c().a();
    }

    @Override // j$.time.chrono.InterfaceC0042k
    public final j$.time.j b() {
        return ((C0038g) J()).b();
    }

    @Override // j$.time.chrono.InterfaceC0042k
    public final InterfaceC0033b c() {
        return ((C0038g) J()).c();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC0040i.d(this, (InterfaceC0042k) obj);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            int i = AbstractC0043l.a[aVar.ordinal()];
            if (i != 1) {
                ZoneId zoneId = this.c;
                C0038g c0038g = this.a;
                if (i != 2) {
                    return R(zoneId, this.b, c0038g.d(j, oVar));
                }
                return S(a(), c0038g.W(ZoneOffset.c0(aVar.F(j))), zoneId);
            }
            return e(j - AbstractC0040i.o(this), ChronoUnit.SECONDS);
        }
        return F(a(), oVar.r(this, j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof InterfaceC0042k) && AbstractC0040i.d(this, (InterfaceC0042k) obj) == 0) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        InterfaceC0042k A = a().A(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.a.f(A.i(this.b).J(), temporalUnit);
        }
        Objects.a(temporalUnit, "unit");
        return temporalUnit.k(this, A);
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
    public final InterfaceC0042k i(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        return S(a(), this.a.W(this.b), zoneId);
    }

    @Override // j$.time.chrono.InterfaceC0042k
    public final InterfaceC0042k j(ZoneId zoneId) {
        return R(zoneId, this.b, this.a);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        return F(a(), j$.time.temporal.k.b(this, j, chronoUnit));
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int n(j$.time.temporal.o oVar) {
        return AbstractC0040i.e(this, oVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal q(j$.time.g gVar) {
        return F(a(), gVar.F(this));
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s r(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar != j$.time.temporal.a.INSTANT_SECONDS && oVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return ((C0038g) J()).r(oVar);
            }
            return ((j$.time.temporal.a) oVar).k();
        }
        return oVar.w(this);
    }

    public final String toString() {
        String c0038g = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = c0038g + zoneOffset.toString();
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
            int i = AbstractC0041j.a[((j$.time.temporal.a) oVar).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return ((C0038g) J()).w(oVar);
                }
                return h().Z();
            }
            return Q();
        }
        return oVar.n(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(this.b);
        objectOutput.writeObject(this.c);
    }
}
