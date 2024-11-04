package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kzy {
    public static volatile mbg a;
    public static volatile mbg b;
    public static volatile mbg c;
    public static volatile mbg d;
    public static volatile mbg e;
    public static volatile mbg f;
    public static volatile mbg g;

    public static /* bridge */ /* synthetic */ void A(Object obj, int i, lim limVar) {
        ((llp) obj).e(llz.c(i, 2), limVar);
    }

    public static /* bridge */ /* synthetic */ void B(Object obj, int i, long j) {
        ((llp) obj).e(llz.c(i, 0), Long.valueOf(j));
    }

    public static llp C(Object obj) {
        return ((ljn) obj).B;
    }

    public static void D(Object obj, llp llpVar) {
        ((ljn) obj).B = llpVar;
    }

    public static final /* bridge */ /* synthetic */ Object E(Object obj) {
        llp C = C(obj);
        if (C == llp.a) {
            llp llpVar = new llp();
            D(obj, llpVar);
            return llpVar;
        }
        return C;
    }

    public static final void F(Object obj) {
        C(obj).d();
    }

    public static String G(lim limVar) {
        StringBuilder sb = new StringBuilder(limVar.d());
        for (int i = 0; i < limVar.d(); i++) {
            byte a2 = limVar.a(i);
            if (a2 != 34) {
                if (a2 != 39) {
                    if (a2 != 92) {
                        switch (a2) {
                            case 7:
                                sb.append("\\a");
                                break;
                            case 8:
                                sb.append("\\b");
                                break;
                            case 9:
                                sb.append("\\t");
                                break;
                            case 10:
                                sb.append("\\n");
                                break;
                            case 11:
                                sb.append("\\v");
                                break;
                            case 12:
                                sb.append("\\f");
                                break;
                            case 13:
                                sb.append("\\r");
                                break;
                            default:
                                if (a2 >= 32 && a2 <= 126) {
                                    sb.append((char) a2);
                                    break;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((a2 >>> 6) & 3) + 48));
                                    sb.append((char) (((a2 >>> 3) & 7) + 48));
                                    sb.append((char) ((a2 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static final void H(lim limVar, ArrayDeque arrayDeque) {
        if (limVar.h()) {
            int O = O(limVar.d());
            int c2 = llf.c(O + 1);
            if (!arrayDeque.isEmpty() && ((lim) arrayDeque.peek()).d() < c2) {
                int c3 = llf.c(O);
                lim limVar2 = (lim) arrayDeque.pop();
                while (!arrayDeque.isEmpty() && ((lim) arrayDeque.peek()).d() < c3) {
                    limVar2 = new llf((lim) arrayDeque.pop(), limVar2);
                }
                llf llfVar = new llf(limVar2, limVar);
                while (!arrayDeque.isEmpty()) {
                    if (((lim) arrayDeque.peek()).d() >= llf.c(O(llfVar.d) + 1)) {
                        break;
                    } else {
                        llfVar = new llf((lim) arrayDeque.pop(), llfVar);
                    }
                }
                arrayDeque.push(llfVar);
                return;
            }
            arrayDeque.push(limVar);
            return;
        }
        if (limVar instanceof llf) {
            llf llfVar2 = (llf) limVar;
            int[] iArr = llf.a;
            H(llfVar2.e, arrayDeque);
            H(llfVar2.f, arrayDeque);
            return;
        }
        throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(limVar.getClass()))));
    }

    public static final boolean I(Object obj) {
        if (!((lkl) obj).b) {
            return true;
        }
        return false;
    }

    public static final Object J(Object obj, Object obj2) {
        lkl lklVar = (lkl) obj;
        lkl lklVar2 = (lkl) obj2;
        if (!lklVar2.isEmpty()) {
            if (!lklVar.b) {
                lklVar = lklVar.a();
            }
            lklVar.b();
            if (!lklVar2.isEmpty()) {
                lklVar.putAll(lklVar2);
            }
        }
        return lklVar;
    }

    public static final Object K() {
        return lkl.a.a();
    }

    public static final nqe L(Object obj) {
        return (nqe) ((ktd) obj).a;
    }

    private static int M(byte b2) {
        return b2 & 63;
    }

    private static boolean N(byte b2) {
        if (b2 > -65) {
            return true;
        }
        return false;
    }

    private static final int O(int i) {
        int binarySearch = Arrays.binarySearch(llf.a, i);
        if (binarySearch < 0) {
            return (-(binarySearch + 1)) - 1;
        }
        return binarySearch;
    }

    public static int a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
            default:
                return 0;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
        }
    }

    public static int b(int i) {
        if (i == 0) {
            return 3;
        }
        if (i == 1) {
            return 1;
        }
        if (i != 3) {
            return 0;
        }
        return 2;
    }

    public static final /* synthetic */ lfl c(ljh ljhVar) {
        ljn q = ljhVar.q();
        q.getClass();
        return (lfl) q;
    }

    public static final /* synthetic */ lgs d(ljh ljhVar) {
        ljn q = ljhVar.q();
        q.getClass();
        return (lgs) q;
    }

    public static int e(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            if (i != 4) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    public static String f(int i) {
        return Integer.toString(a.s(i));
    }

    public static String g(int i) {
        return Integer.toString(a.s(i));
    }

    public static String h(int i) {
        return Integer.toString(a.s(i));
    }

    public static lkq i(ProtoParsers$InternalDontUse protoParsers$InternalDontUse, lkq lkqVar, lja ljaVar) {
        lkq s = lkqVar.s();
        if (protoParsers$InternalDontUse.b == null) {
            protoParsers$InternalDontUse.b = s.cR().f(protoParsers$InternalDontUse.a, ljaVar).q();
        }
        return protoParsers$InternalDontUse.b;
    }

    public static lkq j(Bundle bundle, String str, lkq lkqVar, lja ljaVar) {
        ProtoParsers$InternalDontUse protoParsers$InternalDontUse;
        Parcelable parcelable = bundle.getParcelable(str);
        if (parcelable instanceof Bundle) {
            Bundle bundle2 = (Bundle) parcelable;
            bundle2.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
            protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) bundle2.getParcelable("protoparsers");
        } else {
            protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcelable;
        }
        return i(protoParsers$InternalDontUse, lkqVar, ljaVar);
    }

    public static lkq k(Bundle bundle, String str, lkq lkqVar, lja ljaVar) {
        try {
            return j(bundle, str, lkqVar, ljaVar);
        } catch (ljy e2) {
            throw new RuntimeException(e2);
        }
    }

    public static List l(Bundle bundle, String str, lkq lkqVar, lja ljaVar) {
        ArrayList arrayList;
        Object parcelable = bundle.getParcelable(str);
        if (parcelable instanceof Bundle) {
            Bundle bundle2 = (Bundle) parcelable;
            bundle2.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
            arrayList = bundle2.getParcelableArrayList("protoparsers");
        } else {
            arrayList = (ArrayList) parcelable;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(i((ProtoParsers$InternalDontUse) it.next(), lkqVar, ljaVar));
        }
        return arrayList2;
    }

    public static void m(Bundle bundle, String str, lkq lkqVar) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("protoparsers", new ProtoParsers$InternalDontUse(null, lkqVar));
        bundle.putParcelable(str, bundle2);
    }

    public static void n(Bundle bundle, String str, List list) {
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProtoParsers$InternalDontUse(null, (lkq) it.next()));
        }
        bundle2.putParcelableArrayList("protoparsers", arrayList);
        bundle.putParcelable(str, bundle2);
    }

    public static lim o(CharSequence charSequence, jtf jtfVar) {
        lil lilVar = new lil(charSequence.length());
        try {
            jtk jtkVar = new jtk((String) charSequence);
            jtm jtmVar = new jtm();
            try {
                InputStream f2 = jtfVar.f(new StringReader((String) jtkVar.a));
                jtmVar.b(f2);
                int i = jti.a;
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = f2.read(bArr);
                    if (read == -1) {
                        return lilVar.b();
                    }
                    lilVar.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (jta e2) {
            throw e2;
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    public static String p(lim limVar, jtf jtfVar) {
        StringWriter stringWriter = new StringWriter();
        try {
            OutputStream g2 = jtfVar.g(stringWriter);
            try {
                limVar.o(g2);
                g2.close();
                return stringWriter.toString();
            } finally {
            }
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public static final String q(ByteBuffer byteBuffer, int i, int i2) {
        int i3;
        if ((((byteBuffer.limit() - i) - i2) | i | i2) >= 0) {
            int i4 = i + i2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (i < i4) {
                byte b2 = byteBuffer.get(i);
                if (!w(b2)) {
                    break;
                }
                i++;
                t(b2, cArr, i5);
                i5++;
            }
            int i6 = i5;
            while (i < i4) {
                int i7 = i + 1;
                byte b3 = byteBuffer.get(i);
                if (w(b3)) {
                    t(b3, cArr, i6);
                    i6++;
                    i = i7;
                    while (i < i4) {
                        byte b4 = byteBuffer.get(i);
                        if (w(b4)) {
                            i++;
                            t(b4, cArr, i6);
                            i6++;
                        }
                    }
                } else {
                    if (y(b3)) {
                        if (i7 < i4) {
                            i3 = i6 + 1;
                            i += 2;
                            v(b3, byteBuffer.get(i7), cArr, i6);
                        } else {
                            throw new ljy("Protocol message had invalid UTF-8.");
                        }
                    } else if (x(b3)) {
                        if (i7 < i4 - 1) {
                            i3 = i6 + 1;
                            int i8 = i + 2;
                            i += 3;
                            u(b3, byteBuffer.get(i7), byteBuffer.get(i8), cArr, i6);
                        } else {
                            throw new ljy("Protocol message had invalid UTF-8.");
                        }
                    } else if (i7 < i4 - 2) {
                        byte b5 = byteBuffer.get(i7);
                        int i9 = i + 3;
                        byte b6 = byteBuffer.get(i + 2);
                        i += 4;
                        s(b3, b5, b6, byteBuffer.get(i9), cArr, i6);
                        i6 += 2;
                    } else {
                        throw new ljy("Protocol message had invalid UTF-8.");
                    }
                    i6 = i3;
                }
            }
            return new String(cArr, 0, i6);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static String r(byte[] bArr, int i, int i2) {
        int i3;
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) >= 0) {
            int i4 = i + i2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (i < i4) {
                byte b2 = bArr[i];
                if (!w(b2)) {
                    break;
                }
                i++;
                t(b2, cArr, i5);
                i5++;
            }
            while (i < i4) {
                int i6 = i + 1;
                byte b3 = bArr[i];
                if (w(b3)) {
                    t(b3, cArr, i5);
                    i5++;
                    i = i6;
                    while (i < i4) {
                        byte b4 = bArr[i];
                        if (w(b4)) {
                            i++;
                            t(b4, cArr, i5);
                            i5++;
                        }
                    }
                } else {
                    if (y(b3)) {
                        if (i6 < i4) {
                            i3 = i5 + 1;
                            i += 2;
                            v(b3, bArr[i6], cArr, i5);
                        } else {
                            throw new ljy("Protocol message had invalid UTF-8.");
                        }
                    } else if (x(b3)) {
                        if (i6 < i4 - 1) {
                            i3 = i5 + 1;
                            int i7 = i + 2;
                            i += 3;
                            u(b3, bArr[i6], bArr[i7], cArr, i5);
                        } else {
                            throw new ljy("Protocol message had invalid UTF-8.");
                        }
                    } else if (i6 < i4 - 2) {
                        byte b5 = bArr[i6];
                        int i8 = i + 3;
                        byte b6 = bArr[i + 2];
                        i += 4;
                        s(b3, b5, b6, bArr[i8], cArr, i5);
                        i5 += 2;
                    } else {
                        throw new ljy("Protocol message had invalid UTF-8.");
                    }
                    i5 = i3;
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void s(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) {
        if (!N(b3) && (((b2 << 28) + (b3 + 112)) >> 30) == 0 && !N(b4) && !N(b5)) {
            int M = ((b2 & 7) << 18) | (M(b3) << 12) | (M(b4) << 6) | M(b5);
            cArr[i] = (char) ((M >>> 10) + 55232);
            cArr[i + 1] = (char) ((M & 1023) + 56320);
            return;
        }
        throw new ljy("Protocol message had invalid UTF-8.");
    }

    public static void t(byte b2, char[] cArr, int i) {
        cArr[i] = (char) b2;
    }

    public static void u(byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!N(b3)) {
            if (b2 == -32) {
                if (b3 >= -96) {
                    b2 = -32;
                }
            }
            if (b2 == -19) {
                if (b3 < -96) {
                    b2 = -19;
                }
            }
            if (!N(b4)) {
                cArr[i] = (char) (((b2 & 15) << 12) | (M(b3) << 6) | M(b4));
                return;
            }
        }
        throw new ljy("Protocol message had invalid UTF-8.");
    }

    public static void v(byte b2, byte b3, char[] cArr, int i) {
        if (b2 >= -62 && !N(b3)) {
            cArr[i] = (char) (((b2 & 31) << 6) | M(b3));
            return;
        }
        throw new ljy("Protocol message had invalid UTF-8.");
    }

    public static boolean w(byte b2) {
        if (b2 >= 0) {
            return true;
        }
        return false;
    }

    public static boolean x(byte b2) {
        if (b2 < -16) {
            return true;
        }
        return false;
    }

    public static boolean y(byte b2) {
        if (b2 < -32) {
            return true;
        }
        return false;
    }

    public final boolean z(Object obj, lir lirVar) {
        int i = lirVar.a;
        int a2 = llz.a(i);
        int b2 = llz.b(i);
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 != 2) {
                    if (b2 != 3) {
                        if (b2 != 4) {
                            if (b2 == 5) {
                                llp llpVar = (llp) obj;
                                llpVar.e(llz.c(a2, 5), Integer.valueOf(lirVar.e()));
                                return true;
                            }
                            throw new ljx();
                        }
                        return false;
                    }
                    llp llpVar2 = new llp();
                    int c2 = llz.c(a2, 4);
                    while (lirVar.c() != Integer.MAX_VALUE && z(llpVar2, lirVar)) {
                    }
                    if (c2 == lirVar.a) {
                        llpVar2.d();
                        ((llp) obj).e(llz.c(a2, 3), llpVar2);
                        return true;
                    }
                    throw new ljy("Protocol message end-group tag did not match expected tag.");
                }
                A(obj, a2, lirVar.o());
                return true;
            }
            llp llpVar3 = (llp) obj;
            llpVar3.e(llz.c(a2, 1), Long.valueOf(lirVar.j()));
            return true;
        }
        B(obj, a2, lirVar.k());
        return true;
    }
}
