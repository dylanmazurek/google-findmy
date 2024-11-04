package j$.time;

import j$.time.chrono.AbstractC0040i;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class j implements Temporal, j$.time.temporal.m, Comparable, Serializable {
    public static final j e;
    public static final j f;
    public static final j g;
    private static final j[] h = new j[24];
    private static final long serialVersionUID = 6414437269572265201L;
    private final byte a;
    private final byte b;
    private final byte c;
    private final int d;

    static {
        int i = 0;
        while (true) {
            j[] jVarArr = h;
            if (i < jVarArr.length) {
                jVarArr[i] = new j(i, 0, 0, 0);
                i++;
            } else {
                j jVar = jVarArr[0];
                g = jVar;
                j jVar2 = jVarArr[12];
                e = jVar;
                f = new j(23, 59, 59, 999999999);
                return;
            }
        }
    }

    private j(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    private static j S(int i, int i2, int i3, int i4) {
        if ((i2 | i3 | i4) == 0) {
            return h[i];
        }
        return new j(i, i2, i3, i4);
    }

    public static j T(Temporal temporal) {
        Objects.a(temporal, "temporal");
        j jVar = (j) temporal.B(j$.time.temporal.k.g());
        if (jVar != null) {
            return jVar;
        }
        throw new RuntimeException("Unable to obtain LocalTime from TemporalAccessor: " + String.valueOf(temporal) + " of type " + temporal.getClass().getName());
    }

    private int U(j$.time.temporal.o oVar) {
        int i = i.a[((j$.time.temporal.a) oVar).ordinal()];
        byte b = this.b;
        int i2 = this.d;
        byte b2 = this.a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                throw new RuntimeException("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i2 / 1000;
            case 4:
                throw new RuntimeException("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i2 / 1000000;
            case 6:
                return (int) (i0() / 1000000);
            case 7:
                return this.c;
            case 8:
                return j0();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case 12:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case 13:
                return b2;
            case 14:
                if (b2 == 0) {
                    return 24;
                }
                return b2;
            case 15:
                return b2 / 12;
            default:
                throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar)));
        }
    }

    public static j Z(int i) {
        j$.time.temporal.a.HOUR_OF_DAY.R(i);
        return h[i];
    }

    public static j a0(long j) {
        j$.time.temporal.a.NANO_OF_DAY.R(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return S(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    public static j b0(long j) {
        j$.time.temporal.a.SECOND_OF_DAY.R(j);
        int i = (int) (j / 3600);
        long j2 = j - (i * 3600);
        return S(i, (int) (j2 / 60), (int) (j2 - (r0 * 60)), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    public static j h0(ObjectInput objectInput) {
        int i;
        int i2;
        int readByte = objectInput.readByte();
        byte b = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i = 0;
        } else {
            byte readByte2 = objectInput.readByte();
            if (readByte2 < 0) {
                ?? r7 = ~readByte2;
                i2 = 0;
                b = r7;
                i = 0;
            } else {
                byte readByte3 = objectInput.readByte();
                if (readByte3 < 0) {
                    i = ~readByte3;
                    b = readByte2;
                } else {
                    int readInt = objectInput.readInt();
                    i = readByte3;
                    i2 = readInt;
                    b = readByte2;
                }
            }
            j$.time.temporal.a.HOUR_OF_DAY.R(readByte);
            j$.time.temporal.a.MINUTE_OF_HOUR.R(b);
            j$.time.temporal.a.SECOND_OF_MINUTE.R(i);
            j$.time.temporal.a.NANO_OF_SECOND.R(i2);
            return S(readByte, b, i, i2);
        }
        i2 = 0;
        j$.time.temporal.a.HOUR_OF_DAY.R(readByte);
        j$.time.temporal.a.MINUTE_OF_HOUR.R(b);
        j$.time.temporal.a.SECOND_OF_MINUTE.R(i);
        j$.time.temporal.a.NANO_OF_SECOND.R(i2);
        return S(readByte, b, i, i2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 4, this);
    }

    @Override // j$.time.temporal.l
    public final Object B(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.k.e() || qVar == j$.time.temporal.k.k() || qVar == j$.time.temporal.k.j() || qVar == j$.time.temporal.k.h()) {
            return null;
        }
        if (qVar == j$.time.temporal.k.g()) {
            return this;
        }
        if (qVar == j$.time.temporal.k.f()) {
            return null;
        }
        if (qVar == j$.time.temporal.k.i()) {
            return ChronoUnit.NANOS;
        }
        return qVar.a(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal F(Temporal temporal) {
        return temporal.d(i0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j jVar) {
        int compare = Integer.compare(this.a, jVar.a);
        if (compare == 0) {
            int compare2 = Integer.compare(this.b, jVar.b);
            if (compare2 == 0) {
                int compare3 = Integer.compare(this.c, jVar.c);
                if (compare3 == 0) {
                    return Integer.compare(this.d, jVar.d);
                }
                return compare3;
            }
            return compare2;
        }
        return compare;
    }

    public final int V() {
        return this.a;
    }

    public final int W() {
        return this.b;
    }

    public final int X() {
        return this.d;
    }

    public final int Y() {
        return this.c;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final j e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (i.b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return f0(j);
                case 2:
                    return f0((j % 86400000000L) * 1000);
                case 3:
                    return f0((j % 86400000) * 1000000);
                case 4:
                    return g0(j);
                case 5:
                    return e0(j);
                case 6:
                    return d0(j);
                case 7:
                    return d0((j % 2) * 12);
                default:
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
        }
        return (j) temporalUnit.n(this, j);
    }

    public final j d0(long j) {
        if (j == 0) {
            return this;
        }
        return S(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final j e0(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.a * 60) + this.b;
        int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
        if (i == i2) {
            return this;
        }
        return S(i2 / 60, i2 % 60, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.a == jVar.a && this.b == jVar.b && this.c == jVar.c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, TemporalUnit temporalUnit) {
        j T = T(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long i0 = T.i0() - i0();
            switch (i.b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return i0;
                case 2:
                    return i0 / 1000;
                case 3:
                    return i0 / 1000000;
                case 4:
                    return i0 / 1000000000;
                case 5:
                    return i0 / 60000000000L;
                case 6:
                    return i0 / 3600000000000L;
                case 7:
                    return i0 / 43200000000000L;
                default:
                    throw new RuntimeException("Unsupported unit: ".concat(String.valueOf(temporalUnit)));
            }
        }
        return temporalUnit.k(this, T);
    }

    public final j f0(long j) {
        if (j == 0) {
            return this;
        }
        long i0 = i0();
        long j2 = (((j % 86400000000000L) + i0) + 86400000000000L) % 86400000000000L;
        if (i0 == j2) {
            return this;
        }
        return S((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
    }

    @Override // j$.time.temporal.l
    public final boolean g(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) oVar).S();
        }
        if (oVar != null && oVar.q(this)) {
            return true;
        }
        return false;
    }

    public final j g0(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.b * 60) + (this.a * 3600) + this.c;
        int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
        if (i == i2) {
            return this;
        }
        return S(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
    }

    public final int hashCode() {
        long i0 = i0();
        return (int) (i0 ^ (i0 >>> 32));
    }

    public final long i0() {
        return (this.c * 1000000000) + (this.b * 60000000000L) + (this.a * 3600000000000L) + this.d;
    }

    public final int j0() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        if (j == Long.MIN_VALUE) {
            return e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit);
        }
        return e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final j d(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            aVar.R(j);
            int i = i.a[aVar.ordinal()];
            byte b = this.b;
            byte b2 = this.c;
            int i2 = this.d;
            byte b3 = this.a;
            switch (i) {
                case 1:
                    return l0((int) j);
                case 2:
                    return a0(j);
                case 3:
                    return l0(((int) j) * 1000);
                case 4:
                    return a0(j * 1000);
                case 5:
                    return l0(((int) j) * 1000000);
                case 6:
                    return a0(j * 1000000);
                case 7:
                    int i3 = (int) j;
                    if (b2 == i3) {
                        return this;
                    }
                    j$.time.temporal.a.SECOND_OF_MINUTE.R(i3);
                    return S(b3, b, i3, i2);
                case 8:
                    return g0(j - j0());
                case 9:
                    int i4 = (int) j;
                    if (b == i4) {
                        return this;
                    }
                    j$.time.temporal.a.MINUTE_OF_HOUR.R(i4);
                    return S(b3, i4, b2, i2);
                case 10:
                    return e0(j - ((b3 * 60) + b));
                case 11:
                    return d0(j - (b3 % 12));
                case 12:
                    if (j == 12) {
                        j = 0;
                    }
                    return d0(j - (b3 % 12));
                case 13:
                    int i5 = (int) j;
                    if (b3 == i5) {
                        return this;
                    }
                    j$.time.temporal.a.HOUR_OF_DAY.R(i5);
                    return S(i5, b, b2, i2);
                case 14:
                    if (j == 24) {
                        j = 0;
                    }
                    int i6 = (int) j;
                    if (b3 == i6) {
                        return this;
                    }
                    j$.time.temporal.a.HOUR_OF_DAY.R(i6);
                    return S(i6, b, b2, i2);
                case 15:
                    return d0((j - (b3 / 12)) * 12);
                default:
                    throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar)));
            }
        }
        return (j) oVar.r(this, j);
    }

    public final j l0(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.R(i);
        return S(this.a, this.b, this.c, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m0(DataOutput dataOutput) {
        byte b = this.c;
        byte b2 = this.a;
        byte b3 = this.b;
        int i = this.d;
        if (i == 0) {
            if (b == 0) {
                if (b3 == 0) {
                    dataOutput.writeByte(~b2);
                    return;
                } else {
                    dataOutput.writeByte(b2);
                    dataOutput.writeByte(~b3);
                    return;
                }
            }
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(~b);
            return;
        }
        dataOutput.writeByte(b2);
        dataOutput.writeByte(b3);
        dataOutput.writeByte(b);
        dataOutput.writeInt(i);
    }

    @Override // j$.time.temporal.l
    public final int n(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return U(oVar);
        }
        return j$.time.temporal.k.a(this, oVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal q(g gVar) {
        return (j) AbstractC0040i.a(gVar, this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s r(j$.time.temporal.o oVar) {
        return j$.time.temporal.k.d(this, oVar);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        if (b < 10) {
            str = "0";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append((int) b);
        String str3 = ":";
        byte b2 = this.b;
        if (b2 >= 10) {
            str2 = ":";
        } else {
            str2 = ":0";
        }
        sb.append(str2);
        sb.append((int) b2);
        byte b3 = this.c;
        int i = this.d;
        if (b3 > 0 || i > 0) {
            if (b3 < 10) {
                str3 = ":0";
            }
            sb.append(str3);
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.l
    public final long w(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar == j$.time.temporal.a.NANO_OF_DAY) {
                return i0();
            }
            if (oVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return i0() / 1000;
            }
            return U(oVar);
        }
        return oVar.n(this);
    }
}
