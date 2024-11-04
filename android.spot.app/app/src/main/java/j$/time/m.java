package j$.time;

import j$.time.chrono.AbstractC0032a;
import j$.time.chrono.AbstractC0040i;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class m implements j$.time.temporal.l, j$.time.temporal.m, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;
    private final int a;
    private final int b;

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.f("--");
        nVar.k(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        nVar.e('-');
        nVar.k(j$.time.temporal.a.DAY_OF_MONTH, 2);
        nVar.v();
    }

    private m(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m R(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        byte readByte2 = objectInput.readByte();
        k U = k.U(readByte);
        Objects.a(U, "month");
        j$.time.temporal.a.DAY_OF_MONTH.R(readByte2);
        if (readByte2 <= U.T()) {
            return new m(U.getValue(), readByte2);
        }
        throw new RuntimeException("Illegal value for DayOfMonth field, value " + ((int) readByte2) + " is not valid for month " + U.name());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 13, this);
    }

    @Override // j$.time.temporal.l
    public final Object B(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.k.e()) {
            return j$.time.chrono.u.d;
        }
        return j$.time.temporal.k.c(this, qVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal F(Temporal temporal) {
        if (((AbstractC0032a) AbstractC0040i.p(temporal)).equals(j$.time.chrono.u.d)) {
            Temporal d = temporal.d(this.a, j$.time.temporal.a.MONTH_OF_YEAR);
            j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
            return d.d(Math.min(d.r(aVar).d(), this.b), aVar);
        }
        throw new RuntimeException("Adjustment only supported on ISO date-time");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void S(DataOutput dataOutput) {
        dataOutput.writeByte(this.a);
        dataOutput.writeByte(this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m mVar = (m) obj;
        int i = this.a - mVar.a;
        if (i == 0) {
            return this.b - mVar.b;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.a == mVar.a && this.b == mVar.b) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.l
    public final boolean g(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar == j$.time.temporal.a.MONTH_OF_YEAR || oVar == j$.time.temporal.a.DAY_OF_MONTH) {
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
        return (this.a << 6) + this.b;
    }

    @Override // j$.time.temporal.l
    public final int n(j$.time.temporal.o oVar) {
        return r(oVar).a(w(oVar), oVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s r(j$.time.temporal.o oVar) {
        int i;
        if (oVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return oVar.k();
        }
        if (oVar == j$.time.temporal.a.DAY_OF_MONTH) {
            int ordinal = k.U(this.a).ordinal();
            if (ordinal != 1) {
                if (ordinal != 3 && ordinal != 5 && ordinal != 8 && ordinal != 10) {
                    i = 31;
                } else {
                    i = 30;
                }
            } else {
                i = 28;
            }
            return j$.time.temporal.s.k(i, k.U(r5).T());
        }
        return j$.time.temporal.k.d(this, oVar);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i = this.a;
        if (i < 10) {
            str = "0";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(i);
        int i2 = this.b;
        if (i2 < 10) {
            str2 = "-0";
        } else {
            str2 = "-";
        }
        sb.append(str2);
        sb.append(i2);
        return sb.toString();
    }

    @Override // j$.time.temporal.l
    public final long w(j$.time.temporal.o oVar) {
        int i;
        if (oVar instanceof j$.time.temporal.a) {
            int i2 = l.a[((j$.time.temporal.a) oVar).ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    i = this.a;
                } else {
                    throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar)));
                }
            } else {
                i = this.b;
            }
            return i;
        }
        return oVar.n(this);
    }
}
