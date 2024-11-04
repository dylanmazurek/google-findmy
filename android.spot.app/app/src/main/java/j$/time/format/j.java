package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j implements f {
    static final String[] d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};
    static final j e = new j("+HH:MM:ss", "Z");
    private final String a;
    private final int b;
    private final int c;

    static {
        new j("+HH:MM:ss", "0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(String str, String str2) {
        int i = 0;
        while (true) {
            String[] strArr = d;
            if (i < 22) {
                if (strArr[i].equals(str)) {
                    this.b = i;
                    this.c = i % 11;
                    this.a = str2;
                    return;
                }
                i++;
            } else {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            }
        }
    }

    private static void a(boolean z, int i, StringBuilder sb) {
        String str;
        if (z) {
            str = ":";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    @Override // j$.time.format.f
    public final boolean k(p pVar, StringBuilder sb) {
        String str;
        boolean z;
        Long e2 = pVar.e(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z2 = false;
        if (e2 == null) {
            return false;
        }
        long longValue = e2.longValue();
        int i = (int) longValue;
        if (longValue == i) {
            String str2 = this.a;
            if (i == 0) {
                sb.append(str2);
            } else {
                int abs = Math.abs((i / 3600) % 100);
                int abs2 = Math.abs((i / 60) % 60);
                int abs3 = Math.abs(i % 60);
                int length = sb.length();
                if (i < 0) {
                    str = "-";
                } else {
                    str = "+";
                }
                sb.append(str);
                if (this.b < 11 || abs >= 10) {
                    a(false, abs, sb);
                } else {
                    sb.append((char) (abs + 48));
                }
                int i2 = this.c;
                if ((i2 >= 3 && i2 <= 8) || ((i2 >= 9 && abs3 > 0) || (i2 >= 1 && abs2 > 0))) {
                    if (i2 > 0 && i2 % 2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    a(z, abs2, sb);
                    abs += abs2;
                    if (i2 == 7 || i2 == 8 || (i2 >= 5 && abs3 > 0)) {
                        if (i2 > 0 && i2 % 2 == 0) {
                            z2 = true;
                        }
                        a(z2, abs3, sb);
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb.setLength(length);
                    sb.append(str2);
                }
            }
            return true;
        }
        throw new ArithmeticException();
    }

    public final String toString() {
        String replace = this.a.replace("'", "''");
        return "Offset(" + d[this.b] + ",'" + replace + "')";
    }
}
