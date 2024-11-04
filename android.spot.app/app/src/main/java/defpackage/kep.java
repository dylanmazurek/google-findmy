package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class kep implements keq {
    private final int a;
    private final /* synthetic */ int b;
    private final kag c;

    public kep(kat katVar, int i) {
        this.b = i;
        this.c = katVar;
        this.a = katVar.a + katVar.b;
    }

    @Override // defpackage.keq
    public final int a() {
        if (this.b != 0) {
            return this.a;
        }
        return this.a;
    }

    @Override // defpackage.keq
    public final byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        byte[] J;
        byte[] I;
        if (this.b != 0) {
            byte[] copyOf = Arrays.copyOf(bArr, ((kat) this.c).a);
            kat katVar = (kat) this.c;
            int i = katVar.b;
            int i2 = katVar.a;
            kmk kmkVar = (kmk) kmk.a(ivc.U((kat) this.c, ktd.ad(copyOf), ktd.ad(Arrays.copyOfRange(bArr, i2, i + i2)), null));
            klx klxVar = (klx) kmkVar.a;
            int i3 = klxVar.c;
            int length = bArr4.length;
            int i4 = Integer.MAX_VALUE - i3;
            if (length <= i4) {
                byte[] bArr5 = new byte[i3 + length];
                byte[] b = kgn.b(i3);
                System.arraycopy(b, 0, bArr5, 0, klxVar.c);
                int i5 = klxVar.c;
                Cipher cipher = (Cipher) klx.a.get();
                byte[] bArr6 = new byte[klxVar.d];
                System.arraycopy(b, 0, bArr6, 0, klxVar.c);
                cipher.init(1, klxVar.b, new IvParameterSpec(bArr6));
                if (cipher.doFinal(bArr4, 0, length, bArr5, i5) == length) {
                    byte[] copyOf2 = Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8);
                    kaf kafVar = kmkVar.b;
                    byte[] I2 = jql.I(ker.a, bArr5, copyOf2);
                    kmw kmwVar = (kmw) kafVar;
                    byte[] bArr7 = kmwVar.d;
                    if (bArr7.length > 0) {
                        I = jql.I(kmwVar.c, kmwVar.a.a(jql.I(I2, bArr7), kmwVar.b));
                    } else {
                        I = jql.I(kmwVar.c, kmwVar.a.a(I2, kmwVar.b));
                    }
                    return jql.I(bArr2, bArr3, jql.I(kmkVar.c, bArr5, I));
                }
                throw new GeneralSecurityException("stored output's length does not match input's length");
            }
            throw new GeneralSecurityException(a.ae(i4, "plaintext length can not exceed "));
        }
        kmc kmcVar = (kmc) kmc.a(iuu.H((kdh) this.c, ktd.ad(bArr), null));
        if (bArr4.length <= 2147483631 - kmcVar.e.length) {
            Cipher cipher2 = (Cipher) kmc.b.get();
            byte[][] bArr8 = {ker.a, bArr4};
            byte[] a = kmcVar.c.a(kmc.a, 16);
            for (char c = 0; c <= 0; c = 1) {
                byte[] bArr9 = bArr8[0];
                if (bArr9 == null) {
                    bArr9 = new byte[0];
                }
                a = jql.J(jql.Q(a), kmcVar.c.a(bArr9, 16));
            }
            byte[] bArr10 = bArr8[1];
            int length2 = bArr10.length;
            if (length2 >= 16) {
                int length3 = a.length;
                if (length2 >= length3) {
                    J = Arrays.copyOf(bArr10, length2);
                    for (int i6 = 0; i6 < a.length; i6++) {
                        int i7 = (length2 - length3) + i6;
                        J[i7] = (byte) (J[i7] ^ a[i6]);
                    }
                } else {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
            } else {
                J = jql.J(jql.P(bArr10), jql.Q(a));
            }
            byte[] a2 = kmcVar.c.a(J, 16);
            byte[] bArr11 = (byte[]) a2.clone();
            bArr11[8] = (byte) (bArr11[8] & Byte.MAX_VALUE);
            bArr11[12] = (byte) (bArr11[12] & Byte.MAX_VALUE);
            cipher2.init(1, new SecretKeySpec(kmcVar.d, "AES"), new IvParameterSpec(bArr11));
            byte[] bArr12 = kmcVar.e;
            int length4 = a2.length;
            int length5 = bArr12.length;
            int length6 = bArr4.length;
            byte[] copyOf3 = Arrays.copyOf(bArr12, length5 + length4 + length6);
            System.arraycopy(a2, 0, copyOf3, length5, length4);
            if (cipher2.doFinal(bArr4, 0, length6, copyOf3, length4 + kmcVar.e.length) == length6) {
                return jql.I(bArr2, bArr3, copyOf3);
            }
            throw new GeneralSecurityException("not enough data written");
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public kep(kdh kdhVar, int i) {
        this.b = i;
        this.c = kdhVar;
        this.a = kdhVar.a;
    }
}
