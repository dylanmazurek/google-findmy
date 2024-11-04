package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class q implements TemporalAmount, Serializable {
    public static final q d = new q(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;
    private final int a;
    private final int b;
    private final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.desugar.sun.nio.fs.g.b(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    private q(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q a(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        int readInt2 = objectInput.readInt();
        int readInt3 = objectInput.readInt();
        if ((readInt | readInt2 | readInt3) == 0) {
            return d;
        }
        return new q(readInt, readInt2, readInt3);
    }

    private static void b(Temporal temporal) {
        j$.time.chrono.n nVar = (j$.time.chrono.n) temporal.B(j$.time.temporal.k.e());
        if (nVar != null && !j$.time.chrono.u.d.equals(nVar)) {
            throw new RuntimeException("Chronology mismatch, expected: ISO, actual: " + nVar.l());
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 14, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.a == qVar.a && this.b == qVar.b && this.c == qVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.b, 8) + this.a;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal k(Instant instant) {
        b(instant);
        int i = this.a;
        int i2 = this.b;
        if (i2 == 0) {
            if (i != 0) {
                instant = instant.e(i, ChronoUnit.YEARS);
            }
        } else {
            long j = (i * 12) + i2;
            if (j != 0) {
                instant = instant.e(j, ChronoUnit.MONTHS);
            }
        }
        int i3 = this.c;
        if (i3 != 0) {
            return instant.e(i3, ChronoUnit.DAYS);
        }
        return instant;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal n(Instant instant) {
        b(instant);
        int i = this.a;
        int i2 = this.b;
        Temporal temporal = instant;
        if (i2 == 0) {
            if (i != 0) {
                temporal = instant.k(i, ChronoUnit.YEARS);
            }
        } else {
            long j = (i * 12) + i2;
            temporal = instant;
            if (j != 0) {
                temporal = instant.k(j, ChronoUnit.MONTHS);
            }
        }
        int i3 = this.c;
        if (i3 != 0) {
            return ((Instant) temporal).k(i3, ChronoUnit.DAYS);
        }
        return temporal;
    }

    public final String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeInt(this.a);
        objectOutput.writeInt(this.b);
        objectOutput.writeInt(this.c);
    }
}
