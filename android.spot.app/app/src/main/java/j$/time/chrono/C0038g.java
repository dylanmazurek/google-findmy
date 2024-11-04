package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0038g implements InterfaceC0036e, Temporal, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    private final transient InterfaceC0033b a;
    private final transient j$.time.j b;

    private C0038g(InterfaceC0033b interfaceC0033b, j$.time.j jVar) {
        Objects.a(jVar, "time");
        this.a = interfaceC0033b;
        this.b = jVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C0038g R(n nVar, Temporal temporal) {
        C0038g c0038g = (C0038g) temporal;
        AbstractC0032a abstractC0032a = (AbstractC0032a) nVar;
        if (abstractC0032a.equals(c0038g.a.a())) {
            return c0038g;
        }
        throw new ClassCastException("Chronology mismatch, required: " + abstractC0032a.l() + ", actual: " + c0038g.a.a().l());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C0038g S(InterfaceC0033b interfaceC0033b, j$.time.j jVar) {
        return new C0038g(interfaceC0033b, jVar);
    }

    private C0038g V(InterfaceC0033b interfaceC0033b, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j$.time.j jVar = this.b;
        if (j5 == 0) {
            return Y(interfaceC0033b, jVar);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long i0 = jVar.i0();
        long j10 = j9 + i0;
        long f = j$.nio.file.attribute.s.f(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long g = j$.nio.file.attribute.s.g(j10, 86400000000000L);
        if (g != i0) {
            jVar = j$.time.j.a0(g);
        }
        return Y(interfaceC0033b.e(f, (TemporalUnit) ChronoUnit.DAYS), jVar);
    }

    private C0038g Y(Temporal temporal, j$.time.j jVar) {
        InterfaceC0033b interfaceC0033b = this.a;
        if (interfaceC0033b == temporal && this.b == jVar) {
            return this;
        }
        return new C0038g(AbstractC0035d.R(interfaceC0033b.a(), temporal), jVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 2, this);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object B(j$.time.temporal.q qVar) {
        return AbstractC0040i.k(this, qVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal F(Temporal temporal) {
        return temporal.d(c().x(), j$.time.temporal.a.EPOCH_DAY).d(b().i0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* renamed from: I */
    public final /* synthetic */ int compareTo(InterfaceC0036e interfaceC0036e) {
        return AbstractC0040i.c(this, interfaceC0036e);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final C0038g e(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        InterfaceC0033b interfaceC0033b = this.a;
        if (z) {
            int i = AbstractC0037f.a[((ChronoUnit) temporalUnit).ordinal()];
            j$.time.j jVar = this.b;
            switch (i) {
                case 1:
                    return V(this.a, 0L, 0L, 0L, j);
                case 2:
                    C0038g Y = Y(interfaceC0033b.e(j / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), jVar);
                    return Y.V(Y.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    C0038g Y2 = Y(interfaceC0033b.e(j / 86400000, (TemporalUnit) ChronoUnit.DAYS), jVar);
                    return Y2.V(Y2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return U(j);
                case 5:
                    return V(this.a, 0L, j, 0L, 0L);
                case 6:
                    return V(this.a, j, 0L, 0L, 0L);
                case 7:
                    C0038g Y3 = Y(interfaceC0033b.e(j / 256, (TemporalUnit) ChronoUnit.DAYS), jVar);
                    return Y3.V(Y3.a, (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return Y(interfaceC0033b.e(j, temporalUnit), jVar);
            }
        }
        return R(interfaceC0033b.a(), temporalUnit.n(this, j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C0038g U(long j) {
        return V(this.a, 0L, 0L, j, 0L);
    }

    public final Instant W(ZoneOffset zoneOffset) {
        return Instant.ofEpochSecond(AbstractC0040i.n(this, zoneOffset), this.b.X());
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final C0038g d(long j, j$.time.temporal.o oVar) {
        boolean z = oVar instanceof j$.time.temporal.a;
        InterfaceC0033b interfaceC0033b = this.a;
        if (z) {
            boolean S = ((j$.time.temporal.a) oVar).S();
            j$.time.j jVar = this.b;
            if (S) {
                return Y(interfaceC0033b, jVar.d(j, oVar));
            }
            return Y(interfaceC0033b.d(j, oVar), jVar);
        }
        return R(interfaceC0033b.a(), oVar.r(this, j));
    }

    @Override // j$.time.chrono.InterfaceC0036e
    public final n a() {
        return this.a.a();
    }

    @Override // j$.time.chrono.InterfaceC0036e
    public final j$.time.j b() {
        return this.b;
    }

    @Override // j$.time.chrono.InterfaceC0036e
    public final InterfaceC0033b c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof InterfaceC0036e) && AbstractC0040i.c(this, (InterfaceC0036e) obj) == 0) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        boolean z;
        Objects.a(temporal, "endExclusive");
        InterfaceC0033b interfaceC0033b = this.a;
        InterfaceC0036e D = interfaceC0033b.a().D(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            ChronoUnit chronoUnit = ChronoUnit.DAYS;
            if (((ChronoUnit) temporalUnit).compareTo(chronoUnit) < 0) {
                z = true;
            } else {
                z = false;
            }
            j$.time.j jVar = this.b;
            if (z) {
                j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
                long w = D.w(aVar) - interfaceC0033b.w(aVar);
                switch (AbstractC0037f.a[((ChronoUnit) temporalUnit).ordinal()]) {
                    case 1:
                        w = j$.lang.a.g(w, 86400000000000L);
                        break;
                    case 2:
                        w = j$.lang.a.g(w, 86400000000L);
                        break;
                    case 3:
                        w = j$.lang.a.g(w, 86400000L);
                        break;
                    case 4:
                        w = j$.lang.a.g(w, 86400);
                        break;
                    case 5:
                        w = j$.lang.a.g(w, 1440);
                        break;
                    case 6:
                        w = j$.lang.a.g(w, 24);
                        break;
                    case 7:
                        w = j$.lang.a.g(w, 2);
                        break;
                }
                return j$.lang.a.d(w, jVar.f(D.b(), temporalUnit));
            }
            InterfaceC0033b c = D.c();
            if (D.b().compareTo(jVar) < 0) {
                c = c.k(1L, chronoUnit);
            }
            return interfaceC0033b.f(c, temporalUnit);
        }
        Objects.a(temporalUnit, "unit");
        return temporalUnit.k(this, D);
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

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        return R(this.a.a(), j$.time.temporal.k.b(this, j, chronoUnit));
    }

    @Override // j$.time.temporal.l
    public final int n(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) oVar).S()) {
                return this.b.n(oVar);
            }
            return this.a.n(oVar);
        }
        return r(oVar).a(w(oVar), oVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal q(j$.time.g gVar) {
        return Y(gVar, this.b);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s r(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) oVar).S()) {
                j$.time.j jVar = this.b;
                jVar.getClass();
                return j$.time.temporal.k.d(jVar, oVar);
            }
            return this.a.r(oVar);
        }
        return oVar.w(this);
    }

    @Override // j$.time.chrono.InterfaceC0036e
    public final InterfaceC0042k s(ZoneOffset zoneOffset) {
        return m.R(zoneOffset, null, this);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(this.b);
    }
}
