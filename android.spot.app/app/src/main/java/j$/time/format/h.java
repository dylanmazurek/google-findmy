package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class h implements f {
    @Override // j$.time.format.f
    public final boolean k(p pVar, StringBuilder sb) {
        Long l;
        long j;
        Long e = pVar.e(j$.time.temporal.a.INSTANT_SECONDS);
        j$.time.temporal.l d = pVar.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        if (d.g(aVar)) {
            l = Long.valueOf(pVar.d().w(aVar));
        } else {
            l = null;
        }
        int i = 0;
        if (e == null) {
            return false;
        }
        long longValue = e.longValue();
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        int F = aVar.F(j);
        if (longValue >= -62167219200L) {
            long j2 = longValue - 253402300800L;
            long f = j$.nio.file.attribute.s.f(j2, 315569520000L) + 1;
            LocalDateTime b0 = LocalDateTime.b0(j$.nio.file.attribute.s.g(j2, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (f > 0) {
                sb.append('+');
                sb.append(f);
            }
            sb.append(b0);
            if (b0.W() == 0) {
                sb.append(":00");
            }
        } else {
            long j3 = longValue + 62167219200L;
            long j4 = j3 / 315569520000L;
            long j5 = j3 % 315569520000L;
            LocalDateTime b02 = LocalDateTime.b0(j5 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(b02);
            if (b02.W() == 0) {
                sb.append(":00");
            }
            if (j4 < 0) {
                if (b02.getYear() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j4 - 1));
                } else if (j5 == 0) {
                    sb.insert(length, j4);
                } else {
                    sb.insert(length + 1, Math.abs(j4));
                }
            }
        }
        if (F > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (F <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = F / i2;
                sb.append((char) (i3 + 48));
                F -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }
}
