package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mep {
    public Object a;
    public Object b;
    public Object c;

    public mep() {
    }

    public final kgx a() {
        Object obj = this.a;
        if (obj != null) {
            if (this.b != null) {
                if (this.c != null) {
                    return new kgx(((Integer) obj).intValue(), ((Integer) this.b).intValue(), (kgw) this.c);
                }
                throw new GeneralSecurityException("variant not set");
            }
            throw new GeneralSecurityException("tag size not set");
        }
        throw new GeneralSecurityException("key size not set");
    }

    public final void b(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.a = Integer.valueOf(i);
    }

    public final void c(int i) {
        if (i >= 10 && i <= 16) {
            this.b = Integer.valueOf(i);
            return;
        }
        throw new GeneralSecurityException(a.ae(i, "Invalid tag size for AesCmacParameters: "));
    }

    public final iiy d() {
        boolean z;
        if (this.a != null && this.b != null) {
            Object obj = this.a;
            lim limVar = (lim) obj;
            iiy iiyVar = new iiy(limVar, (jer) this.c, (lln) this.b);
            boolean z2 = false;
            if (iiyVar.a.d() == 32) {
                z = true;
            } else {
                z = false;
            }
            hwx.U(z);
            jer jerVar = iiyVar.b;
            if (!jerVar.g() || ((lim) jerVar.c()).d() == 16) {
                z2 = true;
            }
            hwx.U(z2);
            return iiyVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" identityKey");
        }
        if (this.b == null) {
            sb.append(" creationTimestamp");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void e(lim limVar) {
        this.c = jer.i(limVar);
    }

    public final void f(lln llnVar) {
        if (llnVar != null) {
            this.b = llnVar;
            return;
        }
        throw new NullPointerException("Null creationTimestamp");
    }

    public final void g(jis jisVar) {
        if (jisVar != null) {
            this.a = jisVar;
            return;
        }
        throw new NullPointerException("Null flavorCustomActions");
    }

    public final gkq h() {
        Object obj;
        Object obj2;
        Object obj3 = this.b;
        if (obj3 != null && (obj = this.c) != null && (obj2 = this.a) != null) {
            return new gkq((Long) obj3, (Integer) obj, (byte[]) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" id");
        }
        if (this.c == null) {
            sb.append(" jobType");
        }
        if (this.a == null) {
            sb.append(" payload");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void i(byte[] bArr) {
        if (bArr != null) {
            this.a = bArr;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public final boolean j() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public mep(byte[] bArr) {
        this.a = null;
        this.b = null;
        this.c = kgw.d;
    }

    public mep(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = jdl.a;
    }

    public mep(byte[] bArr, char[] cArr) {
        jdl jdlVar = jdl.a;
        this.b = jdlVar;
        this.c = jdlVar;
    }
}
