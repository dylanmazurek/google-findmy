package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class liv extends lie {
    private static final Logger a = Logger.getLogger(liv.class.getName());
    public static final boolean e = llu.a;
    public ktd f;

    public static int G(int i, lim limVar) {
        return Y(i) + H(limVar);
    }

    public static int H(lim limVar) {
        return P(limVar.d());
    }

    public static int I(int i, int i2) {
        return Y(i) + L(i2);
    }

    @Deprecated
    public static int J(int i, lkq lkqVar, llg llgVar) {
        int Y = Y(i);
        return Y + Y + ((lhw) lkqVar).d(llgVar);
    }

    public static int K(int i, int i2) {
        return Y(i) + L(i2);
    }

    public static int L(int i) {
        return ac(i);
    }

    public static int M(int i, long j) {
        return Y(i) + ac(j);
    }

    public static int N(int i, lke lkeVar) {
        return Y(i) + O(lkeVar);
    }

    public static int O(lke lkeVar) {
        int i;
        if (lkeVar.b != null) {
            i = lkeVar.b.d();
        } else if (lkeVar.a != null) {
            i = lkeVar.a.j();
        } else {
            i = 0;
        }
        return P(i);
    }

    public static int P(int i) {
        return aa(i) + i;
    }

    public static int Q(lkq lkqVar) {
        return P(lkqVar.j());
    }

    public static int R(lkq lkqVar, llg llgVar) {
        return P(((lhw) lkqVar).d(llgVar));
    }

    public static int S(int i, int i2) {
        return Y(i) + T(i2);
    }

    public static int T(int i) {
        return aa(ad(i));
    }

    public static int U(int i, long j) {
        return Y(i) + V(j);
    }

    public static int V(long j) {
        return ac(ae(j));
    }

    public static int W(int i, String str) {
        return Y(i) + X(str);
    }

    public static int X(String str) {
        int length;
        try {
            length = llw.b(str);
        } catch (llv unused) {
            length = str.getBytes(ljw.a).length;
        }
        return P(length);
    }

    public static int Y(int i) {
        return aa(llz.c(i, 0));
    }

    public static int Z(int i, int i2) {
        return Y(i) + aa(i2);
    }

    public static int aa(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int ab(int i, long j) {
        return Y(i) + ac(j);
    }

    public static int ac(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int ad(int i) {
        return (i >> 31) ^ (i + i);
    }

    public static long ae(long j) {
        return (j >> 63) ^ (j + j);
    }

    public static liv af(byte[] bArr) {
        return new lit(bArr, 0, bArr.length);
    }

    public static int ar(int i) {
        return Y(i) + 1;
    }

    public static int as(int i) {
        return Y(i) + 8;
    }

    public static int at(int i) {
        return Y(i) + 4;
    }

    public static int au(int i) {
        return Y(i) + 8;
    }

    public static int av(int i) {
        return Y(i) + 4;
    }

    public static int aw(int i) {
        return Y(i) + 4;
    }

    public static int ax(int i) {
        return Y(i) + 8;
    }

    public abstract void A(int i, int i2);

    public abstract void B(int i, int i2);

    public abstract void C(int i);

    public abstract void D(int i, long j);

    public abstract void E(long j);

    public abstract void F(byte[] bArr, int i);

    @Override // defpackage.lie
    public abstract void a(byte[] bArr, int i, int i2);

    public final void ag() {
        if (b() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void ah(String str, llv llvVar) {
        a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) llvVar);
        byte[] bytes = str.getBytes(ljw.a);
        try {
            int length = bytes.length;
            C(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new liu(e2);
        }
    }

    public final void ai(int i, double d) {
        q(i, Double.doubleToRawLongBits(d));
    }

    public final void aj(double d) {
        r(Double.doubleToRawLongBits(d));
    }

    public final void ak(int i, float f) {
        o(i, Float.floatToRawIntBits(f));
    }

    public final void al(float f) {
        p(Float.floatToRawIntBits(f));
    }

    @Deprecated
    public final void am(lkq lkqVar) {
        lkqVar.cA(this);
    }

    public final void an(int i, int i2) {
        B(i, ad(i2));
    }

    public final void ao(int i) {
        C(ad(i));
    }

    public final void ap(int i, long j) {
        D(i, ae(j));
    }

    public final void aq(long j) {
        E(ae(j));
    }

    public abstract int b();

    public abstract void j(byte b);

    public abstract void l(int i, boolean z);

    public abstract void m(int i, lim limVar);

    public abstract void n(lim limVar);

    public abstract void o(int i, int i2);

    public abstract void p(int i);

    public abstract void q(int i, long j);

    public abstract void r(long j);

    public abstract void s(int i, int i2);

    public abstract void t(int i);

    public abstract void u(int i, lkq lkqVar, llg llgVar);

    public abstract void v(lkq lkqVar);

    public abstract void w(int i, lkq lkqVar);

    public abstract void x(int i, lim limVar);

    public abstract void y(int i, String str);

    public abstract void z(String str);
}
