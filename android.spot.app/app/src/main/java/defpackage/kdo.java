package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdo {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public kdo() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = kds.c;
        this.f = null;
    }

    public final kdt a() {
        Object obj = this.a;
        if (obj != null) {
            if (this.b != null) {
                if (this.d != null) {
                    if (this.e != null) {
                        kdp kdpVar = kdp.d;
                        if (obj != kdpVar && this.c == null) {
                            throw new GeneralSecurityException("Point format is not set");
                        }
                        if (obj == kdpVar && this.c != null) {
                            throw new GeneralSecurityException("For Curve25519 point format must not be set");
                        }
                        Object obj2 = this.a;
                        Object obj3 = this.b;
                        Object obj4 = this.c;
                        Object obj5 = this.d;
                        Object obj6 = this.e;
                        kds kdsVar = (kds) obj6;
                        kdr kdrVar = (kdr) obj4;
                        return new kdt((kdp) obj2, (kdq) obj3, kdrVar, (kag) obj5, kdsVar, (knb) this.f);
                    }
                    throw new GeneralSecurityException("Variant is not set");
                }
                throw new GeneralSecurityException("DEM parameters are not set");
            }
            throw new GeneralSecurityException("Hash type is not set");
        }
        throw new GeneralSecurityException("Elliptic curve type is not set");
    }

    public final void b(kag kagVar) {
        if (kdt.a.contains(kagVar)) {
            this.d = kagVar;
            return;
        }
        throw new GeneralSecurityException(der.c(kagVar, "Invalid DEM parameters ", "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported."));
    }

    public final kat c() {
        if (this.b != null) {
            if (this.c != null) {
                if (this.e != null) {
                    Object obj = this.f;
                    if (obj != null) {
                        if (this.d != null) {
                            if (this.a != null) {
                                Integer num = (Integer) obj;
                                int intValue = num.intValue();
                                Object obj2 = this.d;
                                if (obj2 == kar.a) {
                                    if (intValue > 20) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
                                    }
                                } else if (obj2 == kar.b) {
                                    if (intValue > 28) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
                                    }
                                } else if (obj2 == kar.c) {
                                    if (intValue > 32) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
                                    }
                                } else if (obj2 == kar.d) {
                                    if (intValue > 48) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
                                    }
                                } else if (obj2 == kar.e) {
                                    if (intValue > 64) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
                                    }
                                } else {
                                    throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                                }
                                return new kat(((Integer) this.b).intValue(), ((Integer) this.c).intValue(), ((Integer) this.e).intValue(), ((Integer) this.f).intValue(), (kas) this.a, (kar) this.d);
                            }
                            throw new GeneralSecurityException("variant is not set");
                        }
                        throw new GeneralSecurityException("hash type is not set");
                    }
                    throw new GeneralSecurityException("tag size is not set");
                }
                throw new GeneralSecurityException("iv size is not set");
            }
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        throw new GeneralSecurityException("AES key size is not set");
    }

    public final void d(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public final void e(int i) {
        if (i >= 16) {
            this.c = Integer.valueOf(i);
            return;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
    }

    public final void f(int i) {
        if (i >= 12 && i <= 16) {
            this.e = Integer.valueOf(i);
            return;
        }
        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
    }

    public final void g(int i) {
        if (i >= 10) {
            this.f = Integer.valueOf(i);
            return;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gzf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, haw] */
    public final hbh h() {
        Object obj;
        ?? r3;
        Object obj2;
        ?? r1 = this.c;
        if (r1 != 0 && (obj = this.d) != null && (r3 = this.b) != 0 && (obj2 = this.a) != null) {
            return new hbh(r1, (frx) obj, r3, (hiw) obj2, (jer) this.f, (jer) this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" avatarImageLoader");
        }
        if (this.d == null) {
            sb.append(" accountConverter");
        }
        if (this.b == null) {
            sb.append(" accountsModel");
        }
        if (this.a == null) {
            sb.append(" oneGoogleEventLogger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void i(haw hawVar) {
        if (hawVar != null) {
            this.b = hawVar;
            return;
        }
        throw new NullPointerException("Null accountsModel");
    }

    public final void j(gzf gzfVar) {
        if (gzfVar != null) {
            this.c = gzfVar;
            return;
        }
        throw new NullPointerException("Null avatarImageLoader");
    }

    public final void k(hiw hiwVar) {
        if (hiwVar != null) {
            this.a = hiwVar;
            return;
        }
        throw new NullPointerException("Null oneGoogleEventLogger");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map, java.lang.Object] */
    public final gqf l() {
        try {
            Map m = m();
            Object obj = this.e;
            if (m.containsKey(gqc.a)) {
                List list = (List) m.get(gqc.a);
                if (!list.isEmpty()) {
                    CharSequence charSequence = (CharSequence) list.get(0);
                    int length = charSequence.length();
                    if (charSequence != "gzip") {
                        if (length == "gzip".length()) {
                            for (int i = 0; i < length; i++) {
                                char charAt = charSequence.charAt(i);
                                char charAt2 = "gzip".charAt(i);
                                if (charAt != charAt2) {
                                    int r = ivc.r(charAt);
                                    if (r >= 26 || r != ivc.r(charAt2)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    obj = jti.a(new GZIPInputStream(new ByteArrayInputStream((byte[]) obj)), new ArrayDeque(20), 0);
                }
            }
            this.b = obj;
        } catch (IOException e) {
            this.d = e;
        }
        ?? r4 = this.f;
        if (r4 != 0) {
            Object obj2 = this.c;
            Object obj3 = this.a;
            Object obj4 = this.e;
            Object obj5 = this.b;
            byte[] bArr = (byte[]) obj5;
            byte[] bArr2 = (byte[]) obj4;
            return new gqf((Integer) obj2, (String) obj3, r4, bArr2, bArr, (Exception) this.d);
        }
        throw new IllegalStateException("Missing required properties: headers");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final Map m() {
        ?? r0 = this.f;
        if (r0 != 0) {
            return r0;
        }
        throw new IllegalStateException("Property \"headers\" has not been set");
    }

    public final void n(frx frxVar) {
        if (frxVar != null) {
            this.d = frxVar;
            return;
        }
        throw new NullPointerException("Null accountConverter");
    }

    public kdo(byte[] bArr) {
        this.b = null;
        this.c = null;
        this.e = null;
        this.f = null;
        this.d = null;
        this.a = kas.c;
    }

    public kdo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        jdl jdlVar = jdl.a;
        this.f = jdlVar;
        this.e = jdlVar;
    }

    public kdo(char[] cArr) {
    }
}
