package defpackage;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqa implements kpt {
    public static final kpr a;
    public static final kpr b;
    private static final Charset d = Charset.forName("UTF-8");
    private static final kps e;
    public final Map c;
    private OutputStream f;
    private final Map g;
    private final kps h;
    private final kne i = new kne();

    static {
        kub kubVar = new kub("key");
        kubVar.f(new kpv(1, kpy.DEFAULT));
        a = kubVar.e();
        kub kubVar2 = new kub("value");
        kubVar2.f(new kpv(2, kpy.DEFAULT));
        b = kubVar2.e();
        e = new kqb(1);
    }

    public kqa(OutputStream outputStream, Map map, Map map2, kps kpsVar) {
        this.f = outputStream;
        this.c = map;
        this.g = map2;
        this.h = kpsVar;
    }

    private static int g(kpr kprVar) {
        kpz kpzVar = (kpz) kprVar.a(kpz.class);
        if (kpzVar != null) {
            return kpzVar.a();
        }
        throw new kpq("Field has no @Protobuf config");
    }

    private static kpz h(kpr kprVar) {
        kpz kpzVar = (kpz) kprVar.a(kpz.class);
        if (kpzVar != null) {
            return kpzVar;
        }
        throw new kpq("Field has no @Protobuf config");
    }

    private static ByteBuffer i(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void j(int i) {
        while (true) {
            int i2 = i & 127;
            if ((i & (-128)) != 0) {
                this.f.write(i2 | 128);
                i >>>= 7;
            } else {
                this.f.write(i2);
                return;
            }
        }
    }

    private final void k(long j) {
        while (true) {
            int i = ((int) j) & 127;
            if (((-128) & j) != 0) {
                this.f.write(i | 128);
                j >>>= 7;
            } else {
                this.f.write(i);
                return;
            }
        }
    }

    private final void l(kps kpsVar, kpr kprVar, Object obj, boolean z) {
        kpw kpwVar = new kpw();
        try {
            OutputStream outputStream = this.f;
            this.f = kpwVar;
            try {
                kpsVar.a(obj, this);
                this.f = outputStream;
                long j = kpwVar.a;
                kpwVar.close();
                if (z && j == 0) {
                    return;
                }
                j((g(kprVar) << 3) | 2);
                k(j);
                kpsVar.a(obj, this);
            } catch (Throwable th) {
                this.f = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                kpwVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // defpackage.kpt
    public final /* bridge */ /* synthetic */ void a(kpr kprVar, long j) {
        d(kprVar, j, true);
    }

    @Override // defpackage.kpt
    public final void b(kpr kprVar, Object obj) {
        f(kprVar, obj, true);
    }

    final void c(kpr kprVar, int i, boolean z) {
        if (!z || i != 0) {
            kpz h = h(kprVar);
            int ordinal = h.b().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        return;
                    }
                    j((h.a() << 3) | 5);
                    this.f.write(i(4).putInt(i).array());
                    return;
                }
                j(h.a() << 3);
                j((i + i) ^ (i >> 31));
                return;
            }
            j(h.a() << 3);
            j(i);
        }
    }

    final void d(kpr kprVar, long j, boolean z) {
        if (!z || j != 0) {
            kpz h = h(kprVar);
            int ordinal = h.b().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        return;
                    }
                    j((h.a() << 3) | 1);
                    this.f.write(i(8).putLong(j).array());
                    return;
                }
                j(h.a() << 3);
                k((j >> 63) ^ (j + j));
                return;
            }
            j(h.a() << 3);
            k(j);
        }
    }

    public final void e(kpr kprVar, int i) {
        c(kprVar, i, true);
    }

    final void f(kpr kprVar, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    j((g(kprVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(d);
                    j(bytes.length);
                    this.f.write(bytes);
                    return;
                }
                return;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    f(kprVar, it.next(), false);
                }
                return;
            }
            if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    l(e, kprVar, (Map.Entry) it2.next(), false);
                }
                return;
            }
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (!z || doubleValue != 0.0d) {
                    j((g(kprVar) << 3) | 1);
                    this.f.write(i(8).putDouble(doubleValue).array());
                    return;
                }
                return;
            }
            if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z || floatValue != 0.0f) {
                    j((g(kprVar) << 3) | 5);
                    this.f.write(i(4).putFloat(floatValue).array());
                    return;
                }
                return;
            }
            if (obj instanceof Number) {
                d(kprVar, ((Number) obj).longValue(), z);
                return;
            }
            if (obj instanceof Boolean) {
                c(kprVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return;
                }
                j((g(kprVar) << 3) | 2);
                j(bArr.length);
                this.f.write(bArr);
                return;
            }
            kps kpsVar = (kps) this.c.get(obj.getClass());
            if (kpsVar != null) {
                l(kpsVar, kprVar, obj, z);
                return;
            }
            kpu kpuVar = (kpu) this.g.get(obj.getClass());
            if (kpuVar != null) {
                kpuVar.a(obj, this.i);
                return;
            }
            if (obj instanceof kpx) {
                e(kprVar, ((kpx) obj).a());
            } else if (obj instanceof Enum) {
                e(kprVar, ((Enum) obj).ordinal());
            } else {
                l(this.h, kprVar, obj, z);
            }
        }
    }
}
