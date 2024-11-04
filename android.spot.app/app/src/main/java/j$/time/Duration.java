package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
    public static final Duration c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;
    private final long a;
    private final int b;

    static {
        BigInteger.valueOf(1000000000L);
    }

    private Duration(long j, int i) {
        this.a = j;
        this.b = i;
    }

    private Duration B(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofSeconds(j$.lang.a.d(j$.lang.a.d(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        try {
            return w(temporal.f(temporal2, ChronoUnit.NANOS));
        } catch (c | ArithmeticException unused) {
            long f = temporal.f(temporal2, ChronoUnit.SECONDS);
            long j = 0;
            try {
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
                long w = temporal2.w(aVar) - temporal.w(aVar);
                if (f > 0 && w < 0) {
                    f++;
                } else if (f < 0 && w > 0) {
                    f--;
                }
                j = w;
            } catch (c unused2) {
            }
            return ofSeconds(f, j);
        }
    }

    public static Duration ofDays(long j) {
        return q(j$.lang.a.g(j, 86400), 0);
    }

    public static Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return q(j2, i * 1000000);
    }

    public static Duration ofMinutes(long j) {
        return q(j$.lang.a.g(j, 60), 0);
    }

    public static Duration ofSeconds(long j) {
        return q(j, 0);
    }

    private static Duration q(long j, int i) {
        if ((i | j) == 0) {
            return c;
        }
        return new Duration(j, i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static Duration w(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (i + 1000000000);
            j2--;
        }
        return q(j2, i);
    }

    private Object writeReplace() {
        return new r((byte) 1, this);
    }

    public final long F() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return j$.lang.a.d(j$.lang.a.g(j2, 1000000000L), j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        if (this.a == duration.a && this.b == duration.b) {
            return true;
        }
        return false;
    }

    public long getSeconds() {
        return this.a;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isZero() {
        if ((this.b | this.a) == 0) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal k(Instant instant) {
        long j = this.a;
        if (j != 0) {
            instant = instant.e(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        if (i != 0) {
            return instant.e(i, ChronoUnit.NANOS);
        }
        return instant;
    }

    public Duration minusMillis(long j) {
        if (j == Long.MIN_VALUE) {
            return B(9223372036854775L, 807000000L).B(0L, 1000000L);
        }
        long j2 = -j;
        return B(j2 / 1000, (j2 % 1000) * 1000000);
    }

    public Duration minusMinutes(long j) {
        if (j == Long.MIN_VALUE) {
            long j2 = 60;
            Duration B = B(j$.lang.a.g(Long.MAX_VALUE, j2), 0L);
            B.getClass();
            return B.B(j$.lang.a.g(1L, j2), 0L);
        }
        return B(j$.lang.a.g(-j, 60), 0L);
    }

    public Duration minusSeconds(long j) {
        if (j == Long.MIN_VALUE) {
            return B(Long.MAX_VALUE, 0L).B(1L, 0L);
        }
        return B(-j, 0L);
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal n(Instant instant) {
        long j = this.a;
        Temporal temporal = instant;
        if (j != 0) {
            temporal = instant.k(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        if (i != 0) {
            return ((Instant) temporal).k(i, ChronoUnit.NANOS);
        }
        return temporal;
    }

    public final int r() {
        return this.b;
    }

    public long toMillis() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return j$.lang.a.d(j$.lang.a.g(j2, 1000), j / 1000000);
    }

    public long toMinutes() {
        return this.a / 60;
    }

    public long toSeconds() {
        return this.a;
    }

    public final String toString() {
        long j;
        if (this == c) {
            return "PT0S";
        }
        long j2 = this.a;
        int i = this.b;
        if (j2 < 0 && i > 0) {
            j = 1 + j2;
        } else {
            j = j2;
        }
        long j3 = j / 3600;
        int i2 = (int) ((j % 3600) / 60);
        int i3 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j3 != 0) {
            sb.append(j3);
            sb.append('H');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i3 == 0 && i == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j2 < 0 && i > 0) {
            if (i3 == 0) {
                sb.append("-0");
            } else {
                sb.append(i3);
            }
        } else {
            sb.append(i3);
        }
        if (i > 0) {
            int length = sb.length();
            if (j2 < 0) {
                sb.append(2000000000 - i);
            } else {
                sb.append(i + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeLong(this.a);
        objectOutput.writeInt(this.b);
    }

    public static Duration ofSeconds(long j, long j2) {
        return q(j$.lang.a.d(j, j$.nio.file.attribute.s.f(j2, 1000000000L)), (int) j$.nio.file.attribute.s.g(j2, 1000000000L));
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int compare = Long.compare(this.a, duration.a);
        return compare != 0 ? compare : this.b - duration.b;
    }
}
