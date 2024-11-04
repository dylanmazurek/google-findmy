package defpackage;

import android.support.design.widget.R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lkt implements llg {
    public static final int[] a = new int[0];
    public static final Unsafe b = llu.j();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final lkq g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final kzy m;

    public lkt(int[] iArr, Object[] objArr, int i, int i2, lkq lkqVar, int[] iArr2, int i3, int i4, kzy kzyVar, kzv kzvVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = lkqVar instanceof ljn;
        boolean z = false;
        if (kzvVar != null && (lkqVar instanceof ljk)) {
            z = true;
        }
        this.h = z;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = kzyVar;
        this.g = lkqVar;
    }

    private final Object A(int i) {
        int i2 = i / 3;
        return this.d[i2 + i2];
    }

    private final Object B(Object obj, int i) {
        llg z = z(i);
        long w = w(v(i));
        if (!M(obj, i)) {
            return z.e();
        }
        Object object = b.getObject(obj, w);
        if (P(object)) {
            return object;
        }
        Object e = z.e();
        if (object != null) {
            z.h(e, object);
        }
        return e;
    }

    private final Object C(Object obj, int i, int i2) {
        llg z = z(i2);
        if (!Q(obj, i, i2)) {
            return z.e();
        }
        Object object = b.getObject(obj, w(v(i2)));
        if (P(object)) {
            return object;
        }
        Object e = z.e();
        if (object != null) {
            z.h(e, object);
        }
        return e;
    }

    private static void D(Object obj) {
        if (P(obj)) {
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void E(Object obj, Object obj2, int i) {
        if (!M(obj2, i)) {
            return;
        }
        long w = w(v(i));
        Unsafe unsafe = b;
        Object object = unsafe.getObject(obj2, w);
        if (object != null) {
            llg z = z(i);
            if (!M(obj, i)) {
                if (!P(object)) {
                    unsafe.putObject(obj, w, object);
                } else {
                    Object e = z.e();
                    z.h(e, object);
                    unsafe.putObject(obj, w, e);
                }
                G(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, w);
            if (!P(object2)) {
                Object e2 = z.e();
                z.h(e2, object2);
                unsafe.putObject(obj, w, e2);
                object2 = e2;
            }
            z.h(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + p(i) + " is present but null: " + obj2.toString());
    }

    private final void F(Object obj, Object obj2, int i) {
        int p = p(i);
        if (!Q(obj2, p, i)) {
            return;
        }
        long w = w(v(i));
        Unsafe unsafe = b;
        Object object = unsafe.getObject(obj2, w);
        if (object != null) {
            llg z = z(i);
            if (!Q(obj, p, i)) {
                if (!P(object)) {
                    unsafe.putObject(obj, w, object);
                } else {
                    Object e = z.e();
                    z.h(e, object);
                    unsafe.putObject(obj, w, e);
                }
                H(obj, p, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, w);
            if (!P(object2)) {
                Object e2 = z.e();
                z.h(e2, object2);
                unsafe.putObject(obj, w, e2);
                object2 = e2;
            }
            z.h(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + p(i) + " is present but null: " + obj2.toString());
    }

    private final void G(Object obj, int i) {
        int s = s(i);
        long j = 1048575 & s;
        if (j == 1048575) {
            return;
        }
        llu.s(obj, j, (1 << (s >>> 20)) | llu.d(obj, j));
    }

    private final void H(Object obj, int i, int i2) {
        llu.s(obj, s(i2) & 1048575, i);
    }

    private final void I(Object obj, int i, Object obj2) {
        b.putObject(obj, w(v(i)), obj2);
        G(obj, i);
    }

    private final void J(Object obj, int i, int i2, Object obj2) {
        b.putObject(obj, w(v(i2)), obj2);
        H(obj, i, i2);
    }

    private final boolean K(Object obj, Object obj2, int i) {
        if (M(obj, i) == M(obj2, i)) {
            return true;
        }
        return false;
    }

    private static boolean L(int i) {
        if ((i & 536870912) != 0) {
            return true;
        }
        return false;
    }

    private final boolean M(Object obj, int i) {
        int s = s(i);
        long j = 1048575 & s;
        if (j == 1048575) {
            int v = v(i);
            long w = w(v);
            switch (u(v)) {
                case 0:
                    if (Double.doubleToRawLongBits(llu.b(obj, w)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(llu.c(obj, w)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (llu.f(obj, w) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (llu.f(obj, w) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (llu.d(obj, w) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (llu.f(obj, w) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (llu.d(obj, w) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return llu.w(obj, w);
                case 8:
                    Object h = llu.h(obj, w);
                    if (h instanceof String) {
                        if (((String) h).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (h instanceof lim) {
                        if (lim.b.equals(h)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (llu.h(obj, w) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (lim.b.equals(llu.h(obj, w))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (llu.d(obj, w) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (llu.d(obj, w) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (llu.d(obj, w) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (llu.f(obj, w) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (llu.d(obj, w) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (llu.f(obj, w) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (llu.h(obj, w) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((llu.d(obj, j) & (1 << (s >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean N(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return M(obj, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    private static boolean O(Object obj, int i, llg llgVar) {
        return llgVar.k(llu.h(obj, w(i)));
    }

    private static boolean P(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof ljn) {
            return ((ljn) obj).y();
        }
        return true;
    }

    private final boolean Q(Object obj, int i, int i2) {
        if (llu.d(obj, s(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    private static boolean R(Object obj, long j) {
        return ((Boolean) llu.h(obj, j)).booleanValue();
    }

    private final void S(Object obj, int i, lir lirVar) {
        if (L(i)) {
            llu.u(obj, w(i), lirVar.v());
        } else if (this.i) {
            llu.u(obj, w(i), lirVar.u());
        } else {
            llu.u(obj, w(i), lirVar.o());
        }
    }

    private static final int T(byte[] bArr, int i, int i2, llx llxVar, Class cls, lib libVar) {
        int i3;
        boolean z;
        llx llxVar2 = llx.DOUBLE;
        switch (llxVar) {
            case DOUBLE:
                i3 = i + 8;
                libVar.c = Double.valueOf(kzv.p(bArr, i));
                break;
            case FLOAT:
                i3 = i + 4;
                libVar.c = Float.valueOf(kzv.q(bArr, i));
                break;
            case INT64:
            case UINT64:
                int D = kzv.D(bArr, i, libVar);
                libVar.c = Long.valueOf(libVar.b);
                return D;
            case INT32:
            case UINT32:
            case ENUM:
                int A = kzv.A(bArr, i, libVar);
                libVar.c = Integer.valueOf(libVar.a);
                return A;
            case FIXED64:
            case SFIXED64:
                i3 = i + 8;
                libVar.c = Long.valueOf(kzv.H(bArr, i));
                break;
            case FIXED32:
            case SFIXED32:
                i3 = i + 4;
                libVar.c = Integer.valueOf(kzv.s(bArr, i));
                break;
            case BOOL:
                int D2 = kzv.D(bArr, i, libVar);
                if (libVar.b != 0) {
                    z = true;
                } else {
                    z = false;
                }
                libVar.c = Boolean.valueOf(z);
                return D2;
            case STRING:
                return kzv.y(bArr, i, libVar);
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return kzv.u(lkz.a.a(cls), bArr, i, i2, libVar);
            case BYTES:
                return kzv.r(bArr, i, libVar);
            case SINT32:
                int A2 = kzv.A(bArr, i, libVar);
                libVar.c = Integer.valueOf(liq.H(libVar.a));
                return A2;
            case SINT64:
                int D3 = kzv.D(bArr, i, libVar);
                libVar.c = Long.valueOf(liq.I(libVar.b));
                return D3;
        }
        return i3;
    }

    private final Object U(Object obj, int i, Object obj2, Object obj3) {
        int p = p(i);
        Object h = llu.h(obj, w(v(i)));
        if (h == null) {
            return obj2;
        }
        ljq y = y(i);
        if (y == null) {
            return obj2;
        }
        nqe L = kzy.L(A(i));
        Iterator it = ((lkl) h).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!y.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = kzy.E(obj3);
                }
                int L2 = ktd.L(L, entry.getKey(), entry.getValue());
                lim limVar = lim.b;
                byte[] bArr = new byte[L2];
                liv af = liv.af(bArr);
                try {
                    ktd.M(af, L, entry.getKey(), entry.getValue());
                    kzy.A(obj2, p, kzv.o(af, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private static final void V(int i, Object obj, ktd ktdVar) {
        if (obj instanceof String) {
            ktdVar.D(i, (String) obj);
        } else {
            ktdVar.o(i, (lim) obj);
        }
    }

    static llp d(Object obj) {
        ljn ljnVar = (ljn) obj;
        llp llpVar = ljnVar.B;
        if (llpVar == llp.a) {
            llp llpVar2 = new llp();
            ljnVar.B = llpVar2;
            return llpVar2;
        }
        return llpVar;
    }

    public static Field f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static double n(Object obj, long j) {
        return ((Double) llu.h(obj, j)).doubleValue();
    }

    private static float o(Object obj, long j) {
        return ((Float) llu.h(obj, j)).floatValue();
    }

    private final int p(int i) {
        return this.c[i];
    }

    private static int q(Object obj, long j) {
        return ((Integer) llu.h(obj, j)).intValue();
    }

    private final int r(int i) {
        if (i >= this.e && i <= this.f) {
            return t(i, 0);
        }
        return -1;
    }

    private final int s(int i) {
        return this.c[i + 2];
    }

    private final int t(int i, int i2) {
        int length = (this.c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int p = p(i4);
            if (i == p) {
                return i4;
            }
            if (i < p) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int u(int i) {
        return (i >>> 20) & 255;
    }

    private final int v(int i) {
        return this.c[i + 1];
    }

    private static long w(int i) {
        return i & 1048575;
    }

    private static long x(Object obj, long j) {
        return ((Long) llu.h(obj, j)).longValue();
    }

    private final ljq y(int i) {
        int i2 = i / 3;
        return (ljq) this.d[i2 + i2 + 1];
    }

    private final llg z(int i) {
        Object[] objArr = this.d;
        int i2 = i / 3;
        int i3 = i2 + i2;
        llg llgVar = (llg) objArr[i3];
        if (llgVar != null) {
            return llgVar;
        }
        llg a2 = lkz.a.a((Class) objArr[i3 + 1]);
        this.d[i3] = a2;
        return a2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0053. Please report as an issue. */
    @Override // defpackage.llg
    public final int a(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        int as;
        int h;
        int j;
        int size;
        int size2;
        int j2;
        int Y;
        int Y2;
        int X;
        int X2;
        int Y3;
        int R;
        int i5;
        int Y4;
        int aa;
        int i6;
        int i7;
        Unsafe unsafe = b;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < this.c.length) {
            int v = v(i11);
            int u = u(v);
            int p = p(i11);
            int i13 = this.c[i11 + 2];
            int i14 = i13 & i8;
            if (u <= 17) {
                if (i14 != i9) {
                    if (i14 == i8) {
                        i7 = 0;
                    } else {
                        i7 = unsafe.getInt(obj, i14);
                    }
                    i10 = i7;
                    i9 = i14;
                }
                i = i9;
                i2 = i10;
                i3 = 1 << (i13 >>> 20);
            } else {
                i = i9;
                i2 = i10;
                i3 = 0;
            }
            long w = w(v);
            if (u >= lje.DOUBLE_LIST_PACKED.Z) {
                int i15 = lje.SINT64_LIST_PACKED.Z;
            }
            switch (u) {
                case 0:
                    i4 = i11;
                    if (N(obj, i4, i, i2, i3)) {
                        as = liv.as(p);
                        i12 += as;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i4 = i11;
                    if (N(obj, i4, i, i2, i3)) {
                        as = liv.av(p);
                        i12 += as;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    i4 = i11;
                    if (N(obj, i4, i, i2, i3)) {
                        as = liv.M(p, unsafe.getLong(obj, w));
                        i12 += as;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    i4 = i11;
                    if (N(obj, i4, i, i2, i3)) {
                        as = liv.ab(p, unsafe.getLong(obj, w));
                        i12 += as;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    i4 = i11;
                    if (N(obj, i4, i, i2, i3)) {
                        as = liv.K(p, unsafe.getInt(obj, w));
                        i12 += as;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    i4 = i11;
                    if (N(obj, i4, i, i2, i3)) {
                        as = liv.au(p);
                        i12 += as;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    i4 = i11;
                    if (N(obj, i4, i, i2, i3)) {
                        as = liv.at(p);
                        i12 += as;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    i4 = i11;
                    if (N(obj, i4, i, i2, i3)) {
                        as = liv.ar(p);
                        i12 += as;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    int i16 = i11;
                    i4 = i16;
                    if (N(obj, i16, i, i2, i3)) {
                        Object object = unsafe.getObject(obj, w);
                        if (object instanceof lim) {
                            as = liv.G(p, (lim) object);
                        } else {
                            as = liv.W(p, (String) object);
                        }
                        i12 += as;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    i4 = i11;
                    if (N(obj, i4, i, i2, i3)) {
                        as = llh.c(p, unsafe.getObject(obj, w), z(i4));
                        i12 += as;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    i4 = i11;
                    if (N(obj, i4, i, i2, i3)) {
                        as = liv.G(p, (lim) unsafe.getObject(obj, w));
                        i12 += as;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    i4 = i11;
                    if (N(obj, i4, i, i2, i3)) {
                        as = liv.Z(p, unsafe.getInt(obj, w));
                        i12 += as;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    i4 = i11;
                    if (N(obj, i4, i, i2, i3)) {
                        as = liv.I(p, unsafe.getInt(obj, w));
                        i12 += as;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    i4 = i11;
                    if (N(obj, i4, i, i2, i3)) {
                        as = liv.aw(p);
                        i12 += as;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    i4 = i11;
                    if (N(obj, i4, i, i2, i3)) {
                        as = liv.ax(p);
                        i12 += as;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    i4 = i11;
                    if (N(obj, i4, i, i2, i3)) {
                        as = liv.S(p, unsafe.getInt(obj, w));
                        i12 += as;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int i17 = i11;
                    i4 = i17;
                    if (N(obj, i17, i, i2, i3)) {
                        as = liv.U(p, unsafe.getLong(obj, w));
                        i12 += as;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    i4 = i11;
                    if (N(obj, i11, i, i2, i3)) {
                        as = liv.J(p, (lkq) unsafe.getObject(obj, w), z(i4));
                        i12 += as;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    h = llh.h(p, (List) unsafe.getObject(obj, w));
                    i12 += h;
                    i4 = i11;
                    break;
                case 19:
                    h = llh.g(p, (List) unsafe.getObject(obj, w));
                    i12 += h;
                    i4 = i11;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, w);
                    kzy kzyVar = llh.a;
                    if (list.size() != 0) {
                        j = llh.j(list);
                        size = list.size() * liv.Y(p);
                        i5 = j + size;
                        i12 += i5;
                        i4 = i11;
                        break;
                    }
                    i5 = 0;
                    i12 += i5;
                    i4 = i11;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, w);
                    kzy kzyVar2 = llh.a;
                    size2 = list2.size();
                    if (size2 != 0) {
                        j2 = llh.j(list2);
                        Y = liv.Y(p);
                        h = j2 + (size2 * Y);
                        i12 += h;
                        i4 = i11;
                        break;
                    }
                    h = 0;
                    i12 += h;
                    i4 = i11;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, w);
                    kzy kzyVar3 = llh.a;
                    size2 = list3.size();
                    if (size2 != 0) {
                        j2 = llh.i(list3);
                        Y = liv.Y(p);
                        h = j2 + (size2 * Y);
                        i12 += h;
                        i4 = i11;
                        break;
                    }
                    h = 0;
                    i12 += h;
                    i4 = i11;
                case 23:
                    h = llh.h(p, (List) unsafe.getObject(obj, w));
                    i12 += h;
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_cursorColor /* 24 */:
                    h = llh.g(p, (List) unsafe.getObject(obj, w));
                    i12 += h;
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_cursorErrorColor /* 25 */:
                    List list4 = (List) unsafe.getObject(obj, w);
                    kzy kzyVar4 = llh.a;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        h = size3 * liv.ar(p);
                        i12 += h;
                        i4 = i11;
                        break;
                    }
                    h = 0;
                    i12 += h;
                    i4 = i11;
                case R.styleable.TextInputLayout_endIconCheckable /* 26 */:
                    List list5 = (List) unsafe.getObject(obj, w);
                    kzy kzyVar5 = llh.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        Y2 = liv.Y(p) * size4;
                        if (list5 instanceof lkf) {
                            lkf lkfVar = (lkf) list5;
                            for (int i18 = 0; i18 < size4; i18++) {
                                Object c = lkfVar.c();
                                if (c instanceof lim) {
                                    X2 = liv.H((lim) c);
                                } else {
                                    X2 = liv.X((String) c);
                                }
                                Y2 += X2;
                            }
                        } else {
                            for (int i19 = 0; i19 < size4; i19++) {
                                Object obj2 = list5.get(i19);
                                if (obj2 instanceof lim) {
                                    X = liv.H((lim) obj2);
                                } else {
                                    X = liv.X((String) obj2);
                                }
                                Y2 += X;
                            }
                        }
                        i12 += Y2;
                        i4 = i11;
                        break;
                    }
                    Y2 = 0;
                    i12 += Y2;
                    i4 = i11;
                case R.styleable.TextInputLayout_endIconContentDescription /* 27 */:
                    List list6 = (List) unsafe.getObject(obj, w);
                    llg z = z(i11);
                    kzy kzyVar6 = llh.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        Y3 = 0;
                    } else {
                        Y3 = liv.Y(p) * size5;
                        for (int i20 = 0; i20 < size5; i20++) {
                            Object obj3 = list6.get(i20);
                            if (obj3 instanceof lke) {
                                R = liv.O((lke) obj3);
                            } else {
                                R = liv.R((lkq) obj3, z);
                            }
                            Y3 += R;
                        }
                    }
                    i12 += Y3;
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_endIconDrawable /* 28 */:
                    List list7 = (List) unsafe.getObject(obj, w);
                    kzy kzyVar7 = llh.a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        i5 = size6 * liv.Y(p);
                        for (int i21 = 0; i21 < list7.size(); i21++) {
                            i5 += liv.H((lim) list7.get(i21));
                        }
                        i12 += i5;
                        i4 = i11;
                        break;
                    }
                    i5 = 0;
                    i12 += i5;
                    i4 = i11;
                case R.styleable.TextInputLayout_endIconMinSize /* 29 */:
                    List list8 = (List) unsafe.getObject(obj, w);
                    kzy kzyVar8 = llh.a;
                    size2 = list8.size();
                    if (size2 != 0) {
                        j2 = llh.f(list8);
                        Y = liv.Y(p);
                        h = j2 + (size2 * Y);
                        i12 += h;
                        i4 = i11;
                        break;
                    }
                    h = 0;
                    i12 += h;
                    i4 = i11;
                case R.styleable.TextInputLayout_endIconMode /* 30 */:
                    List list9 = (List) unsafe.getObject(obj, w);
                    kzy kzyVar9 = llh.a;
                    size2 = list9.size();
                    if (size2 != 0) {
                        j2 = llh.i(list9);
                        Y = liv.Y(p);
                        h = j2 + (size2 * Y);
                        i12 += h;
                        i4 = i11;
                        break;
                    }
                    h = 0;
                    i12 += h;
                    i4 = i11;
                case R.styleable.TextInputLayout_endIconScaleType /* 31 */:
                    h = llh.g(p, (List) unsafe.getObject(obj, w));
                    i12 += h;
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_endIconTint /* 32 */:
                    h = llh.h(p, (List) unsafe.getObject(obj, w));
                    i12 += h;
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_endIconTintMode /* 33 */:
                    List list10 = (List) unsafe.getObject(obj, w);
                    kzy kzyVar10 = llh.a;
                    size2 = list10.size();
                    if (size2 != 0) {
                        j2 = llh.d(list10);
                        Y = liv.Y(p);
                        h = j2 + (size2 * Y);
                        i12 += h;
                        i4 = i11;
                        break;
                    }
                    h = 0;
                    i12 += h;
                    i4 = i11;
                case R.styleable.TextInputLayout_errorAccessibilityLiveRegion /* 34 */:
                    List list11 = (List) unsafe.getObject(obj, w);
                    kzy kzyVar11 = llh.a;
                    size2 = list11.size();
                    if (size2 != 0) {
                        j2 = llh.e(list11);
                        Y = liv.Y(p);
                        h = j2 + (size2 * Y);
                        i12 += h;
                        i4 = i11;
                        break;
                    }
                    h = 0;
                    i12 += h;
                    i4 = i11;
                case 35:
                    size = llh.b((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Y4 = liv.Y(p);
                        aa = liv.aa(size);
                        j = Y4 + aa;
                        i5 = j + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_errorEnabled /* 36 */:
                    size = llh.a((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Y4 = liv.Y(p);
                        aa = liv.aa(size);
                        j = Y4 + aa;
                        i5 = j + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_errorIconDrawable /* 37 */:
                    size = llh.j((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Y4 = liv.Y(p);
                        aa = liv.aa(size);
                        j = Y4 + aa;
                        i5 = j + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_errorIconTint /* 38 */:
                    size = llh.j((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Y4 = liv.Y(p);
                        aa = liv.aa(size);
                        j = Y4 + aa;
                        i5 = j + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_errorIconTintMode /* 39 */:
                    size = llh.i((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Y4 = liv.Y(p);
                        aa = liv.aa(size);
                        j = Y4 + aa;
                        i5 = j + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_errorTextAppearance /* 40 */:
                    size = llh.b((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Y4 = liv.Y(p);
                        aa = liv.aa(size);
                        j = Y4 + aa;
                        i5 = j + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_errorTextColor /* 41 */:
                    size = llh.a((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Y4 = liv.Y(p);
                        aa = liv.aa(size);
                        j = Y4 + aa;
                        i5 = j + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_expandedHintEnabled /* 42 */:
                    List list12 = (List) unsafe.getObject(obj, w);
                    kzy kzyVar12 = llh.a;
                    size = list12.size();
                    if (size > 0) {
                        Y4 = liv.Y(p);
                        aa = liv.aa(size);
                        j = Y4 + aa;
                        i5 = j + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_helperText /* 43 */:
                    size = llh.f((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Y4 = liv.Y(p);
                        aa = liv.aa(size);
                        j = Y4 + aa;
                        i5 = j + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_helperTextEnabled /* 44 */:
                    size = llh.i((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Y4 = liv.Y(p);
                        aa = liv.aa(size);
                        j = Y4 + aa;
                        i5 = j + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_helperTextTextAppearance /* 45 */:
                    size = llh.a((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Y4 = liv.Y(p);
                        aa = liv.aa(size);
                        j = Y4 + aa;
                        i5 = j + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_helperTextTextColor /* 46 */:
                    size = llh.b((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Y4 = liv.Y(p);
                        aa = liv.aa(size);
                        j = Y4 + aa;
                        i5 = j + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_hintAnimationEnabled /* 47 */:
                    size = llh.d((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Y4 = liv.Y(p);
                        aa = liv.aa(size);
                        j = Y4 + aa;
                        i5 = j + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_hintEnabled /* 48 */:
                    size = llh.e((List) unsafe.getObject(obj, w));
                    if (size > 0) {
                        Y4 = liv.Y(p);
                        aa = liv.aa(size);
                        j = Y4 + aa;
                        i5 = j + size;
                        i12 += i5;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_hintTextAppearance /* 49 */:
                    List list13 = (List) unsafe.getObject(obj, w);
                    llg z2 = z(i11);
                    kzy kzyVar13 = llh.a;
                    int size7 = list13.size();
                    if (size7 == 0) {
                        i6 = 0;
                    } else {
                        i6 = 0;
                        for (int i22 = 0; i22 < size7; i22++) {
                            i6 += liv.J(p, (lkq) list13.get(i22), z2);
                        }
                    }
                    i12 += i6;
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_hintTextColor /* 50 */:
                    lkl lklVar = (lkl) unsafe.getObject(obj, w);
                    ktd ktdVar = (ktd) A(i11);
                    if (!lklVar.isEmpty()) {
                        Y2 = 0;
                        for (Map.Entry entry : lklVar.entrySet()) {
                            Y2 += liv.Y(p) + liv.P(ktd.L((nqe) ktdVar.a, entry.getKey(), entry.getValue()));
                        }
                        i12 += Y2;
                        i4 = i11;
                        break;
                    }
                    Y2 = 0;
                    i12 += Y2;
                    i4 = i11;
                case R.styleable.TextInputLayout_passwordToggleContentDescription /* 51 */:
                    if (Q(obj, p, i11)) {
                        h = liv.as(p);
                        i12 += h;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_passwordToggleDrawable /* 52 */:
                    if (Q(obj, p, i11)) {
                        h = liv.av(p);
                        i12 += h;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_passwordToggleEnabled /* 53 */:
                    if (Q(obj, p, i11)) {
                        h = liv.M(p, x(obj, w));
                        i12 += h;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_passwordToggleTint /* 54 */:
                    if (Q(obj, p, i11)) {
                        h = liv.ab(p, x(obj, w));
                        i12 += h;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_passwordToggleTintMode /* 55 */:
                    if (Q(obj, p, i11)) {
                        h = liv.K(p, q(obj, w));
                        i12 += h;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_placeholderText /* 56 */:
                    if (Q(obj, p, i11)) {
                        h = liv.au(p);
                        i12 += h;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_placeholderTextAppearance /* 57 */:
                    if (Q(obj, p, i11)) {
                        h = liv.at(p);
                        i12 += h;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_placeholderTextColor /* 58 */:
                    if (Q(obj, p, i11)) {
                        h = liv.ar(p);
                        i12 += h;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_prefixText /* 59 */:
                    if (Q(obj, p, i11)) {
                        Object object2 = unsafe.getObject(obj, w);
                        if (object2 instanceof lim) {
                            h = liv.G(p, (lim) object2);
                        } else {
                            h = liv.W(p, (String) object2);
                        }
                        i12 += h;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_prefixTextAppearance /* 60 */:
                    if (Q(obj, p, i11)) {
                        h = llh.c(p, unsafe.getObject(obj, w), z(i11));
                        i12 += h;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_prefixTextColor /* 61 */:
                    if (Q(obj, p, i11)) {
                        h = liv.G(p, (lim) unsafe.getObject(obj, w));
                        i12 += h;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_shapeAppearance /* 62 */:
                    if (Q(obj, p, i11)) {
                        h = liv.Z(p, q(obj, w));
                        i12 += h;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_shapeAppearanceOverlay /* 63 */:
                    if (Q(obj, p, i11)) {
                        h = liv.I(p, q(obj, w));
                        i12 += h;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_startIconCheckable /* 64 */:
                    if (Q(obj, p, i11)) {
                        h = liv.aw(p);
                        i12 += h;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_startIconContentDescription /* 65 */:
                    if (Q(obj, p, i11)) {
                        h = liv.ax(p);
                        i12 += h;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_startIconDrawable /* 66 */:
                    if (Q(obj, p, i11)) {
                        h = liv.S(p, q(obj, w));
                        i12 += h;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_startIconMinSize /* 67 */:
                    if (Q(obj, p, i11)) {
                        h = liv.U(p, x(obj, w));
                        i12 += h;
                    }
                    i4 = i11;
                    break;
                case R.styleable.TextInputLayout_startIconScaleType /* 68 */:
                    if (Q(obj, p, i11)) {
                        h = liv.J(p, (lkq) unsafe.getObject(obj, w), z(i11));
                        i12 += h;
                    }
                    i4 = i11;
                    break;
                default:
                    i4 = i11;
                    break;
            }
            i11 = i4 + 3;
            i9 = i;
            i10 = i2;
            i8 = 1048575;
        }
        int a2 = i12 + kzy.C(obj).a();
        if (this.h) {
            ljd k = kzv.k(obj);
            int i23 = 0;
            for (int i24 = 0; i24 < k.b.a(); i24++) {
                Map.Entry e = k.b.e(i24);
                i23 += ljd.j((ljm) e.getKey(), e.getValue());
            }
            for (Map.Entry entry2 : k.b.b()) {
                i23 += ljd.j((ljm) entry2.getKey(), entry2.getValue());
            }
            return a2 + i23;
        }
        return a2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    @Override // defpackage.llg
    public final int b(Object obj) {
        int i;
        int l;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.c.length; i4 += 3) {
            int v = v(i4);
            int p = p(i4);
            long w = w(v);
            int i5 = 37;
            switch (u(v)) {
                case 0:
                    i = i3 * 53;
                    l = a.l(Double.doubleToLongBits(llu.b(obj, w)));
                    i3 = i + l;
                    break;
                case 1:
                    i = i3 * 53;
                    l = Float.floatToIntBits(llu.c(obj, w));
                    i3 = i + l;
                    break;
                case 2:
                    i = i3 * 53;
                    l = a.l(llu.f(obj, w));
                    i3 = i + l;
                    break;
                case 3:
                    i = i3 * 53;
                    l = a.l(llu.f(obj, w));
                    i3 = i + l;
                    break;
                case 4:
                    i = i3 * 53;
                    l = llu.d(obj, w);
                    i3 = i + l;
                    break;
                case 5:
                    i = i3 * 53;
                    l = a.l(llu.f(obj, w));
                    i3 = i + l;
                    break;
                case 6:
                    i = i3 * 53;
                    l = llu.d(obj, w);
                    i3 = i + l;
                    break;
                case 7:
                    i = i3 * 53;
                    l = a.i(llu.w(obj, w));
                    i3 = i + l;
                    break;
                case 8:
                    i = i3 * 53;
                    l = ((String) llu.h(obj, w)).hashCode();
                    i3 = i + l;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object h = llu.h(obj, w);
                    if (h != null) {
                        i5 = h.hashCode();
                    }
                    i3 = i2 + i5;
                    break;
                case 10:
                    i = i3 * 53;
                    l = llu.h(obj, w).hashCode();
                    i3 = i + l;
                    break;
                case 11:
                    i = i3 * 53;
                    l = llu.d(obj, w);
                    i3 = i + l;
                    break;
                case 12:
                    i = i3 * 53;
                    l = llu.d(obj, w);
                    i3 = i + l;
                    break;
                case 13:
                    i = i3 * 53;
                    l = llu.d(obj, w);
                    i3 = i + l;
                    break;
                case 14:
                    i = i3 * 53;
                    l = a.l(llu.f(obj, w));
                    i3 = i + l;
                    break;
                case 15:
                    i = i3 * 53;
                    l = llu.d(obj, w);
                    i3 = i + l;
                    break;
                case 16:
                    i = i3 * 53;
                    l = a.l(llu.f(obj, w));
                    i3 = i + l;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object h2 = llu.h(obj, w);
                    if (h2 != null) {
                        i5 = h2.hashCode();
                    }
                    i3 = i2 + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case R.styleable.TextInputLayout_cursorColor /* 24 */:
                case R.styleable.TextInputLayout_cursorErrorColor /* 25 */:
                case R.styleable.TextInputLayout_endIconCheckable /* 26 */:
                case R.styleable.TextInputLayout_endIconContentDescription /* 27 */:
                case R.styleable.TextInputLayout_endIconDrawable /* 28 */:
                case R.styleable.TextInputLayout_endIconMinSize /* 29 */:
                case R.styleable.TextInputLayout_endIconMode /* 30 */:
                case R.styleable.TextInputLayout_endIconScaleType /* 31 */:
                case R.styleable.TextInputLayout_endIconTint /* 32 */:
                case R.styleable.TextInputLayout_endIconTintMode /* 33 */:
                case R.styleable.TextInputLayout_errorAccessibilityLiveRegion /* 34 */:
                case 35:
                case R.styleable.TextInputLayout_errorEnabled /* 36 */:
                case R.styleable.TextInputLayout_errorIconDrawable /* 37 */:
                case R.styleable.TextInputLayout_errorIconTint /* 38 */:
                case R.styleable.TextInputLayout_errorIconTintMode /* 39 */:
                case R.styleable.TextInputLayout_errorTextAppearance /* 40 */:
                case R.styleable.TextInputLayout_errorTextColor /* 41 */:
                case R.styleable.TextInputLayout_expandedHintEnabled /* 42 */:
                case R.styleable.TextInputLayout_helperText /* 43 */:
                case R.styleable.TextInputLayout_helperTextEnabled /* 44 */:
                case R.styleable.TextInputLayout_helperTextTextAppearance /* 45 */:
                case R.styleable.TextInputLayout_helperTextTextColor /* 46 */:
                case R.styleable.TextInputLayout_hintAnimationEnabled /* 47 */:
                case R.styleable.TextInputLayout_hintEnabled /* 48 */:
                case R.styleable.TextInputLayout_hintTextAppearance /* 49 */:
                    i = i3 * 53;
                    l = llu.h(obj, w).hashCode();
                    i3 = i + l;
                    break;
                case R.styleable.TextInputLayout_hintTextColor /* 50 */:
                    i = i3 * 53;
                    l = llu.h(obj, w).hashCode();
                    i3 = i + l;
                    break;
                case R.styleable.TextInputLayout_passwordToggleContentDescription /* 51 */:
                    if (Q(obj, p, i4)) {
                        i = i3 * 53;
                        l = a.l(Double.doubleToLongBits(n(obj, w)));
                        i3 = i + l;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.TextInputLayout_passwordToggleDrawable /* 52 */:
                    if (Q(obj, p, i4)) {
                        i = i3 * 53;
                        l = Float.floatToIntBits(o(obj, w));
                        i3 = i + l;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.TextInputLayout_passwordToggleEnabled /* 53 */:
                    if (Q(obj, p, i4)) {
                        i = i3 * 53;
                        l = a.l(x(obj, w));
                        i3 = i + l;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.TextInputLayout_passwordToggleTint /* 54 */:
                    if (Q(obj, p, i4)) {
                        i = i3 * 53;
                        l = a.l(x(obj, w));
                        i3 = i + l;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.TextInputLayout_passwordToggleTintMode /* 55 */:
                    if (Q(obj, p, i4)) {
                        i = i3 * 53;
                        l = q(obj, w);
                        i3 = i + l;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.TextInputLayout_placeholderText /* 56 */:
                    if (Q(obj, p, i4)) {
                        i = i3 * 53;
                        l = a.l(x(obj, w));
                        i3 = i + l;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.TextInputLayout_placeholderTextAppearance /* 57 */:
                    if (Q(obj, p, i4)) {
                        i = i3 * 53;
                        l = q(obj, w);
                        i3 = i + l;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.TextInputLayout_placeholderTextColor /* 58 */:
                    if (Q(obj, p, i4)) {
                        i = i3 * 53;
                        l = a.i(R(obj, w));
                        i3 = i + l;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.TextInputLayout_prefixText /* 59 */:
                    if (Q(obj, p, i4)) {
                        i = i3 * 53;
                        l = ((String) llu.h(obj, w)).hashCode();
                        i3 = i + l;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.TextInputLayout_prefixTextAppearance /* 60 */:
                    if (Q(obj, p, i4)) {
                        i = i3 * 53;
                        l = llu.h(obj, w).hashCode();
                        i3 = i + l;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.TextInputLayout_prefixTextColor /* 61 */:
                    if (Q(obj, p, i4)) {
                        i = i3 * 53;
                        l = llu.h(obj, w).hashCode();
                        i3 = i + l;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.TextInputLayout_shapeAppearance /* 62 */:
                    if (Q(obj, p, i4)) {
                        i = i3 * 53;
                        l = q(obj, w);
                        i3 = i + l;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.TextInputLayout_shapeAppearanceOverlay /* 63 */:
                    if (Q(obj, p, i4)) {
                        i = i3 * 53;
                        l = q(obj, w);
                        i3 = i + l;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.TextInputLayout_startIconCheckable /* 64 */:
                    if (Q(obj, p, i4)) {
                        i = i3 * 53;
                        l = q(obj, w);
                        i3 = i + l;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.TextInputLayout_startIconContentDescription /* 65 */:
                    if (Q(obj, p, i4)) {
                        i = i3 * 53;
                        l = a.l(x(obj, w));
                        i3 = i + l;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.TextInputLayout_startIconDrawable /* 66 */:
                    if (Q(obj, p, i4)) {
                        i = i3 * 53;
                        l = q(obj, w);
                        i3 = i + l;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.TextInputLayout_startIconMinSize /* 67 */:
                    if (Q(obj, p, i4)) {
                        i = i3 * 53;
                        l = a.l(x(obj, w));
                        i3 = i + l;
                        break;
                    } else {
                        break;
                    }
                case R.styleable.TextInputLayout_startIconScaleType /* 68 */:
                    if (Q(obj, p, i4)) {
                        i = i3 * 53;
                        l = llu.h(obj, w).hashCode();
                        i3 = i + l;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i3 * 53) + kzy.C(obj).hashCode();
        if (this.h) {
            return (hashCode * 53) + kzv.k(obj).hashCode();
        }
        return hashCode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0a02, code lost:            throw new defpackage.ljy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0eb7, code lost:            if (r6 == 1048575) goto L571;     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0eb9, code lost:            r34.putInt(r7, r6, r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0ebf, code lost:            r0 = r8.k;        r2 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0ec5, code lost:            if (r0 >= r8.l) goto L685;     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0ec7, code lost:            r2 = r8.U(r7, r8.j[r0], r2, r7);        r0 = r0 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0ed2, code lost:            if (r2 == null) goto L577;     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0ed4, code lost:            defpackage.kzy.D(r7, (defpackage.llp) r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0ed9, code lost:            if (r9 != 0) goto L583;     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0edd, code lost:            if (r1 != r41) goto L581;     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0ee7, code lost:            throw new defpackage.ljy(r35);     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0ef0, code lost:            return r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0ee8, code lost:            r2 = r35;     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0eec, code lost:            if (r1 > r41) goto L587;     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0eee, code lost:            if (r4 != r9) goto L587;     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0ef6, code lost:            throw new defpackage.ljy(r2);     */
    /* JADX WARN: Failed to find 'out' block for switch in B:111:0x0d35. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:157:0x0a31. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:244:0x03af. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:601:0x00ae. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0cca  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0cd8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x08d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x08e6 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v172, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, defpackage.lib r43) {
        /*
            Method dump skipped, instructions count: 4016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lkt.c(java.lang.Object, byte[], int, int, int, lib):int");
    }

    @Override // defpackage.llg
    public final Object e() {
        return ((ljn) this.g).l();
    }

    @Override // defpackage.llg
    public final void g(Object obj) {
        if (P(obj)) {
            if (obj instanceof ljn) {
                ljn ljnVar = (ljn) obj;
                ljnVar.A = (ljnVar.A & Integer.MIN_VALUE) | Integer.MAX_VALUE;
                ljnVar.y = 0;
                ljnVar.v();
            }
            int[] iArr = this.c;
            for (int i = 0; i < iArr.length; i += 3) {
                int v = v(i);
                long w = w(v);
                int u = u(v);
                if (u != 9) {
                    if (u != 60 && u != 68) {
                        switch (u) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case R.styleable.TextInputLayout_cursorColor /* 24 */:
                            case R.styleable.TextInputLayout_cursorErrorColor /* 25 */:
                            case R.styleable.TextInputLayout_endIconCheckable /* 26 */:
                            case R.styleable.TextInputLayout_endIconContentDescription /* 27 */:
                            case R.styleable.TextInputLayout_endIconDrawable /* 28 */:
                            case R.styleable.TextInputLayout_endIconMinSize /* 29 */:
                            case R.styleable.TextInputLayout_endIconMode /* 30 */:
                            case R.styleable.TextInputLayout_endIconScaleType /* 31 */:
                            case R.styleable.TextInputLayout_endIconTint /* 32 */:
                            case R.styleable.TextInputLayout_endIconTintMode /* 33 */:
                            case R.styleable.TextInputLayout_errorAccessibilityLiveRegion /* 34 */:
                            case 35:
                            case R.styleable.TextInputLayout_errorEnabled /* 36 */:
                            case R.styleable.TextInputLayout_errorIconDrawable /* 37 */:
                            case R.styleable.TextInputLayout_errorIconTint /* 38 */:
                            case R.styleable.TextInputLayout_errorIconTintMode /* 39 */:
                            case R.styleable.TextInputLayout_errorTextAppearance /* 40 */:
                            case R.styleable.TextInputLayout_errorTextColor /* 41 */:
                            case R.styleable.TextInputLayout_expandedHintEnabled /* 42 */:
                            case R.styleable.TextInputLayout_helperText /* 43 */:
                            case R.styleable.TextInputLayout_helperTextEnabled /* 44 */:
                            case R.styleable.TextInputLayout_helperTextTextAppearance /* 45 */:
                            case R.styleable.TextInputLayout_helperTextTextColor /* 46 */:
                            case R.styleable.TextInputLayout_hintAnimationEnabled /* 47 */:
                            case R.styleable.TextInputLayout_hintEnabled /* 48 */:
                            case R.styleable.TextInputLayout_hintTextAppearance /* 49 */:
                                kzv.i(obj, w).b();
                                break;
                            case R.styleable.TextInputLayout_hintTextColor /* 50 */:
                                Unsafe unsafe = b;
                                Object object = unsafe.getObject(obj, w);
                                if (object != null) {
                                    ((lkl) object).c();
                                    unsafe.putObject(obj, w, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (Q(obj, p(i), i)) {
                        z(i).g(b.getObject(obj, w));
                    }
                }
                if (M(obj, i)) {
                    z(i).g(b.getObject(obj, w));
                }
            }
            kzy.F(obj);
            if (this.h) {
                kzv.n(obj);
            }
        }
    }

    @Override // defpackage.llg
    public final void h(Object obj, Object obj2) {
        D(obj);
        obj2.getClass();
        for (int i = 0; i < this.c.length; i += 3) {
            int v = v(i);
            long w = w(v);
            int p = p(i);
            switch (u(v)) {
                case 0:
                    if (M(obj2, i)) {
                        llu.q(obj, w, llu.b(obj2, w));
                        G(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (M(obj2, i)) {
                        llu.r(obj, w, llu.c(obj2, w));
                        G(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (M(obj2, i)) {
                        llu.t(obj, w, llu.f(obj2, w));
                        G(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (M(obj2, i)) {
                        llu.t(obj, w, llu.f(obj2, w));
                        G(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (M(obj2, i)) {
                        llu.s(obj, w, llu.d(obj2, w));
                        G(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (M(obj2, i)) {
                        llu.t(obj, w, llu.f(obj2, w));
                        G(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (M(obj2, i)) {
                        llu.s(obj, w, llu.d(obj2, w));
                        G(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (M(obj2, i)) {
                        llu.m(obj, w, llu.w(obj2, w));
                        G(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (M(obj2, i)) {
                        llu.u(obj, w, llu.h(obj2, w));
                        G(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    E(obj, obj2, i);
                    break;
                case 10:
                    if (M(obj2, i)) {
                        llu.u(obj, w, llu.h(obj2, w));
                        G(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (M(obj2, i)) {
                        llu.s(obj, w, llu.d(obj2, w));
                        G(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (M(obj2, i)) {
                        llu.s(obj, w, llu.d(obj2, w));
                        G(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (M(obj2, i)) {
                        llu.s(obj, w, llu.d(obj2, w));
                        G(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (M(obj2, i)) {
                        llu.t(obj, w, llu.f(obj2, w));
                        G(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (M(obj2, i)) {
                        llu.s(obj, w, llu.d(obj2, w));
                        G(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (M(obj2, i)) {
                        llu.t(obj, w, llu.f(obj2, w));
                        G(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    E(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case R.styleable.TextInputLayout_cursorColor /* 24 */:
                case R.styleable.TextInputLayout_cursorErrorColor /* 25 */:
                case R.styleable.TextInputLayout_endIconCheckable /* 26 */:
                case R.styleable.TextInputLayout_endIconContentDescription /* 27 */:
                case R.styleable.TextInputLayout_endIconDrawable /* 28 */:
                case R.styleable.TextInputLayout_endIconMinSize /* 29 */:
                case R.styleable.TextInputLayout_endIconMode /* 30 */:
                case R.styleable.TextInputLayout_endIconScaleType /* 31 */:
                case R.styleable.TextInputLayout_endIconTint /* 32 */:
                case R.styleable.TextInputLayout_endIconTintMode /* 33 */:
                case R.styleable.TextInputLayout_errorAccessibilityLiveRegion /* 34 */:
                case 35:
                case R.styleable.TextInputLayout_errorEnabled /* 36 */:
                case R.styleable.TextInputLayout_errorIconDrawable /* 37 */:
                case R.styleable.TextInputLayout_errorIconTint /* 38 */:
                case R.styleable.TextInputLayout_errorIconTintMode /* 39 */:
                case R.styleable.TextInputLayout_errorTextAppearance /* 40 */:
                case R.styleable.TextInputLayout_errorTextColor /* 41 */:
                case R.styleable.TextInputLayout_expandedHintEnabled /* 42 */:
                case R.styleable.TextInputLayout_helperText /* 43 */:
                case R.styleable.TextInputLayout_helperTextEnabled /* 44 */:
                case R.styleable.TextInputLayout_helperTextTextAppearance /* 45 */:
                case R.styleable.TextInputLayout_helperTextTextColor /* 46 */:
                case R.styleable.TextInputLayout_hintAnimationEnabled /* 47 */:
                case R.styleable.TextInputLayout_hintEnabled /* 48 */:
                case R.styleable.TextInputLayout_hintTextAppearance /* 49 */:
                    ljv i2 = kzv.i(obj, w);
                    ljv i3 = kzv.i(obj2, w);
                    int size = i2.size();
                    int size2 = i3.size();
                    if (size > 0 && size2 > 0) {
                        if (!i2.c()) {
                            i2 = i2.d(size2 + size);
                        }
                        i2.addAll(i3);
                    }
                    if (size > 0) {
                        i3 = i2;
                    }
                    llu.u(obj, w, i3);
                    break;
                case R.styleable.TextInputLayout_hintTextColor /* 50 */:
                    kzy kzyVar = llh.a;
                    llu.u(obj, w, kzy.J(llu.h(obj, w), llu.h(obj2, w)));
                    break;
                case R.styleable.TextInputLayout_passwordToggleContentDescription /* 51 */:
                case R.styleable.TextInputLayout_passwordToggleDrawable /* 52 */:
                case R.styleable.TextInputLayout_passwordToggleEnabled /* 53 */:
                case R.styleable.TextInputLayout_passwordToggleTint /* 54 */:
                case R.styleable.TextInputLayout_passwordToggleTintMode /* 55 */:
                case R.styleable.TextInputLayout_placeholderText /* 56 */:
                case R.styleable.TextInputLayout_placeholderTextAppearance /* 57 */:
                case R.styleable.TextInputLayout_placeholderTextColor /* 58 */:
                case R.styleable.TextInputLayout_prefixText /* 59 */:
                    if (Q(obj2, p, i)) {
                        llu.u(obj, w, llu.h(obj2, w));
                        H(obj, p, i);
                        break;
                    } else {
                        break;
                    }
                case R.styleable.TextInputLayout_prefixTextAppearance /* 60 */:
                    F(obj, obj2, i);
                    break;
                case R.styleable.TextInputLayout_prefixTextColor /* 61 */:
                case R.styleable.TextInputLayout_shapeAppearance /* 62 */:
                case R.styleable.TextInputLayout_shapeAppearanceOverlay /* 63 */:
                case R.styleable.TextInputLayout_startIconCheckable /* 64 */:
                case R.styleable.TextInputLayout_startIconContentDescription /* 65 */:
                case R.styleable.TextInputLayout_startIconDrawable /* 66 */:
                case R.styleable.TextInputLayout_startIconMinSize /* 67 */:
                    if (Q(obj2, p, i)) {
                        llu.u(obj, w, llu.h(obj2, w));
                        H(obj, p, i);
                        break;
                    } else {
                        break;
                    }
                case R.styleable.TextInputLayout_startIconScaleType /* 68 */:
                    F(obj, obj2, i);
                    break;
            }
        }
        llh.l(obj, obj2);
        if (this.h) {
            llh.k(obj, obj2);
        }
    }

    @Override // defpackage.llg
    public final void i(Object obj, byte[] bArr, int i, int i2, lib libVar) {
        c(obj, bArr, i, i2, 0, libVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c4 A[SYNTHETIC] */
    @Override // defpackage.llg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lkt.j(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // defpackage.llg
    public final boolean k(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.k) {
            int i6 = this.j[i5];
            int p = p(i6);
            int v = v(i6);
            int i7 = this.c[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = b.getInt(obj, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & v) != 0 && !N(obj, i6, i, i2, i9)) {
                return false;
            }
            int u = u(v);
            if (u != 9 && u != 17) {
                if (u != 27) {
                    if (u != 60 && u != 68) {
                        if (u != 49) {
                            if (u != 50) {
                                continue;
                            } else {
                                lkl lklVar = (lkl) llu.h(obj, w(v));
                                if (!lklVar.isEmpty() && ((llx) kzy.L(A(i6)).d).s == lly.MESSAGE) {
                                    llg llgVar = null;
                                    for (Object obj2 : lklVar.values()) {
                                        if (llgVar == null) {
                                            llgVar = lkz.a.a(obj2.getClass());
                                        }
                                        if (!llgVar.k(obj2)) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (Q(obj, p, i6) && !O(obj, v, z(i6))) {
                        return false;
                    }
                }
                List list = (List) llu.h(obj, w(v));
                if (list.isEmpty()) {
                    continue;
                } else {
                    llg z = z(i6);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!z.k(list.get(i10))) {
                            return false;
                        }
                    }
                }
            } else if (N(obj, i6, i, i2, i9) && !O(obj, v, z(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.h && !kzv.k(obj).i()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x03d1, code lost:            r15 = null;        r0.put(r5, r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03d5, code lost:            ((defpackage.liq) r18.c).A(r3);     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x01cc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:325:0x0058. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x07ba A[Catch: all -> 0x01bf, TRY_ENTER, TryCatch #7 {all -> 0x01bf, blocks: (B:3:0x0013, B:303:0x0034, B:321:0x0044, B:322:0x0048, B:324:0x0050, B:325:0x0058, B:331:0x0168, B:336:0x0195, B:338:0x0179, B:340:0x0183, B:342:0x005e, B:344:0x0068, B:346:0x0072, B:348:0x007c, B:327:0x0086, B:328:0x008d, B:350:0x008e, B:352:0x0098, B:383:0x009e, B:386:0x00aa, B:388:0x00b9, B:389:0x00c8, B:392:0x00cd, B:354:0x00d9, B:357:0x00e5, B:359:0x00f4, B:360:0x0103, B:363:0x0108, B:365:0x011c, B:367:0x0121, B:369:0x012a, B:371:0x0133, B:373:0x013c, B:375:0x0145, B:377:0x014e, B:379:0x0157, B:381:0x0160, B:394:0x019e, B:395:0x01a1, B:309:0x01a4, B:310:0x01a8, B:396:0x003a, B:7:0x01c2, B:9:0x01c6, B:58:0x01d2, B:49:0x079d, B:32:0x07ba, B:33:0x07bf, B:28:0x01d8, B:62:0x01ea, B:64:0x01fe, B:66:0x0212, B:68:0x0226, B:12:0x0239, B:14:0x0243, B:17:0x024a, B:22:0x0250, B:70:0x025f, B:72:0x0272, B:74:0x0281, B:76:0x0292, B:78:0x029b, B:80:0x02ae, B:82:0x02c1, B:84:0x02d4, B:86:0x02e7, B:88:0x02fa, B:90:0x030d, B:92:0x0321, B:94:0x0339, B:96:0x034b, B:97:0x0364, B:129:0x03e2, B:130:0x03e9, B:140:0x03d5, B:144:0x0353, B:146:0x0359, B:149:0x03ea, B:151:0x03ff, B:153:0x0410, B:155:0x0414, B:158:0x041e, B:163:0x0422, B:164:0x0427, B:166:0x0428, B:168:0x0436, B:170:0x0444, B:172:0x0452, B:174:0x0460, B:176:0x047a, B:178:0x0488, B:180:0x0496, B:182:0x04a4, B:184:0x04b2, B:186:0x04c0, B:188:0x04ce, B:190:0x04dc, B:192:0x04ea, B:194:0x04f8, B:196:0x0506, B:198:0x0514, B:200:0x0522, B:202:0x0530, B:204:0x054a, B:206:0x0558, B:208:0x0569, B:210:0x057a, B:213:0x0586, B:217:0x058a, B:218:0x058f, B:220:0x0590, B:222:0x05a5, B:224:0x05b6, B:226:0x05ba, B:229:0x05c4, B:234:0x05c8, B:235:0x05cd, B:237:0x05ce, B:239:0x05d5, B:240:0x05e3, B:242:0x05f1, B:244:0x05ff, B:246:0x060d, B:248:0x061b, B:250:0x0629, B:252:0x0637, B:254:0x0645, B:256:0x0653, B:258:0x0661, B:260:0x0674, B:262:0x0685, B:264:0x0696, B:266:0x06a7, B:268:0x06b8, B:270:0x06c3, B:273:0x06ca, B:274:0x06d0, B:276:0x06dc, B:278:0x06ed, B:280:0x06fe, B:282:0x0711, B:284:0x071a, B:286:0x072b, B:288:0x073b, B:290:0x074b, B:292:0x075b, B:294:0x076b, B:296:0x077b, B:298:0x078b), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x07c5 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    @Override // defpackage.llg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(java.lang.Object r17, defpackage.lir r18, defpackage.lja r19) {
        /*
            Method dump skipped, instructions count: 2222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lkt.l(java.lang.Object, lir, lja):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:271:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // defpackage.llg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(java.lang.Object r22, defpackage.ktd r23) {
        /*
            Method dump skipped, instructions count: 1926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lkt.m(java.lang.Object, ktd):void");
    }
}
