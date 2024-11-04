package defpackage;

import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmd implements kai {
    static final kuv a;
    static final kuv b;
    static final kuv c;
    private final ECPublicKey d;
    private final String e;
    private final kmi f;
    private final byte[] g;
    private final byte[] h;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        iuu.u(kmq.SHA256, kke.a, hashMap, hashMap2);
        iuu.u(kmq.SHA384, kke.b, hashMap, hashMap2);
        iuu.u(kmq.SHA512, kke.c, hashMap, hashMap2);
        a = iuu.G(hashMap, hashMap2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        iuu.u(kmi.IEEE_P1363, kkf.a, hashMap3, hashMap4);
        iuu.u(kmi.DER, kkf.b, hashMap3, hashMap4);
        b = iuu.G(hashMap3, hashMap4);
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        iuu.u(kmh.NIST_P256, kkd.a, hashMap5, hashMap6);
        iuu.u(kmh.NIST_P384, kkd.b, hashMap5, hashMap6);
        iuu.u(kmh.NIST_P521, kkd.c, hashMap5, hashMap6);
        c = iuu.G(hashMap5, hashMap6);
    }

    private kmd(ECPublicKey eCPublicKey, kmq kmqVar, kmi kmiVar, byte[] bArr, byte[] bArr2) {
        if (iuu.y(2)) {
            jql.B(eCPublicKey);
            this.e = kne.d(kmqVar);
            this.d = eCPublicKey;
            this.f = kmiVar;
            this.g = bArr;
            this.h = bArr2;
            return;
        }
        throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
    }

    public static kai b(kkj kkjVar) {
        byte[] bArr;
        ECPublicKey y = jql.y((kmh) c.o(kkjVar.a.b), kkjVar.b.getAffineX().toByteArray(), kkjVar.b.getAffineY().toByteArray());
        kmq kmqVar = (kmq) a.o(kkjVar.a.c);
        kmi kmiVar = (kmi) b.o(kkjVar.a.a);
        byte[] c2 = kkjVar.c.c();
        if (kkjVar.a.d.equals(kkg.c)) {
            bArr = new byte[]{0};
        } else {
            bArr = new byte[0];
        }
        return new kmd(y, kmqVar, kmiVar, c2, bArr);
    }

    private final void c(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int i;
        if (this.f == kmi.IEEE_P1363) {
            EllipticCurve curve = this.d.getParams().getCurve();
            int length = bArr.length;
            int t = jql.t(curve);
            if (length == t + t) {
                if ((length & 1) == 0 && length != 0 && length <= 132) {
                    int i2 = length >> 1;
                    byte[] G = jql.G(Arrays.copyOf(bArr, i2));
                    byte[] G2 = jql.G(Arrays.copyOfRange(bArr, i2, length));
                    int length2 = G.length;
                    int length3 = G2.length;
                    int i3 = length2 + 4 + length3;
                    if (i3 >= 128) {
                        bArr3 = new byte[i3 + 3];
                        bArr3[0] = 48;
                        bArr3[1] = -127;
                        bArr3[2] = (byte) i3;
                        i = 3;
                    } else {
                        bArr3 = new byte[i3 + 2];
                        bArr3[0] = 48;
                        bArr3[1] = (byte) i3;
                        i = 2;
                    }
                    int i4 = i + 1;
                    bArr3[i] = 2;
                    int i5 = i + 2;
                    bArr3[i4] = (byte) length2;
                    System.arraycopy(G, 0, bArr3, i5, length2);
                    int i6 = i5 + length2;
                    bArr3[i6] = 2;
                    bArr3[i6 + 1] = (byte) length3;
                    System.arraycopy(G2, 0, bArr3, i6 + 2, length3);
                    bArr = bArr3;
                } else {
                    throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
                }
            } else {
                throw new GeneralSecurityException("Invalid signature");
            }
        }
        if (jql.D(bArr)) {
            List c2 = kmn.c("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            Signature signature = (Signature) kmn.c.b(this.e, c2);
            signature.initVerify(this.d);
            signature.update(bArr2);
            try {
                if (signature.verify(bArr)) {
                    return;
                }
            } catch (RuntimeException unused) {
            }
            throw new GeneralSecurityException("Invalid signature");
        }
        throw new GeneralSecurityException("Invalid signature");
    }

    @Override // defpackage.kai
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.g;
        if (bArr3.length == 0 && this.h.length == 0) {
            c(bArr, bArr2);
            return;
        }
        if (kgt.c(bArr3, bArr)) {
            byte[] bArr4 = this.h;
            if (bArr4.length != 0) {
                bArr2 = jql.I(bArr2, bArr4);
            }
            c(Arrays.copyOfRange(bArr, this.g.length, bArr.length), bArr2);
            return;
        }
        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
    }
}
