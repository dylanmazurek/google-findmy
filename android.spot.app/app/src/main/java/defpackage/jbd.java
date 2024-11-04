package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jbd {
    public final int[] a;
    public final jbb b;
    public jbb c;
    public int d;
    public int e;
    public int f;

    public jbd(int[] iArr) {
        this.a = iArr;
        jbb jbbVar = new jbb(-1, -1);
        this.b = jbbVar;
        this.c = jbbVar;
    }

    private final void d(jbb jbbVar, StringBuilder sb) {
        for (jbb jbbVar2 : jbbVar.d.values()) {
            sb.append("  ");
            sb.append(jbbVar);
            sb.append(" -> ");
            sb.append(jbbVar2);
            sb.append(" [label=\"");
            int[] iArr = this.a;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, jbbVar2.a, Math.min(iArr.length, jbbVar2.b + 1))));
            sb.append("\"]\n");
            d(jbbVar2, sb);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        jbb jbbVar = this.c.c;
        if (jbbVar != null) {
            this.c = jbbVar;
        } else {
            this.c = this.b;
            int i = this.e;
            if (i > 0) {
                this.e = i - 1;
            }
            if (this.f > 0) {
                this.d++;
            }
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.e != 0) {
            jbb jbbVar = (jbb) this.c.d.get(Integer.valueOf(this.a[this.d]));
            while (true) {
                int i = (jbbVar.b - jbbVar.a) + 1;
                int i2 = this.e;
                if (i <= i2) {
                    int i3 = this.d + i;
                    this.d = i3;
                    this.c = jbbVar;
                    int i4 = i2 - i;
                    this.e = i4;
                    if (i4 > 0) {
                        jbbVar = (jbb) jbbVar.d.get(Integer.valueOf(this.a[i3]));
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final boolean c(int i, int i2, int i3, int i4) {
        if (i >= 0 && i3 >= 0) {
            int min = Math.min(this.a.length, i2);
            if (min - i == Math.min(this.a.length, i4) - i3) {
                for (int i5 = i; i5 <= min; i5++) {
                    int[] iArr = this.a;
                    if (iArr[i5] != iArr[(i3 + i5) - i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("digraph {\n");
        d(this.b, sb);
        sb.append("}");
        return sb.toString();
    }
}
