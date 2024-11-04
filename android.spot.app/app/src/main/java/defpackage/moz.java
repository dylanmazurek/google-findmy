package defpackage;

import android.util.StatsEvent;
import android.util.StatsLog;
import java.io.DataInput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import org.chromium.net.UploadDataProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class moz {
    public static String A(String str, int i) {
        CharSequence charSequence;
        str.getClass();
        if (i <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            mmb it = new mqg(1, i - str.length()).iterator();
            while (it.a) {
                it.a();
                sb.append('0');
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    static /* synthetic */ mqz C(CharSequence charSequence, String[] strArr) {
        return new mrg(charSequence, new yj(mkm.d(strArr), 10), 2);
    }

    public static /* synthetic */ String D(String str, char c, char c2) {
        str.getClass();
        String replace = str.replace(c, c2);
        replace.getClass();
        return replace;
    }

    public static /* synthetic */ String E(String str, String str2, String str3) {
        str.getClass();
        int i = 0;
        int w = w(str, str2, 0);
        if (w >= 0) {
            int length = str2.length();
            int length2 = (str.length() - length) + str3.length();
            if (length2 >= 0) {
                StringBuilder sb = new StringBuilder(length2);
                do {
                    sb.append((CharSequence) str, i, w);
                    sb.append(str3);
                    i = w + length;
                    if (w >= str.length()) {
                        break;
                    }
                    w = w(str, str2, w + ac(length, 1));
                } while (w > 0);
                sb.append((CharSequence) str, i, str.length());
                return sb.toString();
            }
            throw new OutOfMemoryError();
        }
        return str;
    }

    public static /* synthetic */ List G(CharSequence charSequence, String[] strArr) {
        charSequence.getClass();
        String str = strArr[0];
        if (str.length() == 0) {
            mre mreVar = new mre(C(charSequence, strArr), 0);
            ArrayList arrayList = new ArrayList(mkm.ap(mreVar));
            Iterator it = mreVar.iterator();
            while (it.hasNext()) {
                arrayList.add(m(charSequence, (mqg) it.next()));
            }
            return arrayList;
        }
        return aO(charSequence, str);
    }

    public static /* synthetic */ boolean I(String str, String str2) {
        str.getClass();
        return str.startsWith(str2);
    }

    public static /* synthetic */ String J(String str) {
        str.getClass();
        str.getClass();
        int z = z(str, '.', 0, 6);
        if (z == -1) {
            return str;
        }
        String substring = str.substring(z + 1, str.length());
        substring.getClass();
        return substring;
    }

    public static /* synthetic */ String K(String str) {
        String str2;
        if (!g("|")) {
            List o = o(str);
            o.size();
            moh aN = aN();
            int O = mkm.O(o);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : o) {
                int i2 = i + 1;
                if (i < 0) {
                    mkm.S();
                }
                String str3 = (String) obj;
                String str4 = null;
                if ((i == 0 || i == O) && g(str3)) {
                    str3 = null;
                } else {
                    int length = str3.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            if (!M(str3.charAt(i3))) {
                                break;
                            }
                            i3++;
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    if (i3 != -1 && i(str3, "|", i3, false)) {
                        str3.getClass();
                        str4 = str3.substring(i3 + 1);
                        str4.getClass();
                    }
                    if (str4 != null && (str2 = (String) aN.a(str4)) != null) {
                        str3 = str2;
                    }
                }
                if (str3 != null) {
                    arrayList.add(str3);
                }
                i = i2;
            }
            StringBuilder sb = new StringBuilder(str.length());
            mkm.aq(arrayList, sb, "\n", "", "", -1, "...", null);
            return sb.toString();
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.");
    }

    public static boolean L(CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
        charSequence.getClass();
        if (i < 0 || charSequence.length() - i2 < 0 || i > charSequence2.length() - i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!P(charSequence.charAt(i3), charSequence2.charAt(i + i3))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean M(char c) {
        if (!Character.isWhitespace(c) && !Character.isSpaceChar(c)) {
            return false;
        }
        return true;
    }

    public static final void N(int i) {
        mqg mqgVar = new mqg(2, 36);
        if (mqgVar.a <= i && i <= mqgVar.b) {
            return;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new mqg(2, 36));
    }

    public static final int O(char c) {
        return Character.digit((int) c, 10);
    }

    public static boolean P(char c, char c2) {
        if (c == c2) {
            return true;
        }
        return false;
    }

    public static final Iterator Q(mol molVar) {
        mra mraVar = new mra();
        mraVar.a = mjo.v(molVar, mraVar, mraVar);
        return mraVar;
    }

    public static mqz R(mqz mqzVar) {
        if (mqzVar instanceof mqs) {
            return mqzVar;
        }
        return new mqs(mqzVar);
    }

    public static mqz S(Object obj, moh mohVar) {
        if (obj == null) {
            return mqv.a;
        }
        return new mrg(new mrd(obj), mohVar, 1);
    }

    public static Object T(mqz mqzVar) {
        mqw mqwVar = new mqw((mqx) mqzVar);
        if (!mqwVar.hasNext()) {
            return null;
        }
        return mqwVar.next();
    }

    public static List U(mqz mqzVar) {
        Iterator a = mqzVar.a();
        if (!a.hasNext()) {
            return mlx.a;
        }
        Object next = a.next();
        if (!a.hasNext()) {
            return mkm.N(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (a.hasNext()) {
            arrayList.add(a.next());
        }
        return arrayList;
    }

    public static Set V(mqz mqzVar) {
        mrf mrfVar = new mrf((mrg) mqzVar);
        if (!mrfVar.hasNext()) {
            return mlz.a;
        }
        Object next = mrfVar.next();
        if (!mrfVar.hasNext()) {
            return mkm.E(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (mrfVar.hasNext()) {
            linkedHashSet.add(mrfVar.next());
        }
        return linkedHashSet;
    }

    public static mqz W(mqz mqzVar, moh mohVar) {
        return new mqx(new mrg(mqzVar, mohVar, 0), false, cka.o);
    }

    public static /* synthetic */ String X(mqz mqzVar, CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        Iterator a = mqzVar.a();
        int i = 0;
        while (a.hasNext()) {
            Object next = a.next();
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            amr.d(sb, next, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static double Y(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            if (d > d3) {
                return d3;
            }
            return d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + ".");
    }

    public static float Z(float f, float f2) {
        if (f < f2) {
            return f2;
        }
        return f;
    }

    public static final Class a(mql mqlVar) {
        mqlVar.getClass();
        return ((mow) mqlVar).a();
    }

    public static void aA(long j, String str) {
        if (j >= 0) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean aB(double d, int i, int i2) {
        if (d >= i && d < i2) {
            return true;
        }
        return false;
    }

    public static int aC(int i) {
        return i - 1;
    }

    public static int aD(Boolean bool) {
        if (bool == null) {
            return 1;
        }
        if (bool.booleanValue()) {
            return 2;
        }
        return 3;
    }

    public static void aE(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
        newBuilder.setAtomId(762);
        newBuilder.writeLong(j);
        newBuilder.writeInt(i);
        newBuilder.writeInt(i2);
        newBuilder.writeInt(i3);
        newBuilder.writeInt(i4);
        newBuilder.writeInt(i5);
        newBuilder.writeInt(i6);
        newBuilder.writeInt(i7);
        newBuilder.writeInt(i8);
        newBuilder.writeInt(i9);
        newBuilder.writeInt(i10);
        newBuilder.writeInt(i11);
        newBuilder.writeInt(i12);
        newBuilder.writeInt(i13);
        newBuilder.addBooleanAnnotation((byte) 1, true);
        newBuilder.usePooledBuffer();
        StatsLog.write(newBuilder.build());
    }

    public static void aF(long j, int i, int i2, int i3, int i4, int i5, long j2, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
        newBuilder.setAtomId(704);
        newBuilder.writeLong(j);
        newBuilder.writeInt(i);
        newBuilder.writeInt(i2);
        newBuilder.writeInt(i3);
        newBuilder.writeInt(i4);
        newBuilder.writeInt(i5);
        newBuilder.writeLong(j2);
        newBuilder.writeInt(i6);
        newBuilder.writeInt(i7);
        newBuilder.writeBoolean(false);
        newBuilder.writeBoolean(false);
        newBuilder.writeInt(i8);
        newBuilder.writeInt(i9);
        newBuilder.writeInt(i10);
        newBuilder.writeLong(-1L);
        newBuilder.writeLong(-1L);
        newBuilder.writeInt(i11);
        newBuilder.writeInt(i12);
        newBuilder.writeInt(i13);
        newBuilder.writeInt(i14);
        newBuilder.usePooledBuffer();
        StatsLog.write(newBuilder.build());
    }

    public static void aG(long j, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, int i6, boolean z3, boolean z4, boolean z5, int i7, String str, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, long j2) {
        StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
        newBuilder.setAtomId(703);
        newBuilder.writeLong(j);
        newBuilder.writeInt(i);
        newBuilder.writeInt(i2);
        newBuilder.writeInt(i3);
        newBuilder.writeInt(i4);
        newBuilder.writeInt(i5);
        newBuilder.writeBoolean(z);
        newBuilder.writeBoolean(z2);
        newBuilder.writeInt(i6);
        newBuilder.writeBoolean(z3);
        newBuilder.writeBoolean(z4);
        newBuilder.writeBoolean(z5);
        newBuilder.writeInt(i7);
        newBuilder.writeString(str);
        newBuilder.writeInt(i8);
        newBuilder.writeInt(i9);
        newBuilder.writeInt(i10);
        newBuilder.writeInt(i11);
        newBuilder.writeInt(i12);
        newBuilder.writeInt(i13);
        newBuilder.writeInt(i14);
        newBuilder.writeInt(i15);
        newBuilder.writeInt(i16);
        newBuilder.writeInt(i17);
        newBuilder.writeInt(i18);
        newBuilder.writeInt(i19);
        newBuilder.writeInt(i20);
        newBuilder.writeInt(i21);
        newBuilder.writeInt(i22);
        newBuilder.writeInt(i23);
        newBuilder.writeInt(i24);
        newBuilder.writeInt(i25);
        newBuilder.writeInt(i26);
        newBuilder.writeInt(i27);
        newBuilder.writeInt(i28);
        newBuilder.writeLong(j2);
        newBuilder.usePooledBuffer();
        StatsLog.write(newBuilder.build());
    }

    public static UploadDataProvider aH(byte[] bArr, int i, int i2) {
        return new nlt(ByteBuffer.wrap(bArr, i, i2).slice());
    }

    public static JSONObject aI(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            try {
                jSONObject.put(str, optJSONObject);
            } catch (JSONException e) {
                throw new IllegalArgumentException(a.ag(str, "Failed adding a default object for key [", "]"), e);
            }
        }
        return optJSONObject;
    }

    public static final int aJ(nli nliVar, int i) {
        int i2;
        int length = nliVar.e.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 <= length) {
                int i4 = i + 1;
                i2 = (i3 + length) >>> 1;
                int i5 = nliVar.f[i2];
                if (i5 < i4) {
                    i3 = i2 + 1;
                } else {
                    if (i5 <= i4) {
                        break;
                    }
                    length = i2 - 1;
                }
            } else {
                i2 = (-i3) - 1;
                break;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }

    public static final String aK(byte[] bArr) {
        bArr.getClass();
        return new String(bArr, mrh.a);
    }

    public static final byte[] aL(String str) {
        byte[] bytes = str.getBytes(mrh.a);
        bytes.getClass();
        return bytes;
    }

    private static moh aN() {
        if ("".length() == 0) {
            return cka.p;
        }
        return new eeo(14);
    }

    public static List aO(CharSequence charSequence, String str) {
        int i = 0;
        int w = w(charSequence, str, 0);
        if (w != -1) {
            ArrayList arrayList = new ArrayList(10);
            do {
                arrayList.add(charSequence.subSequence(i, w).toString());
                i = str.length() + w;
                w = w(charSequence, str, i);
            } while (w != -1);
            arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
            return arrayList;
        }
        return mkm.N(charSequence);
    }

    private final void aP(long j, nkp nkpVar, int i, List list, int i2, int i3, List list2) {
        int i4;
        int i5;
        int i6;
        long j2;
        int i7;
        nkp nkpVar2;
        int i8;
        int i9 = i;
        if (i2 < i3) {
            for (int i10 = i2; i10 < i3; i10++) {
                if (((nks) list.get(i10)).b() < i9) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            nks nksVar = (nks) list.get(i2);
            nks nksVar2 = (nks) list.get(i3 - 1);
            if (i9 == nksVar.b()) {
                int i11 = i2 + 1;
                i5 = i11;
                i4 = ((Number) list2.get(i2)).intValue();
                nksVar = (nks) list.get(i11);
            } else {
                i4 = -1;
                i5 = i2;
            }
            int i12 = i5 + 1;
            if (nksVar.a(i9) != nksVar2.a(i9)) {
                int i13 = 1;
                while (i12 < i3) {
                    if (((nks) list.get(i12 - 1)).a(i9) != ((nks) list.get(i12)).a(i9)) {
                        i13++;
                    }
                    i12++;
                }
                long aQ = j + aQ(nkpVar) + 2;
                int i14 = i13 + i13;
                nkpVar.F(i13);
                nkpVar.F(i4);
                for (int i15 = i5; i15 < i3; i15++) {
                    byte a = ((nks) list.get(i15)).a(i9);
                    if (i15 == i5 || a != ((nks) list.get(i15 - 1)).a(i9)) {
                        nkpVar.F(a & 255);
                    }
                }
                nkp nkpVar3 = new nkp();
                int i16 = i5;
                while (i16 < i3) {
                    int i17 = i9 + 1;
                    byte a2 = ((nks) list.get(i16)).a(i9);
                    int i18 = i16 + 1;
                    int i19 = i18;
                    while (true) {
                        if (i19 < i3) {
                            if (a2 != ((nks) list.get(i19)).a(i9)) {
                                i6 = i19;
                                break;
                            }
                            i19++;
                        } else {
                            i6 = i3;
                            break;
                        }
                    }
                    if (i18 == i6 && i17 == ((nks) list.get(i16)).b()) {
                        nkpVar.F(((Number) list2.get(i16)).intValue());
                        i8 = i14;
                        j2 = aQ;
                        i7 = i6;
                        nkpVar2 = nkpVar3;
                    } else {
                        long j3 = aQ + i14;
                        j2 = aQ;
                        nkpVar.F(-((int) (j3 + aQ(nkpVar3))));
                        i7 = i6;
                        nkpVar2 = nkpVar3;
                        i8 = i14;
                        aP(j3, nkpVar3, i17, list, i16, i7, list2);
                    }
                    i16 = i7;
                    nkpVar3 = nkpVar2;
                    i14 = i8;
                    aQ = j2;
                }
                nkpVar.C(nkpVar3);
                return;
            }
            int min = Math.min(nksVar.b(), nksVar2.b());
            int i20 = 0;
            for (int i21 = i9; i21 < min && nksVar.a(i21) == nksVar2.a(i21); i21++) {
                i20++;
            }
            long aQ2 = j + aQ(nkpVar) + 2;
            long j4 = i20;
            nkpVar.F(-i20);
            nkpVar.F(i4);
            int i22 = i9 + i20;
            while (i9 < i22) {
                nkpVar.F(nksVar.a(i9) & 255);
                i9++;
            }
            if (i12 == i3) {
                if (i22 == ((nks) list.get(i5)).b()) {
                    nkpVar.F(((Number) list2.get(i5)).intValue());
                    return;
                }
                throw new IllegalStateException("Check failed.");
            }
            long j5 = aQ2 + j4 + 1;
            nkp nkpVar4 = new nkp();
            nkpVar.F(-((int) (aQ(nkpVar4) + j5)));
            aP(j5, nkpVar4, i22, list, i5, i3, list2);
            nkpVar.C(nkpVar4);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private static final long aQ(nkp nkpVar) {
        return nkpVar.b / 4;
    }

    public static float aa(float f, float f2) {
        if (f > f2) {
            return f2;
        }
        return f;
    }

    public static float ab(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            if (f > f3) {
                return f3;
            }
            return f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + ".");
    }

    public static int ac(int i, int i2) {
        if (i < i2) {
            return i2;
        }
        return i;
    }

    public static int ad(int i, int i2) {
        if (i > i2) {
            return i2;
        }
        return i;
    }

    public static int ae(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            if (i > i3) {
                return i3;
            }
            return i;
        }
        throw new IllegalArgumentException(a.aj(i2, i3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ", "."));
    }

    public static long af(long j, long j2) {
        if (j < j2) {
            return j2;
        }
        return j;
    }

    public static long ag(long j, long j2) {
        if (j > j2) {
            return j2;
        }
        return j;
    }

    public static long ah(long j, mqe mqeVar) {
        if (!mqeVar.c()) {
            if (j < ((Number) mqeVar.b()).longValue()) {
                return ((Number) mqeVar.b()).longValue();
            }
            if (j <= ((Number) mqeVar.a()).longValue()) {
                return j;
            }
            return ((Number) mqeVar.a()).longValue();
        }
        throw new IllegalArgumentException(a.af(mqeVar, "Cannot coerce value to an empty range: ", "."));
    }

    public static long ai(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            if (j > j3) {
                return j3;
            }
            return j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + ".");
    }

    public static mqf aj(mqf mqfVar, int i) {
        mqfVar.getClass();
        if (mqfVar.c <= 0) {
            i = -i;
        }
        return new mqf(mqfVar.a, mqfVar.b, i);
    }

    public static mqg ak(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return mqg.d;
        }
        return new mqg(i, i2 - 1);
    }

    public static final mwv al(mwv mwvVar) {
        return ap(mwvVar, -1);
    }

    public static final Object am(mwv mwvVar, mmx mmxVar) {
        Object a = mwvVar.a(mzt.a, mmxVar);
        if (a == mne.a) {
            return a;
        }
        return mlh.a;
    }

    public static final Object an(mww mwwVar, mwk mwkVar, mmx mmxVar) {
        Object ao = ao(mwwVar, mwkVar, true, mmxVar);
        if (ao == mne.a) {
            return ao;
        }
        return mlh.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x002e, B:14:0x0058, B:20:0x006d, B:22:0x0075, B:34:0x0046, B:37:0x0054), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0089 -> B:14:0x0058). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object ao(defpackage.mww r6, defpackage.mwk r7, boolean r8, defpackage.mmx r9) {
        /*
            boolean r0 = r9 instanceof defpackage.mwz
            if (r0 == 0) goto L13
            r0 = r9
            mwz r0 = (defpackage.mwz) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            mwz r0 = new mwz
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.d
            mne r1 = defpackage.mne.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4e
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            boolean r8 = r0.c
            mvq r6 = r0.f
            java.lang.Object r7 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.mjo.o(r9)     // Catch: java.lang.Throwable -> L34
            r9 = r6
            r6 = r2
            goto L58
        L34:
            r6 = move-exception
            goto L96
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            boolean r8 = r0.c
            mvq r6 = r0.f
            java.lang.Object r7 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.mjo.o(r9)     // Catch: java.lang.Throwable -> L34
            r5 = r0
            r0 = r6
            r6 = r2
        L4c:
            r2 = r5
            goto L6d
        L4e:
            defpackage.mjo.o(r9)
            defpackage.mpd.B(r6)
            mvq r9 = r7.A()     // Catch: java.lang.Throwable -> L34
        L58:
            r0.a = r6     // Catch: java.lang.Throwable -> L34
            r0.b = r7     // Catch: java.lang.Throwable -> L34
            r0.f = r9     // Catch: java.lang.Throwable -> L34
            r0.c = r8     // Catch: java.lang.Throwable -> L34
            r0.e = r4     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L34
            if (r2 != r1) goto L69
            return r1
        L69:
            r5 = r0
            r0 = r9
            r9 = r2
            goto L4c
        L6d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L34
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L8d
            java.lang.Object r9 = r0.b()     // Catch: java.lang.Throwable -> L34
            r2.a = r6     // Catch: java.lang.Throwable -> L34
            r2.b = r7     // Catch: java.lang.Throwable -> L34
            r2.f = r0     // Catch: java.lang.Throwable -> L34
            r2.c = r8     // Catch: java.lang.Throwable -> L34
            r2.e = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r9 = r6.dt(r9, r2)     // Catch: java.lang.Throwable -> L34
            if (r9 == r1) goto L8c
            r9 = r0
            r0 = r2
            goto L58
        L8c:
            return r1
        L8d:
            if (r8 == 0) goto L93
            r6 = 0
            as(r7, r6)
        L93:
            mlh r6 = defpackage.mlh.a
            return r6
        L96:
            throw r6     // Catch: java.lang.Throwable -> L97
        L97:
            r9 = move-exception
            if (r8 != 0) goto L9b
            goto L9e
        L9b:
            as(r7, r6)
        L9e:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.moz.ao(mww, mwk, boolean, mmx):java.lang.Object");
    }

    public static /* synthetic */ mwv ap(mwv mwvVar, int i) {
        int i2;
        if (i < 0) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        if (mwvVar instanceof mzr) {
            return ((mzr) mwvVar).ds(mnc.a, i2);
        }
        return new mzf(mwvVar, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object ar(defpackage.mwi r4, defpackage.mnw r5, defpackage.mmx r6) {
        /*
            boolean r0 = r6 instanceof defpackage.mwh
            if (r0 == 0) goto L13
            r0 = r6
            mwh r0 = (defpackage.mwh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mwh r0 = new mwh
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            mne r1 = defpackage.mne.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.a
            defpackage.mjo.o(r6)     // Catch: java.lang.Throwable -> L29
            goto L65
        L29:
            r4 = move-exception
            goto L6b
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.mjo.o(r6)
            mnb r6 = r0.o()
            bcr r2 = defpackage.muf.c
            mmz r6 = r6.get(r2)
            if (r6 != r4) goto L6f
            r0.a = r5     // Catch: java.lang.Throwable -> L29
            r0.c = r3     // Catch: java.lang.Throwable -> L29
            mse r6 = new mse     // Catch: java.lang.Throwable -> L29
            mmx r0 = defpackage.mjo.w(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r0, r3)     // Catch: java.lang.Throwable -> L29
            r6.z()     // Catch: java.lang.Throwable -> L29
            eeo r0 = new eeo     // Catch: java.lang.Throwable -> L29
            r2 = 17
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L29
            mvy r4 = r4.b     // Catch: java.lang.Throwable -> L29
            r4.r(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.j()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L65
            return r1
        L65:
            r5.a()
            mlh r4 = defpackage.mlh.a
            return r4
        L6b:
            r5.a()
            throw r4
        L6f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.moz.ar(mwi, mnw, mmx):java.lang.Object");
    }

    public static final void as(mwk mwkVar, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = mkm.aI("Channel was consumed, consumer had failed", th);
            }
        }
        mwkVar.s(cancellationException);
    }

    public static /* synthetic */ mvy at(int i, int i2, int i3) {
        mwg mwgVar;
        if (1 == (i3 & 1)) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != Integer.MAX_VALUE) {
                        if (i2 == 1) {
                            return new mvu(i);
                        }
                        return new mwg(i, i2);
                    }
                    return new mvu(Integer.MAX_VALUE);
                }
                if (i2 == 1) {
                    return new mvu(0);
                }
                mwgVar = new mwg(1, i2);
            } else {
                if (i2 == 1) {
                    return new mwg(1, 2);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
        } else {
            if (i2 == 1) {
                return new mvu(mvx.a);
            }
            mwgVar = new mwg(1, i2);
        }
        return mwgVar;
    }

    public static long au(DataInput dataInput) {
        long readUnsignedByte;
        long j;
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        int i = readUnsignedByte2 >> 6;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    readUnsignedByte = (readUnsignedByte2 << 26) >> 26;
                    j = 1800000;
                } else {
                    return dataInput.readLong();
                }
            } else {
                readUnsignedByte = ((readUnsignedByte2 << 58) >> 26) | (dataInput.readUnsignedByte() << 24) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8) | dataInput.readUnsignedByte();
                j = 1000;
            }
        } else {
            readUnsignedByte = dataInput.readUnsignedByte() | ((readUnsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j = 60000;
        }
        return readUnsignedByte * j;
    }

    public static nnw av(DataInput dataInput, String str) {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte != 67) {
            if (readUnsignedByte != 70) {
                if (readUnsignedByte == 80) {
                    return nrh.n(dataInput, str);
                }
                throw new IOException("Invalid encoding");
            }
            nrk nrkVar = new nrk(str, dataInput.readUTF(), (int) au(dataInput), (int) au(dataInput));
            if (nrkVar.equals(nnw.a)) {
                return nnw.a;
            }
            return nrkVar;
        }
        return new nre(nrh.n(dataInput, str));
    }

    public static int aw(long j) {
        if (j >= -2147483648L && j <= 2147483647L) {
            return (int) j;
        }
        throw new ArithmeticException(a.ap(j, "Value cannot fit in an int: "));
    }

    public static long ax(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) < 0 && (j ^ j2) >= 0) {
            throw new ArithmeticException("The calculation caused an overflow: " + j + " + " + j2);
        }
        return j3;
    }

    public static void ay(nnq nnqVar, int i, int i2, int i3) {
        if (i >= i2 && i <= i3) {
        } else {
            throw new noa(nnqVar.r(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public static boolean az(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    public static final Class b(mql mqlVar) {
        String name;
        mqlVar.getClass();
        Class a = ((mow) mqlVar).a();
        if (a.isPrimitive() && (name = a.getName()) != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    return a;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    return a;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    return a;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    return a;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    return a;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    return a;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    return a;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    return a;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    return a;
                default:
                    return a;
            }
        }
        return a;
    }

    public static final mql c(Class cls) {
        cls.getClass();
        int i = mpo.a;
        return new mox(cls);
    }

    public static String d(String str) {
        int i;
        Comparable comparable;
        int i2;
        List o = o(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : o) {
            if (!g((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(mkm.ap(arrayList));
        Iterator it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i < length) {
                    if (!M(str2.charAt(i))) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                i = str2.length();
            }
            arrayList2.add(Integer.valueOf(i));
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        int length2 = str.length();
        o.size();
        moh aN = aN();
        int O = mkm.O(o);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : o) {
            int i3 = i + 1;
            if (i < 0) {
                mkm.S();
            }
            String str3 = (String) obj2;
            if ((i == 0 || i == O) && g(str3)) {
                str3 = null;
            } else {
                str3.getClass();
                if (i2 >= 0) {
                    String substring = str3.substring(ad(i2, str3.length()));
                    substring.getClass();
                    String str4 = (String) aN.a(substring);
                    if (str4 != null) {
                        str3 = str4;
                    }
                } else {
                    throw new IllegalArgumentException(a.am(i2, "Requested character count ", " is less than zero."));
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i = i3;
        }
        StringBuilder sb = new StringBuilder(length2);
        mkm.aq(arrayList3, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }

    public static Integer e(String str) {
        boolean z;
        int i;
        N(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        int i3 = -2147483647;
        if (mpd.a(charAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i3 = Integer.MIN_VALUE;
                z = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z = false;
            }
        } else {
            z = false;
            i = 0;
        }
        int i4 = -59652323;
        while (i < length) {
            int O = O(str.charAt(i));
            if (O < 0) {
                return null;
            }
            if (i2 < i4) {
                if (i4 != -59652323) {
                    return null;
                }
                i4 = -214748364;
                if (i2 < -214748364) {
                    return null;
                }
            }
            int i5 = i2 * 10;
            if (i5 < i3 + O) {
                return null;
            }
            i2 = i5 - O;
            i++;
        }
        if (z) {
            return Integer.valueOf(i2);
        }
        return Integer.valueOf(-i2);
    }

    public static Long f(String str) {
        int i;
        str.getClass();
        N(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        boolean z = false;
        char charAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (mpd.a(charAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j = Long.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int O = O(str.charAt(i));
            if (O < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = -922337203685477580L;
                if (j2 < -922337203685477580L) {
                    return null;
                }
            }
            long j4 = j2 * 10;
            long j5 = O;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
        }
        if (z) {
            return Long.valueOf(j2);
        }
        return Long.valueOf(-j2);
    }

    public static boolean g(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() == 0) {
            return true;
        }
        mmb it = new mqg(0, charSequence.length() - 1).iterator();
        while (it.a) {
            if (!M(charSequence.charAt(it.a()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(String str, int i, String str2, int i2, int i3, boolean z) {
        str.getClass();
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(true, i, str2, i2, i3);
    }

    public static boolean i(String str, String str2, int i, boolean z) {
        str.getClass();
        if (!z) {
            return str.startsWith(str2, i);
        }
        return h(str, i, str2, 0, str2.length(), true);
    }

    public static int j(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static CharSequence k(CharSequence charSequence) {
        int i;
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (true != z) {
                i = i2;
            } else {
                i = length;
            }
            boolean M = M(charSequence.charAt(i));
            if (!z) {
                if (!M) {
                    z = true;
                } else {
                    i2++;
                }
            } else {
                if (!M) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static String l(String str, CharSequence charSequence) {
        if (I(str, (String) charSequence)) {
            String substring = str.substring(charSequence.length());
            substring.getClass();
            return substring;
        }
        return str;
    }

    public static String m(CharSequence charSequence, mqg mqgVar) {
        mqgVar.getClass();
        int i = mqgVar.a;
        Integer.valueOf(i).getClass();
        int i2 = mqgVar.b;
        Integer.valueOf(i2).getClass();
        return charSequence.subSequence(i, i2 + 1).toString();
    }

    public static String n(String str, String str2, String str3) {
        int y = y(str, str2, 0, 6);
        if (y == -1) {
            return str3;
        }
        String substring = str.substring(y + str2.length(), str.length());
        substring.getClass();
        return substring;
    }

    public static List o(CharSequence charSequence) {
        return U(p(charSequence));
    }

    public static mqz p(CharSequence charSequence) {
        return new mrg(C(charSequence, new String[]{"\r\n", "\n", "\r"}), (moh) new eeo(charSequence, 16), 0);
    }

    public static char q(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(j(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String r(String str, int i) {
        str.getClass();
        String substring = str.substring(0, ad(i, str.length()));
        substring.getClass();
        return substring;
    }

    public static /* synthetic */ boolean s(CharSequence charSequence, char c) {
        if (x(charSequence, c, 0, 2) < 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean t(CharSequence charSequence, CharSequence charSequence2) {
        if (y(charSequence, (String) charSequence2, 0, 2) < 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean u(String str, String str2) {
        str.getClass();
        return str.endsWith(str2);
    }

    public static boolean v(String str, String str2) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static int w(CharSequence charSequence, String str, int i) {
        str.getClass();
        if (!(charSequence instanceof String)) {
            mqg mqgVar = new mqg(ac(i, 0), ad(charSequence.length(), charSequence.length()));
            int i2 = mqgVar.a;
            int i3 = mqgVar.b;
            int i4 = mqgVar.c;
            if ((i4 <= 0 || i2 > i3) && (i4 >= 0 || i3 > i2)) {
                return -1;
            }
            while (!L(str, charSequence, i2, str.length())) {
                if (i2 == i3) {
                    return -1;
                }
                i2 += i4;
            }
            return i2;
        }
        return ((String) charSequence).indexOf(str, i);
    }

    public static /* synthetic */ int x(CharSequence charSequence, char c, int i, int i2) {
        charSequence.getClass();
        boolean z = charSequence instanceof String;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if (!z) {
            char[] cArr = {c};
            mmb it = new mqg(ac(i, 0), j(charSequence)).iterator();
            while (it.a) {
                int a = it.a();
                if (P(cArr[0], charSequence.charAt(a))) {
                    return a;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int y(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return w(charSequence, str, i);
    }

    public static /* synthetic */ int z(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = j(charSequence);
        }
        return ((String) charSequence).lastIndexOf(c, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:            continue;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.nla aM(defpackage.nks... r12) {
        /*
            r11 = this;
            java.util.List r5 = defpackage.mkm.n(r12)
            int r0 = r5.size()
            r1 = 1
            if (r0 <= r1) goto Le
            java.util.Collections.sort(r5)
        Le:
            int r0 = r5.size()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            r9 = 0
            r1 = 0
        L19:
            if (r1 >= r0) goto L26
            r2 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8.add(r2)
            int r1 = r1 + 1
            goto L19
        L26:
            int r0 = r12.length
            r1 = 0
            r2 = 0
        L29:
            if (r1 >= r0) goto L3e
            r3 = r12[r1]
            int r4 = r2 + 1
            int r3 = defpackage.mkm.ao(r5, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8.set(r3, r2)
            int r1 = r1 + 1
            r2 = r4
            goto L29
        L3e:
            java.lang.Object r0 = r5.get(r9)
            nks r0 = (defpackage.nks) r0
            int r0 = r0.b()
            if (r0 <= 0) goto Ldf
            r0 = 0
        L4b:
            int r1 = r5.size()
            if (r0 >= r1) goto Lab
            java.lang.Object r1 = r5.get(r0)
            nks r1 = (defpackage.nks) r1
            int r2 = r0 + 1
            r3 = r2
        L5a:
            int r4 = r5.size()
            if (r3 >= r4) goto La9
            java.lang.Object r4 = r5.get(r3)
            nks r4 = (defpackage.nks) r4
            boolean r6 = r4.g(r1)
            if (r6 == 0) goto La9
            int r6 = r4.b()
            int r7 = r1.b()
            if (r6 == r7) goto L96
            java.lang.Object r4 = r8.get(r3)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Object r6 = r8.get(r0)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r4 <= r6) goto L93
            r5.remove(r3)
            r8.remove(r3)
            goto L5a
        L93:
            int r3 = r3 + 1
            goto L5a
        L96:
            java.util.Objects.toString(r4)
            java.lang.String r12 = java.lang.String.valueOf(r4)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "duplicate option: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        La9:
            r0 = r2
            goto L4b
        Lab:
            nkp r10 = new nkp
            r10.<init>()
            r6 = 0
            int r7 = r5.size()
            r1 = 0
            r4 = 0
            r0 = r11
            r3 = r10
            r0.aP(r1, r3, r4, r5, r6, r7, r8)
            long r0 = aQ(r10)
            int r1 = (int) r0
            int[] r0 = new int[r1]
        Lc4:
            if (r9 >= r1) goto Lcf
            int r2 = r10.f()
            r0[r9] = r2
            int r9 = r9 + 1
            goto Lc4
        Lcf:
            int r1 = r12.length
            nla r2 = new nla
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r1)
            r12.getClass()
            nks[] r12 = (defpackage.nks[]) r12
            r2.<init>(r12, r0)
            return r2
        Ldf:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "the empty byte string is not a supported option"
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.moz.aM(nks[]):nla");
    }
}
