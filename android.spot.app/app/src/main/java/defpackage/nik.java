package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nik {
    public static final nks a;
    private static final String[] b;
    private static final String[] c;
    private static final String[] d;

    static {
        nks nksVar = nks.a;
        a = mkm.aK("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            binaryString.getClass();
            strArr[i] = moz.D(ngt.j("%8s", binaryString), ' ', '0');
        }
        d = strArr;
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i2 = 0; i2 <= 0; i2++) {
            int i3 = iArr[i2];
            String[] strArr3 = c;
            strArr3[i3 | 8] = String.valueOf(strArr3[i3]).concat("|PADDED");
        }
        String[] strArr4 = c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 <= 0; i6++) {
                int i7 = iArr[i6];
                int i8 = i7 | i5;
                String[] strArr5 = c;
                strArr5[i8] = strArr5[i7] + "|" + strArr5[i5];
                strArr5[i8 | 8] = strArr5[i7] + "|" + strArr5[i5] + "|PADDED";
            }
        }
        int length = c.length;
        for (int i9 = 0; i9 < 64; i9++) {
            String[] strArr6 = c;
            if (strArr6[i9] == null) {
                strArr6[i9] = d[i9];
            }
        }
    }

    private nik() {
    }

    public static final String a(int i) {
        String[] strArr = b;
        int length = strArr.length;
        if (i < 10) {
            return strArr[i];
        }
        return ngt.j("0x%02x", Integer.valueOf(i));
    }

    public static final String b(boolean z, int i, int i2, int i3, int i4) {
        String str;
        String str2;
        String str3;
        String a2 = a(i3);
        if (i4 == 0) {
            str = "";
        } else {
            if (i3 != 2 && i3 != 3) {
                if (i3 != 4 && i3 != 6) {
                    if (i3 != 7 && i3 != 8) {
                        String[] strArr = c;
                        int length = strArr.length;
                        if (i4 < 64) {
                            str2 = strArr[i4];
                            str2.getClass();
                        } else {
                            str2 = d[i4];
                        }
                        if (i3 == 5) {
                            if ((i4 & 4) != 0) {
                                str = moz.E(str2, "HEADERS", "PUSH_PROMISE");
                            }
                            str = str2;
                        } else {
                            if (i3 == 0 && (i4 & 32) != 0) {
                                str = moz.E(str2, "PRIORITY", "COMPRESSED");
                            }
                            str = str2;
                        }
                    }
                } else if (i4 == 1) {
                    str = "ACK";
                } else {
                    str = d[i4];
                }
            }
            str = d[i4];
        }
        if (true != z) {
            str3 = ">>";
        } else {
            str3 = "<<";
        }
        return ngt.j("%s 0x%08x %5d %-13s %s", str3, Integer.valueOf(i), Integer.valueOf(i2), a2, str);
    }
}
