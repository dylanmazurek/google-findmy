package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpp extends jpr {
    public final int[] a;
    public final int b;
    private final jpa d;
    private final jpa e;

    public jpp(jpa jpaVar, jpa jpaVar2) {
        boolean z;
        int i;
        this.d = jpaVar;
        this.e = jpaVar2;
        int b = jpaVar2.b();
        if (b <= 28) {
            z = true;
        } else {
            z = false;
        }
        jql.f(z, "metadata size too large");
        int[] iArr = new int[b];
        this.a = iArr;
        long j = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < iArr.length) {
            joa d = d(i2);
            long j2 = d.d | j;
            if (j2 == j) {
                int i4 = 0;
                while (true) {
                    if (i4 < i3) {
                        if (d.equals(d(iArr[i4] & 31))) {
                            break;
                        } else {
                            i4++;
                        }
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                if (i4 != -1) {
                    if (d.b) {
                        i = iArr[i4] | (1 << (i2 + 4));
                    } else {
                        i = i2;
                    }
                    iArr[i4] = i;
                    i2++;
                    j = j2;
                }
            }
            iArr[i3] = i2;
            i3++;
            i2++;
            j = j2;
        }
        this.b = i3;
    }

    @Override // defpackage.jpr
    public final int a() {
        return this.b;
    }

    @Override // defpackage.jpr
    public final Set b() {
        return new jpn(this);
    }

    @Override // defpackage.jpr
    public final void c(jph jphVar, Object obj) {
        for (int i = 0; i < this.b; i++) {
            int i2 = this.a[i];
            joa d = d(i2 & 31);
            if (!d.b) {
                jphVar.a(d, d.c(e(i2)), obj);
            } else {
                jphVar.b(d, new jpo(this, d, i2), obj);
            }
        }
    }

    public final joa d(int i) {
        jpa jpaVar;
        if (i >= 0) {
            jpaVar = this.e;
        } else {
            jpaVar = this.d;
        }
        return jpaVar.c(i);
    }

    public final Object e(int i) {
        jpa jpaVar;
        if (i >= 0) {
            jpaVar = this.e;
        } else {
            jpaVar = this.d;
        }
        return jpaVar.e(i);
    }
}
