package defpackage;

import com.google.ar.core.ImageMetadata;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mjo {
    private static mjo a;

    public mjo() {
    }

    public static mnb A(mmz mmzVar, mnb mnbVar) {
        mnbVar.getClass();
        return B(mmzVar, mnbVar);
    }

    public static mnb B(mnb mnbVar, mnb mnbVar2) {
        mnbVar2.getClass();
        if (mnbVar2 == mnc.a) {
            return mnbVar;
        }
        return (mnb) mnbVar2.fold(mnbVar, cbj.d);
    }

    public static int C(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static int D(int i) {
        return Integer.highestOneBit(moz.ac(i, 1) * 3);
    }

    public static int E(int i) {
        return Integer.numberOfLeadingZeros(i) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ServiceLoader, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ServiceLoader] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List, java.util.ArrayList] */
    public static List F(Class cls, Iterable iterable, ClassLoader classLoader, mbw mbwVar) {
        ?? load;
        if (G(classLoader)) {
            load = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                Object obj = null;
                try {
                    obj = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                } catch (ClassCastException unused) {
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
                if (obj != null) {
                    load.add(obj);
                }
            }
        } else {
            load = ServiceLoader.load(cls, classLoader);
            if (!load.iterator().hasNext()) {
                load = ServiceLoader.load(cls);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : load) {
            mbwVar.b(obj2);
            arrayList.add(obj2);
        }
        Collections.sort(arrayList, Collections.reverseOrder(new bbh(mbwVar, 2)));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static boolean G(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static synchronized void H() {
        synchronized (mjo.class) {
            if (a == null) {
                a = new mjo(null, null);
            }
        }
    }

    public static ktf I(int i) {
        return new ktf(ByteBuffer.allocateDirect(Math.min(ImageMetadata.SHADING_MODE, i)));
    }

    public static lyt J(lyt lytVar, List list) {
        lytVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lytVar = new lyx(lytVar, (lyw) it.next());
        }
        return lytVar;
    }

    public static lyt K(lyt lytVar, lyw... lywVarArr) {
        return J(lytVar, Arrays.asList(lywVarArr));
    }

    public static lyt L(lyt lytVar, List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.reverse(arrayList);
        return J(lytVar, arrayList);
    }

    public static /* synthetic */ Object M(Object obj) {
        byte[] bArr = (byte[]) obj;
        nfd nfdVar = nfd.d;
        int length = bArr.length;
        lja ljaVar = lja.a;
        lkz lkzVar = lkz.a;
        ljn m = ljn.m(nfdVar, bArr, 0, length, lja.a);
        ljn.A(m);
        return (nfd) m;
    }

    public static void N(lsm lsmVar, List list) {
        list.add(lsmVar);
    }

    public static void O(lsm lsmVar, List list) {
        list.add(lsmVar);
    }

    public static lsm P(mko mkoVar) {
        mkoVar.getClass();
        return new lso(mkoVar);
    }

    private static int i(int i, int i2, int i3) {
        return j(j(i, i3) - j(i2, i3), i3);
    }

    private static int j(int i, int i2) {
        int i3 = i % i2;
        if (i3 >= 0) {
            return i3;
        }
        return i3 + i2;
    }

    public static Set k(Map map, String str) {
        mbx mbxVar;
        boolean z;
        mca d;
        List f = mfx.f(map, str);
        if (f == null) {
            return null;
        }
        EnumSet noneOf = EnumSet.noneOf(mbx.class);
        for (Object obj : f) {
            if (obj instanceof Double) {
                Double d2 = (Double) obj;
                int intValue = d2.intValue();
                boolean z2 = true;
                if (intValue == d2.doubleValue()) {
                    z = true;
                } else {
                    z = false;
                }
                hwx.F(z, "Status code %s is not integral", obj);
                if (intValue >= 0 && intValue < mca.a.size()) {
                    d = (mca) mca.a.get(intValue);
                } else {
                    d = mca.d.d("Unknown code " + intValue);
                }
                mbxVar = d.l;
                if (mbxVar.r != d2.intValue()) {
                    z2 = false;
                }
                hwx.F(z2, "Status code %s is not valid", obj);
            } else if (obj instanceof String) {
                try {
                    mbxVar = (mbx) Enum.valueOf(mbx.class, (String) obj);
                } catch (IllegalArgumentException e) {
                    throw new jfl(der.b(obj, "Status code ", " is not valid"), e);
                }
            } else {
                throw new jfl("Can not convert status code " + String.valueOf(obj) + " to Status.Code, because its type is " + String.valueOf(obj.getClass()));
            }
            noneOf.add(mbxVar);
        }
        return DesugarCollections.unmodifiableSet(noneOf);
    }

    public static void l(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            if (mnt.a != null && mnt.a.intValue() < 19) {
                Method method = mns.a;
                if (method != null) {
                    method.invoke(th, th2);
                    return;
                }
                return;
            }
            th.addSuppressed(th2);
        }
    }

    public static double m(long j) {
        return j + 0.0d;
    }

    public static Object n(Throwable th) {
        th.getClass();
        return new mkx(th);
    }

    public static void o(Object obj) {
        if (!(obj instanceof mkx)) {
        } else {
            throw ((mkx) obj).a;
        }
    }

    public static PasswordAuthentication p(String str, InetAddress inetAddress, int i) {
        URL url;
        try {
            url = new URL("https", str, i, "");
        } catch (MalformedURLException unused) {
            mie.a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", str});
            url = null;
        }
        return Authenticator.requestPasswordAuthentication(str, inetAddress, i, "https", "", null, url, Authenticator.RequestorType.PROXY);
    }

    public static mfz q() {
        if (mik.a == null) {
            return new mik();
        }
        return new mcx();
    }

    public static void r(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                l(th, th2);
            }
        }
    }

    public static int s(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                return i2 - i(i2, i, i3);
            }
        } else if (i3 < 0) {
            if (i > i2) {
                return i2 + i(i, i2, -i3);
            }
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
        return i2;
    }

    public static mnq t(Enum[] enumArr) {
        enumArr.getClass();
        return new mnq(enumArr);
    }

    public static Object u(mol molVar, Object obj, mmx mmxVar) {
        Object mniVar;
        molVar.getClass();
        mnb o = mmxVar.o();
        if (o == mnc.a) {
            mniVar = new mnh(mmxVar);
        } else {
            mniVar = new mni(mmxVar, o);
        }
        mpp.g(molVar, 2);
        return molVar.a(obj, mniVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static mmx v(mol molVar, Object obj, mmx mmxVar) {
        molVar.getClass();
        if (molVar instanceof mnj) {
            return ((mnj) molVar).c(obj, mmxVar);
        }
        mnb o = mmxVar.o();
        if (o == mnc.a) {
            return new mnf(mmxVar, molVar, obj);
        }
        return new mng(mmxVar, o, molVar, obj);
    }

    public static mmx w(mmx mmxVar) {
        mnl mnlVar;
        mmxVar.getClass();
        if (mmxVar instanceof mnl) {
            mnlVar = (mnl) mmxVar;
        } else {
            mnlVar = null;
        }
        if (mnlVar != null && (mmxVar = mnlVar.r) == null) {
            mmy mmyVar = (mmy) mnlVar.o().get(mmy.k);
            if (mmyVar != null) {
                mmxVar = mmyVar.de(mnlVar);
            } else {
                mmxVar = mnlVar;
            }
            mnlVar.r = mmxVar;
        }
        return mmxVar;
    }

    public static Object x(mmz mmzVar, Object obj, mol molVar) {
        molVar.getClass();
        return molVar.a(obj, mmzVar);
    }

    public static mmz y(mmz mmzVar, mna mnaVar) {
        mnaVar.getClass();
        if (amr.i(mmzVar.getKey(), mnaVar)) {
            return mmzVar;
        }
        return null;
    }

    public static mnb z(mmz mmzVar, mna mnaVar) {
        mnaVar.getClass();
        if (amr.i(mmzVar.getKey(), mnaVar)) {
            return mnc.a;
        }
        return mmzVar;
    }

    public lyy R() {
        throw null;
    }

    public void S(mbc mbcVar) {
        throw null;
    }

    public void a(mca mcaVar, mbc mbcVar) {
        throw null;
    }

    public void f(Object obj) {
        throw null;
    }

    public mjo(short[] sArr) {
    }

    public mjo(char[] cArr, byte[] bArr) {
        new HashSet();
    }

    public void T() {
    }

    public void g() {
    }

    public void c(long j) {
    }

    public void d(long j) {
    }
}
