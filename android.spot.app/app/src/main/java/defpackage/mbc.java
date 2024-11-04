package defpackage;

import java.util.Arrays;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mbc {
    public static final Logger a = Logger.getLogger(mbc.class.getName());
    public static final may b = new mfg(1);
    static final jtf c = jtf.d.e();
    public Object[] d;
    public int e;

    public mbc() {
    }

    private final int h() {
        Object[] objArr = this.d;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final Object i(int i) {
        return this.d[i + i + 1];
    }

    private final void j(int i) {
        Object[] objArr = new Object[i];
        if (!l()) {
            System.arraycopy(this.d, 0, objArr, 0, a());
        }
        this.d = objArr;
    }

    private final void k(int i, byte[] bArr) {
        this.d[i + i] = bArr;
    }

    private final boolean l() {
        if (this.e == 0) {
            return true;
        }
        return false;
    }

    public final int a() {
        int i = this.e;
        return i + i;
    }

    public final Object b(maz mazVar) {
        int i = this.e;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!Arrays.equals(mazVar.b, f(i)));
        Object i2 = i(i);
        if (i2 instanceof byte[]) {
            return mazVar.a((byte[]) i2);
        }
        throw null;
    }

    public final void c(maz mazVar) {
        if (!l()) {
            int i = 0;
            for (int i2 = 0; i2 < this.e; i2++) {
                if (!Arrays.equals(mazVar.b, f(i2))) {
                    int i3 = i + i;
                    k(i, f(i2));
                    Object i4 = i(i2);
                    if (this.d instanceof byte[][]) {
                        j(h());
                    }
                    this.d[i3 + 1] = i4;
                    i++;
                }
            }
            Arrays.fill(this.d, i + i, a(), (Object) null);
            this.e = i;
        }
    }

    public final void d(mbc mbcVar) {
        if (mbcVar.l()) {
            return;
        }
        int h = h() - a();
        if (l() || h < mbcVar.a()) {
            j(a() + mbcVar.a());
        }
        System.arraycopy(mbcVar.d, 0, this.d, a(), mbcVar.a());
        this.e += mbcVar.e;
    }

    public final void e(maz mazVar, Object obj) {
        mazVar.getClass();
        obj.getClass();
        if (a() == 0 || a() == h()) {
            int a2 = a();
            j(Math.max(a2 + a2, 8));
        }
        k(this.e, mazVar.b);
        int i = this.e;
        this.d[i + i + 1] = mazVar.b(obj);
        this.e++;
    }

    public final byte[] f(int i) {
        return (byte[]) this.d[i + i];
    }

    public final byte[] g(int i) {
        Object i2 = i(i);
        if (i2 instanceof byte[]) {
            return (byte[]) i2;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.e; i++) {
            if (i != 0) {
                sb.append(',');
            }
            String str = new String(f(i), jec.a);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(c.k(g(i)));
            } else {
                sb.append(new String(g(i), jec.a));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public mbc(int i, Object[] objArr) {
        this.e = i;
        this.d = objArr;
    }
}
