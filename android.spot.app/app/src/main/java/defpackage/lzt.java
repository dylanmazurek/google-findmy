package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzt {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public lzt() {
    }

    public static String q(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.concurrent.ThreadFactory] */
    public static ThreadFactory z(lzt lztVar) {
        AtomicLong atomicLong;
        Object obj = lztVar.d;
        Object obj2 = lztVar.c;
        Object obj3 = lztVar.b;
        Object obj4 = lztVar.a;
        Object obj5 = obj4;
        if (obj4 == null) {
            obj5 = Executors.defaultThreadFactory();
        }
        ?? r4 = obj5;
        if (obj != null) {
            atomicLong = new AtomicLong(0L);
        } else {
            atomicLong = null;
        }
        return new jzn(r4, (String) obj, atomicLong, (Boolean) obj2, (Integer) obj3);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [mad, java.lang.Object] */
    public final lzv a() {
        this.a.getClass();
        this.b.getClass();
        this.c.getClass();
        hwx.V(true, "at least one of channelRef and subchannelRef must be null");
        Object obj = this.a;
        return new lzv((String) obj, (lzu) this.b, ((Long) this.c).longValue(), this.d);
    }

    public final void b(long j) {
        this.c = Long.valueOf(j);
    }

    public final lzs c() {
        Object obj = this.a;
        Object obj2 = this.c;
        return new lzs((SocketAddress) obj, (InetSocketAddress) obj2, (String) this.d, (String) this.b);
    }

    public final void d(SocketAddress socketAddress) {
        socketAddress.getClass();
        this.a = socketAddress;
    }

    public final void e(InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.c = inetSocketAddress;
    }

    public final khe f() {
        Object obj = this.b;
        if (obj != null) {
            if (this.d != null) {
                if (this.a != null) {
                    if (this.c != null) {
                        if (((Integer) obj).intValue() >= 16) {
                            Integer num = (Integer) this.d;
                            int intValue = num.intValue();
                            Object obj2 = this.a;
                            if (intValue >= 10) {
                                if (obj2 == khc.a) {
                                    if (intValue > 20) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
                                    }
                                } else if (obj2 == khc.b) {
                                    if (intValue > 28) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
                                    }
                                } else if (obj2 == khc.c) {
                                    if (intValue > 32) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
                                    }
                                } else if (obj2 == khc.d) {
                                    if (intValue > 48) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
                                    }
                                } else if (obj2 == khc.e) {
                                    if (intValue > 64) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
                                    }
                                } else {
                                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                                }
                                return new khe(((Integer) this.b).intValue(), ((Integer) this.d).intValue(), (khd) this.c, (khc) this.a);
                            }
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num));
                        }
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.b));
                    }
                    throw new GeneralSecurityException("variant is not set");
                }
                throw new GeneralSecurityException("hash type is not set");
            }
            throw new GeneralSecurityException("tag size is not set");
        }
        throw new GeneralSecurityException("key size is not set");
    }

    public final void g(int i) {
        this.b = Integer.valueOf(i);
    }

    public final void h(int i) {
        this.d = Integer.valueOf(i);
    }

    public final kbd i() {
        Object obj = this.b;
        if (obj != null) {
            if (this.a != null) {
                if (this.c != null) {
                    if (this.d != null) {
                        int intValue = ((Integer) obj).intValue();
                        ((Integer) this.c).intValue();
                        ((Integer) this.d).intValue();
                        return new kbd(intValue, (kbc) this.a);
                    }
                    throw new GeneralSecurityException("Tag size is not set");
                }
                throw new GeneralSecurityException("IV size is not set");
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    public final void j() {
        this.c = 12;
    }

    public final void k(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public final void l() {
        this.d = 16;
    }

    public final kay m() {
        Object obj = this.d;
        if (obj != null) {
            if (this.b != null) {
                if (this.c != null) {
                    if (this.a != null) {
                        int intValue = ((Integer) obj).intValue();
                        int intValue2 = ((Integer) this.b).intValue();
                        ((Integer) this.a).intValue();
                        return new kay(intValue, intValue2, (kax) this.c);
                    }
                    throw new GeneralSecurityException("Tag size is not set");
                }
                throw new GeneralSecurityException("Variant is not set");
            }
            throw new GeneralSecurityException("IV size is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    public final void n(int i) {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public final void o(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.d = Integer.valueOf(i);
    }

    public final void p() {
        this.a = 16;
    }

    public final void r(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void s(String str) {
        q(str, 0);
        this.d = str;
    }

    public final void t(jis jisVar) {
        if (jisVar != null) {
            this.b = jisVar;
            return;
        }
        throw new NullPointerException("Null rangingTechnologiesSet");
    }

    public final void u(jis jisVar) {
        if (jisVar != null) {
            this.a = jisVar;
            return;
        }
        throw new NullPointerException("Null startRangingList");
    }

    public final void v(lim limVar) {
        if (limVar != null) {
            this.c = limVar;
            return;
        }
        throw new NullPointerException("Null vendorData");
    }

    public final void w(hip... hipVarArr) {
        this.a = jis.p(hipVarArr);
    }

    public final hdk x() {
        Object obj;
        Object obj2;
        Object obj3 = this.c;
        if (obj3 != null && (obj = this.d) != null && (obj2 = this.b) != null) {
            return new hdk((hdp) obj3, (hdf) obj, (jer) this.a, (hdi) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" cardIcon");
        }
        if (this.d == null) {
            sb.append(" titleData");
        }
        if (this.b == null) {
            sb.append(" visualElementsInfo");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void y(hdp hdpVar) {
        if (hdpVar != null) {
            this.c = hdpVar;
            return;
        }
        throw new NullPointerException("Null cardIcon");
    }

    public lzt(byte[] bArr, byte[] bArr2) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.a = kbc.c;
    }

    public lzt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = null;
        this.c = null;
        this.b = null;
        this.a = null;
    }

    public lzt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = jdl.a;
    }

    public lzt(char[] cArr) {
        this.b = null;
        this.d = null;
        this.a = null;
        this.c = khd.d;
    }

    public lzt(char[] cArr, byte[] bArr) {
        this.d = null;
        this.b = null;
        this.a = null;
        this.c = kax.c;
    }
}
