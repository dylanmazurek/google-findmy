package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import org.chromium.net.BidirectionalStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfk extends mcu {
    private static final maa B;
    public static final maz n;
    public final /* synthetic */ mco A;
    public mca o;
    public mbc p;
    public Charset q;
    public boolean r;
    public final Object s;
    public final Collection t;
    public boolean u;
    public boolean v;
    public int w;
    public mca x;
    public boolean y;
    public boolean z;

    static {
        mfj mfjVar = new mfj(0);
        B = mfjVar;
        n = mab.a(":status", mfjVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mfk(mco mcoVar, int i, mjt mjtVar, Object obj, mjz mjzVar) {
        super(i, mjtVar, mjzVar);
        this.A = mcoVar;
        this.q = jec.b;
        this.t = new ArrayList();
        this.v = false;
        this.s = obj;
    }

    public static Charset g(mbc mbcVar) {
        String str = (String) mbcVar.b(mfh.g);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return jec.b;
    }

    public static void h(mbc mbcVar) {
        mbcVar.c(n);
        mbcVar.c(mac.b);
        mbcVar.c(mac.a);
    }

    public static final mca i(mbc mbcVar) {
        char charAt;
        Integer num = (Integer) mbcVar.b(n);
        if (num == null) {
            return mca.h.d("Missing HTTP status code");
        }
        String str = (String) mbcVar.b(mfh.g);
        if (str != null && str.length() >= 16) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';')) {
                return null;
            }
        }
        return mfh.a(num.intValue()).a("invalid content-type: ".concat(String.valueOf(str)));
    }

    @Override // defpackage.mhg
    public final void j(int i) {
        BidirectionalStream bidirectionalStream = this.A.k;
        bidirectionalStream.getClass();
        int i2 = this.w - i;
        this.w = i2;
        if (i2 == 0 && !this.y) {
            bidirectionalStream.read(ByteBuffer.allocateDirect(4096));
        }
    }

    @Override // defpackage.mhg
    public final void k(Throwable th) {
        l(mca.b(th), true, new mbc());
    }

    public final void l(mca mcaVar, boolean z, mbc mbcVar) {
        BidirectionalStream bidirectionalStream = this.A.k;
        bidirectionalStream.getClass();
        bidirectionalStream.cancel();
        e(mcaVar, z, mbcVar);
    }

    public final void m() {
        boolean z;
        if (this.i != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.U(z);
        synchronized (this.a) {
            hwx.V(!this.e, "Already allocated");
            this.e = true;
        }
        super.a();
    }
}
