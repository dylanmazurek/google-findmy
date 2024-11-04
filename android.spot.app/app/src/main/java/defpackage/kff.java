package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kff {
    final long[] a;
    final long[] b;
    final long[] c;

    public kff(long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = jArr3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(kff kffVar, int i) {
        kfe.a(this.a, kffVar.a, i);
        kfe.a(this.b, kffVar.b, i);
        kfe.a(this.c, kffVar.c, i);
    }

    public void b(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    kff() {
        this(new long[10], new long[10], new long[10]);
    }

    public kff(kff kffVar) {
        this.a = Arrays.copyOf(kffVar.a, 10);
        this.b = Arrays.copyOf(kffVar.b, 10);
        this.c = Arrays.copyOf(kffVar.c, 10);
    }
}
