package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class K extends AbstractC0035d {
    private static final long serialVersionUID = -8722293800195731463L;
    private final transient j$.time.g a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K(j$.time.g gVar) {
        Objects.a(gVar, "isoDate");
        this.a = gVar;
    }

    private int Y() {
        return this.a.a0() + 543;
    }

    private K a0(j$.time.g gVar) {
        if (gVar.equals(this.a)) {
            return this;
        }
        return new K(gVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 8, this);
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.chrono.InterfaceC0033b
    /* renamed from: M */
    public final InterfaceC0033b k(long j, TemporalUnit temporalUnit) {
        return (K) super.k(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0035d
    public final o S() {
        if (Y() >= 1) {
            return L.BE;
        }
        return L.BEFORE_BE;
    }

    @Override // j$.time.chrono.AbstractC0035d
    final InterfaceC0033b U(long j) {
        return a0(this.a.j0(j));
    }

    @Override // j$.time.chrono.AbstractC0035d
    final InterfaceC0033b V(long j) {
        return a0(this.a.k0(j));
    }

    @Override // j$.time.chrono.AbstractC0035d
    final InterfaceC0033b W(long j) {
        return a0(this.a.l0(j));
    }

    @Override // j$.time.chrono.AbstractC0035d
    /* renamed from: X */
    public final InterfaceC0033b q(j$.time.temporal.m mVar) {
        return (K) super.q(mVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:            if (r2 != 7) goto L20;     */
    @Override // j$.time.chrono.AbstractC0035d, j$.time.temporal.Temporal
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.chrono.K d(long r9, j$.time.temporal.o r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j$.time.temporal.a
            if (r0 == 0) goto L9a
            r0 = r11
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r8.w(r0)
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 != 0) goto L10
            return r8
        L10:
            int[] r1 = j$.time.chrono.J.a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            j$.time.g r3 = r8.a
            r4 = 7
            r5 = 6
            r6 = 4
            if (r2 == r6) goto L4c
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L4c
            goto L62
        L27:
            j$.time.chrono.I r11 = j$.time.chrono.I.d
            j$.time.temporal.s r11 = r11.K(r0)
            r11.b(r9, r0)
            int r11 = r8.Y()
            long r0 = (long) r11
            r4 = 12
            long r0 = r0 * r4
            int r11 = r3.Y()
            long r4 = (long) r11
            long r0 = r0 + r4
            r4 = 1
            long r0 = r0 - r4
            long r9 = r9 - r0
            j$.time.g r9 = r3.k0(r9)
            j$.time.chrono.K r9 = r8.a0(r9)
            return r9
        L4c:
            j$.time.chrono.I r2 = j$.time.chrono.I.d
            j$.time.temporal.s r2 = r2.K(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L85
            if (r0 == r5) goto L7a
            if (r0 == r4) goto L6b
        L62:
            j$.time.g r9 = r3.d(r9, r11)
            j$.time.chrono.K r9 = r8.a0(r9)
            return r9
        L6b:
            int r9 = r8.Y()
            int r9 = (-542) - r9
            j$.time.g r9 = r3.q0(r9)
            j$.time.chrono.K r9 = r8.a0(r9)
            return r9
        L7a:
            int r2 = r2 + (-543)
            j$.time.g r9 = r3.q0(r2)
            j$.time.chrono.K r9 = r8.a0(r9)
            return r9
        L85:
            int r9 = r8.Y()
            r10 = 1
            if (r9 < r10) goto L8d
            goto L8f
        L8d:
            int r2 = 1 - r2
        L8f:
            int r2 = r2 + (-543)
            j$.time.g r9 = r3.q0(r2)
            j$.time.chrono.K r9 = r8.a0(r9)
            return r9
        L9a:
            j$.time.chrono.b r9 = super.d(r9, r11)
            j$.time.chrono.K r9 = (j$.time.chrono.K) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.K.d(long, j$.time.temporal.o):j$.time.chrono.K");
    }

    @Override // j$.time.chrono.InterfaceC0033b
    public final n a() {
        return I.d;
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.chrono.InterfaceC0033b, j$.time.temporal.Temporal
    public final InterfaceC0033b e(long j, TemporalUnit temporalUnit) {
        return (K) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0035d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof K) {
            return this.a.equals(((K) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.chrono.InterfaceC0033b
    public final int hashCode() {
        I.d.getClass();
        return this.a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        return (K) super.k(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.temporal.Temporal
    public final Temporal q(j$.time.g gVar) {
        return (K) super.q(gVar);
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.temporal.l
    public final j$.time.temporal.s r(j$.time.temporal.o oVar) {
        long d;
        if (oVar instanceof j$.time.temporal.a) {
            if (AbstractC0040i.h(this, oVar)) {
                j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
                int i = J.a[aVar.ordinal()];
                if (i != 1 && i != 2 && i != 3) {
                    if (i != 4) {
                        return I.d.K(aVar);
                    }
                    j$.time.temporal.s k = j$.time.temporal.a.YEAR.k();
                    if (Y() <= 0) {
                        d = (-(k.e() + 543)) + 1;
                    } else {
                        d = 543 + k.d();
                    }
                    return j$.time.temporal.s.j(1L, d);
                }
                return this.a.r(oVar);
            }
            throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar)));
        }
        return oVar.w(this);
    }

    @Override // j$.time.temporal.l
    public final long w(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i = J.a[((j$.time.temporal.a) oVar).ordinal()];
            int i2 = 1;
            if (i != 4) {
                j$.time.g gVar = this.a;
                if (i != 5) {
                    if (i != 6) {
                        if (i != 7) {
                            return gVar.w(oVar);
                        }
                        if (Y() < 1) {
                            i2 = 0;
                        }
                        return i2;
                    }
                    return Y();
                }
                return ((Y() * 12) + gVar.Y()) - 1;
            }
            int Y = Y();
            if (Y < 1) {
                Y = 1 - Y;
            }
            return Y;
        }
        return oVar.n(this);
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.chrono.InterfaceC0033b
    public final long x() {
        return this.a.x();
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.chrono.InterfaceC0033b
    public final InterfaceC0036e z(j$.time.j jVar) {
        return C0038g.S(this, jVar);
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.temporal.Temporal
    public final Temporal e(long j, TemporalUnit temporalUnit) {
        return (K) super.e(j, temporalUnit);
    }
}
