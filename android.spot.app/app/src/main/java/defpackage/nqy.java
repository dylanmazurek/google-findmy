package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqy {
    public static final /* synthetic */ int a = 0;
    private static final double b = Math.log(10.0d);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(CharSequence charSequence, int i) {
        int charAt = charSequence.charAt(i) - '0';
        return (((charAt << 3) + (charAt + charAt)) + charSequence.charAt(i + 1)) - 48;
    }

    public static void b(Appendable appendable, int i, int i2) {
        int log;
        if (i < 0) {
            appendable.append('-');
            if (i != Integer.MIN_VALUE) {
                i = -i;
            } else {
                while (i2 > 10) {
                    appendable.append('0');
                    i2--;
                }
                appendable.append("2147483648");
                return;
            }
        }
        if (i < 10) {
            while (i2 > 1) {
                appendable.append('0');
                i2--;
            }
            appendable.append((char) (i + 48));
            return;
        }
        if (i < 100) {
            while (i2 > 2) {
                appendable.append('0');
                i2--;
            }
            int i3 = ((i + 1) * 13421772) >> 27;
            appendable.append((char) (i3 + 48));
            appendable.append((char) (((i - (i3 << 3)) - (i3 + i3)) + 48));
            return;
        }
        if (i < 1000) {
            log = 3;
        } else if (i < 10000) {
            log = 4;
        } else {
            log = ((int) (Math.log(i) / b)) + 1;
        }
        while (i2 > log) {
            appendable.append('0');
            i2--;
        }
        appendable.append(Integer.toString(i));
    }

    public static void c(StringBuffer stringBuffer, int i, int i2) {
        try {
            b(stringBuffer, i, i2);
        } catch (IOException unused) {
        }
    }

    public static void d(Appendable appendable, int i) {
        if (i < 0) {
            appendable.append('-');
            if (i != Integer.MIN_VALUE) {
                i = -i;
            } else {
                appendable.append("2147483648");
                return;
            }
        }
        if (i < 10) {
            appendable.append((char) (i + 48));
        } else {
            if (i < 100) {
                int i2 = ((i + 1) * 13421772) >> 27;
                appendable.append((char) (i2 + 48));
                appendable.append((char) (((i - (i2 << 3)) - (i2 + i2)) + 48));
                return;
            }
            appendable.append(Integer.toString(i));
        }
    }
}
