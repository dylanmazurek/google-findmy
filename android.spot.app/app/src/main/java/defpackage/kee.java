package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kee {
    public static final kgf a;
    public static final kgf b;
    public static final kgf c;
    public static final kgf d;
    public static final kuv e;
    public static final kuv f;
    public static final kuv g;
    public static final kuv h;
    public static final kuv i;
    public static final kuv j;
    private static final knb k;
    private static final knb l;

    static {
        knb b2 = kgt.b("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        k = b2;
        knb b3 = kgt.b("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        l = b3;
        a = new kgf((Object) keb.class, kgl.class, (Object) new kbx(8));
        b = new kgf((Object) b2, kgl.class, (Object) new kby(9));
        e = new kuv(kef.class, kgk.class, (byte[]) null);
        c = new kgf((Object) b3, kgk.class, (Object) new kbz(8));
        f = new kuv(kec.class, kgk.class, (byte[]) null);
        d = new kgf((Object) b2, kgk.class, (Object) new kfn() { // from class: ked
            /* JADX WARN: Code restructure failed: missing block: B:48:0x0156, code lost:            r0 = defpackage.kfk.a;     */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0133 A[Catch: ljy -> 0x0220, TryCatch #3 {ljy -> 0x0220, blocks: (B:7:0x0011, B:13:0x003a, B:15:0x0043, B:17:0x0047, B:18:0x0049, B:20:0x0052, B:21:0x0054, B:24:0x0099, B:28:0x0112, B:31:0x0126, B:33:0x012a, B:36:0x012f, B:38:0x0133, B:41:0x018f, B:43:0x013e, B:44:0x0143, B:45:0x0144, B:46:0x0153, B:48:0x0156, B:49:0x0166, B:51:0x0175, B:53:0x017b, B:55:0x0195, B:56:0x019a, B:57:0x019b, B:58:0x01a2, B:59:0x0159, B:61:0x015d, B:62:0x0160, B:64:0x0164, B:65:0x01a3, B:66:0x01b2, B:67:0x00c8, B:68:0x00d9, B:69:0x00da, B:73:0x00e1, B:74:0x00f2, B:75:0x00f3, B:79:0x00fa, B:80:0x010b, B:81:0x010c, B:84:0x01b3, B:85:0x01c4, B:86:0x01c5, B:87:0x01d4, B:88:0x0087, B:91:0x008c, B:94:0x0093, B:97:0x01d5, B:98:0x01dc, B:99:0x01dd, B:100:0x01e4, B:103:0x01e6, B:116:0x01e8, B:118:0x01f0, B:119:0x01f6, B:120:0x01f7, B:106:0x01f9, B:108:0x0201, B:109:0x0207, B:110:0x0208, B:111:0x020d, B:113:0x020f, B:114:0x0213, B:122:0x0215, B:124:0x0219, B:125:0x021f, B:12:0x0037, B:9:0x0026), top: B:6:0x0011, inners: #5, #6, #5 }] */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0144 A[Catch: ljy -> 0x0220, TryCatch #3 {ljy -> 0x0220, blocks: (B:7:0x0011, B:13:0x003a, B:15:0x0043, B:17:0x0047, B:18:0x0049, B:20:0x0052, B:21:0x0054, B:24:0x0099, B:28:0x0112, B:31:0x0126, B:33:0x012a, B:36:0x012f, B:38:0x0133, B:41:0x018f, B:43:0x013e, B:44:0x0143, B:45:0x0144, B:46:0x0153, B:48:0x0156, B:49:0x0166, B:51:0x0175, B:53:0x017b, B:55:0x0195, B:56:0x019a, B:57:0x019b, B:58:0x01a2, B:59:0x0159, B:61:0x015d, B:62:0x0160, B:64:0x0164, B:65:0x01a3, B:66:0x01b2, B:67:0x00c8, B:68:0x00d9, B:69:0x00da, B:73:0x00e1, B:74:0x00f2, B:75:0x00f3, B:79:0x00fa, B:80:0x010b, B:81:0x010c, B:84:0x01b3, B:85:0x01c4, B:86:0x01c5, B:87:0x01d4, B:88:0x0087, B:91:0x008c, B:94:0x0093, B:97:0x01d5, B:98:0x01dc, B:99:0x01dd, B:100:0x01e4, B:103:0x01e6, B:116:0x01e8, B:118:0x01f0, B:119:0x01f6, B:120:0x01f7, B:106:0x01f9, B:108:0x0201, B:109:0x0207, B:110:0x0208, B:111:0x020d, B:113:0x020f, B:114:0x0213, B:122:0x0215, B:124:0x0219, B:125:0x021f, B:12:0x0037, B:9:0x0026), top: B:6:0x0011, inners: #5, #6, #5 }] */
            /* JADX WARN: Removed duplicated region for block: B:61:0x015d A[Catch: ljy -> 0x0220, TryCatch #3 {ljy -> 0x0220, blocks: (B:7:0x0011, B:13:0x003a, B:15:0x0043, B:17:0x0047, B:18:0x0049, B:20:0x0052, B:21:0x0054, B:24:0x0099, B:28:0x0112, B:31:0x0126, B:33:0x012a, B:36:0x012f, B:38:0x0133, B:41:0x018f, B:43:0x013e, B:44:0x0143, B:45:0x0144, B:46:0x0153, B:48:0x0156, B:49:0x0166, B:51:0x0175, B:53:0x017b, B:55:0x0195, B:56:0x019a, B:57:0x019b, B:58:0x01a2, B:59:0x0159, B:61:0x015d, B:62:0x0160, B:64:0x0164, B:65:0x01a3, B:66:0x01b2, B:67:0x00c8, B:68:0x00d9, B:69:0x00da, B:73:0x00e1, B:74:0x00f2, B:75:0x00f3, B:79:0x00fa, B:80:0x010b, B:81:0x010c, B:84:0x01b3, B:85:0x01c4, B:86:0x01c5, B:87:0x01d4, B:88:0x0087, B:91:0x008c, B:94:0x0093, B:97:0x01d5, B:98:0x01dc, B:99:0x01dd, B:100:0x01e4, B:103:0x01e6, B:116:0x01e8, B:118:0x01f0, B:119:0x01f6, B:120:0x01f7, B:106:0x01f9, B:108:0x0201, B:109:0x0207, B:110:0x0208, B:111:0x020d, B:113:0x020f, B:114:0x0213, B:122:0x0215, B:124:0x0219, B:125:0x021f, B:12:0x0037, B:9:0x0026), top: B:6:0x0011, inners: #5, #6, #5 }] */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0160 A[Catch: ljy -> 0x0220, TryCatch #3 {ljy -> 0x0220, blocks: (B:7:0x0011, B:13:0x003a, B:15:0x0043, B:17:0x0047, B:18:0x0049, B:20:0x0052, B:21:0x0054, B:24:0x0099, B:28:0x0112, B:31:0x0126, B:33:0x012a, B:36:0x012f, B:38:0x0133, B:41:0x018f, B:43:0x013e, B:44:0x0143, B:45:0x0144, B:46:0x0153, B:48:0x0156, B:49:0x0166, B:51:0x0175, B:53:0x017b, B:55:0x0195, B:56:0x019a, B:57:0x019b, B:58:0x01a2, B:59:0x0159, B:61:0x015d, B:62:0x0160, B:64:0x0164, B:65:0x01a3, B:66:0x01b2, B:67:0x00c8, B:68:0x00d9, B:69:0x00da, B:73:0x00e1, B:74:0x00f2, B:75:0x00f3, B:79:0x00fa, B:80:0x010b, B:81:0x010c, B:84:0x01b3, B:85:0x01c4, B:86:0x01c5, B:87:0x01d4, B:88:0x0087, B:91:0x008c, B:94:0x0093, B:97:0x01d5, B:98:0x01dc, B:99:0x01dd, B:100:0x01e4, B:103:0x01e6, B:116:0x01e8, B:118:0x01f0, B:119:0x01f6, B:120:0x01f7, B:106:0x01f9, B:108:0x0201, B:109:0x0207, B:110:0x0208, B:111:0x020d, B:113:0x020f, B:114:0x0213, B:122:0x0215, B:124:0x0219, B:125:0x021f, B:12:0x0037, B:9:0x0026), top: B:6:0x0011, inners: #5, #6, #5 }] */
            /* JADX WARN: Removed duplicated region for block: B:69:0x00da A[Catch: ljy -> 0x0220, TryCatch #3 {ljy -> 0x0220, blocks: (B:7:0x0011, B:13:0x003a, B:15:0x0043, B:17:0x0047, B:18:0x0049, B:20:0x0052, B:21:0x0054, B:24:0x0099, B:28:0x0112, B:31:0x0126, B:33:0x012a, B:36:0x012f, B:38:0x0133, B:41:0x018f, B:43:0x013e, B:44:0x0143, B:45:0x0144, B:46:0x0153, B:48:0x0156, B:49:0x0166, B:51:0x0175, B:53:0x017b, B:55:0x0195, B:56:0x019a, B:57:0x019b, B:58:0x01a2, B:59:0x0159, B:61:0x015d, B:62:0x0160, B:64:0x0164, B:65:0x01a3, B:66:0x01b2, B:67:0x00c8, B:68:0x00d9, B:69:0x00da, B:73:0x00e1, B:74:0x00f2, B:75:0x00f3, B:79:0x00fa, B:80:0x010b, B:81:0x010c, B:84:0x01b3, B:85:0x01c4, B:86:0x01c5, B:87:0x01d4, B:88:0x0087, B:91:0x008c, B:94:0x0093, B:97:0x01d5, B:98:0x01dc, B:99:0x01dd, B:100:0x01e4, B:103:0x01e6, B:116:0x01e8, B:118:0x01f0, B:119:0x01f6, B:120:0x01f7, B:106:0x01f9, B:108:0x0201, B:109:0x0207, B:110:0x0208, B:111:0x020d, B:113:0x020f, B:114:0x0213, B:122:0x0215, B:124:0x0219, B:125:0x021f, B:12:0x0037, B:9:0x0026), top: B:6:0x0011, inners: #5, #6, #5 }] */
            @Override // defpackage.kfn
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.ivc a(defpackage.kgo r12) {
                /*
                    Method dump skipped, instructions count: 570
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ked.a(kgo):ivc");
            }
        });
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        iuu.u(kjr.RAW, kea.c, hashMap, hashMap2);
        iuu.u(kjr.TINK, kea.a, hashMap, hashMap2);
        iuu.u(kjr.LEGACY, kea.b, hashMap, hashMap2);
        iuu.u(kjr.CRUNCHY, kea.b, hashMap, hashMap2);
        g = iuu.G(hashMap, hashMap2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        iuu.u(kjb.DHKEM_P256_HKDF_SHA256, kdz.a, hashMap3, hashMap4);
        iuu.u(kjb.DHKEM_P384_HKDF_SHA384, kdz.b, hashMap3, hashMap4);
        iuu.u(kjb.DHKEM_P521_HKDF_SHA512, kdz.c, hashMap3, hashMap4);
        iuu.u(kjb.DHKEM_X25519_HKDF_SHA256, kdz.f, hashMap3, hashMap4);
        h = iuu.G(hashMap3, hashMap4);
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        iuu.u(kja.HKDF_SHA256, kdy.a, hashMap5, hashMap6);
        iuu.u(kja.HKDF_SHA384, kdy.b, hashMap5, hashMap6);
        iuu.u(kja.HKDF_SHA512, kdy.c, hashMap5, hashMap6);
        i = iuu.G(hashMap5, hashMap6);
        HashMap hashMap7 = new HashMap();
        HashMap hashMap8 = new HashMap();
        iuu.u(kiz.AES_128_GCM, kdw.a, hashMap7, hashMap8);
        iuu.u(kiz.AES_256_GCM, kdw.b, hashMap7, hashMap8);
        iuu.u(kiz.CHACHA20_POLY1305, kdw.c, hashMap7, hashMap8);
        j = iuu.G(hashMap7, hashMap8);
    }

    public static keb a(kjr kjrVar, kjd kjdVar) {
        kjb kjbVar;
        kja kjaVar;
        kea keaVar = (kea) g.p(kjrVar);
        kuv kuvVar = h;
        int i2 = kjdVar.a;
        kiz kizVar = null;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            kjbVar = null;
                        } else {
                            kjbVar = kjb.DHKEM_P521_HKDF_SHA512;
                        }
                    } else {
                        kjbVar = kjb.DHKEM_P384_HKDF_SHA384;
                    }
                } else {
                    kjbVar = kjb.DHKEM_P256_HKDF_SHA256;
                }
            } else {
                kjbVar = kjb.DHKEM_X25519_HKDF_SHA256;
            }
        } else {
            kjbVar = kjb.KEM_UNKNOWN;
        }
        if (kjbVar == null) {
            kjbVar = kjb.UNRECOGNIZED;
        }
        kdz kdzVar = (kdz) kuvVar.p(kjbVar);
        kuv kuvVar2 = i;
        int i3 = kjdVar.b;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        kjaVar = null;
                    } else {
                        kjaVar = kja.HKDF_SHA512;
                    }
                } else {
                    kjaVar = kja.HKDF_SHA384;
                }
            } else {
                kjaVar = kja.HKDF_SHA256;
            }
        } else {
            kjaVar = kja.KDF_UNKNOWN;
        }
        if (kjaVar == null) {
            kjaVar = kja.UNRECOGNIZED;
        }
        kdy kdyVar = (kdy) kuvVar2.p(kjaVar);
        kuv kuvVar3 = j;
        int i4 = kjdVar.c;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        kizVar = kiz.CHACHA20_POLY1305;
                    }
                } else {
                    kizVar = kiz.AES_256_GCM;
                }
            } else {
                kizVar = kiz.AES_128_GCM;
            }
        } else {
            kizVar = kiz.AEAD_UNKNOWN;
        }
        if (kizVar == null) {
            kizVar = kiz.UNRECOGNIZED;
        }
        return new keb(kdzVar, kdyVar, (kdw) kuvVar3.p(kizVar), keaVar);
    }

    public static knb b(kdz kdzVar, byte[] bArr) {
        int i2;
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (kdzVar == kdz.f) {
            i2 = 32;
        } else if (kdzVar == kdz.a) {
            i2 = 65;
        } else if (kdzVar == kdz.b) {
            i2 = 97;
        } else if (kdzVar == kdz.c) {
            i2 = 133;
        } else {
            throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
        }
        return knb.b(iuu.w(bigInteger, i2));
    }
}
