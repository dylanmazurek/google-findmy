package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* loaded from: classes2.dex */
public final class s extends AbstractC0035d {
    private static final long serialVersionUID = -5207853542612002020L;
    private final transient q a;
    private final transient int b;
    private final transient int c;
    private final transient int d;

    private s(q qVar, int i, int i2, int i3) {
        qVar.F(i, i2, i3);
        this.a = qVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private int Y() {
        return this.a.B(this.b, this.c) + this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s Z(q qVar, int i, int i2, int i3) {
        return new s(qVar, i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s a0(q qVar, long j) {
        return new s(qVar, j);
    }

    private s d0(int i, int i2, int i3) {
        q qVar = this.a;
        int S = qVar.S(i, i2);
        if (i3 > S) {
            i3 = S;
        }
        return new s(qVar, i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new G((byte) 6, this);
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.chrono.InterfaceC0033b
    /* renamed from: M */
    public final InterfaceC0033b k(long j, TemporalUnit temporalUnit) {
        return (s) super.k(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0035d
    public final o S() {
        return t.AH;
    }

    @Override // j$.time.chrono.AbstractC0035d
    final InterfaceC0033b W(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.b + ((int) j);
        int i = (int) j2;
        if (j2 == i) {
            return d0(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.AbstractC0035d
    /* renamed from: X */
    public final InterfaceC0033b q(j$.time.temporal.m mVar) {
        return (s) super.q(mVar);
    }

    @Override // j$.time.chrono.InterfaceC0033b
    public final n a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC0035d
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final s U(long j) {
        return new s(this.a, x() + j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC0035d
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final s V(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        return d0(this.a.r(j$.nio.file.attribute.s.f(j2, 12L)), ((int) j$.nio.file.attribute.s.g(j2, 12L)) + 1, this.d);
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.chrono.InterfaceC0033b, j$.time.temporal.Temporal
    public final InterfaceC0033b e(long j, TemporalUnit temporalUnit) {
        return (s) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.temporal.Temporal
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final s d(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            q qVar = this.a;
            qVar.K(aVar).b(j, aVar);
            int i = (int) j;
            int i2 = r.a[aVar.ordinal()];
            int i3 = this.d;
            int i4 = this.c;
            int i5 = this.b;
            switch (i2) {
                case 1:
                    return d0(i5, i4, i);
                case 2:
                    return U(Math.min(i, qVar.T(i5)) - Y());
                case 3:
                    return U((j - w(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
                case 4:
                    return U(j - (((int) j$.nio.file.attribute.s.g(x() + 3, 7)) + 1));
                case 5:
                    return U(j - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 6:
                    return U(j - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 7:
                    return new s(qVar, j);
                case 8:
                    return U((j - w(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
                case 9:
                    return d0(i5, i, i3);
                case 10:
                    return V(j - (((i5 * 12) + i4) - 1));
                case 11:
                    if (i5 < 1) {
                        i = 1 - i;
                    }
                    return d0(i, i4, i3);
                case 12:
                    return d0(i, i4, i3);
                case 13:
                    return d0(1 - i5, i4, i3);
                default:
                    throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar)));
            }
        }
        return (s) super.d(j, oVar);
    }

    @Override // j$.time.chrono.AbstractC0035d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.b == sVar.b && this.c == sVar.c && this.d == sVar.d && this.a.equals(sVar.a)) {
            return true;
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.chrono.InterfaceC0033b
    public final int hashCode() {
        int hashCode = this.a.l().hashCode();
        int i = this.b;
        return (hashCode ^ (i & (-2048))) ^ (((i << 11) + (this.c << 6)) + this.d);
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        return (s) super.k(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.temporal.Temporal
    public final Temporal q(j$.time.g gVar) {
        return (s) super.q(gVar);
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.temporal.l
    public final j$.time.temporal.s r(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (AbstractC0040i.h(this, oVar)) {
                j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
                int i = r.a[aVar.ordinal()];
                int i2 = this.b;
                q qVar = this.a;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return qVar.K(aVar);
                        }
                        return j$.time.temporal.s.j(1L, 5L);
                    }
                    return j$.time.temporal.s.j(1L, qVar.T(i2));
                }
                return j$.time.temporal.s.j(1L, qVar.S(i2, this.c));
            }
            throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar)));
        }
        return oVar.w(this);
    }

    @Override // j$.time.temporal.l
    public final long w(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i = r.a[((j$.time.temporal.a) oVar).ordinal()];
            int i2 = this.c;
            int i3 = 1;
            int i4 = this.d;
            int i5 = this.b;
            switch (i) {
                case 1:
                    return i4;
                case 2:
                    return Y();
                case 3:
                    return ((i4 - 1) / 7) + 1;
                case 4:
                    return ((int) j$.nio.file.attribute.s.g(x() + 3, 7)) + 1;
                case 5:
                    return ((i4 - 1) % 7) + 1;
                case 6:
                    return ((Y() - 1) % 7) + 1;
                case 7:
                    return x();
                case 8:
                    return ((Y() - 1) / 7) + 1;
                case 9:
                    return i2;
                case 10:
                    return ((i5 * 12) + i2) - 1;
                case 11:
                    return i5;
                case 12:
                    return i5;
                case 13:
                    if (i5 <= 1) {
                        i3 = 0;
                    }
                    return i3;
                default:
                    throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar)));
            }
        }
        return oVar.n(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeInt(j$.time.temporal.k.a(this, j$.time.temporal.a.YEAR));
        objectOutput.writeByte(j$.time.temporal.k.a(this, j$.time.temporal.a.MONTH_OF_YEAR));
        objectOutput.writeByte(j$.time.temporal.k.a(this, j$.time.temporal.a.DAY_OF_MONTH));
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.chrono.InterfaceC0033b
    public final long x() {
        return this.a.F(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.chrono.InterfaceC0033b
    public final InterfaceC0036e z(j$.time.j jVar) {
        return C0038g.S(this, jVar);
    }

    @Override // j$.time.chrono.AbstractC0035d, j$.time.temporal.Temporal
    public final Temporal e(long j, TemporalUnit temporalUnit) {
        return (s) super.e(j, temporalUnit);
    }

    private s(q qVar, long j) {
        int[] R = qVar.R((int) j);
        this.a = qVar;
        this.b = R[0];
        this.c = R[1];
        this.d = R[2];
    }
}
