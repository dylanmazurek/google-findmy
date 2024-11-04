package defpackage;

import java.io.Closeable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dep implements Closeable {
    public static final String[] a = new String[128];
    int b;
    int[] c = new int[32];
    String[] d = new String[32];
    int[] e = new int[32];

    static {
        for (int i = 0; i <= 31; i++) {
            a[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract double a();

    public abstract int b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final deo c(String str) {
        throw new deo(str + " at path " + d());
    }

    public final String d() {
        int i = this.b;
        int[] iArr = this.c;
        String[] strArr = this.d;
        int[] iArr2 = this.e;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3 || i3 == 4 || i3 == 5) {
                    sb.append('.');
                    String str = strArr[i2];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            } else {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            }
        }
        return sb.toString();
    }

    public abstract String e();

    public abstract String f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(int i) {
        int i2 = this.b;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i2 == length) {
            if (i2 != 256) {
                this.c = Arrays.copyOf(iArr, length + length);
                String[] strArr = this.d;
                int length2 = strArr.length;
                this.d = (String[]) Arrays.copyOf(strArr, length2 + length2);
                int[] iArr2 = this.e;
                int length3 = iArr2.length;
                this.e = Arrays.copyOf(iArr2, length3 + length3);
            } else {
                throw new den("Nesting too deep at ".concat(d()));
            }
        }
        int[] iArr3 = this.c;
        int i3 = this.b;
        this.b = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract void l();

    public abstract void m();

    public abstract boolean n();

    public abstract boolean o();

    public abstract int p();

    public abstract int q(elo eloVar);
}
