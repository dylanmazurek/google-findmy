package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class i implements f {
    static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    final Enum a;
    final int b;
    final int c;
    private final u d;
    final int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public i(j$.time.temporal.o oVar, int i, int i2, u uVar) {
        this.a = (Enum) oVar;
        this.b = i;
        this.c = i2;
        this.d = uVar;
        this.e = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, j$.time.temporal.o] */
    public i b() {
        if (this.e == -1) {
            return this;
        }
        return new i(this.a, this.b, this.c, this.d, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, j$.time.temporal.o] */
    public i c(int i) {
        int i2 = this.e + i;
        return new i(this.a, this.b, this.c, this.d, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, java.lang.Object, j$.time.temporal.o] */
    @Override // j$.time.format.f
    public boolean k(p pVar, StringBuilder sb) {
        String l;
        ?? r0 = this.a;
        Long e = pVar.e(r0);
        if (e == null) {
            return false;
        }
        long longValue = e.longValue();
        s b = pVar.b();
        if (longValue == Long.MIN_VALUE) {
            l = "9223372036854775808";
        } else {
            l = Long.toString(Math.abs(longValue));
        }
        int length = l.length();
        int i = this.c;
        if (length <= i) {
            b.getClass();
            int i2 = this.b;
            u uVar = this.d;
            if (longValue >= 0) {
                int i3 = c.a[uVar.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        sb.append('+');
                    }
                } else if (i2 < 19 && longValue >= f[i2]) {
                    sb.append('+');
                }
            } else {
                int i4 = c.a[uVar.ordinal()];
                if (i4 != 1 && i4 != 2 && i4 != 3) {
                    if (i4 == 4) {
                        throw new RuntimeException("Field " + String.valueOf((Object) r0) + " cannot be printed as the value " + longValue + " cannot be negative according to the SignStyle");
                    }
                } else {
                    sb.append('-');
                }
            }
            for (int i5 = 0; i5 < i2 - l.length(); i5++) {
                sb.append('0');
            }
            sb.append(l);
            return true;
        }
        throw new RuntimeException("Field " + String.valueOf((Object) r0) + " cannot be printed as the value " + longValue + " exceeds the maximum print width of " + i);
    }

    public String toString() {
        Enum r0 = this.a;
        u uVar = this.d;
        int i = this.c;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && uVar == u.NORMAL) {
            return "Value(" + String.valueOf(r0) + ")";
        }
        if (i2 == i && uVar == u.NOT_NEGATIVE) {
            return "Value(" + String.valueOf(r0) + "," + i2 + ")";
        }
        return "Value(" + String.valueOf(r0) + "," + i2 + "," + i + "," + String.valueOf(uVar) + ")";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public i(j$.time.temporal.o oVar, int i, int i2, u uVar, int i3) {
        this.a = (Enum) oVar;
        this.b = i;
        this.c = i2;
        this.d = uVar;
        this.e = i3;
    }
}
