package defpackage;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jhd extends jha {
    transient long[] g;
    private transient int h;
    private transient int i;

    public jhd() {
        super(3);
    }

    private final void A(int i, long j) {
        C()[i] = j;
    }

    private final void B(int i, int i2) {
        if (i == -2) {
            this.h = i2;
            i = -2;
        } else {
            A(i, (z(i) & (-4294967296L)) | ((i2 + 1) & 4294967295L));
        }
        if (i2 == -2) {
            this.i = i;
        } else {
            A(i2, (4294967295L & z(i2)) | ((i + 1) << 32));
        }
    }

    private final long[] C() {
        long[] jArr = this.g;
        jArr.getClass();
        return jArr;
    }

    private final int y(int i) {
        return ((int) (z(i) >>> 32)) - 1;
    }

    private final long z(int i) {
        return C()[i];
    }

    @Override // defpackage.jha
    public final int a(int i, int i2) {
        if (i >= size()) {
            return i2;
        }
        return i;
    }

    @Override // defpackage.jha
    public final int b() {
        int b = super.b();
        this.g = new long[b];
        return b;
    }

    @Override // defpackage.jha
    public final int c() {
        return this.h;
    }

    @Override // defpackage.jha, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (u()) {
            return;
        }
        this.h = -2;
        this.i = -2;
        long[] jArr = this.g;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // defpackage.jha
    public final int d(int i) {
        return ((int) z(i)) - 1;
    }

    @Override // defpackage.jha
    public final Map l() {
        Map l = super.l();
        this.g = null;
        return l;
    }

    @Override // defpackage.jha
    public final Map m(int i) {
        return new LinkedHashMap(i, 1.0f, false);
    }

    @Override // defpackage.jha
    public final void p(int i) {
        super.p(i);
        this.h = -2;
        this.i = -2;
    }

    @Override // defpackage.jha
    public final void q(int i, Object obj, Object obj2, int i2, int i3) {
        super.q(i, obj, obj2, i2, i3);
        B(this.i, i);
        B(i, -2);
    }

    @Override // defpackage.jha
    public final void r(int i, int i2) {
        int size = size() - 1;
        super.r(i, i2);
        B(y(i), d(i));
        if (i < size) {
            B(y(size), i);
            B(i, d(size));
        }
        A(size, 0L);
    }

    @Override // defpackage.jha
    public final void s(int i) {
        super.s(i);
        this.g = Arrays.copyOf(C(), i);
    }
}
