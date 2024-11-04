package j$.time.chrono;

import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* renamed from: j$.time.chrono.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0039h implements TemporalAmount, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    private final n a;
    final int b;
    final int c;
    final int d;

    static {
        j$.desugar.sun.nio.fs.g.b(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0039h(n nVar, int i, int i2, int i3) {
        this.a = nVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private long a() {
        j$.time.temporal.s K = this.a.K(j$.time.temporal.a.MONTH_OF_YEAR);
        if (K.g() && K.h()) {
            return (K.d() - K.e()) + 1;
        }
        return -1L;
    }

    private void b(Temporal temporal) {
        n nVar = (n) temporal.B(j$.time.temporal.k.e());
        if (nVar != null) {
            n nVar2 = this.a;
            if (!((AbstractC0032a) nVar2).equals(nVar)) {
                throw new RuntimeException("Chronology mismatch, expected: " + nVar2.l() + ", actual: " + nVar.l());
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0039h)) {
            return false;
        }
        C0039h c0039h = (C0039h) obj;
        if (this.b == c0039h.b && this.c == c0039h.c && this.d == c0039h.d) {
            if (((AbstractC0032a) this.a).equals(c0039h.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractC0032a) this.a).hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b));
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal k(Instant instant) {
        b(instant);
        int i = this.b;
        int i2 = this.c;
        if (i2 == 0) {
            if (i != 0) {
                instant = instant.e(i, ChronoUnit.YEARS);
            }
        } else {
            long a = a();
            if (a > 0) {
                instant = instant.e((i * a) + i2, ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    instant = instant.e(i, ChronoUnit.YEARS);
                }
                instant = instant.e(i2, ChronoUnit.MONTHS);
            }
        }
        int i3 = this.d;
        if (i3 != 0) {
            return instant.e(i3, ChronoUnit.DAYS);
        }
        return instant;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal n(Instant instant) {
        b(instant);
        int i = this.b;
        int i2 = this.c;
        Temporal temporal = instant;
        if (i2 == 0) {
            if (i != 0) {
                temporal = instant.k(i, ChronoUnit.YEARS);
            }
        } else {
            long a = a();
            Temporal temporal2 = instant;
            if (a > 0) {
                temporal = instant.k((i * a) + i2, ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    temporal2 = instant.k(i, ChronoUnit.YEARS);
                }
                temporal = ((Instant) temporal2).k(i2, ChronoUnit.MONTHS);
            }
        }
        int i3 = this.d;
        if (i3 != 0) {
            return temporal.k(i3, ChronoUnit.DAYS);
        }
        return temporal;
    }

    public final String toString() {
        n nVar = this.a;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 == 0 && i2 == 0 && i == 0) {
            return ((AbstractC0032a) nVar).l() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((AbstractC0032a) nVar).l());
        sb.append(" P");
        if (i3 != 0) {
            sb.append(i3);
            sb.append('Y');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('D');
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.a.l());
        objectOutput.writeInt(this.b);
        objectOutput.writeInt(this.c);
        objectOutput.writeInt(this.d);
    }

    protected Object writeReplace() {
        return new G((byte) 9, this);
    }
}
