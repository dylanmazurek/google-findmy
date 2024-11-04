package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import java.io.Closeable;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lyn {
    private static lyn c;
    public Object a;
    public Object b;

    private lyn() {
        this.b = null;
        this.a = null;
    }

    public static synchronized lyn t() {
        lyn lynVar;
        synchronized (lyn.class) {
            if (c == null) {
                c = new lyn();
            }
            lynVar = c;
        }
        return lynVar;
    }

    public final lyp a() {
        if (this.b != null) {
            Object obj = this.a;
            lyp lypVar = lyp.a;
            for (Map.Entry entry : ((lyp) obj).b.entrySet()) {
                if (!((IdentityHashMap) this.b).containsKey(entry.getKey())) {
                    ((IdentityHashMap) this.b).put((lyo) entry.getKey(), entry.getValue());
                }
            }
            this.a = new lyp((IdentityHashMap) this.b);
            this.b = null;
        }
        return (lyp) this.a;
    }

    public final void b(lyo lyoVar, Object obj) {
        if (this.b == null) {
            this.b = new IdentityHashMap(1);
        }
        ((IdentityHashMap) this.b).put(lyoVar, obj);
    }

    public final boolean c(Context context) {
        boolean z;
        if (this.b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.b = Boolean.valueOf(z);
        }
        ((Boolean) this.b).booleanValue();
        return ((Boolean) this.b).booleanValue();
    }

    public final kdh d() {
        Object obj = this.a;
        if (obj != null) {
            if (this.b != null) {
                return new kdh(((Integer) obj).intValue(), (kdg) this.b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    public final void e(int i) {
        if (i != 32 && i != 48 && i != 64) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    public final kbh f() {
        Object obj = this.a;
        if (obj != null) {
            if (this.b != null) {
                return new kbh(((Integer) obj).intValue(), (kbg) this.b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    public final void g(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    public final void h(float f) {
        float[] fArr = (float[]) this.b;
        double atan2 = Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d;
        double d = (float) atan2;
        double d2 = f;
        ((float[]) this.a)[0] = (float) (r0[0] + (Math.cos(d) * d2));
        ((float[]) this.a)[1] = (float) (r12[1] + (d2 * Math.sin(d)));
    }

    public final void i(float f) {
        float[] fArr = (float[]) this.b;
        float atan2 = (float) Math.atan2(fArr[1], fArr[0]);
        double d = atan2;
        double d2 = f;
        ((float[]) this.a)[0] = (float) (r2[0] + (Math.cos(d) * d2));
        ((float[]) this.a)[1] = (float) (r14[1] + (d2 * Math.sin(d)));
    }

    public final void j(float f) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f);
        matrix.mapPoints((float[]) this.a);
        matrix.mapPoints((float[]) this.b);
    }

    public final void k(float f) {
        float[] fArr = (float[]) this.a;
        float f2 = fArr[0];
        fArr[1] = fArr[1] * f;
        float[] fArr2 = (float[]) this.b;
        float f3 = fArr2[0];
        fArr2[1] = fArr2[1] * f;
    }

    public final void l(float f) {
        float[] fArr = (float[]) this.a;
        fArr[0] = fArr[0] + f;
        fArr[1] = fArr[1] + 0.0f;
    }

    public final void m(List list) {
        Closeable closeable = (OutputStream) hzc.W(list);
        if (closeable instanceof ikj) {
            this.b = (ikj) closeable;
            this.a = (OutputStream) list.get(0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ikj, java.lang.Object] */
    public final void n() {
        if (this.b != null) {
            ((OutputStream) this.a).flush();
            this.b.b();
            return;
        }
        throw new ikk("Cannot sync underlying stream");
    }

    public final ijk o() {
        Object obj;
        Object obj2 = this.b;
        if (obj2 != null && (obj = this.a) != null) {
            return new ijk((lim) obj2, (lim) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" privateKey");
        }
        if (this.a == null) {
            sb.append(" publicKey");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void p(lim limVar) {
        if (limVar != null) {
            this.b = limVar;
            return;
        }
        throw new NullPointerException("Null privateKey");
    }

    public final void q(lim limVar) {
        if (limVar != null) {
            this.a = limVar;
            return;
        }
        throw new NullPointerException("Null publicKey");
    }

    public final ham r() {
        Object obj = this.a;
        if (obj != null) {
            return new ham((jer) this.b, (frx) obj);
        }
        throw new IllegalStateException("Missing required properties: accountCapabilitiesRetriever");
    }

    public final void s(hao haoVar) {
        this.b = jer.i(haoVar);
    }

    public lyn(ham hamVar) {
        this.b = jdl.a;
        this.b = hamVar.a;
        this.a = hamVar.b;
    }

    public lyn(lyp lypVar) {
        this.a = lypVar;
    }

    public lyn(byte[] bArr) {
    }

    public lyn(byte[] bArr, byte[] bArr2) {
        this.a = null;
        this.b = kbg.c;
    }

    public lyn(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = jdl.a;
    }

    public lyn(char[] cArr) {
        this.a = null;
        this.b = kdg.c;
    }

    public lyn(char[] cArr, byte[] bArr, byte[] bArr2) {
        int i = jis.d;
        jis jisVar = jmi.a;
        this.a = jisVar;
        this.b = jisVar;
    }

    public lyn(short[] sArr) {
        this.a = new float[2];
        this.b = r3;
        float[] fArr = {1.0f};
    }

    public lyn(lyn lynVar) {
        this((float[]) lynVar.a, (float[]) lynVar.b);
    }

    public lyn(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[2];
        this.a = fArr3;
        this.b = new float[2];
        System.arraycopy(fArr, 0, fArr3, 0, 2);
        System.arraycopy(fArr2, 0, this.b, 0, 2);
    }
}
