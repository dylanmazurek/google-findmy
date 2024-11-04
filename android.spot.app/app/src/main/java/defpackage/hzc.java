package defpackage;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import android.provider.Settings;
import android.support.design.widget.R;
import android.util.TypedValue;
import j$.time.Instant;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hzc {
    public static String a;
    public static Boolean b;
    private static String c;
    private static Boolean d;

    public hzc() {
    }

    public static jck A(Class cls, String str) {
        try {
            return new jck(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    public static jiy B(Iterator it, jei jeiVar, jiu jiuVar) {
        while (it.hasNext()) {
            Object next = it.next();
            jiuVar.d(jeiVar.a(next), next);
        }
        try {
            return jiuVar.b();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.valueOf(e.getMessage()).concat(". To index multiple values under a key, use Multimaps.index."));
        }
    }

    public static Object C(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String D(Map map) {
        int size = map.size();
        hwx.D(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public static Map E(Map map, jei jeiVar) {
        return new jlo(map, new njz(jeiVar, null));
    }

    public static boolean F(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList G(Iterable iterable) {
        iterable.getClass();
        return new ArrayList((Collection) iterable);
    }

    public static ArrayList H(Iterator it) {
        ArrayList arrayList = new ArrayList();
        Q(arrayList, it);
        return arrayList;
    }

    public static ArrayList I(int i) {
        hwx.D(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static List J(List list) {
        if (list instanceof jis) {
            return ((jis) list).h();
        }
        if (list instanceof jkx) {
            return ((jkx) list).a;
        }
        if (list instanceof RandomAccess) {
            return new jkv(list);
        }
        return new jkx(list);
    }

    public static List K(List list, jei jeiVar) {
        if (list instanceof RandomAccess) {
            return new jkz(list, jeiVar);
        }
        return new jlb(list, jeiVar);
    }

    public static boolean L(List list, Object obj) {
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (list2 instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!amr.g(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!it2.hasNext() || !amr.g(it.next(), it2.next())) {
                    break;
                }
            } else if (!it2.hasNext()) {
                return true;
            }
        }
        return false;
    }

    public static jmw M(Iterator it) {
        it.getClass();
        if (it instanceof jmw) {
            return (jmw) it;
        }
        return new jkc(it);
    }

    public static Object N(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object O(Iterator it) {
        if (it.hasNext()) {
            Object next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    public static void P(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean Q(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:            return false;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0014, code lost:            if (r2.hasNext() == false) goto L65;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:            if (r3.equals(r2.next()) == false) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0020, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:            return false;     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0001, code lost:            if (r3 == null) goto L50;     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:            if (r2.hasNext() == false) goto L62;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:            if (r2.next() != null) goto L64;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:            return true;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean R(java.util.Iterator r2, java.lang.Object r3) {
        /*
            r0 = 1
            if (r3 != 0) goto L10
        L3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L21
            java.lang.Object r3 = r2.next()
            if (r3 != 0) goto L3
            return r0
        L10:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r2.next()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L10
            return r0
        L21:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzc.R(java.util.Iterator, java.lang.Object):boolean");
    }

    public static boolean S(Iterator it, Collection collection) {
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static Object T(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static jer U(Iterable iterable, jet jetVar) {
        Iterator it = iterable.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (jetVar.a(next)) {
                return jer.i(next);
            }
        }
        return jdl.a;
    }

    public static Iterable V(Iterable iterable, jet jetVar) {
        iterable.getClass();
        return new jjx(iterable, jetVar);
    }

    public static Object W(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return X(list);
            }
            throw new NoSuchElementException();
        }
        return N(iterable.iterator());
    }

    public static Object X(List list) {
        return list.get(list.size() - 1);
    }

    public static Object Y(Iterable iterable) {
        Iterator it = iterable.iterator();
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static String Z(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0088 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r5) {
        /*
            java.lang.String r0 = defpackage.hzc.c
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L12
            java.lang.String r5 = defpackage.he$$ExternalSyntheticApiModelOutline0.m135m()
            defpackage.hzc.c = r5
            return r5
        L12:
            java.lang.String r0 = "robolectric"
            java.lang.String r1 = android.os.Build.FINGERPRINT
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L89
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class<hzc> r2 = defpackage.hzc.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L3f
            r3 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "currentProcessName"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch: java.lang.Throwable -> L3f
            r2 = 1
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r0 = r0.invoke(r1, r1)     // Catch: java.lang.Throwable -> L3f
            boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L40
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
        L40:
            r0 = r1
        L41:
            defpackage.hzc.c = r0
            if (r0 != 0) goto L88
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            java.lang.String r4 = "/proc/self/cmdline"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            r4 = 50
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            java.lang.String r3 = r2.readLine()     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L66
            r2.close()     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
            android.os.StrictMode.setThreadPolicy(r0)
            goto L7e
        L66:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L6b
            goto L6f
        L6b:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
        L6f:
            throw r3     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L72
        L70:
            r5 = move-exception
            goto L84
        L72:
            r2 = move-exception
            java.lang.String r3 = "CurrentProcess"
            java.lang.String r4 = "Unable to read /proc/self/cmdline"
            android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L70
            android.os.StrictMode.setThreadPolicy(r0)
            r3 = r1
        L7e:
            defpackage.hzc.c = r3
            if (r3 != 0) goto L83
            goto L89
        L83:
            return r3
        L84:
            android.os.StrictMode.setThreadPolicy(r0)
            throw r5
        L88:
            return r0
        L89:
            java.lang.String r0 = "activity"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5
            java.util.List r5 = r5.getRunningAppProcesses()
            if (r5 == 0) goto Lb1
            int r0 = android.os.Process.myPid()
            java.util.Iterator r5 = r5.iterator()
        L9f:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto Lb1
            java.lang.Object r2 = r5.next()
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2
            int r3 = r2.pid
            if (r3 != r0) goto L9f
            java.lang.String r1 = r2.processName
        Lb1:
            defpackage.hzc.c = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzc.a(android.content.Context):java.lang.String");
    }

    public static boolean aa(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        iterable.getClass();
        return Q(collection, iterable.iterator());
    }

    public static boolean ab(Iterable iterable, jet jetVar) {
        Iterator it = iterable.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (jetVar.a(it.next())) {
                if (i != -1) {
                    return true;
                }
            } else {
                i++;
            }
        }
        return false;
    }

    public static Object[] ac(Iterable iterable) {
        Collection H;
        if (iterable instanceof Collection) {
            H = (Collection) iterable;
        } else {
            H = H(iterable.iterator());
        }
        return H.toArray();
    }

    public static Object ad(Iterable iterable) {
        return T(iterable.iterator());
    }

    public static ColorStateList ae(Context context, ksr ksrVar, int i) {
        int s;
        ColorStateList e;
        if (ksrVar.A(i) && (s = ksrVar.s(i, 0)) != 0 && (e = bqx.e(context, s)) != null) {
            return e;
        }
        return ksrVar.t(i);
    }

    public static Application af(Context context) {
        if (!(context instanceof Application)) {
            Context context2 = context;
            while (context2 instanceof ContextWrapper) {
                context2 = ((ContextWrapper) context2).getBaseContext();
                if (context2 instanceof Application) {
                    return (Application) context2;
                }
            }
            throw new IllegalStateException("Could not find an Application in the given context: ".concat(String.valueOf(String.valueOf(context))));
        }
        return (Application) context;
    }

    public static boolean ag(Context context) {
        boolean z;
        Set k = ((lrb) ah(context, lrb.class)).k();
        jmo jmoVar = (jmo) k;
        if (jmoVar.e <= 1) {
            z = true;
        } else {
            z = false;
        }
        iqg.D(z, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (k.isEmpty()) {
            return true;
        }
        return ((Boolean) jmoVar.listIterator().next()).booleanValue();
    }

    public static Object ah(Context context, Class cls) {
        context.getClass();
        return ai(af(context.getApplicationContext()), cls);
    }

    public static Object ai(Object obj, Class cls) {
        boolean z;
        if (obj instanceof lsb) {
            if (obj instanceof lsd) {
                Annotation[] annotations = cls.getAnnotations();
                int length = annotations.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (annotations[i].annotationType().getCanonicalName().contentEquals("dagger.hilt.android.EarlyEntryPoint")) {
                            z = true;
                            break;
                        }
                        i++;
                    } else {
                        z = false;
                        break;
                    }
                }
                iqg.D(!z, "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", cls.getCanonicalName());
            }
            return cls.cast(obj);
        }
        if (obj instanceof lsc) {
            return ai(((lsc) obj).r(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), lsb.class, lsc.class));
    }

    public static int aj(int i) {
        if (i != 0) {
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    return 0;
                }
            }
            return i2;
        }
        return 3;
    }

    public static lqa ak(lpu lpuVar) {
        lpt lptVar = (lpt) lpuVar;
        if ((lptVar.a & 134217728) != 0) {
            lqa lqaVar = lptVar.w;
            if (lqaVar == null) {
                return lqa.c;
            }
            return lqaVar;
        }
        return null;
    }

    public static /* synthetic */ lqc al(ljh ljhVar) {
        ljn q = ljhVar.q();
        q.getClass();
        return (lqc) q;
    }

    public static int am(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            if (i != 3) {
                if (i != 5) {
                    return 0;
                }
                return 6;
            }
            return 4;
        }
        return 2;
    }

    public static int an(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            default:
                return 0;
        }
    }

    public static lim ao(lor lorVar) {
        lorVar.getClass();
        String str = (String) lorVar.b.get("deviceIdentifierType");
        String str2 = (String) lorVar.b.get("deviceIdentifier");
        lim limVar = null;
        if (str2 != null) {
            try {
                if (amr.i(str, "accountKey")) {
                    lim o = kzy.o(str2, jtf.f);
                    o.getClass();
                    limVar = ap(o);
                } else if (amr.i(str, "hashedAccountKey")) {
                    limVar = kzy.o(str2, jtf.f);
                }
            } catch (jta e) {
                ((jni) ((jni) lop.a.g()).i(e).j("com/google/wireless/android/security/fmd/library/deeplinks/AccountKeyDeepLinkDataKt", "extractHashedAccountKeyFromQueryParameters", 81, "AccountKeyDeepLinkData.kt")).r("Failed to decode account key");
            }
        }
        return limVar;
    }

    public static lim ap(lim limVar) {
        int i = jse.a;
        jsc d2 = ((jrq) jsd.a).d();
        try {
            limVar.n(new lma(d2));
            return lim.t(d2.k().e());
        } catch (IOException e) {
            throw new AssertionError("impossible", e);
        }
    }

    public static int aq(int i) {
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
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case R.styleable.TextInputLayout_cursorColor /* 24 */:
                return 25;
            case R.styleable.TextInputLayout_cursorErrorColor /* 25 */:
                return 26;
            case R.styleable.TextInputLayout_endIconCheckable /* 26 */:
                return 27;
            case R.styleable.TextInputLayout_endIconContentDescription /* 27 */:
                return 28;
            case R.styleable.TextInputLayout_endIconDrawable /* 28 */:
                return 29;
            case R.styleable.TextInputLayout_endIconMinSize /* 29 */:
                return 30;
            case R.styleable.TextInputLayout_endIconMode /* 30 */:
                return 31;
            case R.styleable.TextInputLayout_endIconScaleType /* 31 */:
                return 32;
            case R.styleable.TextInputLayout_endIconTint /* 32 */:
                return 33;
            case R.styleable.TextInputLayout_endIconTintMode /* 33 */:
                return 34;
            case R.styleable.TextInputLayout_errorAccessibilityLiveRegion /* 34 */:
                return 35;
            case 35:
                return 36;
            case R.styleable.TextInputLayout_errorEnabled /* 36 */:
                return 37;
            case R.styleable.TextInputLayout_errorIconDrawable /* 37 */:
                return 38;
            case R.styleable.TextInputLayout_errorIconTint /* 38 */:
                return 39;
            case R.styleable.TextInputLayout_errorIconTintMode /* 39 */:
                return 40;
            case R.styleable.TextInputLayout_errorTextAppearance /* 40 */:
                return 41;
            case R.styleable.TextInputLayout_errorTextColor /* 41 */:
                return 42;
            case R.styleable.TextInputLayout_expandedHintEnabled /* 42 */:
                return 43;
            case R.styleable.TextInputLayout_helperText /* 43 */:
                return 44;
            case R.styleable.TextInputLayout_helperTextEnabled /* 44 */:
                return 45;
            case R.styleable.TextInputLayout_helperTextTextAppearance /* 45 */:
                return 46;
            case R.styleable.TextInputLayout_helperTextTextColor /* 46 */:
                return 47;
            case R.styleable.TextInputLayout_hintAnimationEnabled /* 47 */:
                return 48;
            case R.styleable.TextInputLayout_hintEnabled /* 48 */:
                return 49;
            case R.styleable.TextInputLayout_hintTextAppearance /* 49 */:
                return 50;
            case R.styleable.TextInputLayout_hintTextColor /* 50 */:
                return 51;
            case R.styleable.TextInputLayout_passwordToggleContentDescription /* 51 */:
                return 52;
            case R.styleable.TextInputLayout_passwordToggleDrawable /* 52 */:
                return 53;
            case R.styleable.TextInputLayout_passwordToggleEnabled /* 53 */:
                return 54;
            case R.styleable.TextInputLayout_passwordToggleTint /* 54 */:
                return 55;
            case R.styleable.TextInputLayout_passwordToggleTintMode /* 55 */:
                return 56;
            default:
                return 0;
        }
    }

    public static int ar(int i) {
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
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            default:
                return 0;
        }
    }

    public static /* synthetic */ lmu as(ljh ljhVar) {
        ljn q = ljhVar.q();
        q.getClass();
        return (lmu) q;
    }

    public static int at(int i) {
        if (i != 1) {
            if (i != 3) {
                if (i != 5) {
                    return 0;
                }
                return 6;
            }
            return 4;
        }
        return 2;
    }

    public static Instant au(lln llnVar) {
        return Instant.ofEpochSecond(lmi.e(llnVar.a, llnVar.b).a, r4.b);
    }

    public static boolean b() {
        boolean z;
        if (d == null) {
            int myUid = Process.myUid();
            if (Build.VERSION.SDK_INT < 24) {
                try {
                    z = ((Boolean) UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE).invoke(null, Integer.valueOf(myUid))).booleanValue();
                } catch (Exception unused) {
                    z = true;
                }
            } else {
                z = Process.isApplicationUid(myUid);
            }
            d = Boolean.valueOf(z);
        }
        return d.booleanValue();
    }

    public static icr c(ico icoVar, jer jerVar, jer jerVar2, jer jerVar3) {
        if (icoVar != null) {
            return new icr(icoVar, jerVar, jerVar2, jerVar3);
        }
        throw new IllegalStateException("Missing required properties: dataId");
    }

    public static String d(int i) {
        if (i != 143) {
            if (i != 257) {
                switch (i) {
                    case 0:
                        return "GATT_SUCCESS";
                    case 1:
                        return "INVALID_HANDLE";
                    case 2:
                        return "READ_NOT_PERMITTED";
                    case 3:
                        return "WRITE_NOT_PERMITTED";
                    case 4:
                        return "INVALID_PDU";
                    case 5:
                        return "INSUFFICIENT_AUTHENTICATION";
                    case 6:
                        return "REQUEST_NOT_SUPPORTED";
                    case 7:
                        return "INVALID_OFFSET";
                    case 8:
                        return "INSUFFICIENT_AUTHORIZATION";
                    case 9:
                        return "PREPARE_QUEUE_FULL";
                    case 10:
                        return "ATTRIBUTE_NOT_FOUND";
                    case 11:
                        return "ATTRIBUTE_NOT_LONG";
                    case 12:
                        return "INSUFFICIENT_ENCRYPTION_KEY_SIZE";
                    case 13:
                        return "INVALID_ATTRIBUTE_LENGTH";
                    case 14:
                        return "UNLIKELY_ERROR";
                    case 15:
                        return "INSUFFICIENT_ENCRYPTION";
                    case 16:
                        return "UNSUPPORTED_GROUP_TYPE";
                    case 17:
                        return "INSUFFICIENT_RESOURCES";
                    default:
                        return a.ae(i, "unknown error status: ");
                }
            }
            return "GATT_FAILURE";
        }
        return "CONNECTION_CONGESTED";
    }

    public static Typeface e(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int weight;
        int i3;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i = configuration.fontWeightAdjustment;
            if (i != Integer.MAX_VALUE) {
                i2 = configuration.fontWeightAdjustment;
                if (i2 != 0 && typeface != null) {
                    weight = typeface.getWeight();
                    i3 = configuration.fontWeightAdjustment;
                    create = Typeface.create(typeface, bpv.e(weight + i3, 1, 1000), typeface.isItalic());
                    return create;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static float f(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    public static int g(TypedValue typedValue) {
        int complexUnit;
        if (Build.VERSION.SDK_INT >= 22) {
            complexUnit = typedValue.getComplexUnit();
            return complexUnit;
        }
        return typedValue.data & 15;
    }

    public static int h(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i, i2);
    }

    public static ColorStateList i(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList e;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (e = bqx.e(context, resourceId)) != null) {
            return e;
        }
        return typedArray.getColorStateList(i);
    }

    public static Drawable j(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable c2;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (c2 = cu.c(context, resourceId)) != null) {
            return c2;
        }
        return typedArray.getDrawable(i);
    }

    public static boolean k(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static boolean l(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 2.0f) {
            return true;
        }
        return false;
    }

    public static int m(Context context, int i) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, iup.a);
            TypedValue typedValue = new TypedValue();
            boolean value = obtainStyledAttributes.getValue(2, typedValue);
            if (!value) {
                value = obtainStyledAttributes.getValue(1, typedValue);
            }
            obtainStyledAttributes.recycle();
            if (value) {
                if (g(typedValue) == 2) {
                    return Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density);
                }
                return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            }
            return 0;
        }
        return 0;
    }

    public static int n(Context context, int i, int i2) {
        TypedValue o = o(context, i);
        if (o != null && o.type == 16) {
            return o.data;
        }
        return i2;
    }

    public static TypedValue o(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static TypedValue p(Context context, int i, String str) {
        TypedValue o = o(context, i);
        if (o != null) {
            return o;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static boolean q(Context context, int i, boolean z) {
        TypedValue o = o(context, i);
        if (o != null && o.type == 18) {
            if (o.data == 0) {
                return false;
            }
            return true;
        }
        return z;
    }

    public static float r(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }

    public static void s(jls jlsVar, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Collection b2 = jlsVar.b(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                b2.add(objectInputStream.readObject());
            }
        }
    }

    public static void t(jls jlsVar, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(jlsVar.q().size());
        for (Map.Entry entry : jlsVar.q().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public static Object[] u(Object[] objArr, int i) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i);
    }

    public static Object[] v(Collection collection, Object[] objArr) {
        int size = collection.size();
        if (objArr.length < size) {
            objArr = u(objArr, size);
        }
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    public static void w(Object obj, int i) {
        if (obj != null) {
        } else {
            throw new NullPointerException(a.ae(i, "at index "));
        }
    }

    public static void x(Object... objArr) {
        y(objArr, objArr.length);
    }

    public static void y(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            w(objArr[i2], i2);
        }
    }

    public static Collection z(Collection collection) {
        if (collection instanceof SortedSet) {
            return DesugarCollections.unmodifiableSortedSet((SortedSet) collection);
        }
        if (collection instanceof Set) {
            return DesugarCollections.unmodifiableSet((Set) collection);
        }
        if (collection instanceof List) {
            return DesugarCollections.unmodifiableList((List) collection);
        }
        return DesugarCollections.unmodifiableCollection(collection);
    }

    public hzc(char[] cArr) {
    }
}
