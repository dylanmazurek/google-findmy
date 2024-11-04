package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import java.io.IOException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mkm {
    public static final void A(Object[] objArr, int i) {
        objArr.getClass();
        objArr[i] = null;
    }

    public static final void B(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            A(objArr, i);
            i++;
        }
    }

    public static final Object[] C(Object[] objArr, int i) {
        objArr.getClass();
        Object[] copyOf = Arrays.copyOf(objArr, i);
        copyOf.getClass();
        return copyOf;
    }

    public static final Set D(Set set) {
        ((mmr) set).b.f();
        if (((mls) set).c() > 0) {
            return set;
        }
        return mmr.a;
    }

    public static final Set E(Object obj) {
        Set singleton = Collections.singleton(obj);
        singleton.getClass();
        return singleton;
    }

    public static Set F(Object... objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length > 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(H(length));
                x(objArr, linkedHashSet);
                return linkedHashSet;
            }
            return E(objArr[0]);
        }
        return mlz.a;
    }

    public static final Object G(Map map, Object obj) {
        if (map instanceof mmd) {
            return ((mmd) map).a();
        }
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            throw new NoSuchElementException(a.af(obj, "Key ", " is missing in the map."));
        }
        return obj2;
    }

    public static int H(int i) {
        if (i >= 0) {
            if (i < 3) {
                return i + 1;
            }
            if (i >= 1073741824) {
                return Integer.MAX_VALUE;
            }
            return (int) ((i / 0.75f) + 1.0f);
        }
        return i;
    }

    public static Map I(mkw mkwVar) {
        mkwVar.getClass();
        Map singletonMap = Collections.singletonMap(mkwVar.a, mkwVar.b);
        singletonMap.getClass();
        return singletonMap;
    }

    public static Map J(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map K(Iterable iterable) {
        int size = iterable.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(H(iterable.size()));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    mkw mkwVar = (mkw) it.next();
                    linkedHashMap.put(mkwVar.a, mkwVar.b);
                }
                return linkedHashMap;
            }
            return I((mkw) iterable.get(0));
        }
        return mly.a;
    }

    public static Map L(Map map) {
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return new LinkedHashMap(map);
            }
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            singletonMap.getClass();
            return singletonMap;
        }
        return mly.a;
    }

    public static final List M(List list) {
        mmg mmgVar = (mmg) list;
        if (mmgVar.f == null) {
            mmgVar.b();
            mmgVar.e = true;
            if (mmgVar.d > 0) {
                return list;
            }
            return mmg.a;
        }
        throw new IllegalStateException();
    }

    public static final List N(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static int O(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static List P(Object... objArr) {
        objArr.getClass();
        if (objArr.length > 0) {
            return d(objArr);
        }
        return mlx.a;
    }

    public static List Q(Object... objArr) {
        return new ArrayList(new mlu(objArr, true));
    }

    public static List R(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return list;
            }
            return N(list.get(0));
        }
        return mlx.a;
    }

    public static void S() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static void T(List list, Comparator comparator) {
        list.getClass();
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static Object U(List list) {
        if (!list.isEmpty()) {
            return list.remove(O(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object V(Iterable iterable) {
        if (iterable instanceof List) {
            return W((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object W(List list) {
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object X(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object Y(List list, int i) {
        if (i >= 0 && i <= O(list)) {
            return list.get(i);
        }
        return null;
    }

    public static Object Z(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(O(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final mkt a(int i, mnw mnwVar) {
        if (i - 1 != 1) {
            return new mli(mnwVar);
        }
        return new mkz(mnwVar);
    }

    public static final void aA(mnb mnbVar, CancellationException cancellationException) {
        muf mufVar = (muf) mnbVar.get(muf.c);
        if (mufVar != null) {
            mufVar.s(cancellationException);
        }
    }

    public static final void aB(mnb mnbVar) {
        muf mufVar = (muf) mnbVar.get(muf.c);
        if (mufVar != null) {
            aC(mufVar);
        }
    }

    public static final void aC(muf mufVar) {
        if (mufVar.t()) {
        } else {
            throw mufVar.n();
        }
    }

    public static final boolean aD(mnb mnbVar) {
        muf mufVar = (muf) mnbVar.get(muf.c);
        if (mufVar != null) {
            return mufVar.t();
        }
        return true;
    }

    public static /* synthetic */ mtl aF(muf mufVar, boolean z, muc mucVar, int i) {
        boolean z2;
        boolean z3 = false;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (1 == ((z ? 1 : 0) & ((i & 1) ^ 1))) {
            z3 = true;
        }
        if (mufVar instanceof mun) {
            return ((mun) mufVar).G(z3, z2, mucVar);
        }
        return mufVar.q(z3, z2, new dhs(mucVar, 4, (int[]) null));
    }

    public static final mst aH(Executor executor) {
        mti mtiVar;
        if (executor instanceof mti) {
            mtiVar = (mti) executor;
        } else {
            mtiVar = null;
        }
        if (mtiVar == null) {
            return new mtw(executor);
        }
        throw null;
    }

    public static final CancellationException aI(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final nks aJ(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i + i;
                bArr[i] = (byte) ((nlp.a(str.charAt(i2)) << 4) + nlp.a(str.charAt(i2 + 1)));
            }
            return new nks(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
    }

    public static final nks aK(String str) {
        nks nksVar = new nks(moz.aL(str));
        nksVar.d = str;
        return nksVar;
    }

    public static final String aL(int i) {
        if (i == 0) {
            return "0";
        }
        char c = nlp.a[(i >> 28) & 15];
        char[] cArr = nlp.a;
        int i2 = 0;
        char[] cArr2 = {c, cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        if (i2 >= 0) {
            if (i2 <= 8) {
                return new String(cArr2, i2, 8 - i2);
            }
            throw new IllegalArgumentException(a.am(i2, "startIndex: ", " > endIndex: 8"));
        }
        throw new IndexOutOfBoundsException(a.am(i2, "startIndex: ", ", endIndex: 8, size: 8"));
    }

    public static final void aM(long j, long j2, long j3) {
        if ((j2 | j3) >= 0 && j2 <= j && j - j2 >= j3) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
    }

    public static final boolean aN(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        bArr.getClass();
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0057, code lost:            r7 = 0;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String aO(byte[] r13, byte[][] r14, int r15) {
        /*
            int r0 = r13.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto L84
            int r3 = r2 + r0
            int r3 = r3 / 2
        L9:
            r4 = 10
            if (r3 < 0) goto L14
            r5 = r13[r3]
            if (r5 == r4) goto L14
            int r3 = r3 + (-1)
            goto L9
        L14:
            int r5 = r3 + 1
            r6 = 1
            r7 = 1
        L18:
            int r8 = r5 + r7
            r9 = r13[r8]
            if (r9 == r4) goto L21
            int r7 = r7 + 1
            goto L18
        L21:
            int r4 = r8 - r5
            r9 = r15
            r7 = 0
            r10 = 0
            r11 = 0
        L27:
            if (r7 == 0) goto L2c
            r7 = 46
            goto L34
        L2c:
            r7 = r14[r9]
            r7 = r7[r10]
            int r7 = defpackage.ngt.x(r7)
        L34:
            int r12 = r5 + r11
            r12 = r13[r12]
            int r12 = defpackage.ngt.x(r12)
            int r7 = r7 - r12
            if (r7 != 0) goto L58
            int r11 = r11 + 1
            int r10 = r10 + 1
            if (r11 == r4) goto L57
            r7 = r14[r9]
            int r7 = r7.length
            if (r7 != r10) goto L55
            int r7 = r14.length
            r12 = -1
            int r7 = r7 + r12
            if (r9 != r7) goto L50
            goto L57
        L50:
            int r9 = r9 + 1
            r7 = 1
            r10 = -1
            goto L27
        L55:
            r7 = 0
            goto L27
        L57:
            r7 = 0
        L58:
            if (r7 >= 0) goto L5c
        L5a:
            r0 = r3
            goto L3
        L5c:
            if (r7 <= 0) goto L61
        L5e:
            int r2 = r8 + 1
            goto L3
        L61:
            int r6 = r4 - r11
            r7 = r14[r9]
            int r7 = r7.length
            int r7 = r7 - r10
            int r9 = r9 + 1
            int r10 = r14.length
        L6a:
            if (r9 >= r10) goto L73
            r11 = r14[r9]
            int r11 = r11.length
            int r7 = r7 + r11
            int r9 = r9 + 1
            goto L6a
        L73:
            if (r7 >= r6) goto L76
            goto L5a
        L76:
            if (r7 <= r6) goto L79
            goto L5e
        L79:
            java.nio.charset.Charset r14 = java.nio.charset.StandardCharsets.UTF_8
            r14.getClass()
            java.lang.String r15 = new java.lang.String
            r15.<init>(r13, r5, r4, r14)
            goto L85
        L84:
            r15 = 0
        L85:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mkm.aO(byte[], byte[][], int):java.lang.String");
    }

    public static final njw aP(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions == null) {
            return null;
        }
        return new njw(x509TrustManager, x509TrustManagerExtensions);
    }

    public static final boolean aQ() {
        nju njuVar = nju.b;
        if (aS() && Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    public static final List aR(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ngi) obj) != ngi.a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ap(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ngi) it.next()).g);
        }
        return arrayList2;
    }

    public static final boolean aS() {
        return amr.i("Dalvik", System.getProperty("java.vm.name"));
    }

    public static final int aT(int i, int i2, int i3) {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(a.ad(i, i3, "PROTOCOL_ERROR padding ", " > remaining length "));
    }

    public static /* synthetic */ String aU(int i) {
        switch (i) {
            case 1:
                return "NO_ERROR";
            case 2:
                return "PROTOCOL_ERROR";
            case 3:
                return "INTERNAL_ERROR";
            case 4:
                return "FLOW_CONTROL_ERROR";
            case 5:
                return "SETTINGS_TIMEOUT";
            case 6:
                return "STREAM_CLOSED";
            case 7:
                return "FRAME_SIZE_ERROR";
            case 8:
                return "REFUSED_STREAM";
            case 9:
                return "CANCEL";
            case 10:
                return "COMPRESSION_ERROR";
            case 11:
                return "CONNECT_ERROR";
            case 12:
                return "ENHANCE_YOUR_CALM";
            case 13:
                return "INADEQUATE_SECURITY";
            default:
                return "HTTP_1_1_REQUIRED";
        }
    }

    public static int[] aV() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    }

    public static final int aW(int i) {
        int[] aV = aV();
        for (int i2 = 0; i2 < 14; i2++) {
            int i3 = aV[i2];
            int i4 = i3 - 1;
            if (i3 != 0) {
                if (i4 == i) {
                    return i3;
                }
            } else {
                throw null;
            }
        }
        return 0;
    }

    public static final nhw aX(String str) {
        ngi ngiVar;
        int i;
        String str2;
        if (moz.I(str, "HTTP/1.")) {
            i = 9;
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt != 0) {
                    if (charAt == 1) {
                        ngiVar = ngi.b;
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                } else {
                    ngiVar = ngi.a;
                }
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else if (moz.I(str, "ICY ")) {
            ngiVar = ngi.a;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                String substring = str.substring(i, i2);
                substring.getClass();
                int parseInt = Integer.parseInt(substring);
                if (str.length() > i2) {
                    if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                        str2.getClass();
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                } else {
                    str2 = "";
                }
                return new nhw(ngiVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        }
        throw new ProtocolException("Unexpected status line: ".concat(str));
    }

    public static final String aY(ngd ngdVar) {
        String b = ngdVar.b();
        String c = ngdVar.c();
        if (c != null) {
            return a.an(c, b, "?");
        }
        return b;
    }

    public static final boolean aZ(String str) {
        if (!amr.i(str, "GET") && !amr.i(str, "HEAD")) {
            return true;
        }
        return false;
    }

    public static Object aa(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Object ab(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List ac(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + iterable.size());
        arrayList.addAll(collection);
        arrayList.addAll(iterable);
        return arrayList;
    }

    public static List ad(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List ae(Iterable iterable) {
        iterable.getClass();
        if (iterable.size() <= 1) {
            return ag(iterable);
        }
        Object[] array = iterable.toArray(new Comparable[0]);
        f((Comparable[]) array);
        return d(array);
    }

    public static List af(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return ag(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            array.getClass();
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            return d(array);
        }
        List ah = ah(iterable);
        T(ah, comparator);
        return ah;
    }

    public static List ag(Iterable iterable) {
        Object next;
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return new ArrayList(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return N(next);
            }
            return mlx.a;
        }
        return R(ah(iterable));
    }

    public static List ah(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        at(iterable, arrayList);
        return arrayList;
    }

    public static List ai(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(ap(iterable), ap(iterable2)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new mkw(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static Set aj(Iterable iterable) {
        Object next;
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(H(collection.size()));
                    at(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return E(next);
            }
            return mlz.a;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        at(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return linkedHashSet2;
            }
            return E(linkedHashSet2.iterator().next());
        }
        return mlz.a;
    }

    public static mqz ak(Iterable iterable) {
        iterable.getClass();
        return new bwu(iterable, 2);
    }

    public static boolean al(Iterable iterable, Object obj) {
        int i;
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            if (iterable instanceof List) {
                i = ((List) iterable).indexOf(obj);
            } else {
                int i2 = 0;
                for (Object obj2 : iterable) {
                    if (i2 < 0) {
                        S();
                    }
                    if (!amr.i(obj, obj2)) {
                        i2++;
                    } else {
                        i = i2;
                    }
                }
                return false;
            }
            if (i < 0) {
                return false;
            }
            return true;
        }
        return ((Collection) iterable).contains(obj);
    }

    public static int[] am(Collection collection) {
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static void an(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static /* synthetic */ int ao(List list, Comparable comparable) {
        int size = list.size();
        int size2 = list.size();
        if (size >= 0) {
            if (size <= size2) {
                int i = size - 1;
                int i2 = 0;
                while (i2 <= i) {
                    int i3 = (i2 + i) >>> 1;
                    int C = mjo.C((Comparable) list.get(i3), comparable);
                    if (C < 0) {
                        i2 = i3 + 1;
                    } else if (C > 0) {
                        i = i3 - 1;
                    } else {
                        return i3;
                    }
                }
                return -(i2 + 1);
            }
            throw new IndexOutOfBoundsException(a.aj(size2, size, "toIndex (", ") is greater than size (", ")."));
        }
        throw new IllegalArgumentException(a.am(size, "fromIndex (0) is greater than toIndex (", ")."));
    }

    public static int ap(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }

    public static void aq(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, moh mohVar) {
        appendable.append(charSequence2);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > 0) {
                i = 0;
                break;
            }
            amr.d(appendable, next, mohVar);
        }
        if (i >= 0 && i2 > 0) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ String ar(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, moh mohVar, int i) {
        CharSequence charSequence4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        moh mohVar2;
        int i2;
        iterable.getClass();
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        CharSequence charSequence7 = charSequence;
        charSequence7.getClass();
        if ((i & 2) != 0) {
            charSequence4 = "";
        } else {
            charSequence4 = charSequence2;
        }
        charSequence4.getClass();
        if ((i & 4) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence3;
        }
        charSequence5.getClass();
        if ((i & 16) != 0) {
            charSequence6 = "...";
        } else {
            charSequence6 = null;
        }
        charSequence6.getClass();
        StringBuilder sb = new StringBuilder();
        if ((i & 32) != 0) {
            mohVar2 = null;
        } else {
            mohVar2 = mohVar;
        }
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        aq(iterable, sb, charSequence7, charSequence4, charSequence5, i2, charSequence6, mohVar2);
        return sb.toString();
    }

    public static final void as(int i, Object[] objArr) {
        if (i < objArr.length) {
            objArr[i] = null;
        }
    }

    public static void at(Iterable iterable, Collection collection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static /* synthetic */ String av(int i) {
        return "DROP_OLDEST";
    }

    public static final Object aw(mmx mmxVar) {
        nan nanVar;
        Object obj;
        mnb o = mmxVar.o();
        aB(o);
        mmx w = mjo.w(mmxVar);
        if (w instanceof nan) {
            nanVar = (nan) w;
        } else {
            nanVar = null;
        }
        if (nanVar == null) {
            obj = mlh.a;
        } else {
            if (nanVar.a.cp(o)) {
                nanVar.c(o, mlh.a);
            } else {
                mvk mvkVar = new mvk();
                nanVar.c(o.plus(mvkVar), mlh.a);
                if (mvkVar.a) {
                    mlh mlhVar = mlh.a;
                    boolean z = msy.a;
                    ThreadLocal threadLocal = mvc.a;
                    mto a = mvc.a();
                    if (!a.p()) {
                        if (a.o()) {
                            nanVar.c = mlhVar;
                            nanVar.e = 1;
                            a.m(nanVar);
                            obj = mne.a;
                        } else {
                            a.n(true);
                            try {
                                nanVar.run();
                                do {
                                } while (a.q());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                    obj = mlh.a;
                }
            }
            obj = mne.a;
        }
        if (obj == mne.a) {
            return obj;
        }
        return mlh.a;
    }

    public static final Object ax(mve mveVar, mol molVar) {
        Object msmVar;
        mmx mmxVar;
        aF(mveVar, false, new mtm(msz.k(mveVar.e.o()).g(mveVar.b, mveVar, ((mrt) mveVar).a)), 3);
        try {
            if (!(molVar instanceof mnj)) {
                msmVar = mjo.u(molVar, mveVar, mveVar);
            } else {
                mpp.g(molVar, 2);
                msmVar = molVar.a(mveVar, mveVar);
            }
        } catch (Throwable th) {
            msmVar = new msm(th);
        }
        mne mneVar = mne.a;
        if (msmVar == mneVar) {
            return mneVar;
        }
        Object C = mveVar.C(msmVar);
        if (C == muo.b) {
            return mne.a;
        }
        if (C instanceof msm) {
            Throwable th2 = ((msm) C).b;
            if ((th2 instanceof mvd) && ((mvd) th2).a == mveVar) {
                if (msmVar instanceof msm) {
                    th2 = ((msm) msmVar).b;
                    mmxVar = mveVar.e;
                    if (msy.b) {
                        if (!(mmxVar instanceof mnm)) {
                            throw th2;
                        }
                    } else {
                        throw th2;
                    }
                } else {
                    return msmVar;
                }
            } else {
                mmxVar = mveVar.e;
                if (msy.b) {
                    if (!(mmxVar instanceof mnm)) {
                        throw th2;
                    }
                } else {
                    throw th2;
                }
            }
            throw nbi.a(th2, (mnm) mmxVar);
        }
        return muo.b(C);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object ay(long r7, defpackage.mol r9, defpackage.mmx r10) {
        /*
            boolean r0 = r10 instanceof defpackage.mvf
            if (r0 == 0) goto L13
            r0 = r10
            mvf r0 = (defpackage.mvf) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            mvf r0 = new mvf
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.a
            mne r1 = defpackage.mne.a
            int r2 = r0.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            mpn r7 = r0.c
            defpackage.mjo.o(r10)     // Catch: defpackage.mvd -> L2a
            goto L55
        L2a:
            r8 = move-exception
            goto L59
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.mjo.o(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L3e
            return r3
        L3e:
            mpn r10 = new mpn
            r10.<init>()
            r0.c = r10     // Catch: defpackage.mvd -> L56
            r0.b = r4     // Catch: defpackage.mvd -> L56
            mve r2 = new mve     // Catch: defpackage.mvd -> L56
            r2.<init>(r7, r0)     // Catch: defpackage.mvd -> L56
            r10.a = r2     // Catch: defpackage.mvd -> L56
            java.lang.Object r10 = ax(r2, r9)     // Catch: defpackage.mvd -> L56
            if (r10 != r1) goto L55
            return r1
        L55:
            return r10
        L56:
            r7 = move-exception
            r8 = r7
            r7 = r10
        L59:
            muf r9 = r8.a
            java.lang.Object r7 = r7.a
            if (r9 != r7) goto L60
            return r3
        L60:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mkm.ay(long, mol, mmx):java.lang.Object");
    }

    public static final muf az(mnb mnbVar) {
        muf mufVar = (muf) mnbVar.get(muf.c);
        if (mufVar != null) {
            return mufVar;
        }
        Objects.toString(mnbVar);
        throw new IllegalStateException("Current context doesn't contain Job in it: ".concat(String.valueOf(mnbVar)));
    }

    public static final void b(int i, int i2) {
        if (i <= i2) {
        } else {
            throw new IndexOutOfBoundsException(a.aj(i2, i, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static final String ba(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        format.getClass();
        return format;
    }

    public static final void bb(ngv ngvVar, ngx ngxVar, String str) {
        Logger logger = ngy.b;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        format.getClass();
        logger.fine(ngxVar.b + " " + format + ": " + ngvVar.a);
    }

    public static final ngn bc(ngn ngnVar) {
        ngp ngpVar;
        if (ngnVar != null) {
            ngpVar = ngnVar.g;
        } else {
            ngpVar = null;
        }
        if (ngpVar != null) {
            ngm ngmVar = new ngm(ngnVar);
            ngmVar.e = null;
            return ngmVar.a();
        }
        return ngnVar;
    }

    public static final String bd(String str) {
        InetAddress bf;
        str.getClass();
        int i = -1;
        int i2 = 0;
        if (moz.t(str, ":")) {
            if (moz.I(str, "[") && moz.u(str, "]")) {
                bf = bf(str, 1, str.length() - 1);
            } else {
                bf = bf(str, 0, str.length());
            }
            if (bf == null) {
                return null;
            }
            byte[] address = bf.getAddress();
            int length = address.length;
            if (length == 16) {
                address.getClass();
                int i3 = 0;
                int i4 = 0;
                while (i3 < address.length) {
                    int i5 = i3;
                    while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                        i5 += 2;
                    }
                    int i6 = i5 - i3;
                    if (i6 > i4 && i6 >= 4) {
                        i = i3;
                        i4 = i6;
                    }
                    i3 = i5 + 2;
                }
                nkp nkpVar = new nkp();
                while (i2 < address.length) {
                    if (i2 == i) {
                        nkpVar.D(58);
                        i2 += i4;
                        if (i2 == 16) {
                            nkpVar.D(58);
                        }
                    } else {
                        if (i2 > 0) {
                            nkpVar.D(58);
                        }
                        nkpVar.J((ngt.x(address[i2]) << 8) | ngt.x(address[i2 + 1]));
                        i2 += 2;
                    }
                }
                return nkpVar.i();
            }
            if (length == 4) {
                return bf.getHostAddress();
            }
            throw new AssertionError(a.ag(str, "Invalid IPv6 address: '", "'"));
        }
        try {
            String ascii = IDN.toASCII(str);
            ascii.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = ascii.toLowerCase(locale);
            lowerCase.getClass();
            if (lowerCase.length() != 0) {
                int length2 = lowerCase.length();
                for (int i7 = 0; i7 < length2; i7++) {
                    char charAt = lowerCase.charAt(i7);
                    if (mpd.a(charAt, 31) > 0 && mpd.a(charAt, 127) < 0 && moz.x(" #%/:?@[\\]", charAt, 0, 6) == -1) {
                    }
                    return null;
                }
                return lowerCase;
            }
        } catch (IllegalArgumentException unused) {
        }
        return null;
    }

    public static final ngr be(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return ngr.c;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return ngr.b;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return ngr.a;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return ngr.d;
            }
        } else if (str.equals("SSLv3")) {
            return ngr.e;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.net.InetAddress bf(java.lang.String r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mkm.bf(java.lang.String, int, int):java.net.InetAddress");
    }

    public static boolean c(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        int length = objArr.length;
        if (length != objArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Object obj2 = objArr2[i];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!c((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else {
                    if ((obj instanceof mlb) && (obj2 instanceof mlb)) {
                        throw null;
                    }
                    if ((obj instanceof mlf) && (obj2 instanceof mlf)) {
                        throw null;
                    }
                    if ((obj instanceof mlc) && (obj2 instanceof mlc)) {
                        throw null;
                    }
                    if ((obj instanceof mld) && (obj2 instanceof mld)) {
                        throw null;
                    }
                    if (!amr.i(obj, obj2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static List d(Object[] objArr) {
        objArr.getClass();
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static void e(Object[] objArr, Object obj, int i, int i2) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static void f(Object[] objArr) {
        objArr.getClass();
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static Object[] g(Object[] objArr, int i, int i2) {
        objArr.getClass();
        b(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static int h(Object[] objArr) {
        objArr.getClass();
        return objArr.length - 1;
    }

    public static int i(Object[] objArr, Object obj) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (amr.i(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static Object j(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object k(Object[] objArr, int i) {
        if (i >= 0 && i <= h(objArr)) {
            return objArr[i];
        }
        return null;
    }

    public static List l(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List m(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return n(objArr);
            }
            return N(objArr[0]);
        }
        return mlx.a;
    }

    public static List n(Object[] objArr) {
        return new ArrayList(new mlu(objArr, false));
    }

    public static void o(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        bArr.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void p(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void q(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void s(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        p(iArr, iArr2, i, 0, i2);
    }

    public static byte[] t(byte[] bArr, int i) {
        bArr.getClass();
        b(i, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static void u(int[] iArr, int i, int i2) {
        iArr.getClass();
        Arrays.fill(iArr, 0, i2, i);
    }

    public static /* synthetic */ void v(long[] jArr) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    public static void x(Object[] objArr, Collection collection) {
        for (Object obj : objArr) {
            collection.add(obj);
        }
    }

    public static /* synthetic */ void y(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        q(objArr, objArr2, 0, i, i2);
    }

    public static final int z(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if ((-2147483639) + i3 > 0) {
            if (i2 <= 2147483639) {
                return 2147483639;
            }
            return Integer.MAX_VALUE;
        }
        return i3;
    }
}
